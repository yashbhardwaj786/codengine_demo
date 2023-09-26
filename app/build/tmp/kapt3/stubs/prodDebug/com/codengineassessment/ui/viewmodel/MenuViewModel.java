package com.codengineassessment.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/MenuViewModel;", "Lcom/codengineassessment/common/BaseViewModel;", "repository", "Lcom/codengineassessment/repository/MenuRepository;", "(Lcom/codengineassessment/repository/MenuRepository;)V", "categoryList", "Ljava/util/ArrayList;", "Lcom/codengineassessment/data/model/Categories;", "getCategoryList", "()Ljava/util/ArrayList;", "setCategoryList", "(Ljava/util/ArrayList;)V", "categorySelectedList", "productList", "Lcom/codengineassessment/data/model/Food;", "getProductList", "setProductList", "addToCart", "", "data", "fetchMenuCategory", "context", "Landroid/content/Context;", "onCategoryClicked", "pos", "", "productClick", "Companion", "app_prodDebug"})
public final class MenuViewModel extends com.codengineassessment.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.codengineassessment.repository.MenuRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codengineassessment.data.model.Categories> categoryList;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.codengineassessment.data.model.Categories> categorySelectedList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codengineassessment.data.model.Food> productList;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ON_DATA_FETCH = "ON_DATA_FETCH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_CLICKED = "CATEGORY_CLICKED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_TO_CART_CLICKED = "ADD_TO_CART_CLICKED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_CARD_CLICKED = "PRODUCT_CARD_CLICKED";
    @org.jetbrains.annotations.NotNull()
    public static final com.codengineassessment.ui.viewmodel.MenuViewModel.Companion Companion = null;
    
    public MenuViewModel(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.repository.MenuRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codengineassessment.data.model.Categories> getCategoryList() {
        return null;
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.Categories> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codengineassessment.data.model.Food> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codengineassessment.data.model.Food> p0) {
    }
    
    public final void fetchMenuCategory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void onCategoryClicked(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.Categories data, int pos) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.Food data) {
    }
    
    public final void productClick(@org.jetbrains.annotations.NotNull()
    com.codengineassessment.data.model.Food data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/codengineassessment/ui/viewmodel/MenuViewModel$Companion;", "", "()V", "ADD_TO_CART_CLICKED", "", "CATEGORY_CLICKED", "ON_DATA_FETCH", "PRODUCT_CARD_CLICKED", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}