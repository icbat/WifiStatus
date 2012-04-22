package com.icbat.wifistatus; // Please edit this line if you're forking your own copy.

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class WifiStatusActivity extends ListActivity {
    
    @Override
     public void onCreate(Bundle savedInstanceState) {
    	 List<String> out = new ArrayList<String>();
    	 out.add("teehee");
    	 out.add("lolol");
    	 
    	 
         super.onCreate(savedInstanceState);
         setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, out));
     }

}
