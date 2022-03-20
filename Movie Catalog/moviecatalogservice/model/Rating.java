package com.moviecatalogservice.model;

public class Rating {
	private String userId;
	private int rate;
	public Rating(String userId, int rate) {
		super();
		this.userId = userId;
		this.rate = rate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

//	public Rating(String userId, String rate) {
//		super();
//		this.userId = userId;
//		this.rate = rate;
//	}
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getRate() {
//		return rate;
//	}
//	public void setRate(String rate) {
//		this.rate = rate;
//	}



}
