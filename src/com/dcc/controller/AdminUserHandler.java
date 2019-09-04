package com.dcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcc.po.AdminUser;
import com.dcc.service.inter.ServiceAdminUserInter;
import com.dcc.service.inter.ServiceLogInter;

@Controller
public class AdminUserHandler {
	@Autowired
	private ServiceAdminUserInter adminUserInter;
	@Autowired
	private ServiceLogInter servicelog;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public String LoginAdminUser(String users,String password) throws Exception {
		String logins = adminUserInter.loginAuser(users, password);
		return logins;
	}
	
	@RequestMapping("/update_AdminUser.do")
	@ResponseBody
	public String update_AdminUser(AdminUser adminUser) throws Exception {
		String updates = adminUserInter.updateUserMessage(adminUser);
		return updates;
	}
	
	
	@RequestMapping("/updatepass.do")
	@ResponseBody
	public String updatepass(AdminUser adminUser,String pass) throws Exception {
		String updates = adminUserInter.updatePassword(adminUser, pass);
		return updates;
	}
	
	@RequestMapping("/signout.do")
	public String signout() throws Exception {
		adminUserInter.signout();
		return "redirect:login.html";
	}
	//µÇÂ¼ÈÕÖ¾
	@RequestMapping(value="/selectIp.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String selectIp() throws Exception {
		String logs = servicelog.getLog();
		return logs;
	}
	
	@RequestMapping(value="/selectAd_AdminUser.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String selectAd_AdminUser() throws Exception {
		String users = adminUserInter.selectAdminU();
		return users;
	}
	
	@RequestMapping(value="/registerUser.do")
	@ResponseBody
	public String registerUser(AdminUser adminUser,String result) throws Exception {
		String res = adminUserInter.addUserAdmin(adminUser,result);
		return res;
	}

}
