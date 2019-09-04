package com.dcc.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * 获取外网IP
 * @author snykt
 *
 */
public class GetIp {
	public static String getIpAddr() {
		 String inputLine = "";  
	        String read = "";  
	        String ip = "";  
	        try {  
	            URL url = new URL("http://www.ip138.com/");//第三方网站问题可能获取不到
	            HttpURLConnection urlConnection = (HttpURLConnection) url  
	                    .openConnection();  

	            BufferedReader in = new BufferedReader(new InputStreamReader(  
	                    urlConnection.getInputStream())); 
	            System.out.println(in);
	            while ((read = in.readLine()) != null) {  
	                inputLine += read;  
	            }  
	            String[] strs = inputLine.split(":");  
	            ip = strs[1].split("<")[0];  
	        } catch (Exception e) {  
	            System.out.println("ip获取失败");
	            ip = "122.127.194.154";//获取不到就默认ip
	        }  
	        return ip.trim();  
	}

}
