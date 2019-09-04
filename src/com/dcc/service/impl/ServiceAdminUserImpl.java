package com.dcc.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dcc.dao.MapperAdminUser;
import com.dcc.po.AdminUser;
import com.dcc.service.inter.ServiceAdminUserInter;
import com.dcc.util.Time;

public class ServiceAdminUserImpl implements ServiceAdminUserInter {
	@Autowired//ע��
	private MapperAdminUser mapperAdminUser;

	@Override
	public String loginAuser(String users, String password) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		AdminUser adminUser = mapperAdminUser.loginAdminUser(users, password);
		if(adminUser!=null) {
			map.put("state", "1");
			String jsonUser = JSONObject.toJSONString(adminUser);
			System.out.println(jsonUser);
			Cookie cookies = new Cookie("admin_user", java.net.URLEncoder.encode(jsonUser, "UTF-8"));//���л�
			//����SpringMVC�ṩ���ڷ�controller���ȡresponse����ķ���
			HttpServletResponse response =((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
			request.getSession().setAttribute("admin_user", jsonUser);
			response.addCookie(cookies);
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}
	

	@Override
	@Transactional
	public String updateUserMessage(AdminUser adminUser){
		Map<String, String> map = new HashMap<String, String>();
		if(adminUser == null) {
			map.put("state", "1");
		}else{
			try {
				mapperAdminUser.updateUSerMessages(adminUser);
				String jsonUser = JSONObject.toJSONString(mapperAdminUser.selectFindId(adminUser.getId()));
				Cookie cookies = new Cookie("admin_user", java.net.URLEncoder.encode(jsonUser, "UTF-8"));//���л�
				//����SpringMVC�ṩ���ڷ�controller���ȡresponse����ķ���
				HttpServletResponse response =((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
				response.addCookie(cookies);
				map.put("state", "1");
			} catch (Exception e) {
				e.printStackTrace();
				map.put("state", "-1");
			}
		}
		
		return JSON.toJSONString(map);
	}


	@Override
	@Transactional
	public String updatePassword(AdminUser adminUser,String pass) throws Exception {
		AdminUser ad = mapperAdminUser.selectFindId(adminUser.getId());//���ݲ�ԭ����
		Map<String, String> map = new HashMap<String, String>();
		if(ad.getPassword().equals(pass)) {//�����ѯ����ԭ�������û������ԭ������ͬ�������
			mapperAdminUser.updatePassword(adminUser);
			map.put("state", "1");
		}else if(!ad.getPassword().equals(pass)){
			map.put("state", "-2");
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}


	@Override
	public void signout() throws Exception {
		HttpServletResponse response =((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session =  request.getSession();
		session.removeAttribute("admin_user");
		session.invalidate();
		 Cookie[] cookies = request.getCookies();
		 //ѭ��ɾ��cookie
			for(Cookie ck : cookies) {
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
	}


	@Override
	public String selectAdminU() throws Exception {
		List<AdminUser> lists = mapperAdminUser.selectAdminUser();
		return JSON.toJSONString(lists);
	}


	@Override
	public String addUserAdmin(AdminUser adminUser,String result) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String keysy = session.getAttribute("sess_captcha").toString();
		if(!result.equals(keysy)) {
			map.put("state", "0");//��֤�����
		}else {
			adminUser.setDates(Time.getTime2());
			int num = mapperAdminUser.addAdminUser(adminUser);
			if(num>0) {
				map.put("state", "1");//ע��ɹ�
			}else {
				map.put("state", "-1");
			}
		}
		
		
		return JSON.toJSONString(map);
	}

}
