package com.dcc.dao;

import java.util.List;

import com.dcc.po.NewsType;

public interface Newtype {
	/**
	 * ��ѯ����dao
	 * @return
	 * @throws Exception
	 */
	public List<NewsType> selectType() throws Exception;
	/**
	 * ����type
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public int addType(NewsType type) throws Exception;

}
