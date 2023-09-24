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
import com.codengineassessment.utils.Constant.Companion.PREF_USER_NAME
import com.codengineassessment.utils.Constant.Companion.PREF_USER_PROFILE_PIC
import com.codengineassessment.utils.Constant.Companion.PREF_USER_TYPE
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
                    loginViewModel.errorMessage.set("Pin should not be empty")
                    loginViewModel.isValidPin.set(false)
                }else if(loginViewModel.otp.length < 4){
                    loginViewModel.errorMessage.set("Pin should be 4 digit")
                    loginViewModel.isValidPin.set(false)
                } else if(loginViewModel.otp.length == 4){
                    if (loginViewModel.otp == "1111"){
                        prefs.saveData(PREF_USER_NAME, "Yash Bhardwaj")
                        prefs.saveData(PREF_USER_PROFILE_PIC, "user1")
                        prefs.saveData(PREF_USER_TYPE, "Manager")
                        ModuleMaster.navigateToMainActivity(this)
                    }else if(loginViewModel.otp =="2222"){
                        prefs.saveData(PREF_USER_NAME, "Tara Chand")
                        prefs.saveData(PREF_USER_PROFILE_PIC, "user2")
                        prefs.saveData(PREF_USER_TYPE, "Server")
                        ModuleMaster.navigateToMainActivity(this)
                    } else {
                        loginViewModel.errorMessage.set("Enter Valid Pin")
                        loginViewModel.isValidPin.set(false)
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