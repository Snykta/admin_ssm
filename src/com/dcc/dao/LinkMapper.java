package com.dcc.dao;

import java.util.List;

import com.dcc.po.Link;

public interface LinkMapper {
	/**
	 * 插入链接
	 * @param link
	 * @return
	 * @throws Exception
	 */
	public int addLinkDao(Link link) throws Exception;
	/**
	 * 总数
	 * @return
	 * @throws Exception
	 */
	public int countLink() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<Link> fenyeLink(Integer num) throws Exception;
	
	/**
	 * 删除Link
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteLink(Integer id) throws Exception;
	/**
	 * 单查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Link findIdLink(Integer id) throws Exception;
	/**
	 * 更新
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateLink(Link link) throws Exception;
	

}
