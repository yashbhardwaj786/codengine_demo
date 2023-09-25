package com.codengineassessment.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.R
import com.codengineassessment.common.BaseActivity
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.common.ModuleMaster
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.ActivityLoginBinding
import com.codengineassessment.databinding.ActivitySplashBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.viewmodel.LoginViewModel
import com.codengineassessment.ui.viewmodel.LoginViewModel.Companion.VERIFY_CLICK
import com.codengineassessment.ui.viewmodel.MainViewModel
import com.codengineassessment.ui.viewmodelfactory.LoginViewModelFactory
import com.codengineassessment.ui.viewmodelfactory.MainViewModelFactory
import com.codengineassessment.utils.Constant.Companion.EMPTY_PIN_MESSAGE
import com.codengineassessment.utils.Constant.Companion.MANAGER_IMAGE
import com.codengineassessment.utils.Constant.Companion.MANAGER_NAME
import com.codengineassessment.utils.Constant.Companion.MANAGER_PIN
import com.codengineassessment.utils.Constant.Companion.MANAGER_TYPE
import com.codengineassessment.utils.Constant.Companion.MANAGER_USER_ID
import com.codengineassessment.utils.Constant.Companion.PREF_USER_ID
import com.codengineassessment.utils.Constant.Companion.PREF_USER_NAME
import com.codengineassessment.utils.Constant.Companion.PREF_USER_PROFILE_PIC
import com.codengineassessment.utils.Constant.Companion.PREF_USER_TYPE
import com.codengineassessment.utils.Constant.Companion.PROPER_PIN_MESSAGE
import com.codengineassessment.utils.Constant.Companion.SERVER_IMAGE
import com.codengineassessment.utils.Constant.Companion.SERVER_NAME
import com.codengineassessment.utils.Constant.Companion.SERVER_PIN
import com.codengineassessment.utils.Constant.Companion.SERVER_TYPE
import com.codengineassessment.utils.Constant.Companion.SERVER_USER_ID
import com.codengineassessment.utils.Constant.Companion.VALID_PIN_MESSAGE
import com.codengineassessment.utils.hideKeyboard
import com.google.android.material.internal.ViewUtils.hideKeyboard
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class LoginActivity : BaseActivity() {

    override val kodein by kodein()
    private lateinit var loginViewModel: LoginViewModel
    private val factory by instance<LoginViewModelFactory>()
    private val binding: ActivityLoginBinding by lazyBinding()
    override val dataBinding: Boolean = true
    override val layoutResource: Int = R.layout.activity_login
    private val prefs: PreferenceProvider by instance()

    override fun getViewModel(): BaseViewModel {
        return loginViewModel
    }

    override fun initializeViewModel() {
        loginViewModel =
            ViewModelProvider(this, factory)[LoginViewModel::class.java]
    }

    override fun setBindings() {
        binding.viewModel = loginViewModel
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onNotificationReceived(data: Notify) {
        when(data.identifier){
            VERIFY_CLICK -> {
                hideKeyboard(binding.pinview)
                if(loginViewModel.otp.isEmpty()){
                    loginViewModel.errorMessage.set(EMPTY_PIN_MESSAGE)
                    loginViewModel.isValidPin.set(false)
                }else if(loginViewModel.otp.length < 4){
                    loginViewModel.errorMessage.set(PROPER_PIN_MESSAGE)
                    loginViewModel.isValidPin.set(false)
                } else if(loginViewModel.otp.length == 4){
                    when (loginViewModel.otp) {
                        MANAGER_PIN -> {
                            prefs.saveData(PREF_USER_NAME, MANAGER_NAME)
                            prefs.saveData(PREF_USER_PROFILE_PIC, MANAGER_IMAGE)
                            prefs.saveData(PREF_USER_TYPE, MANAGER_TYPE)
                            prefs.saveData(PREF_USER_ID, MANAGER_USER_ID)
                            ModuleMaster.navigateToMainActivity(this)
                        }
                        SERVER_PIN -> {
                            prefs.saveData(PREF_USER_NAME, SERVER_NAME)
                            prefs.saveData(PREF_USER_PROFILE_PIC, SERVER_IMAGE)
                            prefs.saveData(PREF_USER_TYPE, SERVER_TYPE)
                            prefs.saveData(PREF_USER_ID, SERVER_USER_ID)
                            ModuleMaster.navigateToMainActivity(this)
                        }
                        else -> {
                            loginViewModel.errorMessage.set(VALID_PIN_MESSAGE)
                            loginViewModel.isValidPin.set(false)
                        }
                    }

                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.pinview.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(cs: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
                loginViewModel.isValidPin.set(true)
            }

            override fun beforeTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
            }

            override fun afterTextChanged(arg0: Editable) {
                if (loginViewModel.otp.length == 4) {
                        loginViewModel.onVerifyClick()
                }
            }
        })

        binding.pinview.setOnEditorActionListener { _, actionId, event ->
            if (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE) {
                loginViewModel.onVerifyClick()
            }
            false
        }
    }
}