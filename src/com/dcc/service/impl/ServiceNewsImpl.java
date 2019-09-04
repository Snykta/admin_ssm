package com.dcc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.dcc.dao.NewsMapper;
import com.dcc.dao.Newtype;
import com.dcc.po.News;
import com.dcc.po.NewsType;
import com.dcc.service.inter.ServiceNewsInter;
import com.dcc.util.Time;

public class ServiceNewsImpl implements ServiceNewsInter{
	@Autowired
	private Newtype types;
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public String selectNewsType() throws Exception {
		List<NewsType> lists = types.selectType();
		return JSON.toJSONString(lists);
	}

	@Override
	@Transactional
	public void addNews(News news) throws Exception {
		news.setDatas(Time.getTime2());
		newsMapper.insertNews(news);
		
	}

	@Override
	public String countNews() throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = newsMapper.countNews();
		map.put("state", count);
		return JSON.toJSONString(map);
	}

	@Override
	public String fenyeNews(Integer num) throws Exception {
		List<News> lists = newsMapper.fenyeNews(num);
		return JSON.toJSONString(lists);
	}

	@Override
	@Transactional
	public String deleteNews(Integer id) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		int del = newsMapper.deleteNews(id);
		if(del==1) {
			map.put("state", "1");
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}

	@Override
	@Transactional
	public String delsNews(String array) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		String[] split = array.split(",");
		int de = newsMapper.delsNews(split);
		if(de>0) {
			map.put("state", "1");
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}

	@Override
	public String findIdN(Integer id) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		News news = newsMapper.findIdNew(id);
		return JSON.toJSONString(news);
	}

	@Override
	@Transactional
	public void updateNew(News news) throws Exception {
		newsMapper.updateNew(news);
	}

	@Override
	@Transactional
	public String addNewsType(NewsType type) throws Exception {
		type.setDates(Time.getTime());
		types.addType(type);
		return null;
	}

	@Override
	public String searchNew(String title) throws Exception {
		List<News> list = newsMapper.searchNews(title);
		return JSON.toJSONString(list);
	}

}
