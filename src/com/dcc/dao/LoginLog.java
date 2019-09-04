package com.dcc.dao;

import java.util.List;

import com.dcc.po.Login_log;

public interface LoginLog {
	
	public int insertLog(Login_log log) throws Exception;
	
	public List<Login_log> selectLog() throws Exception;

}
