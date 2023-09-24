package com.codengineassessment.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun isInternetAvailable(ctx: Context): Boolean {
    var result = false
    val connectivityManager = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?

    connectivityManager?.let {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            it.getNetworkCapabilities(connectivityManager.activeNetwork)?.apply {
                result = when {
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    else -> false
                }
            }
        } else {
            connectivityManager.activeNetworkInfo.also { networkInfo ->
                return networkInfo != null && networkInfo.isConnected
            }
        }
    }
    return result
}

fun showToast(context: Context?, message: String?) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

infix fun Context.hideKeyboard(view: View?) {
    if (view != null) {
        val imm: InputMethodManager? =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
        imm?.hideSoftInputFromWindow(view?.windowToken, 0)
    }
}

fun nullSafeErrorLogging(errorMessage: String?): Exception {
    return if (errorMessage != null) EWException(errorMessage) else EWException(Constant.NULL_ERROR_MESSAGE)
}