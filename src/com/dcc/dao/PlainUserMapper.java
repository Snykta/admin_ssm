package com.dcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;

public interface PlainUserMapper {
	/*
	 * ������ͨ��Ա
	 */
	public int addPlanUser(PlainUserCostom costom) throws Exception;
	
	/**
	 * ��ҳ��ѯ��ͨ��Ա
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<PlainUser> fenyePuser(Integer num) throws Exception;
	
	/**
	 * ��ѯ����
	 * @return
	 * @throws Exception
	 */
	public int countPuser() throws Exception;
	/**
	 * ɾ����Ա
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delPuser(Integer id) throws Exception;
	
	/**
	 * ������Ա
	 * @param plainUser
	 * @return
	 * @throws Exception
	 */
	public int updatePuser(PlainUser plainUser) throws Exception;
	
	/**
	 * ������ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PlainUser FindIdUser(Integer id) throws Exception;
	/**
	 * ģ����ѯ
	 * @param names
	 * @return
	 * @throws Exception
	 */
	public List<PlainUser> searchUser(@Param("names")String names) throws Exception;
	
	/**
	 * ת�Ʋ���
	 * @param costom
	 * @return
	 * @throws Exception
	 */
	public int update_dept_id(PlainUserCostom costom) throws Exception;
	
}
