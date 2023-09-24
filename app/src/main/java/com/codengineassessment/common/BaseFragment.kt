package com.codengineassessment.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.codengineassessment.notifiers.Loader
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.notifiers.NotifyException
import com.codengineassessment.notifiers.NotifyRetry
import com.codengineassessment.utils.Utility
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.kodein

abstract class BaseFragment : Fragment(), KodeinAware {
    override val kodein by kodein()
    private lateinit var baseBinding: ViewDataBinding

    @ExperimentalCoroutinesApi
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val activity = context as BaseActivity
        if (!dataBinding) {
            inflater.inflate(layoutResource, container, false)
        } else {
            baseBinding = DataBindingUtil.inflate(inflater, layoutResource, container, false)
        }
        initializeViewModel()
        setBindings()
        getViewModel()?.let {
            it.notifier.receive { event ->
                when (event) {
                    is NotifyException -> {
                        event.exception.message?.let { msg ->

                        }
                    }
                    is Loader -> {
                        if (event.loading) {
                            Utility.showProgressDialog(getActivity() as BaseActivity, true)
                        } else {
                            Utility.hideProgressDialog()
                        }
                    }
                    is NotifyRetry -> {

                    }
                    else -> {
                        onNotificationReceived(event)
                    }
                }
            }
        }
        return baseBinding.root
    }

    fun getBinding(): ViewDataBinding {
        return baseBinding
    }
    abstract val dataBinding: Boolean
    abstract val layoutResource: Int
    abstract fun getViewModel(): BaseViewModel?
    abstract fun onNotificationReceived(data: Notify)
    abstract fun setBindings()
    abstract fun initializeViewModel()

    inline fun <reified T> lazyBinding(): Lazy<T> = lazy { getBinding() as T }
}
