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

    companion object {
        const val CONTINUE_SHOPPING_CLICKED = "CONTINUE_SHOPPING_CLICKED"
    }

}