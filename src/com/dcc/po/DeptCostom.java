package com.dcc.po;

import java.util.List;

/**
 * dept����չ��
 * @author snykt
 *
 */
public class DeptCostom extends Dept {
	
	private List<PlainUserCostom> lists;

	public List<PlainUserCostom> getLists() {
		return lists;
	}

	public void setLists(List<PlainUserCostom> lists) {
		this.lists = lists;
	}

	
	
}
