package com.dcc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class FileHandler {
	
	@RequestMapping("/getlistsFile.do")
	@ResponseBody
	public String getlistsFile() {
		Map<String,Float> map = new HashMap<String,Float>();
		File file = new File("E:\\apache-tomcat-9.0.11\\webapps\\test");
		File[] files = file.listFiles();
		for (File file2 : files) {
			if(!file2.isDirectory()) {
				float filesize = (float)file2.length()/1024;
				map.put(file2.getName(), filesize);
			}
		}
		return JSON.toJSONString(map);
	}
	
	@RequestMapping("/delFile.do")
	@ResponseBody
	public String delFile(String filename) {
		Map<String,String> map = new HashMap<String,String>();
		try {
			String path = "E:\\apache-tomcat-9.0.11\\webapps\\test\\"+filename;
			File file = new File(path);
			file.delete();
			map.put("state", "1");
		} catch (Exception e) {
			System.out.println(e.toString()+"É¾³ýÎÄ¼þÊ§°Ü");
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}
	@RequestMapping(value="/downloadFile.do/{filename}",method=RequestMethod.GET)
	 public ResponseEntity<byte[]> downloadFile(HttpServletRequest request,@PathVariable String filename) throws IOException{
		 String path = "E:\\apache-tomcat-9.0.11\\webapps\\test\\"+filename;
		File file = new File(path);
		byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<>(body, headers, statusCode);
        return entity;
	 }
	

}
