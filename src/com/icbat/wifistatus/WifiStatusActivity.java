package com.icbat.wifistatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class WifiStatusActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	// Initialization
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }
    
    private List<HashMap<String,String>> getOutput ()	{
    	List<HashMap<String,String>> out = new ArrayList<HashMap<String,String>>();
    	HashMap<String, String> item = new HashMap<String,String>();
    	item.clear();
        item.put("1", "A");
        item.put("2", "B");
        out.add(item);
        item.clear();
        item.put("3", "C");
        item.put("4", "D");
        out.add(item);
    	return out;
    }
}