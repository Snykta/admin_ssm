package com.dcc.service.inter;

import com.dcc.po.Link;

public interface ServiceLinkInter {
	/**
	 * 添加链接
	 * @throws Exception
	 */
	public void addLink(Link link) throws Exception;
	/**
	 * 查询总数
	 * @return
	 * @throws Exception
	 */
	public String countLink() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String fenyeLink(Integer num) throws Exception;
	
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String deleteLink(Integer id) throws Exception;
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findIdLi(Integer id) throws Exception;
	/**
	 * 更新
	 * @param id
	 * @throws Exception
	 */
	public void updateLin(Link link) throws Exception;

}
