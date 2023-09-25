package com.codengineassessment.data.model

data class CartItemProduct(
    var foodId: Int? = null,
    var foodName: String? = null,
    var foodImage: String? = null,
    var foodPrice: Long? = null,
    var quantity: Int? = null,
)