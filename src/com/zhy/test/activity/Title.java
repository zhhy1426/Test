package com.zhy.test.activity;

import java.io.Serializable;

public class Title implements Serializable {
	private static final long serialVersionUID = -6830671378191960321L;
	private String id;
	private String title;
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
