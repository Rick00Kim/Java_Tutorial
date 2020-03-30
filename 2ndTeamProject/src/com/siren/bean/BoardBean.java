package com.siren.bean;

import java.util.Date;

public class BoardBean {
	private int index_num;
	private String kinds;
	private String id;
	private String title;
	private String content;
	private int hit;
	private Date writeDay;
	
	public BoardBean(){}

	public BoardBean(int index_num, String kinds, String id, String title, String content, int hit, Date writeDay) {
		this.index_num = index_num;
		this.kinds = kinds;
		this.id = id;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.writeDay = writeDay;
	}

	public int getIndex_num() {
		return index_num;
	}

	public void setIndex_num(int index_num) {
		this.index_num = index_num;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getWriteDay() {
		return writeDay;
	}

	public void setWriteDay(Date writeDay) {
		this.writeDay = writeDay;
	}

	
}
