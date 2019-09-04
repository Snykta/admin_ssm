package com.dcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dcc.po.News;

public interface NewsMapper {
	
	/**
	 * ��������dao
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int insertNews(News news) throws Exception;
	
	/**
	 * ��ѯ����
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int countNews() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public List<News> fenyeNews(Integer num) throws Exception;
	
	/**
	 * ɾ��news
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int deleteNews(Integer id) throws Exception;
	
	/**
	 * ����ɾ��dao
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delsNews(String[] array) throws Exception;
	/**
	 * ������ѯ
	 * @param array
	 * @return
	 * @throws Exception
	 */
	public News findIdNew(Integer id) throws Exception;
	/**
	 * ����
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public int updateNew(News news) throws Exception;
	/**
	 * ģ����ѯ
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public List<News> searchNews(@Param("title")String title) throws Exception;

}
