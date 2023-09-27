package com.codengineassessment.ui.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.repository.MenuRepository
import com.codengineassessment.ui.viewmodel.MenuViewModel

class MenuViewModelFactory(
    private val repository: MenuRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  MenuViewModel(repository) as T
    }
}