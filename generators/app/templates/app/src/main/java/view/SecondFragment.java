package <%=packageName%>.view;

import android.os.Bundle;

import <%=packageName%>.R;
import <%=packageName%>.viewmodel.SecondViewModel;

import inair.app.IAFragment;

public class SecondFragment extends IAFragment {
  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setRootContentView(R.layout.second_layout);
    setDataContext(new SecondViewModel(this));
  }
}
