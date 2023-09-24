package com.codengineassessment.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/LoginViewModel;", "Lcom/codengineassessment/common/BaseViewModel;", "()V", "errorMessage", "Landroidx/databinding/ObservableField;", "", "getErrorMessage", "()Landroidx/databinding/ObservableField;", "setErrorMessage", "(Landroidx/databinding/ObservableField;)V", "isValidPin", "", "setValidPin", "otp", "getOtp", "()Ljava/lang/String;", "setOtp", "(Ljava/lang/String;)V", "onVerifyClick", "", "Companion", "app_prodDebug"})
public final class LoginViewModel extends com.codengineassessment.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otp = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> errorMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isValidPin;
    @org.jetbrains.annotations.NotNull()
    public static final com.codengineassessment.ui.viewmodel.LoginViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERIFY_CLICK = "VERIFY_CLICK";
    
    public LoginViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtp() {
        return null;
    }
    
    public final void setOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isValidPin() {
        return null;
    }
    
    public final void setValidPin(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    public final void onVerifyClick() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/LoginViewModel$Companion;", "", "()V", "VERIFY_CLICK", "", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}