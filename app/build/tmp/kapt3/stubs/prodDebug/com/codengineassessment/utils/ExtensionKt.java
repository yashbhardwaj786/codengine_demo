package com.codengineassessment.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\n\u001a\u00060\u000bj\u0002`\f2\b\u0010\r\u001a\u0004\u0018\u00010\b\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u001a\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086\u0004\u00a8\u0006\u001c"}, d2 = {"getWindowHeight", "", "context", "Landroid/content/Context;", "isInternetAvailable", "", "ctx", "loadJSONFromAsset", "", "fileName", "nullSafeErrorLogging", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorMessage", "setupFullHeight", "", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "showCartCount", "cartCount", "Landroid/widget/TextView;", "prefs", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "showToast", "message", "hideKeyboard", "view", "Landroid/view/View;", "app_prodDebug"})
public final class ExtensionKt {
    
    public static final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return false;
    }
    
    public static final void showToast(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.Exception nullSafeErrorLogging(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String loadJSONFromAsset(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    public static final void showCartCount(@org.jetbrains.annotations.Nullable()
    android.widget.TextView cartCount, @org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.preferences.PreferenceProvider prefs) {
    }
    
    public static final void setupFullHeight(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final int getWindowHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
}