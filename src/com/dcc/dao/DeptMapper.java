package com.dcc.dao;

import java.util.List;

import com.dcc.po.Dept;
import com.dcc.po.DeptCostom;

public interface DeptMapper {
	
	/**
	 * ��ѯ����dept
	 * @return
	 * @throws Exception
	 */
	public List<Dept> selectdept() throws Exception;
	/**
	 * ��Ӳ���
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	public int adddeptDao(Dept dept) throws Exception;
	/**
	 * ����
	 * @return
	 * @throws Exception
	 */
	public int countDept() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<DeptCostom> fenyeDept(Integer num) throws Exception;
	/**
	 * �鿴��������
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<DeptCostom> dept_user_findId(Integer num) throws Exception;
	/**
	 * �޸�����
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	public int update_Dept(Dept dept) throws Exception;
	
	/**
	 * ��ѯ����dept
	 */
	public Dept find_id_Depts(Integer id) throws Exception;
	

}
