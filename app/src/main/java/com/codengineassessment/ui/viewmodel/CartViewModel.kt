package com.codengineassessment.ui.viewmodel

import android.content.Context
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.model.CartItemProduct
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.repository.CartRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CartViewModel(
    private val repository: CartRepository,
    private val prefs: PreferenceProvider
): BaseViewModel() {
    var isCartEmpty = ObservableField(false)

    var cartItemProductList = ArrayList<CartItemProduct>()
    val allWords: LiveData<List<TransactionData>> = repository.allUsers(prefs).asLiveData()

    fun confirmAndPayDBCall(transactionInfo: TransactionData){
        CoroutineScope(Dispatchers.IO).launch{
            repository.insert(transactionInfo)
        }
    }

}