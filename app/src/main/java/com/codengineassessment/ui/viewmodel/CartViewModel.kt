package com.codengineassessment.ui.viewmodel

import androidx.databinding.ObservableField
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

    fun confirmAndPayDBCall(transactionInfo: TransactionData){
        CoroutineScope(Dispatchers.IO).launch{
            repository.insert(transactionInfo)
        }
    }

}