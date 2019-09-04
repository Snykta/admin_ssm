package com.dcc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dcc.util.Cores;

@Controller
public class CodeHandler {
	
	@RequestMapping("/getCode.do")
	public void getCode(HttpServletResponse response,HttpServletRequest request) {
		response.setContentType("image/jpg");// 设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        Cores randomValidateCode = new Cores();
        try {
        	randomValidateCode.getRandcode(request, response);// 输出图片方法
        	 HttpSession session = request.getSession();
     		String keysy = session.getAttribute("sess_captcha").toString();
     		System.out.println(keysy);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
