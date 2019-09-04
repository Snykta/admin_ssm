package com.dcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;
import com.dcc.service.inter.ServicePlainUserInter;

@Controller
public class PlainUserHandler {
	@Autowired
	private ServicePlainUserInter planInter;
	
	@RequestMapping(value="/addPlainUser.do")
	public String addPlainUser(PlainUserCostom costom) throws Exception {
		planInter.addPuser(costom);
		return "redirect:/html/users.html";
	}
	
	@RequestMapping("countpuser.do")
	@ResponseBody
	public String countpuser() throws Exception{
		String counts = planInter.countPuser();
		return counts;
	}
	
	@RequestMapping(value="pagePuser.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String pagePuser(Integer result) throws Exception{
		String Feny = planInter.FenyePuser(result);
		return Feny;
	}
	
	@RequestMapping(value="delPUser.do")
	@ResponseBody
	public String delPUser(Integer result) throws Exception{
		String dels = planInter.delsUs(result);
		return dels;
	}
	
	@RequestMapping(value="updateuser_puser.do")
	public String updateuser_puser(PlainUser plainUser) throws Exception{
		planInter.updatePlainUser(plainUser);
		return "redirect:/html/users.html";
	}
	
	@RequestMapping(value="findidu_puser.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findidu_puser(Integer result) throws Exception{
		String users = planInter.findPianU(result);
		return users;
	}
	
	@RequestMapping(value="searchPlainUser.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String searchPlainUser(String result) throws Exception{
		String users = planInter.searchPlUser(result);
		return users;
	}
	
	@RequestMapping(value="update_DeptU_ser.do")
	public String update_DeptU_ser(PlainUserCostom costom) throws Exception{
		planInter.updat_dep_id(costom);
		return "redirect:/html/dept.html";
	}
	

}
