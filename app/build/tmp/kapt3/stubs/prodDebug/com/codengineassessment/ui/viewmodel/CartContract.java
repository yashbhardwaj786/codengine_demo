package com.codengineassessment.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/CartContract;", "", "decreaseQuantity", "", "data", "Lcom/codengineassessment/data/model/CartItemProduct;", "position", "", "increaseQuantity", "app_prodDebug"})
public abstract interface CartContract {
    
    public abstract void increaseQuantity(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.CartItemProduct data, int position);
    
    public abstract void decreaseQuantity(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.CartItemProduct data, int position);
}