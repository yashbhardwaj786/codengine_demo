package com.codengineassessment.ui.viewmodel

import android.database.Observable
import androidx.databinding.ObservableField
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.notifiers.Notify

class LoginViewModel(): BaseViewModel() {
    var otp: String = ""
    var errorMessage=  ObservableField<String>("")

    var isValidPin =  ObservableField<Boolean>(true)

    fun onVerifyClick(){
        notifier.notify(Notify(VERIFY_CLICK, otp))
    }

    companion object {
        const val VERIFY_CLICK = "VERIFY_CLICK"
    }

}