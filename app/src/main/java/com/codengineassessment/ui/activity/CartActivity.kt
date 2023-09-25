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
import com.codengineassessment.ui.viewmodel.CartViewModel
import com.codengineassessment.ui.viewmodel.CartViewModel.Companion.CONTINUE_SHOPPING_CLICKED
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
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setToolBar(getString(R.string.checkout), true)
        val cartCountHome = findViewById<TextView>(R.id.cartCount)
        showCartCount(cartCountHome, prefs)
        val cartItemProduct = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
        cartViewModel.cartItemProductList = cartItemProduct
        if (cartItemProduct.isEmpty()) {
            cartViewModel.isCartEmpty.set(true)
        } else {
            initRecyclerView()
            cartViewModel.isCartEmpty.set(false)
        }
        val userType = prefs.getData(Constant.PREF_USER_TYPE)
        binding.isManager = userType == Constant.MANAGER_TYPE
    }

    private fun initRecyclerView() {
        binding.productList?.apply {
            hasFixedSize()
            layoutManager =
                LinearLayoutManager(context)
            adapter =
                CartListItemAdapter(cartViewModel, cartViewModel.cartItemProductList, prefs)
        }
    }
}