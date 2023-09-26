package com.codengineassessment.ui.viewmodel

import android.content.Context
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.repository.CartRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CartViewModel(
    private val repository: CartRepository
): BaseViewModel() {
    var isCartEmpty = ObservableField(false)
    var cartItemProductList = ArrayList<CartItemProduct>()
    val allWords: LiveData<List<TransactionData>> = repository.allUsers.asLiveData()

    fun confirmAndPayDBCall(){
        val transactionInfo = TransactionData(
            firstName = "Yash",
            userId = "101",
        lastName =  "Bhardwaj",
        mobile = "8386915333",
        email = "yashpremsharma@gmail.com",
        quantity =  3,
        price = 500.00,
        time = "09.00 AM",
        )

        CoroutineScope(Dispatchers.IO).launch{
            repository.insert(transactionInfo)
        }
//        viewModelScope.launch {
//            repository.insert(transactionInfo)
//        }

    }

}