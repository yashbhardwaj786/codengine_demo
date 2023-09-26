package com.codengineassessment.ui.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0002J \u0010$\u001a\u00020#2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\'0&j\b\u0012\u0004\u0012\u00020\'`(H\u0002J\b\u0010)\u001a\u00020#H\u0016J\u0012\u0010*\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020#H\u0016J\u001a\u00101\u001a\u00020#2\u0006\u00102\u001a\u0002032\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u0010.\u001a\u000205H\u0002J\b\u00106\u001a\u00020#H\u0016J\b\u00107\u001a\u00020#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00068"}, d2 = {"Lcom/codengineassessment/ui/fragment/MenuFragment;", "Lcom/codengineassessment/common/BaseFragment;", "Lcom/codengineassessment/ui/bottomsheet/AddToCartContract;", "()V", "binding", "Lcom/codengineassessment/databinding/FragmentMenuBinding;", "getBinding", "()Lcom/codengineassessment/databinding/FragmentMenuBinding;", "binding$delegate", "Lkotlin/Lazy;", "dataBinding", "", "getDataBinding", "()Z", "factory", "Lcom/codengineassessment/ui/viewmodelfactory/MenuViewModelFactory;", "getFactory", "()Lcom/codengineassessment/ui/viewmodelfactory/MenuViewModelFactory;", "factory$delegate", "layoutResource", "", "getLayoutResource", "()I", "mainActivity", "Lcom/codengineassessment/ui/activity/MainActivity;", "menuViewModel", "Lcom/codengineassessment/ui/viewmodel/MenuViewModel;", "prefs", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "getPrefs", "()Lcom/codengineassessment/data/preferences/PreferenceProvider;", "prefs$delegate", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "initProductRecyclerView", "", "initRecyclerView", "categoryProductsList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/Categories;", "Lkotlin/collections/ArrayList;", "initializeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "openProductDescriptionBottomSheet", "Lcom/codengineassessment/data/model/Food;", "setBindings", "updateCartValue", "app_prodDebug"})
public final class MenuFragment extends com.codengineassessment.common.BaseFragment implements com.codengineassessment.ui.bottomsheet.AddToCartContract {
    private com.codengineassessment.ui.activity.MainActivity mainActivity;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy factory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy prefs$delegate = null;
    private com.codengineassessment.ui.viewmodel.MenuViewModel menuViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    private final boolean dataBinding = true;
    private final int layoutResource = com.codengineassessment.R.layout.fragment_menu;
    
    public MenuFragment() {
        super();
    }
    
    private final com.codengineassessment.ui.viewmodelfactory.MenuViewModelFactory getFactory() {
        return null;
    }
    
    private final com.codengineassessment.data.preferences.PreferenceProvider getPrefs() {
        return null;
    }
    
    private final com.codengineassessment.databinding.FragmentMenuBinding getBinding() {
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.codengineassessment.common.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initializeViewModel() {
    }
    
    @java.lang.Override()
    public void onNotificationReceived(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.notifiers.Notify data) {
    }
    
    @java.lang.Override()
    public void setBindings() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void initRecyclerView(java.util.ArrayList<com.codengineassessment.data.model.Categories> categoryProductsList) {
    }
    
    private final void initProductRecyclerView() {
    }
    
    private final void openProductDescriptionBottomSheet(com.codengineassessment.data.model.Food data) {
    }
    
    @java.lang.Override()
    public void updateCartValue() {
    }
}