package com.dcc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.AdminUser;

public interface MapperAdminUser {
	/**
	 * ��¼��dao
	 * @param users
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public AdminUser loginAdminUser(@Param("users") String users,@Param("password") String password) throws Exception;
	
	/***
	 * �����û���Ϣdao
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int updateUSerMessages(AdminUser adminUser) throws Exception;
	
	/**
	 * ����id��ѯdao
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public AdminUser selectFindId(Integer id) throws Exception;
	
	/**
	 * �޸�����dao
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int updatePassword(AdminUser adminUser) throws Exception;
	/**
	 * ��ѯ���й���Ա
	 * @return
	 * @throws Exception
	 */
	public List<AdminUser> selectAdminUser() throws Exception;
	
	/**
	 * ע��
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public int addAdminUser(AdminUser adminUser) throws Exception;
	
	
}
