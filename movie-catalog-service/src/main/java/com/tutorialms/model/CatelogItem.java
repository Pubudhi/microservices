package com.tutorialms.model;

public class CatelogItem {
	
	public CatelogItem(String name, String des, int rating) {
		super();
		this.name = name;
		this.des = des;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	private String name;
	private String des;
	private int rating;
	

}
