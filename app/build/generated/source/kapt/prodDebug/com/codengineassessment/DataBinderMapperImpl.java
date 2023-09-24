package com.codengineassessment;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.codengineassessment.databinding.ActivityLoginBindingImpl;
import com.codengineassessment.databinding.ActivityMainBindingImpl;
import com.codengineassessment.databinding.ActivitySplashBindingImpl;
import com.codengineassessment.databinding.DialogCustumProgressBindingImpl;
import com.codengineassessment.databinding.FragmentMenuBindingImpl;
import com.codengineassessment.databinding.LayoutCategoryItemBindingImpl;
import com.codengineassessment.databinding.LayoutProductItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_DIALOGCUSTUMPROGRESS = 4;

  private static final int LAYOUT_FRAGMENTMENU = 5;

  private static final int LAYOUT_LAYOUTCATEGORYITEM = 6;

  private static final int LAYOUT_LAYOUTPRODUCTITEM = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.dialog_custum_progress, LAYOUT_DIALOGCUSTUMPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.fragment_menu, LAYOUT_FRAGMENTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.layout_category_item, LAYOUT_LAYOUTCATEGORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.codengineassessment.R.layout.layout_product_item, LAYOUT_LAYOUTPRODUCTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCUSTUMPROGRESS: {
          if ("layout/dialog_custum_progress_0".equals(tag)) {
            return new DialogCustumProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_custum_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENU: {
          if ("layout/fragment_menu_0".equals(tag)) {
            return new FragmentMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTCATEGORYITEM: {
          if ("layout/layout_category_item_0".equals(tag)) {
            return new LayoutCategoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_category_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPRODUCTITEM: {
          if ("layout/layout_product_item_0".equals(tag)) {
            return new LayoutProductItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_product_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
      sKeys.put(2, "isSelected");
      sKeys.put(3, "position");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_login_0", com.codengineassessment.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.codengineassessment.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.codengineassessment.R.layout.activity_splash);
      sKeys.put("layout/dialog_custum_progress_0", com.codengineassessment.R.layout.dialog_custum_progress);
      sKeys.put("layout/fragment_menu_0", com.codengineassessment.R.layout.fragment_menu);
      sKeys.put("layout/layout_category_item_0", com.codengineassessment.R.layout.layout_category_item);
      sKeys.put("layout/layout_product_item_0", com.codengineassessment.R.layout.layout_product_item);
    }
  }
}
