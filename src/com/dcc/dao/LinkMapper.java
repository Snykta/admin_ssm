package com.dcc.dao;

import java.util.List;

import com.dcc.po.Link;

public interface LinkMapper {
	/**
	 * ��������
	 * @param link
	 * @return
	 * @throws Exception
	 */
	public int addLinkDao(Link link) throws Exception;
	/**
	 * ����
	 * @return
	 * @throws Exception
	 */
	public int countLink() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<Link> fenyeLink(Integer num) throws Exception;
	
	/**
	 * ɾ��Link
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteLink(Integer id) throws Exception;
	/**
	 * ����ѯ
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Link findIdLink(Integer id) throws Exception;
	/**
	 * ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int updateLink(Link link) throws Exception;
	

}
