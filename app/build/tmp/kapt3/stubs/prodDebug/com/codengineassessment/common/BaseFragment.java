package com.codengineassessment.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0005J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0006\b\u0000\u0010\u001b\u0018\u0001H\u0086\bJ&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H&J\b\u0010\'\u001a\u00020\u0018H&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/codengineassessment/common/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/kodein/di/KodeinAware;", "()V", "baseBinding", "Landroidx/databinding/ViewDataBinding;", "dataBinding", "", "getDataBinding", "()Z", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "Lkotlin/Lazy;", "layoutResource", "", "getLayoutResource", "()I", "getBinding", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "initializeViewModel", "", "lazyBinding", "Lkotlin/Lazy;", "T", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "setBindings", "app_prodDebug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private androidx.databinding.ViewDataBinding baseBinding;
    
    public BaseFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
}