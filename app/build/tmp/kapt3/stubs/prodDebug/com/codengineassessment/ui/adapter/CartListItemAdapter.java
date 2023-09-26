package com.codengineassessment.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0016J\u0006\u0010*\u001a\u00020#R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/codengineassessment/ui/adapter/CartListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codengineassessment/ui/adapter/CartListItemAdapter$ProductViewHolder;", "viewModel", "Lcom/codengineassessment/ui/viewmodel/CartViewModel;", "cartItemList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/CartItemProduct;", "Lkotlin/collections/ArrayList;", "cartListener", "Lcom/codengineassessment/ui/viewmodel/CartContract;", "preferenceProvider", "Lcom/codengineassessment/data/preferences/PreferenceProvider;", "(Lcom/codengineassessment/ui/viewmodel/CartViewModel;Ljava/util/ArrayList;Lcom/codengineassessment/ui/viewmodel/CartContract;Lcom/codengineassessment/data/preferences/PreferenceProvider;)V", "getCartItemList", "()Ljava/util/ArrayList;", "setCartItemList", "(Ljava/util/ArrayList;)V", "getCartListener", "()Lcom/codengineassessment/ui/viewmodel/CartContract;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "setLayoutInflater", "(Landroid/view/LayoutInflater;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNotifyDataChange", "ProductViewHolder", "app_prodDebug"})
public final class CartListItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codengineassessment.ui.adapter.CartListItemAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.ui.viewmodel.CartViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> cartItemList;
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.ui.viewmodel.CartContract cartListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.data.preferences.PreferenceProvider preferenceProvider = null;
    public android.view.LayoutInflater layoutInflater;
    public android.content.Context context;
    
    public CartListItemAdapter(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.ui.viewmodel.CartViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> cartItemList, @org.jetbrains.annotations.NotNull()
    com.codengineassessment.ui.viewmodel.CartContract cartListener, @org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.preferences.PreferenceProvider preferenceProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> getCartItemList() {
        return null;
    }
    
    public final void setCartItemList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.CartItemProduct> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codengineassessment.ui.viewmodel.CartContract getCartListener() {
        return null;
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.codengineassessment.ui.adapter.CartListItemAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.ui.adapter.CartListItemAdapter.ProductViewHolder holder, int position) {
    }
    
    public final void setNotifyDataChange() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/codengineassessment/ui/adapter/CartListItemAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "binding", "Lcom/codengineassessment/databinding/LayoutCartItemBinding;", "(Landroid/view/View;Lcom/codengineassessment/databinding/LayoutCartItemBinding;)V", "getBinding", "()Lcom/codengineassessment/databinding/LayoutCartItemBinding;", "setBinding", "(Lcom/codengineassessment/databinding/LayoutCartItemBinding;)V", "app_prodDebug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.codengineassessment.databinding.LayoutCartItemBinding binding;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.codengineassessment.databinding.LayoutCartItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codengineassessment.databinding.LayoutCartItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.codengineassessment.databinding.LayoutCartItemBinding p0) {
        }
    }
}