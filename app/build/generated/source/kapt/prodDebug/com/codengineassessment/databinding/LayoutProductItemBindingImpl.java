package com.codengineassessment.databinding;
import com.codengineassessment.R;
import com.codengineassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutProductItemBindingImpl extends LayoutProductItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.save, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutProductItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutProductItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.foodImage.setTag(null);
        this.foodName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.price.setTag(null);
        this.quantity.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.codengineassessment.ui.viewmodel.MenuViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codengineassessment.data.model.Food) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.codengineassessment.ui.viewmodel.MenuViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setData(@Nullable com.codengineassessment.data.model.Food Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String javaLangStringDataFoodPrice = null;
        java.lang.String dataFoodImage = null;
        java.lang.Long dataFoodPrice = null;
        java.lang.String dataQuantity = null;
        java.lang.String dataFoodName = null;
        com.codengineassessment.data.model.Food data = mData;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.foodImage
                    dataFoodImage = data.getFoodImage();
                    // read data.foodPrice
                    dataFoodPrice = data.getFoodPrice();
                    // read data.quantity
                    dataQuantity = data.getQuantity();
                    // read data.foodName
                    dataFoodName = data.getFoodName();
                }


                // read ("$") + (data.foodPrice)
                javaLangStringDataFoodPrice = ("$") + (dataFoodPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.codengineassessment.utils.BindingUtil.setImage(this.foodImage, dataFoodImage, androidx.appcompat.content.res.AppCompatResources.getDrawable(foodImage.getContext(), R.drawable.ic_image_placeholder_wrapper));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.foodName, dataFoodName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, javaLangStringDataFoodPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantity, dataQuantity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}