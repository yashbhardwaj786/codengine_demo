package com.codengineassessment.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u001e\u0010\u0015\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0016j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0017J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006J\"\u0010\u001f\u001a\u00020\u001d2\u001a\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0017J\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/codengineassessment/data/preferences/PreferenceProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "IMAGE_OBJ", "", "PREFERENCE_NAME", "PRIVATE_MODE", "", "getContext", "()Landroid/content/Context;", "setContext", "preference", "Landroid/content/SharedPreferences;", "getPreference", "()Landroid/content/SharedPreferences;", "clearAllPref", "", "getData", "key", "getImagesJsonObject", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLong", "", "defaultValue", "(Ljava/lang/String;J)Ljava/lang/Long;", "saveData", "", "value", "saveImagesJsonObject", "imagesObj", "saveLong", "app_prodDebug"})
public final class PreferenceProvider {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private int PRIVATE_MODE = 0;
    private final java.lang.String PREFERENCE_NAME = "delphic_demo";
    private final java.lang.String IMAGE_OBJ = "DogImageObject";
    
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
    
    public final void saveImagesJsonObject(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> imagesObj) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getImagesJsonObject() {
        return null;
    }
    
    public final boolean clearAllPref() {
        return false;
    }
}