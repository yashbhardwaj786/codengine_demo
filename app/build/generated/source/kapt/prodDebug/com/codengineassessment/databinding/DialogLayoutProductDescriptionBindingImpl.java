package com.codengineassessment.databinding;
import com.codengineassessment.R;
import com.codengineassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogLayoutProductDescriptionBindingImpl extends DialogLayoutProductDescriptionBinding implements com.codengineassessment.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topView, 5);
        sViewsWithIds.put(R.id.bannerImage, 6);
        sViewsWithIds.put(R.id.close, 7);
        sViewsWithIds.put(R.id.minus, 8);
        sViewsWithIds.put(R.id.decrease, 9);
        sViewsWithIds.put(R.id.plus, 10);
        sViewsWithIds.put(R.id.increase, 11);
        sViewsWithIds.put(R.id.separator, 12);
        sViewsWithIds.put(R.id.bottomLayout, 13);
        sViewsWithIds.put(R.id.total, 14);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogLayoutProductDescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private DialogLayoutProductDescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.confirmPay.setTag(null);
        this.foodImage.setTag(null);
        this.quantity.setTag(null);
        this.rootLayout.setTag(null);
        this.totalValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.codengineassessment.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.totalAmount == variableId) {
            setTotalAmount((java.lang.String) variable);
        }
        else if (BR.quantityValue == variableId) {
            setQuantityValue((java.lang.Integer) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codengineassessment.data.model.Food) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.codengineassessment.ui.viewmodel.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotalAmount(@Nullable java.lang.String TotalAmount) {
        this.mTotalAmount = TotalAmount;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.totalAmount);
        super.requestRebind();
    }
    public void setQuantityValue(@Nullable java.lang.Integer QuantityValue) {
        this.mQuantityValue = QuantityValue;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.quantityValue);
        super.requestRebind();
    }
    public void setData(@Nullable com.codengineassessment.data.model.Food Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.codengineassessment.ui.viewmodel.MenuViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.Integer quantityValue = mQuantityValue;
        java.lang.String dataFoodImage = null;
        java.lang.String javaLangStringQuantityValue = null;
        com.codengineassessment.data.model.Food data = mData;
        com.codengineassessment.ui.viewmodel.MenuViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x11L) != 0) {



                // read ("$") + (totalAmount)
                javaLangStringTotalAmount = ("$") + (totalAmount);
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read ("") + (quantityValue)
                javaLangStringQuantityValue = ("") + (quantityValue);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (data != null) {
                    // read data.foodImage
                    dataFoodImage = data.getFoodImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.confirmPay.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            com.codengineassessment.utils.BindingUtil.setImage(this.foodImage, dataFoodImage, androidx.appcompat.content.res.AppCompatResources.getDrawable(foodImage.getContext(), R.drawable.ic_image_placeholder_wrapper));
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantity, javaLangStringQuantityValue);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalValue, javaLangStringTotalAmount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.codengineassessment.ui.viewmodel.MenuViewModel viewModel = mViewModel;
        // data
        com.codengineassessment.data.model.Food data = mData;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.addToCart(data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): totalAmount
        flag 1 (0x2L): quantityValue
        flag 2 (0x3L): data
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}