package com.codengineassessment.ui.viewmodel

import com.codengineassessment.data.model.CartItemProduct

interface CartContract {
    fun increaseQuantity(data: CartItemProduct, position: Int)
    fun decreaseQuantity(data: CartItemProduct, position: Int)
}