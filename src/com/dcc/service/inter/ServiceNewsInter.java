package com.dcc.service.inter;

import com.dcc.po.News;
import com.dcc.po.NewsType;

public interface ServiceNewsInter {
	/**
	 * 查询新闻的分类
	 * @return
	 */
	public String selectNewsType() throws Exception;
	
	/***
	 * 插入新闻分类
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public String addNewsType(NewsType type) throws Exception;
	/**
	 * 增加新闻service
	 * @param news
	 * @throws Exception
	 */
	public void addNews(News news) throws Exception;
	/**
	 * 查询总数
	 * @return
	 * @throws Exception
	 */
	public String countNews() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String fenyeNews(Integer num) throws Exception;
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String deleteNews(Integer id) throws Exception;
	/**
	 * 批量删除
	 * @param array
	 * @return
	 * @throws Exception
	 */
	public String delsNews(String array) throws Exception;
	
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findIdN(Integer id) throws Exception;
	/**
	 * 更新
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public void updateNew(News news) throws Exception;
	/**
	 * 模糊查询
	 * @param title
	 * @return
	 * @throws Exception
	 */
	public String searchNew(String title) throws Exception;

}
