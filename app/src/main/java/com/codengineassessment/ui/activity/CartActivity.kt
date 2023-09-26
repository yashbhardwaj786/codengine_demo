package com.codengineassessment.ui.activity

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.codengineassessment.CodengineAssessment
import com.codengineassessment.R
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.ActivityCartBinding
import com.codengineassessment.ui.adapter.CartListItemAdapter
import com.codengineassessment.ui.viewmodel.CartContract
import com.codengineassessment.ui.viewmodel.CartViewModel
import com.codengineassessment.ui.viewmodelfactory.CartViewModelFactory
import com.codengineassessment.utils.Constant
import com.codengineassessment.utils.showCartCount
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance
import androidx.lifecycle.Observer
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.ui.bottomsheet.ToGoContract
import com.codengineassessment.ui.bottomsheet.ToGoDialogFragment
import com.codengineassessment.utils.Constant.Companion.SUCCESSFULLY_PURCHASE
import com.codengineassessment.utils.getCartCount
import com.codengineassessment.utils.getCurrentTime
import com.codengineassessment.utils.showToast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CartActivity : AppCompatActivity(), CartContract, KodeinAware, ToGoContract {
    override val kodein by kodein()
    private lateinit var cartCountHome: TextView
    private val prefs: PreferenceProvider by instance()
    private var _binding: ActivityCartBinding? = null
    private val binding get() = _binding!!
    private var roundOffTotal = ""
    private val cartViewModel: CartViewModel by viewModels {
        CartViewModelFactory((this.application as CodengineAssessment).repository)
    }

    private fun updateCart(cartItemProduct: CartItemProduct, position: Int){
        val cartList = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
        if(cartItemProduct.quantity == 0){
            cartList.removeAt(position)
            val adapter = binding?.productList?.adapter as CartListItemAdapter
            adapter.cartItemList = cartList
            adapter.setNotifyDataChange()
        }else {
            cartList[position] = cartItemProduct
        }
        prefs.saveCartJsonObject(cartList)
        showCartCount(cartCountHome, prefs)
        calculatePrice()
        if(cartList.isEmpty()){
            cartViewModel.isCartEmpty.set(true)
        }
    }

    private fun setToolBar(titleText: String, showBackButton: Boolean = false) {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val title = findViewById<TextView>(R.id.title)
        title?.text = titleText
        title?.maxLines = 1
        title?.ellipsize = TextUtils.TruncateAt.END
        toolbar?.contentInsetStartWithNavigation = 0
        setSupportActionBar(toolbar)
        val backIconLayout = findViewById<LinearLayout>(R.id.backIconLayout)
        if(showBackButton){
            backIconLayout.visibility = View.VISIBLE
        }else {
            backIconLayout.visibility = View.INVISIBLE
        }

        backIconLayout.setOnClickListener {
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_cart)
        setToolBar(getString(R.string.checkout), true)
        binding.viewModel = cartViewModel
        cartCountHome = findViewById<TextView>(R.id.cartCount)
        showCartCount(cartCountHome, prefs)
        val cartItemProduct = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
        cartViewModel.cartItemProductList = cartItemProduct
        if (cartItemProduct.isEmpty()) {
            cartViewModel.isCartEmpty.set(true)
        } else {
            initRecyclerView()
            calculatePrice()
            cartViewModel.isCartEmpty.set(false)
        }
        val userType = prefs.getData(Constant.PREF_USER_TYPE)
        binding.isManager = userType == Constant.MANAGER_TYPE

        binding.confirmPay.setOnClickListener {
            saveDataToDB("Guest", "", "", "")
        }
        findViewById<Button>(R.id.continueShopping).setOnClickListener {
            finish()
        }
        binding.toGo.setOnClickListener {
            openToGoBottomSheet()
        }
    }

    private fun initRecyclerView() {
        binding.productList.apply {
            hasFixedSize()
            layoutManager =
                LinearLayoutManager(context)
            adapter =
                CartListItemAdapter(cartViewModel, cartViewModel.cartItemProductList, this@CartActivity, prefs)
        }
    }

    private fun calculatePrice(){
        val cartItemList = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
        var total = 0.0
        var subTotal = 0.0
        var tax = 0.0
        if(cartItemList.isNotEmpty()){
            for (i in cartItemList.indices){
                subTotal += (cartItemList[i].quantity?.let { cartItemList[i].foodPrice?.times(it) })?.toDouble()
                    ?: 0.0
            }
            tax = (subTotal * 8.25)/100
            total = subTotal + tax
            val roundOffTax = String.format("%.2f", tax)
            val roundOffSubTotal = String.format("%.2f", subTotal)
            roundOffTotal = String.format("%.2f", total)
            binding.subtotalAmount = roundOffSubTotal
            binding.taxValueAmount = roundOffTax
            binding.totalAmount = roundOffTotal
        }
    }

    override fun increaseQuantity(data: CartItemProduct, position: Int) {
        data.quantity = data.quantity?.plus(1)
        val adapter = binding.productList.adapter as CartListItemAdapter
        adapter.setNotifyDataChange()
        updateCart(data, position)
    }

    override fun decreaseQuantity(data: CartItemProduct, position: Int) {
        val adapter = binding.productList.adapter as CartListItemAdapter
        adapter.setNotifyDataChange()
        data.quantity = data.quantity?.minus(1)
        updateCart(data, position)
    }

    private fun openToGoBottomSheet() {
        val dialogFragment = ToGoDialogFragment.newInstance(this)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        dialogFragment.isCancelable = true
        dialogFragment.show(fragmentTransaction, "TO GO")
    }

    override fun submitData(firstName: String, lastName: String, email: String, mobile: String) {
        saveDataToDB(firstName, lastName, email, mobile)
    }

    private fun saveDataToDB(firstName: String, lastName: String, email: String, mobile: String){
        val transactionInfo = TransactionData(
            firstName = firstName,
            userId = prefs.getData(Constant.PREF_USER_ID) ?: "101",
            lastName =  lastName,
            mobile = mobile,
            email = email,
            quantity =  getCartCount(prefs),
            price = roundOffTotal.toDouble(),
            time = getCurrentTime(),
        )
        cartViewModel.confirmAndPayDBCall(transactionInfo)
        showToast(this, SUCCESSFULLY_PURCHASE)
        CoroutineScope(Dispatchers.IO).launch{
            delay(2000)
            val list = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
            list.clear()
            prefs.saveCartJsonObject(list)
            finish()
        }
    }
}