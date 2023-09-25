package com.codengineassessment.ui.viewmodel

import androidx.databinding.ObservableField
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.notifiers.Notify


class CartViewModel(
): BaseViewModel() {
    var isCartEmpty = ObservableField(false)
    var cartItemProductList = ArrayList<CartItemProduct>()

    fun continueShopping(){
        notifier.notify(Notify(CONTINUE_SHOPPING_CLICKED, ""))
    }

    fun increaseQuantityCLick(data: CartItemProduct, position: Int){
        notifier.notify(Notify(INCREASE_QUANTITY, data, position))
    }
    fun decreaseQuantityCLick(data: CartItemProduct, position: Int){
        notifier.notify(Notify(DECREASE_QUANTITY, data, position))
    }

    companion object {
        const val CONTINUE_SHOPPING_CLICKED = "CONTINUE_SHOPPING_CLICKED"
        const val INCREASE_QUANTITY = "INCREASE_QUANTITY"
        const val DECREASE_QUANTITY = "DECREASE_QUANTITY"
    }

}