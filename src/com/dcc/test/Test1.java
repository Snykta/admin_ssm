package com.dcc.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dcc.po.AdminUser;
import com.dcc.po.Dept;
import com.dcc.po.Link;
import com.dcc.po.News;
import com.dcc.po.NewsType;
import com.dcc.po.PlainUserCostom;
import com.dcc.service.impl.ServiceAdminUserImpl;
import com.dcc.service.inter.ServiceAdminUserInter;
import com.dcc.service.inter.ServiceDeptInter;
import com.dcc.service.inter.ServiceLinkInter;
import com.dcc.service.inter.ServiceLogInter;
import com.dcc.service.inter.ServiceNewsInter;
import com.dcc.service.inter.ServicePlainUserInter;
import com.dcc.util.Time;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = AppUtil.getApplicationContext();
		ServiceDeptInter uservice = (ServiceDeptInter) applicationContext.getBean("serviceDeptImpl");
		//ServicePlainUserInter uservice = (ServicePlainUserInter) applicationContext.getBean("servicePlainUserImpl");
		
		try {
//			String aa = uservice.FenyeDepts(0);
//			JSONArray j = JSONArray.parseArray(aa);
//			
//			System.out.println(j.get(0));
			Dept dept = new Dept();
			dept.setEname("κώµτ");
			dept.setId(12);
			System.out.println(uservice.find_dept_ids(2));
//			uservice.update_depts(dept);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
