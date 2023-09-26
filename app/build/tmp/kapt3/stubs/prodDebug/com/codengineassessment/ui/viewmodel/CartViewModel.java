package com.codengineassessment.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/CartViewModel;", "Lcom/codengineassessment/common/BaseViewModel;", "repository", "Lcom/codengineassessment/repository/CartRepository;", "(Lcom/codengineassessment/repository/CartRepository;)V", "allWords", "Landroidx/lifecycle/LiveData;", "", "Lcom/codengineassessment/data/db/TransactionData;", "getAllWords", "()Landroidx/lifecycle/LiveData;", "cartItemProductList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/CartItemProduct;", "getCartItemProductList", "()Ljava/util/ArrayList;", "setCartItemProductList", "(Ljava/util/ArrayList;)V", "isCartEmpty", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "()Landroidx/databinding/ObservableField;", "setCartEmpty", "(Landroidx/databinding/ObservableField;)V", "confirmAndPayDBCall", "", "app_prodDebug"})
public final class CartViewModel extends com.codengineassessment.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.repository.CartRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Boolean> isCartEmpty;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> cartItemProductList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.codengineassessment.data.db.TransactionData>> allWords = null;
    
    public CartViewModel(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.repository.CartRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> isCartEmpty() {
        return null;
    }
    
    public final void setCartEmpty(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> getCartItemProductList() {
        return null;
    }
    
    public final void setCartItemProductList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.codengineassessment.data.db.TransactionData>> getAllWords() {
        return null;
    }
    
    public final void confirmAndPayDBCall() {
    }
}