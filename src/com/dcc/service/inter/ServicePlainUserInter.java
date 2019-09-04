package com.dcc.service.inter;

import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;

public interface ServicePlainUserInter {
	/**
	 * 添加普通人员
	 * @throws Exception
	 */
	public void addPuser(PlainUserCostom costom) throws Exception;
	
	/**
	 * 查询总数
	 * @return
	 * @throws Exception
	 */
	public String countPuser() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String FenyePuser(Integer num) throws Exception;
	/**
	 * 删除人员
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String delsUs(Integer id) throws Exception;
	
	/**
	 * 更新人员
	 * @param plainUser
	 */
	public void updatePlainUser(PlainUser plainUser) throws Exception;
	
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findPianU(Integer id) throws Exception;
	/**
	 * 模糊查询
	 * @param names
	 * @return
	 * @throws Exception
	 */
	public String searchPlUser(String names) throws Exception;
	
	/**
	 * 转移部门
	 * @param costom
	 * @throws Exception
	 */
	public void updat_dep_id(PlainUserCostom costom) throws Exception;

}
