package com.techelevator.model;

public class Ratings {
	
	private int ratingId;
	private int pictureId;
	private int userId;
	private int rating;
	private String byUser;
	

	public Ratings(int ratingId, int pictureId, int userId, int rating, String byUser) {

		this.ratingId = ratingId;
		this.pictureId = pictureId;
		this.userId = userId;
		this.rating = rating;
		this.byUser = byUser;
	}
	public String getByUser() {
		return byUser;
	}
	public void setByUser(String byUser) {
		this.byUser = byUser;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
