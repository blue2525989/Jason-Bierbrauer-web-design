package com.springvelocity.model;

public class SimpleContent {

	private String url;
	
	private String name;
	
	private String description;
	
	public SimpleContent(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
	
	public SimpleContent(String url, String name, String description) {
		this.setUrl(url);
		this.setName(name);
		this.setDescription(description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
