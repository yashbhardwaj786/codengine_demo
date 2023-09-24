package com.codengineassessment.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010 \u001a\u00020\u0005J\n\u0010!\u001a\u0004\u0018\u00010\"H&J\b\u0010#\u001a\u00020$H&J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u0002H\'0&\"\u0006\b\u0000\u0010\'\u0018\u0001H\u0086\bJ\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020$H&J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00062"}, d2 = {"Lcom/codengineassessment/common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/kodein/di/KodeinAware;", "()V", "baseBinding", "Landroidx/databinding/ViewDataBinding;", "dataBinding", "", "getDataBinding", "()Z", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "layoutResource", "", "getLayoutResource", "()I", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "getBinding", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "initializeViewModel", "", "lazyBinding", "Lkotlin/Lazy;", "T", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "setBindings", "setToolBar", "titleText", "", "app_prodDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private androidx.databinding.ViewDataBinding baseBinding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView title;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ViewDataBinding getBinding() {
        return null;
    }
    
    public abstract boolean getDataBinding();
    
    public abstract int getLayoutResource();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codengineassessment.common.BaseViewModel getViewModel();
    
    public abstract void onNotificationReceived(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify data);
    
    public abstract void setBindings();
    
    public abstract void initializeViewModel();
    
    public final void setToolBar(@org.jetbrains.annotations.NotNull()
    java.lang.String titleText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}