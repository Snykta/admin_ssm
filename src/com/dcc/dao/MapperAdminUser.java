package com.dcc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.AdminUser;

public interface MapperAdminUser {
	/**
	 * 登录的dao
	 * @param users
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public AdminUser loginAdminUser(@Param("users") String users,@Param("password") String password) throws Exception;
	
	/***
	 * 更新用户信息dao
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int updateUSerMessages(AdminUser adminUser) throws Exception;
	
	/**
	 * 根据id查询dao
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AdminUser selectFindId(Integer id) throws Exception;
	
	/**
	 * 修改密码dao
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int updatePassword(AdminUser adminUser) throws Exception;
	/**
	 * 查询所有管理员
	 * @return
	 * @throws Exception
	 */
	public List<AdminUser> selectAdminUser() throws Exception;
	
	/**
	 * 注册
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int addAdminUser(AdminUser adminUser) throws Exception;
	
	
}
