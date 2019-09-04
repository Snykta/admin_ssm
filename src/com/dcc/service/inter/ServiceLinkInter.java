package com.dcc.service.inter;

import com.dcc.po.Link;

public interface ServiceLinkInter {
	/**
	 * �������
	 * @throws Exception
	 */
	public void addLink(Link link) throws Exception;
	/**
	 * ��ѯ����
	 * @return
	 * @throws Exception
	 */
	public String countLink() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String fenyeLink(Integer num) throws Exception;
	
	/**
	 * ɾ��
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String deleteLink(Integer id) throws Exception;
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findIdLi(Integer id) throws Exception;
	/**
	 * ����
	 * @param id
	 * @throws Exception
	 */
	public void updateLin(Link link) throws Exception;

}
