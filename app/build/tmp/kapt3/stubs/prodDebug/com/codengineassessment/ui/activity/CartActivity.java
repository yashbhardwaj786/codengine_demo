package com.codengineassessment.ui.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lcom/codengineassessment/ui/activity/CartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/codengineassessment/ui/viewmodel/CartContract;", "Lorg/kodein/di/KodeinAware;", "()V", "_binding", "Lcom/codengineassessment/databinding/ActivityCartBinding;", "binding", "getBinding", "()Lcom/codengineassessment/databinding/ActivityCartBinding;", "cartCountHome", "Landroid/widget/TextView;", "cartViewModel", "Lcom/codengineassessment/ui/viewmodel/CartViewModel;", "getCartViewModel", "()Lcom/codengineassessment/ui/viewmodel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "kodein", "Lorg/kodein/di/Kodein;", "getKodein", "()Lorg/kodein/di/Kodein;", "kodein$delegate", "prefs", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "getPrefs", "()Lcom/codengineassessment/data/preferences/PreferenceProvider;", "prefs$delegate", "calculatePrice", "", "decreaseQuantity", "data", "Lcom/codengineassessment/data/model/CartItemProduct;", "position", "", "increaseQuantity", "initRecyclerView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setToolBar", "titleText", "", "showBackButton", "", "updateCart", "cartItemProduct", "app_prodDebug"})
public final class CartActivity extends androidx.appcompat.app.AppCompatActivity implements com.codengineassessment.ui.viewmodel.CartContract, org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy kodein$delegate = null;
    private android.widget.TextView cartCountHome;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy prefs$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.codengineassessment.databinding.ActivityCartBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cartViewModel$delegate = null;
    
    public CartActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.Kodein getKodein() {
        return null;
    }
    
    private final com.codengineassessment.data.preferences.PreferenceProvider getPrefs() {
        return null;
    }
    
    private final com.codengineassessment.databinding.ActivityCartBinding getBinding() {
        return null;
    }
    
    private final com.codengineassessment.ui.viewmodel.CartViewModel getCartViewModel() {
        return null;
    }
    
    private final void updateCart(com.codengineassessment.data.model.CartItemProduct cartItemProduct, int position) {
    }
    
    private final void setToolBar(java.lang.String titleText, boolean showBackButton) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void calculatePrice() {
    }
    
    @java.lang.Override()
    public void increaseQuantity(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.CartItemProduct data, int position) {
    }
    
    @java.lang.Override()
    public void decreaseQuantity(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.CartItemProduct data, int position) {
    }
    
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