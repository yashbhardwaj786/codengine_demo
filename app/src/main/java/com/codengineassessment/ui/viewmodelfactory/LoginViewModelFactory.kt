package com.codengineassessment.ui.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.ui.viewmodel.LoginViewModel
import com.codengineassessment.ui.viewmodel.MainViewModel

class LoginViewModelFactory() : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  LoginViewModel() as T
    }
}