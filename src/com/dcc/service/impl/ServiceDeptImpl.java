package com.dcc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.dcc.dao.DeptMapper;
import com.dcc.po.Dept;
import com.dcc.po.DeptCostom;
import com.dcc.service.inter.ServiceDeptInter;
import com.dcc.util.Time;

public class ServiceDeptImpl implements ServiceDeptInter {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public String selectDept() throws Exception {
		List<Dept> list = deptMapper.selectdept();
		return JSON.toJSONString(list);
	}

	@Override
	@Transactional
	public void addDept(Dept dept) throws Exception {
		dept.setDatas(Time.getTime2());
		deptMapper.adddeptDao(dept);
	}

	@Override
	public String countsDepts() throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("counts", deptMapper.countDept());
		return JSON.toJSONString(map);
	}

	@Override
	public String FenyeDepts(Integer num) throws Exception {
		List<DeptCostom> lists = deptMapper.fenyeDept(num);
		return JSON.toJSONString(lists);
	}

	@Override
	public String deptUser_findId(Integer num) throws Exception {
		List<DeptCostom> lists = deptMapper.dept_user_findId(num);
		return JSON.toJSONString(lists);
	}

	@Override
	public void update_depts(Dept dept) throws Exception {
		deptMapper.update_Dept(dept);
	}

	@Override
	public String find_dept_ids(Integer id) throws Exception {
		return JSON.toJSONString(deptMapper.find_id_Depts(id));
	}
	
	

}
