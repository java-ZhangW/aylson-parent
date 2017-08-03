package com.aylson.dc.cfdb.search;

import com.aylson.core.frame.search.BaseSearch;

public class UserSmsSearch extends BaseSearch {

	private static final long serialVersionUID = 9060410382377139090L;
	
	// 模糊查询
	private String phoneIdLike; // 手机唯一标识码

	public String getPhoneIdLike() {
		return phoneIdLike;
	}

	public void setPhoneIdLike(String phoneIdLike) {
		this.phoneIdLike = phoneIdLike;
	}
}
