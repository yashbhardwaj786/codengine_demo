package com.codengineassessment.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.codengineassessment.R

object BindingUtil {

    @BindingAdapter("imageUrl", "errorDrawable")
    @JvmStatic
    fun setImage(imageView: ImageView, url: String?, errorDrawable: Drawable?) {
        var errorDrawable = errorDrawable
        if (url == null || url.isEmpty()) {
            return
        }
        val context = imageView.context
        val res = context.resources
        if (errorDrawable == null) {
            errorDrawable =
                ContextCompat.getDrawable(
                    imageView.context,
                    R.drawable.ic_image_placeholder_wrapper
                )
        }
        Glide.with(context).load(getImage(url, context)).into(imageView)
    }
    @BindingAdapter("circularImageUrl", "errorDrawable")
    @JvmStatic
    fun setCircularImage(imageView: ImageView, url: String?, errorDrawable: Drawable?) {
        var errorDrawable = errorDrawable
        if (url == null || url.isEmpty()) {
            return
        }
        val context = imageView.context
        val res = context.resources
        if (errorDrawable == null) {
            errorDrawable =
                ContextCompat.getDrawable(
                    imageView.context,
                    R.drawable.ic_image_placeholder_wrapper
                )
        }
        Glide.with(context).load(getImage(url, context)).circleCrop().into(imageView)
    }
    private fun getImage(imageName: String, context: Context): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}