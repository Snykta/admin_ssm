package com.dcc.po;

import java.io.File;

public class News {
	private int id;
	private String title;//����
	private String keyword;//�ؼ���
	private String descs;//����
	private String sort;//����
	private String imgs;//ͼƬ
	private String source;//��Դ
	private String author;//����
	private String datas;//ʱ��
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
