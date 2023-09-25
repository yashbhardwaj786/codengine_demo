package com.codengineassessment.databinding;
import com.codengineassessment.R;
import com.codengineassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutCategoryItemBindingImpl extends LayoutCategoryItemBinding implements com.codengineassessment.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutCategoryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutCategoryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.imageView3.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.card.MaterialCardView) bindings[1];
        this.mboundView1.setTag(null);
        this.textView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.codengineassessment.generated.callback.OnClickListener(this, 1);
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
        if (BR.isSelected == variableId) {
            setIsSelected((java.lang.Boolean) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.codengineassessment.ui.viewmodel.MenuViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((com.codengineassessment.data.model.Categories) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsSelected(@Nullable java.lang.Boolean IsSelected) {
        this.mIsSelected = IsSelected;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.codengineassessment.ui.viewmodel.MenuViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setData(@Nullable com.codengineassessment.data.model.Categories Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        java.lang.Boolean isSelected = mIsSelected;
        int isSelectedTextView5AndroidColorWhiteTextView5AndroidColorBlack = 0;
        java.lang.Integer position = mPosition;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSelected = false;
        int isSelectedImageView3AndroidColorWhiteImageView3AndroidColorBlack = 0;
        java.lang.String dataCategoryImage = null;
        java.lang.String dataCategoryName = null;
        com.codengineassessment.ui.viewmodel.MenuViewModel viewModel = mViewModel;
        com.codengineassessment.data.model.Categories data = mData;
        int isSelectedMboundView1AndroidColorBlueMboundView1AndroidColorBgStyleSolidColor = 0;

        if ((dirtyFlags & 0x11L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSelected)
                androidxDatabindingViewDataBindingSafeUnboxIsSelected = androidx.databinding.ViewDataBinding.safeUnbox(isSelected);
            if((dirtyFlags & 0x11L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSelected) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
                isSelectedTextView5AndroidColorWhiteTextView5AndroidColorBlack = ((androidxDatabindingViewDataBindingSafeUnboxIsSelected) ? (getColorFromResource(textView5, R.color.white)) : (getColorFromResource(textView5, R.color.black)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
                isSelectedImageView3AndroidColorWhiteImageView3AndroidColorBlack = ((androidxDatabindingViewDataBindingSafeUnboxIsSelected) ? (getColorFromResource(imageView3, R.color.white)) : (getColorFromResource(imageView3, R.color.black)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/blue : @android:color/bg_style_solid_color
                isSelectedMboundView1AndroidColorBlueMboundView1AndroidColorBgStyleSolidColor = ((androidxDatabindingViewDataBindingSafeUnboxIsSelected) ? (getColorFromResource(mboundView1, R.color.blue)) : (getColorFromResource(mboundView1, R.color.bg_style_solid_color)));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                if (data != null) {
                    // read data.categoryImage
                    dataCategoryImage = data.getCategoryImage();
                    // read data.categoryName
                    dataCategoryName = data.getCategoryName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.imageView3.setImageTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(isSelectedImageView3AndroidColorWhiteImageView3AndroidColorBlack));
            }
            // api target 1

            this.mboundView1.setCardBackgroundColor(isSelectedMboundView1AndroidColorBlueMboundView1AndroidColorBgStyleSolidColor);
            this.textView5.setTextColor(isSelectedTextView5AndroidColorWhiteTextView5AndroidColorBlack);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.codengineassessment.utils.BindingUtil.setImage(this.imageView3, dataCategoryImage, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageView3.getContext(), R.drawable.ic_image_placeholder_wrapper));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView5, dataCategoryName);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // position
        java.lang.Integer position = mPosition;
        // viewModel
        com.codengineassessment.ui.viewmodel.MenuViewModel viewModel = mViewModel;
        // data
        com.codengineassessment.data.model.Categories data = mData;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.onCategoryClicked(data, position);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isSelected
        flag 1 (0x2L): position
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): data
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/white : @android:color/black
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/blue : @android:color/bg_style_solid_color
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(isSelected) ? @android:color/blue : @android:color/bg_style_solid_color
    flag mapping end*/
    //end
}