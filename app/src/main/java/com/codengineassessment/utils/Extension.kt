package com.codengineassessment.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.DisplayMetrics
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.codengineassessment.R
import com.codengineassessment.data.preferences.PreferenceProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Calendar

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
fun getCartCount(prefs: PreferenceProvider): Int {
    var count = 0
    val cartList = prefs.getCartJsonObject()
    cartList?.let {
        if (it.isNotEmpty()){
            for (i in it.indices){
                count = count.plus(it[i].quantity ?: 0)
            }
        }
    }
    return count
}
fun setupFullHeight(bottomSheetDialog: BottomSheetDialog, context: Context) {
    val bottomSheet: CoordinatorLayout =
        bottomSheetDialog.findViewById<View>(R.id.rootLayout) as CoordinatorLayout
    val behavior: BottomSheetBehavior<*> = BottomSheetBehavior.from(
        bottomSheet
    )
    val layoutParams: ViewGroup.LayoutParams = bottomSheet.layoutParams
    val windowHeight = getWindowHeight(context)
    if (layoutParams != null) {
        layoutParams.height = windowHeight
    }
    bottomSheet.layoutParams = layoutParams
    behavior.state = BottomSheetBehavior.STATE_EXPANDED
}
fun getWindowHeight(context: Context): Int {
    // Calculate window height for fullscreen use
    val displayMetrics = DisplayMetrics()
    (context as Activity).windowManager.defaultDisplay.getMetrics(displayMetrics)
    return displayMetrics.heightPixels
}
fun getCurrentTimestamp(): Long {
    return System.currentTimeMillis()
}

fun getCurrentTime(): String {
    val time = Calendar.getInstance().time
    val formatter = SimpleDateFormat("HH:mm a")
    return formatter.format(time)
}