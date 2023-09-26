package com.codengineassessment.ui.viewmodel

import androidx.databinding.ObservableField
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.notifiers.Notify

class ToGoViewModel(): BaseViewModel() {

    var firstNameErrorMessage = ObservableField("")
    var mobileNumberErrorMessage = ObservableField("")
    var emailErrorMessage = ObservableField("")
    var firstName = ""
    var lastName = ""
    var mobile = ""
    var email = ""

    fun submit(){
        notifier.notify(Notify(SUBMIT_CLICK, ""))
    }

    companion object {
        const val SUBMIT_CLICK = "SUBMIT_CLICK"
    }

}