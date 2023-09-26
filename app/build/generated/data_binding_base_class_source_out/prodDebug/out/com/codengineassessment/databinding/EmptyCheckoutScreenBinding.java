// Generated by data binding compiler. Do not edit!
package com.codengineassessment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.codengineassessment.R;
import com.codengineassessment.ui.viewmodel.CartViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EmptyCheckoutScreenBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView cartImage;

  @NonNull
  public final AppCompatButton continueShopping;

  @Bindable
  protected CartViewModel mViewModel;

  protected EmptyCheckoutScreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView cartImage, AppCompatButton continueShopping) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cartImage = cartImage;
    this.continueShopping = continueShopping;
  }

  public abstract void setViewModel(@Nullable CartViewModel viewModel);

  @Nullable
  public CartViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static EmptyCheckoutScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.empty_checkout_screen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EmptyCheckoutScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EmptyCheckoutScreenBinding>inflateInternal(inflater, R.layout.empty_checkout_screen, root, attachToRoot, component);
  }

  @NonNull
  public static EmptyCheckoutScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.empty_checkout_screen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EmptyCheckoutScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EmptyCheckoutScreenBinding>inflateInternal(inflater, R.layout.empty_checkout_screen, null, false, component);
  }

  public static EmptyCheckoutScreenBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EmptyCheckoutScreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (EmptyCheckoutScreenBinding)bind(component, view, R.layout.empty_checkout_screen);
  }
}
