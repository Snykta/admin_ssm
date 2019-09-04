package com.dcc.service.inter;

import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;

public interface ServicePlainUserInter {
	/**
	 * �����ͨ��Ա
	 * @throws Exception
	 */
	public void addPuser(PlainUserCostom costom) throws Exception;
	
	/**
	 * ��ѯ����
	 * @return
	 * @throws Exception
	 */
	public String countPuser() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String FenyePuser(Integer num) throws Exception;
	/**
	 * ɾ����Ա
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String delsUs(Integer id) throws Exception;
	
	/**
	 * ������Ա
	 * @param plainUser
	 */
	public void updatePlainUser(PlainUser plainUser) throws Exception;
	
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findPianU(Integer id) throws Exception;
	/**
	 * ģ����ѯ
	 * @param names
	 * @return
	 * @throws Exception
	 */
	public String searchPlUser(String names) throws Exception;
	
	/**
	 * ת�Ʋ���
	 * @param costom
	 * @throws Exception
	 */
	public void updat_dep_id(PlainUserCostom costom) throws Exception;

}
