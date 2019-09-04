package com.dcc.service.inter;

import java.util.Map;

import com.dcc.po.AdminUser;

public interface ServiceAdminUserInter {
	/**
	 * ��¼��service
	 * @param users
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public String loginAuser(String users, String password) throws Exception;
	
	/**
	 * �����û���Ϣservice
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public String updateUserMessage(AdminUser adminUser) throws Exception;
	
	/**
	 * �޸�����service
	 * @param adminUser//�������û�����������
	 * @param pass �û�����ԭ����
	 * @return
	 * @throws Exception
	 */
	public String updatePassword(AdminUser adminUser,String pass) throws Exception;
	
	/**
	 * �˳���¼service
	 * @throws Exception
	 */
	public void signout() throws Exception;
	/**
	 * ��ѯ���й���Ա
	 * @return
	 * @throws Exception
	 */
	public String selectAdminU() throws Exception;
	/**
	 * ע�����Ա
	 * @param adminUser
	 * @return
	 * @throws Exception
	 */
	public String addUserAdmin(AdminUser adminUser,String result) throws Exception;

}
