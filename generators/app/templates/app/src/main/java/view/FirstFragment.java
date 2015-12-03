package <%=packageName%>.view;

import android.os.Bundle;

import <%=packageName%>.R;
import <%=packageName%>.viewmodel.FirstViewModel;

import inair.app.IAFragment;

public class FirstFragment extends IAFragment {
  @Override
  public void onInitialize(Bundle savedInstanceState) {
    setRootContentView(R.layout.first_layout);
    setDataContext(new FirstViewModel(this));
  }
}
