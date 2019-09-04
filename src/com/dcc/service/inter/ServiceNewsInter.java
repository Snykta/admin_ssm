package com.dcc.service.inter;

import com.dcc.po.News;
import com.dcc.po.NewsType;

public interface ServiceNewsInter {
	/**
	 * ��ѯ���ŵķ���
	 * @return
	 */
	public String selectNewsType() throws Exception;
	
	/***
	 * �������ŷ���
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public String addNewsType(NewsType type) throws Exception;
	/**
	 * ��������service
	 * @param news
	 * @throws Exception
	 */
	public void addNews(News news) throws Exception;
	/**
	 * ��ѯ����
	 * @return
	 * @throws Exception
	 */
	public String countNews() throws Exception;
	
	/**
	 * ��ҳ��ѯ
	 * @param num
	 * @return
	 * @throws Exception
	 */
	public String fenyeNews(Integer num) throws Exception;
	/**
	 * ɾ��
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String deleteNews(Integer id) throws Exception;
	/**
	 * ����ɾ��
	 * @param array
	 * @return
	 * @throws Exception
	 */
	public String delsNews(String array) throws Exception;
	
	/**
	 * ��ѯ����
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String findIdN(Integer id) throws Exception;
	/**
	 * ����
	 * @param news
	 * @return
	 * @throws Exception
	 */
	public void updateNew(News news) throws Exception;
	/**
	 * ģ����ѯ
	 * @param title
	 * @return
	 * @throws Exception
	 */
	public String searchNew(String title) throws Exception;

}
