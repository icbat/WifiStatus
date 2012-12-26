package com.icbat.wifistatus;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WifiStatusActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
   	List<String> out = getWifiInfo();

       super.onCreate(savedInstanceState);
       setListAdapter(new ArrayAdapter<String>(this, android.R.layout.two_line_list_item, out));
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
   	info.add("Speed:  " + WifiInfo.LINK_SPEED_UNITS);
   	
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
