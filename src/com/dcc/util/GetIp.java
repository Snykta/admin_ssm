package com.dcc.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * ��ȡ����IP
 * @author snykt
 *
 */
public class GetIp {
	public static String getIpAddr() {
		 String inputLine = "";  
	        String read = "";  
	        String ip = "";  
	        try {  
	            URL url = new URL("http://www.ip138.com/");//��������վ������ܻ�ȡ����
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
	            System.out.println("ip��ȡʧ��");
	            ip = "122.127.194.154";//��ȡ������Ĭ��ip
	        }  
	        return ip.trim();  
	}

}
