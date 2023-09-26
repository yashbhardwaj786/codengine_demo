package com.codengineassessment.ui.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.R
import com.codengineassessment.common.BaseActivity
import com.codengineassessment.common.BaseDialogFragment
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.DialogLayoutProductDescriptionBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.viewmodel.MenuViewModel
import com.codengineassessment.ui.viewmodel.MenuViewModel.Companion.ADD_TO_CART_CLICKED
import com.codengineassessment.ui.viewmodelfactory.MenuViewModelFactory
import com.codengineassessment.utils.Constant
import com.codengineassessment.utils.setupFullHeight
import com.codengineassessment.utils.showToast
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance
import org.parceler.Parcels

class ProductDescriptionDialogFragment: BaseDialogFragment(), KodeinAware {
    override val kodein by kodein()
    private val factory by instance<MenuViewModelFactory>()
    private val prefs by instance<PreferenceProvider>()
    private lateinit var homeViewModel: MenuViewModel
    lateinit var binding: DialogLayoutProductDescriptionBinding
    private var foodData: Food? = null
    private var productCount = 1
    private var total = 0.0
    private var addToCartContract: AddToCartContract? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflater.let {
            DataBindingUtil.inflate<DialogLayoutProductDescriptionBinding>(
                it,
                R.layout.dialog_layout_product_description,
                null,
                false
            )
        }.apply {
            this.viewModel = homeViewModel
            this?.executePendingBindings()
        }
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_MODE_CHANGED)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.close.setOnClickListener {
            dialog?.dismiss()
        }

        Parcels.unwrap<Food>(requireArguments()?.getParcelable(Constant.BOTTOM_DATA))
            ?.let { data ->
                foodData = data
                binding.data = data as Food
                binding.quantityValue = productCount
            }
        foodData?.let {
            calculatePrice(it)
        }


        binding.minus.setOnClickListener {
            if(productCount > 1){
                productCount = productCount.minus(1)
                binding.quantityValue = productCount
                foodData?.let {
                    calculatePrice(it)
                }
            }
        }
        binding.plus.setOnClickListener {
            productCount = productCount.plus(1)
            binding.quantityValue = productCount
            foodData?.let {
                calculatePrice(it)
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = dialog ?: BottomSheetDialog(
            activity as BaseActivity,
            R.style.TransParentBottomSheetDialog
        )
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        if (dialog is BottomSheetDialog) {
            dialog.behavior.skipCollapsed = true
            dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog =
                dialogInterface as BottomSheetDialog
            context?.let {
                setupFullHeight(bottomSheetDialog, it)
            }
        }

        return object :
            BottomSheetDialog(activity as BaseActivity, R.style.TransParentBottomSheetDialog) {
            override fun onBackPressed() {
                super.onBackPressed()
                getDialog()?.dismiss()
            }
        }
    }


    override fun getViewModel(): BaseViewModel? {
        return homeViewModel
    }

    override fun onNotificationReceived(data: Notify) {

        when (data.identifier) {
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
                            quantity = productCount
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
                            it[pos].quantity = it[pos].quantity?.plus(productCount)
                        }else {
                            cartItem.apply {
                                foodId = foodData.foodId
                                foodName = foodData.foodName
                                foodImage = foodData.foodImage
                                foodPrice = foodData.foodPrice
                                quantity = productCount
                            }
                            it.add(cartItem)
                        }
                    }
                }
                prefs.saveCartJsonObject(cartList)
                showToast(requireContext(), Constant.CART_ITEM_ADDED)
                addToCartContract?.updateCartValue()
                dialog?.dismiss()
            }

        }
    }

    override fun onResume() {
        val params: ViewGroup.LayoutParams = dialog?.window!!.attributes
        params.width = WindowManager.LayoutParams.MATCH_PARENT
        params.height = WindowManager.LayoutParams.MATCH_PARENT
        dialog?.window!!.attributes = params as WindowManager.LayoutParams
        dialog?.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        super.onResume()
    }

    override fun initializeViewModel() {
        homeViewModel =
            ViewModelProvider(this, factory).get(MenuViewModel::class.java)
    }
    private fun calculatePrice(data: Food){
        total = data.foodPrice?.toDouble()?.times(productCount) ?: 0.0
        val roundOffTotal = String.format("%.2f", total)
        binding.totalAmount = roundOffTotal
    }

    fun setAddToCartContractListener(addToCartContract: AddToCartContract) {
        this.addToCartContract = addToCartContract
    }

    companion object {
    }
}