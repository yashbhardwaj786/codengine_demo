package com.codengineassessment.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.codengineassessment.R
import com.codengineassessment.common.BaseFragment
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.model.Categories
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.model.MenuResult
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.FragmentMenuBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.activity.MainActivity
import com.codengineassessment.ui.adapter.CategoryItemAdapter
import com.codengineassessment.ui.adapter.ProductListItemAdapter
import com.codengineassessment.ui.bottomsheet.AddToCartContract
import com.codengineassessment.ui.bottomsheet.ProductDescriptionDialogFragment
import com.codengineassessment.ui.viewmodel.MenuViewModel
import com.codengineassessment.ui.viewmodel.MenuViewModel.Companion.ADD_TO_CART_CLICKED
import com.codengineassessment.ui.viewmodel.MenuViewModel.Companion.CATEGORY_CLICKED
import com.codengineassessment.ui.viewmodel.MenuViewModel.Companion.ON_DATA_FETCH
import com.codengineassessment.ui.viewmodel.MenuViewModel.Companion.PRODUCT_CARD_CLICKED
import com.codengineassessment.ui.viewmodelfactory.MenuViewModelFactory
import com.codengineassessment.utils.Constant
import com.codengineassessment.utils.Constant.Companion.CART_ITEM_ADDED
import com.codengineassessment.utils.showCartCount
import com.codengineassessment.utils.showToast
import org.kodein.di.generic.instance
import org.parceler.Parcels

class MenuFragment : BaseFragment(), AddToCartContract {
    private lateinit var mainActivity: MainActivity
    private val factory by instance<MenuViewModelFactory>()
    private val prefs by instance<PreferenceProvider>()
    private lateinit var menuViewModel: MenuViewModel
    private val binding: FragmentMenuBinding by lazyBinding()
    override val dataBinding: Boolean = true
    override val layoutResource: Int = R.layout.fragment_menu

    override fun getViewModel(): BaseViewModel {
        return menuViewModel
    }

    override fun initializeViewModel() {
        menuViewModel = ViewModelProvider(this, factory)[MenuViewModel::class.java]
    }

    override fun onNotificationReceived(data: Notify) {
        when (data.identifier) {
            ON_DATA_FETCH -> {
                val response = data.arguments[0] as MenuResult
                response.categories?.let {
                    if(it.isNotEmpty()){
                        initRecyclerView(it)
                    }
                }
            }

            CATEGORY_CLICKED -> {
                val position = data.arguments[0] as Int
                menuViewModel.categoryList[position].food?.let {
                    menuViewModel.productList = it
                    initProductRecyclerView()
                }

                val adapter = binding.categoryList.adapter as CategoryItemAdapter
                adapter.setNotifyDataChange()
            }
            PRODUCT_CARD_CLICKED -> {
                val foodData = data.arguments[0] as Food
                openProductDescriptionBottomSheet(foodData)
            }

            ADD_TO_CART_CLICKED -> {
                val foodData = data.arguments[0] as Food
                val cartList = prefs.getCartJsonObject() ?: ArrayList<CartItemProduct>()
                val cartItem = CartItemProduct()
                cartList.let {
                    if(it.isEmpty()){
                        cartItem.apply {
                            foodId = foodData.foodId
                            foodName = foodData.foodName
                            foodImage = foodData.foodImage
                            foodPrice = foodData.foodPrice
                            quantity = 1
                        }
                        it.add(cartItem)
                    }else {
                        var pos = 0
                        var isSameItemAvailable = false
                        for(i in it.indices){
                            if(it[i].foodId ==foodData.foodId){
                                pos = i
                                isSameItemAvailable = true
                                break
                            }else {
                                isSameItemAvailable = false
//                                break
                            }
                        }
                        if(isSameItemAvailable){
                            it[pos].quantity = it[pos].quantity?.plus(1)
                        }else {
                            cartItem.apply {
                                foodId = foodData.foodId
                                foodName = foodData.foodName
                                foodImage = foodData.foodImage
                                foodPrice = foodData.foodPrice
                                quantity = 1
                            }
                            it.add(cartItem)
                        }
                    }
                }
                prefs.saveCartJsonObject(cartList)
                showToast(requireContext(), CART_ITEM_ADDED)
                showCartCount(mainActivity.cartCountHome, prefs)
            }
        }
    }

    override fun setBindings() {
        binding.viewModel = menuViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = context as MainActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        menuViewModel.fetchMenuCategory(requireContext())
    }
    override fun onResume() {
        super.onResume()
        mainActivity.setToolBar(getString(R.string.menu))

    }
    private fun initRecyclerView(categoryProductsList: ArrayList<Categories>) {
        categoryProductsList[0].isSelected = true
        categoryProductsList[0].food?.let {
            if(it.isNotEmpty()){
                menuViewModel.productList = it
                initProductRecyclerView()
            }
        }

        menuViewModel.categoryList = categoryProductsList
        binding.categoryList?.apply {
            hasFixedSize()
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = CategoryItemAdapter(menuViewModel, menuViewModel.categoryList)
        }
    }

    private fun initProductRecyclerView() {
        if (binding.productList != null) {
            binding.productList.apply {
                val gridLayoutManager = GridLayoutManager(context, 2)
                layoutManager = gridLayoutManager
                adapter = ProductListItemAdapter(menuViewModel.productList, menuViewModel, prefs)
            }
        }
    }

    private fun openProductDescriptionBottomSheet(data: Food) {
        val dialogFragment = ProductDescriptionDialogFragment()
        val args = Bundle()
        args.putParcelable(Constant.BOTTOM_DATA, Parcels.wrap(data))
        dialogFragment.arguments = args
        val fragmentTransaction = this.childFragmentManager.beginTransaction()
        dialogFragment.isCancelable = true
        dialogFragment.setAddToCartContractListener(this)
        dialogFragment.show(fragmentTransaction, "SUBMIT REVIEW NOTIFICATION")
    }

    override fun updateCartValue() {
        showCartCount(mainActivity.cartCountHome, prefs)
    }
}