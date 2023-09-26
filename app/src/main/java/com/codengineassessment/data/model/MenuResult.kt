package com.codengineassessment.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class MenuResult(
    var categories: ArrayList<Categories>? = null,
)

data class Categories(
    val categoryId: Int? = null,
    val categoryName: String? = null,
    val categoryImage: String? = null,
    val food: ArrayList<Food>? = null,
    var isSelected: Boolean = false,
)
@Parcelize
data class Food(
    val foodId: Int? = null,
    val foodName: String? = null,
    val foodImage: String? = null,
    val foodPrice: Long? = null,
    val quantity: String? = null,
): Parcelable