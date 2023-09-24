package com.codengineassessment.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codengineassessment.notifiers.Loader
import com.codengineassessment.notifiers.Notifier
import com.codengineassessment.notifiers.NotifyException

open abstract class BaseViewModel : ViewModel() {
    /**
     * Use notifier to send any message and data to the activity from ViewModel
     */
    val notifier = Notifier(viewModelScope)

    fun showProgress() {
        notifier.notify(Loader(true))
    }

    fun hideProgress() {
        notifier.notify(Loader(false))
    }

    fun showError(error: Exception) {
        notifier.notify(NotifyException(error))
    }

    override fun onCleared() {
        notifier.close()
        super.onCleared()
    }

}