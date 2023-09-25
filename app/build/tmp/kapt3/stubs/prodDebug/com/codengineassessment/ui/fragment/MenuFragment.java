package com.codengineassessment.ui.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\"2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`\'H\u0002J\b\u0010(\u001a\u00020\"H\u0016J\u0012\u0010)\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u001a\u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00103\u001a\u00020\"H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00064"}, d2 = {"Lcom/codengineassessment/ui/fragment/MenuFragment;", "Lcom/codengineassessment/common/BaseFragment;", "()V", "binding", "Lcom/codengineassessment/databinding/FragmentMenuBinding;", "getBinding", "()Lcom/codengineassessment/databinding/FragmentMenuBinding;", "binding$delegate", "Lkotlin/Lazy;", "dataBinding", "", "getDataBinding", "()Z", "factory", "Lcom/codengineassessment/ui/viewmodelfactory/MenuViewModelFactory;", "getFactory", "()Lcom/codengineassessment/ui/viewmodelfactory/MenuViewModelFactory;", "factory$delegate", "layoutResource", "", "getLayoutResource", "()I", "mainActivity", "Lcom/codengineassessment/ui/activity/MainActivity;", "menuViewModel", "Lcom/codengineassessment/ui/viewmodel/MenuViewModel;", "prefs", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "getPrefs", "()Lcom/codengineassessment/data/preferences/PreferenceProvider;", "prefs$delegate", "getViewModel", "Lcom/codengineassessment/common/BaseViewModel;", "initProductRecyclerView", "", "initRecyclerView", "categoryProductsList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/Categories;", "Lkotlin/collections/ArrayList;", "initializeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNotificationReceived", "data", "Lcom/codengineassessment/notifiers/Notify;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setBindings", "app_prodDebug"})
public final class MenuFragment extends com.codengineassessment.common.BaseFragment {
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
}