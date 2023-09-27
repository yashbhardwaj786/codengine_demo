package com.codengineassessment.repository

import android.content.Context
import com.codengineassessment.data.model.Categories
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.model.MenuResult
import com.codengineassessment.utils.loadJSONFromAsset
import com.codengineassessment.utils.nullSafeErrorLogging
import org.json.JSONObject
import java.lang.Exception

class MenuRepository {

    suspend fun fetchMenus(context: Context): Any {
        val menuResultObject = MenuResult()
        val categoryData = ArrayList<Categories>()
        return try {
            val obj = JSONObject(loadJSONFromAsset(context, "menu.json"))
            val categoriesArr = obj.optJSONArray("categories")
            for (i in 0 until categoriesArr.length()) {
                val categoriesJsonObj = categoriesArr.getJSONObject(i)
                val categoryId = categoriesJsonObj.optInt("categoryId")
                val categoryName = categoriesJsonObj.optString("categoryName")
                val categoryImage = categoriesJsonObj.optString("categoryImage")
                val foodArr = categoriesJsonObj.optJSONArray("food")
                val food = ArrayList<Food>()
                for (i in 0 until foodArr.length()) {
                    val foodJsonObj = foodArr.getJSONObject(i)
                    val foodId = foodJsonObj.optInt("foodId")
                    val foodName = foodJsonObj.optString("foodName")
                    val foodImage = foodJsonObj.optString("foodImage")
                    val foodPrice = foodJsonObj.optLong("foodPrice")
                    val quantity = foodJsonObj.optString("quantity")
                    val foodItem = Food(foodId, foodName, foodImage, foodPrice, quantity)
                    food.add(foodItem)
                }
                val categoryItem = Categories(categoryId, categoryName, categoryImage, food)
                categoryData.add(categoryItem)
            }
            menuResultObject.apply {
                categories = categoryData
            }
        } catch (ex: Exception) {
            nullSafeErrorLogging(ex.localizedMessage)
        }
    }
}