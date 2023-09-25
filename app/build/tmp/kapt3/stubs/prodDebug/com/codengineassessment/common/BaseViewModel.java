package com.codengineassessment.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\n\u001a\u00020\b2\n\u0010\u000b\u001a\u00060\fj\u0002`\rJ\u0006\u0010\u000e\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/codengineassessment/common/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "notifier", "Lcom/codengineassessment/notifiers/Notifier;", "getNotifier", "()Lcom/codengineassessment/notifiers/Notifier;", "hideProgress", "", "onCleared", "showError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showProgress", "app_prodDebug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * Use notifier to send any message and data to the activity from ViewModel
     */
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.notifiers.Notifier notifier = null;
    
    public BaseViewModel() {
        super();
    }
    
    /**
     * Use notifier to send any message and data to the activity from ViewModel
     */
    @org.jetbrains.annotations.NotNull()
    public final com.codengineassessment.notifiers.Notifier getNotifier() {
        return null;
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}