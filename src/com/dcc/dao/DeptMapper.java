package com.dcc.dao;

import java.util.List;

import com.dcc.po.Dept;
import com.dcc.po.DeptCostom;

public interface DeptMapper {
	
	/**
	 * 查询所有dept
	 * @return
	 * @throws Exception
	 */
	public List<Dept> selectdept() throws Exception;
	/**
	 * 添加部门
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	public int adddeptDao(Dept dept) throws Exception;
	/**
	 * 总数
	 * @return
	 * @throws Exception
	 */
	public int countDept() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<DeptCostom> fenyeDept(Integer num) throws Exception;
	/**
	 * 查看部门详情
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<DeptCostom> dept_user_findId(Integer num) throws Exception;
	/**
	 * 修改名称
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	public int update_Dept(Dept dept) throws Exception;
	
	/**
	 * 查询单个dept
	 */
	public Dept find_id_Depts(Integer id) throws Exception;
	

}
