package com.codengineassessment.common

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.codengineassessment.R
import com.codengineassessment.utils.Utility
import com.codengineassessment.notifiers.Loader
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.notifiers.NotifyException
import com.codengineassessment.notifiers.NotifyRetry
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein

abstract class BaseActivity  : AppCompatActivity(), KodeinAware {
    override val kodein by kodein()
    private lateinit var baseBinding: ViewDataBinding
    var toolbar: Toolbar? = null
    var title: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        if (!dataBinding) {
            setContentView(layoutResource)
        } else {
            baseBinding = DataBindingUtil.setContentView(this, layoutResource)
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
                            Utility.showProgressDialog(this)
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

    fun setToolBar(titleText: String, showBackButton: Boolean = false) {
        toolbar = findViewById(R.id.toolbar)
        title = findViewById(R.id.title)
        title?.text = titleText
        title?.maxLines = 1
        title?.ellipsize = TextUtils.TruncateAt.END
        toolbar?.contentInsetStartWithNavigation = 0
        setSupportActionBar(toolbar)
        val backIconLayout = findViewById<LinearLayout>(R.id.backIconLayout)
        if(showBackButton){
            backIconLayout.visibility = View.VISIBLE
        }else {
            backIconLayout.visibility = View.INVISIBLE
        }

        backIconLayout.setOnClickListener {
            finish()
        }
    }
}