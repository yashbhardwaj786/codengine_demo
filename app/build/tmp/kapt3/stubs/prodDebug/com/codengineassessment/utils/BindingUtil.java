package com.codengineassessment.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/codengineassessment/utils/BindingUtil;", "", "()V", "getImage", "", "imageName", "", "context", "Landroid/content/Context;", "setImage", "", "imageView", "Landroid/widget/ImageView;", "url", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "app_prodDebug"})
public final class BindingUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.codengineassessment.utils.BindingUtil INSTANCE = null;
    
    private BindingUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"imageUrl", "errorDrawble"})
    public static final void setImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorDrawable) {
    }
    
    private final int getImage(java.lang.String imageName, android.content.Context context) {
        return 0;
    }
}