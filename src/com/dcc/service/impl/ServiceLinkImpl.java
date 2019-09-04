package com.dcc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.dcc.dao.LinkMapper;
import com.dcc.po.Link;
import com.dcc.service.inter.ServiceLinkInter;
import com.dcc.util.Time;

public class ServiceLinkImpl implements ServiceLinkInter {
	@Autowired
	private LinkMapper linkMapper;

	@Override
	@Transactional
	public void addLink(Link link) throws Exception {
		link.setDatas(Time.getTime());
		linkMapper.addLinkDao(link);
	}

	@Override
	public String countLink() throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer num = linkMapper.countLink();
		map.put("state", num);
		return JSON.toJSONString(map);
	}

	@Override
	public String fenyeLink(Integer num) throws Exception {
		List<Link> lists = linkMapper.fenyeLink(num);
		return JSON.toJSONString(lists);
	}

	@Override
	@Transactional
	public String deleteLink(Integer id) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		int del =linkMapper.deleteLink(id);
		if(del>0) {
			map.put("state", "1");
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}

	@Override
	public String findIdLi(Integer id) throws Exception {
		Link link =linkMapper.findIdLink(id);
		return JSON.toJSONString(link);
	}

	@Override
	public void updateLin(Link link) throws Exception {
		linkMapper.updateLink(link);
		
	}

}
