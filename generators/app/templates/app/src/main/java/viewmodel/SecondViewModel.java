package <%=packageName%>.viewmodel;

import android.graphics.drawable.Drawable;

import <%=packageName%>.R;

import inair.app.IAContext;
import inair.data.LayeredItemViewData;
import inair.data.ViewModel;

public class SecondViewModel extends ViewModel implements LayeredItemViewData {
  private CharSequence mTitle = "Second Layer";
  private String mBindingText = "InAiR - This is the second layer screen";
  private int mBindingImage = R.drawable.logo2d3d;

  public SecondViewModel(IAContext context) {
    super(context);
  }

  public Drawable getBindingImage() {
    return getResources().getDrawable(mBindingImage);
  }

  public void setBindingImage(int bindingImage) {
    this.mBindingImage = bindingImage;
    notifyPropertyChanged("bindingImage");
  }

  public String getBindingText() {
    return mBindingText;
  }

  public void setBindingText(String bindingText) {
    this.mBindingText = bindingText;
    notifyPropertyChanged("bindingText");
  }

  public void setTitle(CharSequence title) {
    mTitle = title;
    notifyPropertyChanged("title");
  }

  @Override
  public CharSequence getTitle() {
    return mTitle;
  }

  @Override
  public boolean getShouldOpen() {
    return true;
  }
}
