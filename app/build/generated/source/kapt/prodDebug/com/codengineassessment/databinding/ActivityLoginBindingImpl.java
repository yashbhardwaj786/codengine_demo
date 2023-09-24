package com.codengineassessment.databinding;
import com.codengineassessment.R;
import com.codengineassessment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.codengineassessment.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView2, 4);
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.textView2, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener pinviewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.otp
            //         is viewModel.setOtp((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(pinview);
            // localize variables for thread safety
            // viewModel.otp
            java.lang.String viewModelOtp = null;
            // viewModel
            com.codengineassessment.ui.viewmodel.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setOtp(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.chaos.view.PinView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pinview.setTag(null);
        this.textView3.setTag(null);
        this.verifyNumber.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.codengineassessment.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.codengineassessment.ui.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.codengineassessment.ui.viewmodel.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsValidPin((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelErrorMessage((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsValidPin(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsValidPin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelErrorMessage(androidx.databinding.ObservableField<java.lang.String> ViewModelErrorMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsValidPin = null;
        java.lang.Boolean viewModelIsValidPinGet = null;
        int viewModelIsValidPinViewINVISIBLEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsValidPinGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelErrorMessage = null;
        java.lang.String viewModelErrorMessageGet = null;
        java.lang.String viewModelOtp = null;
        com.codengineassessment.ui.viewmodel.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isValidPin
                        viewModelIsValidPin = viewModel.isValidPin();
                    }
                    updateRegistration(0, viewModelIsValidPin);


                    if (viewModelIsValidPin != null) {
                        // read viewModel.isValidPin.get()
                        viewModelIsValidPinGet = viewModelIsValidPin.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isValidPin.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsValidPinGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsValidPinGet);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsValidPinGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isValidPin.get()) ? View.INVISIBLE : View.VISIBLE
                    viewModelIsValidPinViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsValidPinGet) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.errorMessage
                        viewModelErrorMessage = viewModel.getErrorMessage();
                    }
                    updateRegistration(1, viewModelErrorMessage);


                    if (viewModelErrorMessage != null) {
                        // read viewModel.errorMessage.get()
                        viewModelErrorMessageGet = viewModelErrorMessage.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.otp
                        viewModelOtp = viewModel.getOtp();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pinview, viewModelOtp);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.pinview, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, pinviewandroidTextAttrChanged);
            this.verifyNumber.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, viewModelErrorMessageGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.textView3.setVisibility(viewModelIsValidPinViewINVISIBLEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.codengineassessment.ui.viewmodel.LoginViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onVerifyClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isValidPin
        flag 1 (0x2L): viewModel.errorMessage
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isValidPin.get()) ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isValidPin.get()) ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}