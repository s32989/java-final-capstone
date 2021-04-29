package com.techelevator.model;

public class Likes {
	
	private int likeId;
	private int pictureId;
	private int userId;
	private String byUser;
	
	public Likes(int likeId, int pictureId, int userId, String byUser) {

		this.likeId = likeId;
		this.pictureId = pictureId;
		this.userId = userId;
		this.byUser = byUser;
	}

	public int getLikeId() {
		return likeId;
	}

	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getByUser() {
		return byUser;
	}

	public void setByUser(String byUser) {
		this.byUser = byUser;
	}
	
	
}