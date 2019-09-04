package com.dcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcc.po.Dept;
import com.dcc.service.inter.ServiceDeptInter;

@Controller
public class DeptHandler {
	@Autowired
	private ServiceDeptInter deptInter;
	
	@RequestMapping(value="/findDept.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findDept() throws Exception {
		String depts = deptInter.selectDept();
		return depts;
	}
	
	@RequestMapping(value="/adddepts.do")
	public String adddepts(Dept dept) throws Exception {
		deptInter.addDept(dept);
		return "redirect:/html/dept.html";
	}
	
	@RequestMapping(value="/counts_Dept.do")
	@ResponseBody
	public String counts_Dept() throws Exception {
		String counts = deptInter.countsDepts();
		return counts;
	}
	
	@RequestMapping(value="/page_Depts.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String page_Depts(Integer result) throws Exception {
		String Feny = deptInter.FenyeDepts(result);
		return Feny;
	}
	
	@RequestMapping(value="/findIde_deptaction.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findIde_deptaction(Integer result) throws Exception {
		String Xq = deptInter.deptUser_findId(result);
		return Xq;
	}
	@RequestMapping(value="/updateDeptUser.do")
	public String updateDeptUser(Dept dept) throws Exception {
		deptInter.update_depts(dept);
		return "redirect:/html/dept.html";
	}
	
	@RequestMapping(value="/findIde_deptaction_ids.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findIde_deptaction_ids(Integer result) throws Exception {
		String depts = deptInter.find_dept_ids(result);
		return depts;
	}
}
