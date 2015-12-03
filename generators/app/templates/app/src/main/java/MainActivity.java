package <%=packageName%>;

import android.os.Bundle;

import <%=packageName%>.view.FirstFragment;
import <%=packageName%>.view.SecondFragment;
import <%=packageName%>.viewmodel.MainViewModel;

import inair.app.IAActivity;

public class MainActivity extends IAActivity {

  @Override
  public void onInitialize(Bundle bundle) {
    setRootContentView(R.layout.activity_main);
    setDataContext(new MainViewModel(this));

    addChildLayout(new FirstFragment());
    addChildLayout(new SecondFragment());
  }
}
