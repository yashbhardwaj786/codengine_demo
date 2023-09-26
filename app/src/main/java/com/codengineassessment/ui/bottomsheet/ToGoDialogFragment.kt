package com.codengineassessment.ui.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.R
import com.codengineassessment.common.BaseDialogFragment
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.databinding.DialogLayoutTogoBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.activity.CartActivity
import com.codengineassessment.ui.viewmodel.ToGoViewModel
import com.codengineassessment.ui.viewmodel.ToGoViewModel.Companion.SUBMIT_CLICK
import com.codengineassessment.ui.viewmodelfactory.ToGoViewModelFactory
import com.codengineassessment.utils.checkValidationForFields
import com.codengineassessment.utils.isValidEmail
import com.codengineassessment.utils.setupFullHeight
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.instance

class ToGoDialogFragment: BaseDialogFragment(), KodeinAware {
    override val kodein by kodein()
    private val factory by instance<ToGoViewModelFactory>()
    private lateinit var toGoViewModel: ToGoViewModel
    lateinit var binding: DialogLayoutTogoBinding
    private var toGoContract: ToGoContract? = null
    private var isNameValid = false
    private var isPhoneValid = false
    private var isEmailValid = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = inflater.let {
            DataBindingUtil.inflate<DialogLayoutTogoBinding>(
                it,
                R.layout.dialog_layout_togo,
                null,
                false
            )
        }.apply {
            this.viewModel = toGoViewModel
            this?.executePendingBindings()
        }
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.close.setOnClickListener {
            dialog?.dismiss()
        }

        editTextFocusLostListener(binding.firstName, binding.firstnameError, FIRST_NAME)
        editTextFocusLostListener(binding.email, binding.emailError, EMAIL)
        editTextFocusLostListener(binding.mobileNumber, binding.mobileNumberError, PHONE)

        editTextChangeListener(binding.firstName, binding.firstnameError,  FIRST_NAME)
        editTextChangeListener(binding.email, binding.emailError, EMAIL)
        editTextChangeListener(binding.mobileNumber, binding.mobileNumberError, PHONE)

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = dialog ?: BottomSheetDialog(
            activity as CartActivity,
            R.style.TransParentBottomSheetDialog
        )
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        if (dialog is BottomSheetDialog) {
            dialog.behavior.skipCollapsed = true
            dialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog =
                dialogInterface as BottomSheetDialog
            context?.let {
                setupFullHeight(bottomSheetDialog, it)
            }
        }

        return object :
            BottomSheetDialog(activity as CartActivity, R.style.TransParentBottomSheetDialog) {
            override fun onBackPressed() {
                super.onBackPressed()
                getDialog()?.dismiss()
            }
        }
    }


    override fun getViewModel(): BaseViewModel? {
        return toGoViewModel
    }

    override fun onNotificationReceived(data: Notify) {

        when (data.identifier) {
            SUBMIT_CLICK -> {
                toGoContract?.submitData(toGoViewModel.firstName, toGoViewModel.lastName,
                    toGoViewModel.email, toGoViewModel.mobile)
            }

        }
    }

    override fun onResume() {
        val params: ViewGroup.LayoutParams = dialog?.window!!.attributes
        params.width = WindowManager.LayoutParams.MATCH_PARENT
        params.height = WindowManager.LayoutParams.MATCH_PARENT
        dialog?.window!!.attributes = params as WindowManager.LayoutParams
        dialog?.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        super.onResume()
    }

    override fun initializeViewModel() {
        toGoViewModel =
            ViewModelProvider(this, factory).get(ToGoViewModel::class.java)
    }

    companion object {
        const val FIRST_NAME = "first_name"
        const val PHONE = "phone"
        const val EMAIL = "email"
        fun newInstance(toGoContract: ToGoContract): ToGoDialogFragment {
            return ToGoDialogFragment().apply {
                this.toGoContract = toGoContract
            }
        }
    }

    private fun editTextFocusLostListener(
        editText: EditText,
        errorText: TextView,
        componentValue: String
    ) {

        editText.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                when (componentValue) {
                    FIRST_NAME -> {
                        if (toGoViewModel.firstName.isNullOrEmpty()) {
                            toGoViewModel.firstNameErrorMessage.set("First Name Required")
                            errorText.visibility = View.VISIBLE
                        }
                    }

                    PHONE -> {
                        if (toGoViewModel.mobile.isNullOrEmpty()) {
                            toGoViewModel.mobileNumberErrorMessage.set("Please enter 10 digit Phone Number")
                            errorText.visibility = View.VISIBLE
                        } else if (toGoViewModel.mobile?.length!! < 10) {
                            toGoViewModel.mobileNumberErrorMessage.set("Please enter 10 digit Phone Number")
                            errorText.visibility = View.VISIBLE
                        }
                    }

                    EMAIL -> {
                        if (toGoViewModel.email.isNullOrEmpty()) {
                            toGoViewModel.emailErrorMessage.set("Please enter email address")
                            errorText.visibility = View.VISIBLE
                        } else if (!toGoViewModel.email.isValidEmail()) {
                            toGoViewModel.emailErrorMessage.set("Please enter valid email address")
                            errorText.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }
    }
    private fun editTextChangeListener(
        editText: EditText,
        errorText: TextView,
        componentValue: String
    ) {

        editText.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(cs: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
                errorText.text = ""
                errorText.visibility = View.INVISIBLE

                when (componentValue) {
                    FIRST_NAME -> {
                        if (cs.toString().isNullOrEmpty()) {
                            isNameValid = false
                            toGoViewModel.firstNameErrorMessage.set("First Name Required")
                            errorText.visibility = View.VISIBLE
                        } else {
                            isNameValid = true
                        }
                    }

                    PHONE -> {
                        when {
                            cs.toString().isNullOrEmpty() -> {
                                isPhoneValid = false
                                toGoViewModel.mobileNumberErrorMessage.set("Please enter 10 digit Phone Number")
                                errorText.visibility = View.VISIBLE
                            }
                            cs.toString().length < 10 -> {
                                isPhoneValid = false
                            }
                            else -> {
                                isPhoneValid = true
                            }
                        }
                    }

                    EMAIL -> {
                        when {
                            cs.toString().isNullOrEmpty() -> {
                                isEmailValid = false
                                toGoViewModel.emailErrorMessage.set("Please enter email address")
                                errorText.visibility = View.VISIBLE
                            }
                            !cs.toString().isValidEmail() -> {
                                isEmailValid = false
                            }
                            else -> {
                                isEmailValid = true
                            }
                        }
                    }
                }
                checkValidations()
            }

            override fun beforeTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
            }

            override fun afterTextChanged(arg0: Editable) {
            }
        })
    }

    fun checkValidations() {
        checkValidationForFields(
            isNameValid,
            isPhoneValid,
            isEmailValid,
            binding.save,
            requireContext()
        )
    }

}