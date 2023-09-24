package com.codengineassessment.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/codengineassessment/ui/adapter/ProductListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codengineassessment/ui/adapter/ProductListItemAdapter$ProductViewHolder;", "foodList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/Food;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/codengineassessment/ui/viewmodel/MenuViewModel;", "preferenceProvider", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "(Ljava/util/ArrayList;Lcom/codengineassessment/ui/viewmodel/MenuViewModel;Lcom/codengineassessment/data/preferences/PreferenceProvider;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "setLayoutInflater", "(Landroid/view/LayoutInflater;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductViewHolder", "app_prodDebug"})
public final class ProductListItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codengineassessment.ui.adapter.ProductListItemAdapter.ProductViewHolder> {
    private final java.util.ArrayList<com.codengineassessment.data.model.Food> foodList = null;
    private final com.codengineassessment.ui.viewmodel.MenuViewModel viewModel = null;
    private final com.codengineassessment.data.preferences.PreferenceProvider preferenceProvider = null;
    public android.view.LayoutInflater layoutInflater;
    public android.content.Context context;
    
    public ProductListItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.Food> foodList, @org.jetbrains.annotations.NotNull()
    com.codengineassessment.ui.viewmodel.MenuViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.preferences.PreferenceProvider preferenceProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.LayoutInflater getLayoutInflater() {
        return null;
    }
    
    public final void setLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codengineassessment.ui.adapter.ProductListItemAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.ui.adapter.ProductListItemAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/codengineassessment/ui/adapter/ProductListItemAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "binding", "Lcom/codengineassessment/databinding/LayoutProductItemBinding;", "(Landroid/view/View;Lcom/codengineassessment/databinding/LayoutProductItemBinding;)V", "getBinding", "()Lcom/codengineassessment/databinding/LayoutProductItemBinding;", "setBinding", "(Lcom/codengineassessment/databinding/LayoutProductItemBinding;)V", "app_prodDebug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.codengineassessment.databinding.LayoutProductItemBinding binding;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.codengineassessment.databinding.LayoutProductItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codengineassessment.databinding.LayoutProductItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.codengineassessment.databinding.LayoutProductItemBinding p0) {
        }
    }
}