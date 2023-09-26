package com.codengineassessment.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/codengineassessment/common/BaseDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "initializeViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "onStart", "app_prodDebug"})
public abstract class BaseDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    
    public BaseDialogFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.codengineassessment.common.BaseViewModel getViewModel();
    
    public abstract void onNotificationReceived(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify data);
    
    public abstract void initializeViewModel();
}