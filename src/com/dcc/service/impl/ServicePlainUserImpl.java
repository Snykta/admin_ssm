package com.dcc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.dcc.dao.PlainUserMapper;
import com.dcc.po.PlainUser;
import com.dcc.po.PlainUserCostom;
import com.dcc.service.inter.ServicePlainUserInter;

public class ServicePlainUserImpl implements ServicePlainUserInter{
	@Autowired
	private PlainUserMapper plainMapper;

	@Override
	@Transactional
	public void addPuser(PlainUserCostom costom) throws Exception {
		plainMapper.addPlanUser(costom);
		
	}

	@Override
	public String countPuser() throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("counts", plainMapper.countPuser());
		return JSON.toJSONString(map);
	}

	@Override
	public String FenyePuser(Integer num) throws Exception {
		List<PlainUser> lists = plainMapper.fenyePuser(num);
		return JSON.toJSONString(lists);
	}

	@Override
	@Transactional
	public String delsUs(Integer id) throws Exception {
		Map<String, String> map = new HashMap<String,String>();
		int num = plainMapper.delPuser(id);
		if(num>0) {
			map.put("state", "1");
		}else {
			map.put("state", "-1");
		}
		return JSON.toJSONString(map);
	}

	@Override
	@Transactional
	public void updatePlainUser(PlainUser plainUser) throws Exception {
		plainMapper.updatePuser(plainUser);
		
	}

	@Override
	public String findPianU(Integer id) throws Exception {
		PlainUser plainUser = plainMapper.FindIdUser(id);
		return JSON.toJSONString(plainUser);
	}

	@Override
	public String searchPlUser(String names) throws Exception {
		List<PlainUser> lists = plainMapper.searchUser(names);
		return JSON.toJSONString(lists);
	}

	@Override
	public void updat_dep_id(PlainUserCostom costom) throws Exception {
		plainMapper.update_dept_id(costom);
		
	}

}
