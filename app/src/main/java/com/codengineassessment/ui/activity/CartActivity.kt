package com.codengineassessment.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.codengineassessment.R
import com.codengineassessment.common.BaseActivity
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.ActivityCartBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.adapter.CartListItemAdapter
import com.codengineassessment.ui.adapter.CategoryItemAdapter
import com.codengineassessment.ui.viewmodel.CartViewModel
import com.codengineassessment.ui.viewmodel.CartViewModel.Companion.CONTINUE_SHOPPING_CLICKED
import com.codengineassessment.ui.viewmodel.CartViewModel.Companion.DECREASE_QUANTITY
import com.codengineassessment.ui.viewmodel.CartViewModel.Companion.INCREASE_QUANTITY
import com.codengineassessment.ui.viewmodelfactory.CartViewModelFactory
import com.codengineassessment.utils.Constant
import com.codengineassessment.utils.showCartCount
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class CartActivity : BaseActivity() {
    override val kodein by kodein()
    private lateinit var cartViewModel: CartViewModel
    private val factory by instance<CartViewModelFactory>()
    private val binding: ActivityCartBinding by lazyBinding()
    override val dataBinding: Boolean = true
    override val layoutResource: Int = R.layout.activity_cart
    private val prefs: PreferenceProvider by instance()
    private lateinit var cartCountHome: TextView

    override fun getViewModel(): BaseViewModel {
        return cartViewModel
    }

    override fun initializeViewModel() {
        cartViewModel =
            ViewModelProvider(this, factory)[CartViewModel::class.java]
    }

    override fun setBindings() {
        binding.viewModel = cartViewModel
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onNotificationReceived(data: Notify) {
        when (data.identifier) {
            CONTINUE_SHOPPING_CLICKED -> {
                finish()
            }
            INCREASE_QUANTITY -> {
                val cartItemProduct = data.arguments[0] as CartItemProduct
                val position = data.arguments[1] as Int
                cartItemProduct.quantity = cartItemProduct.quantity?.plus(1)
                val adapter = binding.productList.adapter as CartListItemAdapter
                adapter.setNotifyDataChange()
                updateCart(cartItemProduct, position)
            }
            DECREASE_QUANTITY -> {
                val cartItemProduct = data.arguments[0] as CartItemProduct
                val position = data.arguments[1] as Int
                val adapter = binding.productList.adapter as CartListItemAdapter
                adapter.setNotifyDataChange()
                cartItemProduct.quantity = cartItemProduct.quantity?.minus(1)
                updateCart(cartItemProduct, position)
            }
        }
    }

    private fun updateCart(cartItemProduct: CartItemProduct, position: Int){
        val cartList = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
        if(cartItemProduct.quantity == 0){
            cartList.removeAt(position)
            val adapter = binding.productList.adapter as CartListItemAdapter
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setToolBar(getString(R.string.checkout), true)
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
    }

    private fun initRecyclerView() {
        binding.productList.apply {
            hasFixedSize()
            layoutManager =
                LinearLayoutManager(context)
            adapter =
                CartListItemAdapter(cartViewModel, cartViewModel.cartItemProductList, prefs)
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
            val roundOffTotal = String.format("%.2f", total)
            binding.subtotalAmount = roundOffSubTotal
            binding.taxValueAmount = roundOffTax
            binding.totalAmount = roundOffTotal
        }
    }
}