package com.icbat.wifistatus;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class WifiStatusActivity extends ListActivity {
    String[] listItems = {"item 1", "item 2 ", "list", "android", "item 3", "foobar", "bar", }; 
    @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         setListAdapter(new ArrayAdapter(this,  android.R.layout.simple_list_item_1, listItems));
     }

}
