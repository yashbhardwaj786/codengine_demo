package com.codengineassessment.data.preferences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015J\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006J\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/codengineassessment/data/preferences/PreferenceProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PREFERENCE_NAME", "", "PRIVATE_MODE", "", "getContext", "()Landroid/content/Context;", "setContext", "preference", "Landroid/content/SharedPreferences;", "getPreference", "()Landroid/content/SharedPreferences;", "clearAllPref", "", "getCartJsonObject", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/CartItemProduct;", "Lkotlin/collections/ArrayList;", "getData", "key", "getLong", "", "defaultValue", "(Ljava/lang/String;J)Ljava/lang/Long;", "saveCartJsonObject", "", "cartItem", "saveData", "value", "saveLong", "app_prodDebug"})
public final class PreferenceProvider {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private int PRIVATE_MODE = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PREFERENCE_NAME = "delphic_demo";
    
    public PreferenceProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    private final android.content.SharedPreferences getPreference() {
        return null;
    }
    
    public final void saveData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue) {
        return null;
    }
    
    public final boolean clearAllPref() {
        return false;
    }
    
    public final void saveCartJsonObject(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> cartItem) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> getCartJsonObject() {
        return null;
    }
}