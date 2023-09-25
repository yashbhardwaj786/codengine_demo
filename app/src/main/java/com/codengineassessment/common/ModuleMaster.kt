package com.codengineassessment.common

import android.content.Context
import android.content.Intent
import com.codengineassessment.R
import com.codengineassessment.ui.activity.CartActivity
import com.codengineassessment.ui.activity.LoginActivity
import com.codengineassessment.ui.activity.MainActivity

object ModuleMaster {

    fun navigateToMainActivity(context: Context) {
        Intent(context, MainActivity::class.java).also {
            context.startActivity(it)
            (context as BaseActivity).finish()
        }
    }
    fun navigateToLoginActivity(context: Context) {
        Intent(context, LoginActivity::class.java).also {
            context.startActivity(it)
            (context as BaseActivity).finish()
        }
    }
    fun navigateToCartActivity(context: Context) {
        Intent(context, CartActivity::class.java).also {
            context.startActivity(it)
        }
    }
}
