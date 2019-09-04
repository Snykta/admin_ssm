package com.dcc.service.inter;

import java.util.Map;

import com.dcc.po.AdminUser;

public interface ServiceAdminUserInter {
	/**
	 * 登录的service
	 * @param users
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public String loginAuser(String users, String password) throws Exception;
	
	/**
	 * 更新用户信息service
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public String updateUserMessage(AdminUser adminUser) throws Exception;
	
	/**
	 * 修改密码service
	 * @param adminUser//包含了用户输入新密码
	 * @param pass 用户输入原密码
	 * @return
	 * @throws Exception
	 */
	public String updatePassword(AdminUser adminUser,String pass) throws Exception;
	
	/**
	 * 退出登录service
	 * @throws Exception
	 */
	public void signout() throws Exception;
	/**
	 * 查询所有管理员
	 * @return
	 * @throws Exception
	 */
	public String selectAdminU() throws Exception;
	/**
	 * 注册管理员
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public String addUserAdmin(AdminUser adminUser,String result) throws Exception;

}
