package com.dcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dcc.po.Link;
import com.dcc.service.inter.ServiceLinkInter;

@Controller
public class LinkHandler {
	@Autowired
	private ServiceLinkInter linkInter;
	
	@RequestMapping("/add_link.do")
	public String add_link(Link link) throws Exception {
		linkInter.addLink(link);
		return "redirect:/html/link.html";
	}
		
	@RequestMapping("/count_link.do")
	@ResponseBody
	public String count_link(Link link) throws Exception {
		String nums = linkInter.countLink();
		return nums;
	}
	
	@RequestMapping(value="/findPage_link.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findPage_link(Integer Fenye) throws Exception {
		String fy = linkInter.fenyeLink(Fenye);
		return fy;
	}
	
	@RequestMapping("/del_link.do")
	@ResponseBody
	public String del_link(Integer result) throws Exception {
		String dels = linkInter.deleteLink(result);
		return dels;
	}
	
	@RequestMapping(value="/select_link.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String select_link(Integer id) throws Exception {
		String lin = linkInter.findIdLi(id);
		return lin;
	}
	
	@RequestMapping("/update_link.do")
	public String update_link(Link link) throws Exception {
		linkInter.updateLin(link);
		return "redirect:/html/link.html";
	}

}
