package com.dcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.News;

public interface NewsMapper {
	
	/**
	 * 插入新闻dao
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int insertNews(News news) throws Exception;
	
	/**
	 * 查询总数
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int countNews() throws Exception;
	
	/**
	 * 分页查询
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<News> fenyeNews(Integer num) throws Exception;
	
	/**
	 * 删除news
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteNews(Integer id) throws Exception;
	
	/**
	 * 批量删除dao
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delsNews(String[] array) throws Exception;
	/**
	 * 单个查询
	 * @param array
	 * @return
	 * @throws Exception
	 */
	public News findIdNew(Integer id) throws Exception;
	/**
	 * 更新
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int updateNew(News news) throws Exception;
	/**
	 * 模糊查询
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public List<News> searchNews(@Param("title")String title) throws Exception;

}
