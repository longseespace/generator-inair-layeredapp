package <%=packageName%>.viewmodel;

import inair.app.IAContext;
import inair.data.LayeredItemViewData;
import inair.data.ViewModel;

public class FirstViewModel extends ViewModel implements LayeredItemViewData {

  private CharSequence mTitle = "First Layer";

  public FirstViewModel(IAContext context) {
    super(context);
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
