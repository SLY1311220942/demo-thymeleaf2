package com.sly.demo.thymeleaf.model;

import java.io.Serializable;

/**
 * demo模型
 * @author sly
 * @time 2019年1月10日
 */
public class DemoModel implements Serializable {

	private static final long serialVersionUID = 7590149614373634451L;
	
	private String id;
	private String text;
	
	public DemoModel() {
		
	}
	
	public DemoModel(String id,String text) {
		this.id = id;
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
