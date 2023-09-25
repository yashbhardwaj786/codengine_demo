package com.codengineassessment.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.utils.Constant.Companion.CART_COUNT
import java.io.IOException

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

fun loadJSONFromAsset(context: Context, fileName: String): String {
    var json = ""
    try {
        val `is` = context.assets.open(fileName)
        val size = `is`.available()
        val buffer = ByteArray(size)
        `is`.read(buffer)
        `is`.close()
        json = String(buffer, charset("UTF-8"))
    } catch (ex: IOException) {
        ex.printStackTrace()
        return json
    }

    return json
}

fun showCartCount(cartCount: TextView?, prefs: PreferenceProvider) {
    var count = 0
    val cartList = prefs.getCartJsonObject()
    cartList?.let {
        if (it.isNotEmpty()){
            for (i in it.indices){
                count = count.plus(it[i].quantity ?: 0)
            }
        }
    }
    if (count > 0) {
        cartCount?.text = "$count"
        cartCount?.visibility = View.VISIBLE
    } else {
        cartCount?.visibility = View.GONE
    }
}