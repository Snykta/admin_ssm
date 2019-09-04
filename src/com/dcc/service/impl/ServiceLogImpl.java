package com.dcc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.dcc.dao.LoginLog;
import com.dcc.po.Login_log;
import com.dcc.service.inter.ServiceLogInter;
import com.dcc.util.GetIp;
import com.dcc.util.Get_ip_state;
import com.dcc.util.Time;


public class ServiceLogImpl implements ServiceLogInter {
	@Autowired
	private LoginLog logs;

	@Override
	@Transactional
	public void addLog() throws Exception {
		Login_log log = new Login_log();
		log.setLogin_ip(GetIp.getIpAddr());
		log.setSite("河南信阳");//地址
		log.setDates(Time.getTime());//时间
		log.setEndlog("成功");//状态
		logs.insertLog(log);
		
	}

	@Override
	public String getLog() throws Exception {
		List<Login_log> lists = logs.selectLog();
		return JSON.toJSONString(lists);
	}

}
