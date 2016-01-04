package io.github.icbat.wifistatus;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.ArrayAdapter;

public class WifiStatusActivity extends ListActivity {
    
    @Override
     public void onCreate(Bundle savedInstanceState) {
    	List<String> out = getWifiInfo();

        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, out));
    }
    
    private List<String> getWifiInfo() {
    	WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
    	WifiInfo wifiInfo = wifi.getConnectionInfo();
    	DhcpInfo dhcp = wifi.getDhcpInfo();
    	
    	// Whatever string is given is what outputs
    	List<String> info = new ArrayList<String>(); 
    	
    	// The following come from Wifi Info
    	info.add("SSID:  " + wifiInfo.getSSID());
    	info.add("BSSID:  " + wifiInfo.getBSSID());
    	info.add("Hidden:  " + wifiInfo.getHiddenSSID());
    	info.add("MAC:  " + wifiInfo.getMacAddress());
    	info.add("Speed:  " + wifiInfo.getLinkSpeed() + " " + WifiInfo.LINK_SPEED_UNITS);
    	
    	// The following come from DHCP Info
    	info.add("IP:  " + Formatter.formatIpAddress(dhcp.ipAddress));
    	info.add("Default Gateway:  " + Formatter.formatIpAddress(dhcp.gateway));
    	info.add("DNS 1:  " + Formatter.formatIpAddress(dhcp.dns1));
    	info.add("DNS 2:  " + Formatter.formatIpAddress(dhcp.dns2));
    	info.add("DHCP:  " + Formatter.formatIpAddress(dhcp.serverAddress));
    	info.add("Subnet:  " + Formatter.formatIpAddress(dhcp.netmask));
    	info.add("Lease Duration:  " + dhcp.leaseDuration);
    	
    	return info;
    }

}
