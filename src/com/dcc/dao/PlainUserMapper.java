package com.dcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;

public interface PlainUserMapper {
	/*
	 * 增加普通人员
	 */
	public int addPlanUser(PlainUserCostom costom) throws Exception;
	
	/**
	 * 分页查询普通人员
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<PlainUser> fenyePuser(Integer num) throws Exception;
	
	/**
	 * 查询总数
	 * @return
	 * @throws Exception
	 */
	public int countPuser() throws Exception;
	/**
	 * 删除人员
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delPuser(Integer id) throws Exception;
	
	/**
	 * 更新人员
	 * @param plainUser
	 * @return
	 * @throws Exception
	 */
	public int updatePuser(PlainUser plainUser) throws Exception;
	
	/**
	 * 单个查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PlainUser FindIdUser(Integer id) throws Exception;
	/**
	 * 模糊查询
	 * @param names
	 * @return
	 * @throws Exception
	 */
	public List<PlainUser> searchUser(@Param("names")String names) throws Exception;
	
	/**
	 * 转移部门
	 * @param costom
	 * @return
	 * @throws Exception
	 */
	public int update_dept_id(PlainUserCostom costom) throws Exception;
	
}
