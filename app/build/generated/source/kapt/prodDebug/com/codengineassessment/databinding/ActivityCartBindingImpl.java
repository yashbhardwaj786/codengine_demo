package com.codengineassessment.databinding;
import com.codengineassessment.R;
import com.codengineassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCartBindingImpl extends ActivityCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(8, 
            new String[] {"empty_checkout_screen"},
            new int[] {9},
            new int[] {com.codengineassessment.R.layout.empty_checkout_screen});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.subtotal, 10);
        sViewsWithIds.put(R.id.tax, 11);
        sViewsWithIds.put(R.id.separator, 12);
        sViewsWithIds.put(R.id.confirmPay, 13);
        sViewsWithIds.put(R.id.total, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @Nullable
    private final com.codengineassessment.databinding.EmptyCheckoutScreenBinding mboundView81;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.view.View) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            );
        this.appbar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView81 = (com.codengineassessment.databinding.EmptyCheckoutScreenBinding) bindings[9];
        setContainedBinding(this.mboundView81);
        this.productList.setTag(null);
        this.subTotalValue.setTag(null);
        this.taxValue.setTag(null);
        this.toGo.setTag(null);
        this.totalValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView81.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView81.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.totalAmount == variableId) {
            setTotalAmount((java.lang.String) variable);
        }
        else if (BR.subtotalAmount == variableId) {
            setSubtotalAmount((java.lang.String) variable);
        }
        else if (BR.isManager == variableId) {
            setIsManager((java.lang.Boolean) variable);
        }
        else if (BR.taxValueAmount == variableId) {
            setTaxValueAmount((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.codengineassessment.ui.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotalAmount(@Nullable java.lang.String TotalAmount) {
        this.mTotalAmount = TotalAmount;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.totalAmount);
        super.requestRebind();
    }
    public void setSubtotalAmount(@Nullable java.lang.String SubtotalAmount) {
        this.mSubtotalAmount = SubtotalAmount;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.subtotalAmount);
        super.requestRebind();
    }
    public void setIsManager(@Nullable java.lang.Boolean IsManager) {
        this.mIsManager = IsManager;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isManager);
        super.requestRebind();
    }
    public void setTaxValueAmount(@Nullable java.lang.String TaxValueAmount) {
        this.mTaxValueAmount = TaxValueAmount;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.taxValueAmount);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.codengineassessment.ui.viewmodel.CartViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView81.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsCartEmpty((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsCartEmpty(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsCartEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String totalAmount = mTotalAmount;
        java.lang.String javaLangStringTotalAmount = null;
        int isManagerViewVISIBLEViewGONE = 0;
        java.lang.String javaLangStringTaxValueAmount = null;
        java.lang.String subtotalAmount = mSubtotalAmount;
        java.lang.String javaLangStringSubtotalAmount = null;
        java.lang.Boolean viewModelIsCartEmptyGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsCartEmpty = null;
        java.lang.Boolean isManager = mIsManager;
        int viewModelIsCartEmptyViewGONEViewVISIBLE = 0;
        java.lang.String taxValueAmount = mTaxValueAmount;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsCartEmptyGet = false;
        int viewModelIsCartEmptyViewVISIBLEViewGONE = 0;
        com.codengineassessment.ui.viewmodel.CartViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsManager = false;

        if ((dirtyFlags & 0x42L) != 0) {



                // read ("$") + (totalAmount)
                javaLangStringTotalAmount = ("$") + (totalAmount);
        }
        if ((dirtyFlags & 0x44L) != 0) {



                // read ("$") + (subtotalAmount)
                javaLangStringSubtotalAmount = ("$") + (subtotalAmount);
        }
        if ((dirtyFlags & 0x48L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isManager)
                androidxDatabindingViewDataBindingSafeUnboxIsManager = androidx.databinding.ViewDataBinding.safeUnbox(isManager);
            if((dirtyFlags & 0x48L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsManager) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isManager) ? View.VISIBLE : View.GONE
                isManagerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsManager) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x50L) != 0) {



                // read ("$") + (taxValueAmount)
                javaLangStringTaxValueAmount = ("$") + (taxValueAmount);
        }
        if ((dirtyFlags & 0x61L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isCartEmpty
                    viewModelIsCartEmpty = viewModel.isCartEmpty();
                }
                updateRegistration(0, viewModelIsCartEmpty);


                if (viewModelIsCartEmpty != null) {
                    // read viewModel.isCartEmpty.get()
                    viewModelIsCartEmptyGet = viewModelIsCartEmpty.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsCartEmptyGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsCartEmptyGet);
            if((dirtyFlags & 0x61L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsCartEmptyGet) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.GONE : View.VISIBLE
                viewModelIsCartEmptyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsCartEmptyGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.VISIBLE : View.GONE
                viewModelIsCartEmptyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsCartEmptyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelIsCartEmptyViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(viewModelIsCartEmptyViewVISIBLEViewGONE);
            this.productList.setVisibility(viewModelIsCartEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView81.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subTotalValue, javaLangStringSubtotalAmount);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.taxValue, javaLangStringTaxValueAmount);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.toGo.setVisibility(isManagerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalValue, javaLangStringTotalAmount);
        }
        executeBindingsOn(mboundView81);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isCartEmpty
        flag 1 (0x2L): totalAmount
        flag 2 (0x3L): subtotalAmount
        flag 3 (0x4L): isManager
        flag 4 (0x5L): taxValueAmount
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isManager) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isManager) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCartEmpty.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}