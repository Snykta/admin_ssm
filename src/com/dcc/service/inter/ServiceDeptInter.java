package com.dcc.service.inter;

import com.dcc.po.Dept;

public interface ServiceDeptInter {
	/**
	 * ��ѯ����dept
	 * @return
	 * @throws Exception
	 */
	public String selectDept() throws Exception;
	
	/**
	 * ��Ӳ���
	 * @throws Exception
	 */
	public void addDept(Dept dept) throws Exception;
	
	/**
	 * ����
	 * @return
	 * @throws Exception
	 */
	public String countsDepts() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String FenyeDepts(Integer num) throws Exception;
	
	/**
	 * �鿴����
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String deptUser_findId(Integer num) throws Exception;
	
	/**
	 * ���²���
	 * @throws Exception
	 */
	public void update_depts(Dept dept) throws Exception;
	
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String find_dept_ids(Integer id) throws Exception;

}
