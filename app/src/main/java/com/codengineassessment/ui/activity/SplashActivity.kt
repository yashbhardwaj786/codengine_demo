package com.codengineassessment.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.codengineassessment.R
import com.codengineassessment.common.BaseActivity
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.common.ModuleMaster
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.ActivitySplashBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.viewmodel.MainViewModel
import com.codengineassessment.ui.viewmodelfactory.MainViewModelFactory
import com.codengineassessment.utils.Constant.Companion.PREF_USER_NAME
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class SplashActivity : BaseActivity() {

    override val kodein by kodein()
    private lateinit var mainViewModel: MainViewModel
    private val factory by instance<MainViewModelFactory>()
    private val binding: ActivitySplashBinding by lazyBinding()
    override val dataBinding: Boolean = true
    override val layoutResource: Int = R.layout.activity_splash
    private val prefs: PreferenceProvider by instance()

    override fun getViewModel(): BaseViewModel {
        return mainViewModel
    }

    override fun initializeViewModel() {
        mainViewModel =
            ViewModelProvider(this, factory)[MainViewModel::class.java]
    }

    override fun setBindings() {
        binding.viewModel = mainViewModel
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onNotificationReceived(data: Notify) {
        when(data.identifier){

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch{
            delay(2000)
            goAhead()
        }
    }

    private fun goAhead(){
        if(prefs.getData(PREF_USER_NAME).isNullOrEmpty()){
            ModuleMaster.navigateToLoginActivity(this)
        }else {
            ModuleMaster.navigateToMainActivity(this)
        }
    }
}