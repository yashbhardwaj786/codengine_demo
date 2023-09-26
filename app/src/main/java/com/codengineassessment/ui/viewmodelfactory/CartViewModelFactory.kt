package com.codengineassessment.ui.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.repository.CartRepository
import com.codengineassessment.ui.viewmodel.CartViewModel

class CartViewModelFactory(
    private val repository: CartRepository,
    private val prefs: PreferenceProvider
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  CartViewModel(repository, prefs) as T
    }
}