package com.dcc.po;

import java.io.File;

public class News {
	private int id;
	private String title;//标题
	private String keyword;//关键字
	private String descs;//描述
	private String sort;//分类
	private String imgs;//图片
	private String source;//来源
	private String author;//作者
	private String datas;//时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDatas() {
		return datas;
	}
	public void setDatas(String datas) {
		this.datas = datas;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", keyword=" + keyword + ", descs=" + descs + ", sort=" + sort
				+ ", imgs=" + imgs + ", source=" + source + ", author=" + author + ", datas=" + datas + "]";
	}
	
	
}
