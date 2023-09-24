package com.codengineassessment.utils

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.text.TextUtils
import com.codengineassessment.R

class Utility {
    companion object {
        private var progressInstance: Dialog? = null

        fun showProgressDialog(activity: Activity, isCancelable: Boolean = false) {
            progressInstance?.let {
                if (it.isShowing) {
                    it.dismiss()
                }
            }
            try {
                progressInstance = CustomProgressBar.show(activity, isCancelable)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        fun hideProgressDialog() {
            try {
                progressInstance?.let {
                    if (it.isShowing) {
                        it.dismiss()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}

fun showAlertDialog(
    context: Context,
    title: String,
    message: String,
    listener: DialogInterface.OnClickListener
): AlertDialog? {
    var titleValue = title
    if (context is Activity && !context.isFinishing) {
        val alertDialog: AlertDialog =
            AlertDialog.Builder(context, com.google.android.material.R.style.ThemeOverlay_AppCompat_Dialog_Alert).create()

        titleValue =
            if (TextUtils.isEmpty(titleValue)) context.getResources().getString(R.string.app_name) else titleValue

        // Setting Dialog Title
        alertDialog.setTitle(titleValue)

        // Setting Dialog Message
        alertDialog.setMessage(message)

        // Setting alert dialog icon
        // alertDialog.setIcon((status) ? R.drawable.success :
        // R.drawable.fail);

        // Setting Cancel Button
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", listener)

        // Setting OKAY Button
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Okay", listener)

        // Showing Alert Message
        alertDialog.show()

        return alertDialog
    }
    return null
}
