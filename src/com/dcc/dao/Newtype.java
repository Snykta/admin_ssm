package com.dcc.dao;

import java.util.List;

import com.dcc.po.NewsType;

public interface Newtype {
	/**
	 * 查询分类dao
	 * @return
	 * @throws Exception
	 */
	public List<NewsType> selectType() throws Exception;
	/**
	 * 增加type
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public int addType(NewsType type) throws Exception;

}
