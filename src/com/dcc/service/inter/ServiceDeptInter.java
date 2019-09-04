package com.dcc.service.inter;

import com.dcc.po.Dept;

public interface ServiceDeptInter {
	/**
	 * 查询所有dept
	 * @return
	 * @throws Exception
	 */
	public String selectDept() throws Exception;
	
	/**
	 * 添加部门
	 * @throws Exception
	 */
	public void addDept(Dept dept) throws Exception;
	
	/**
	 * 总数
	 * @return
	 * @throws Exception
	 */
	public String countsDepts() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String FenyeDepts(Integer num) throws Exception;
	
	/**
	 * 查看详情
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String deptUser_findId(Integer num) throws Exception;
	
	/**
	 * 更新部门
	 * @throws Exception
	 */
	public void update_depts(Dept dept) throws Exception;
	
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String find_dept_ids(Integer id) throws Exception;

}
