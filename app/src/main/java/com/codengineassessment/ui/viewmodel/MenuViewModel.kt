package com.codengineassessment.ui.viewmodel

import android.content.Context
import androidx.lifecycle.viewModelScope
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.model.Categories
import com.codengineassessment.data.model.Food
import com.codengineassessment.data.model.MenuResult
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.repository.MenuRepository
import com.codengineassessment.utils.Constant.Companion.ON_DATA_FAILURE
import com.codengineassessment.utils.Constant.Companion.ON_START
import com.codengineassessment.utils.EWException
import kotlinx.coroutines.launch

class MenuViewModel(
    private val repository: MenuRepository
): BaseViewModel() {
    var categoryList = ArrayList<Categories>()
    private val categorySelectedList = ArrayList<Categories>()
    var productList = ArrayList<Food>()
    fun fetchMenuCategory(context: Context){
        viewModelScope.launch {
            notifier.notify(Notify(ON_START, ""))
            val response = repository.fetchMenus(context)
            response.let {
                if (it is MenuResult) {
                    notifier.notify(Notify(ON_DATA_FETCH, it))
                    return@launch
                } else if (it is EWException) {
                    it.printStackTrace()
                    notifier.notify(Notify(ON_DATA_FAILURE, it.localizedMessage))
                }
            }

        }
    }

    fun onCategoryClicked(data: Categories, pos: Int) {
        if (!this.categorySelectedList.contains(data))
            this.categorySelectedList.add(data)
        var position = -1
        run loop@{
            categoryList.forEach {
                position++
                if (it.categoryName == data.categoryName) {
                    if (!it.isSelected) {
                        for (item in categoryList.indices) {
                            categoryList[item].isSelected =
                                categoryList[item].categoryName == it.categoryName
                        }
                    }
                }
            }
        }
        notifier.notify(Notify(CATEGORY_CLICKED, pos))
    }

    companion object {
        const val ON_DATA_FETCH = "ON_DATA_FETCH"
        const val CATEGORY_CLICKED = "CATEGORY_CLICKED"
    }

}