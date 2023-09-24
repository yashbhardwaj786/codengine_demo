package com.codengineassessment.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0016J\u0012\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0017J\b\u0010-\u001a\u00020%H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 \u00a8\u0006."}, d2 = {"Lcom/codengineassessment/ui/activity/SplashActivity;", "Lcom/codengineassessment/common/BaseActivity;", "()V", "binding", "Lcom/codengineassessment/databinding/ActivitySplashBinding;", "getBinding", "()Lcom/codengineassessment/databinding/ActivitySplashBinding;", "binding$delegate", "Lkotlin/Lazy;", "dataBinding", "", "getDataBinding", "()Z", "factory", "Lcom/codengineassessment/ui/viewmodelfactory/MainViewModelFactory;", "getFactory", "()Lcom/codengineassessment/ui/viewmodelfactory/MainViewModelFactory;", "factory$delegate", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "layoutResource", "", "getLayoutResource", "()I", "mainViewModel", "Lcom/codengineassessment/ui/viewmodel/MainViewModel;", "prefs", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "getPrefs", "()Lcom/codengineassessment/data/preferences/PreferenceProvider;", "prefs$delegate", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "goAhead", "", "initializeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "setBindings", "app_prodDebug"})
public final class SplashActivity extends com.codengineassessment.common.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private com.codengineassessment.ui.viewmodel.MainViewModel mainViewModel;
    private final kotlin.Lazy factory$delegate = null;
    private final kotlin.Lazy binding$delegate = null;
    private final boolean dataBinding = true;
    private final int layoutResource = com.codengineassessment.R.layout.activity_splash;
    private final kotlin.Lazy prefs$delegate = null;
    
    public SplashActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.codengineassessment.ui.viewmodelfactory.MainViewModelFactory getFactory() {
        return null;
    }
    
    private final com.codengineassessment.databinding.ActivitySplashBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getDataBinding() {
        return false;
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    private final com.codengineassessment.data.preferences.PreferenceProvider getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codengineassessment.common.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void setBindings() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onNotificationReceived(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify data) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void goAhead() {
    }
}