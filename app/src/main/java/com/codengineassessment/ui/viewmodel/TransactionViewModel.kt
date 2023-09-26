package com.codengineassessment.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.data.db.TransactionData
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.repository.CartRepository

class TransactionViewModel(
    private val repository: CartRepository,
    private val prefs: PreferenceProvider
): BaseViewModel() {

    val allTransaction: LiveData<List<TransactionData>> = repository.allUsers(prefs).asLiveData()

    companion object {
    }

}