package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class Picture {
	
	private int pictureId;
	private int userId;
	private String userName;
	private String picUrl;
	private String picServerName;
	private String picName;
	private String description;
	private boolean isPrivate;
	private boolean favorite;
	private List<Comments> comments;
	private List<Likes> likes;
	private List<Ratings> ratings;
	
	public Picture(int pictureId, int userId, String userName, String picUrl, String picServerName, String picName,
			String description, boolean isPrivate, boolean favorite ) {
	
		this.pictureId = pictureId;
		this.userId = userId;
		this.userName = userName;
		this.picUrl = picUrl;
		this.picServerName = picServerName;
		this.picName = picName;
		this.description = description;
		this.isPrivate = isPrivate;
		this.favorite = favorite;
		this.comments =new ArrayList<Comments>();
		this.likes = new ArrayList<Likes>();
		this.ratings = new ArrayList<Ratings>();
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicServerName() {
		return picServerName;
	}

	public void setPicServerName(String picServerName) {
		this.picServerName = picServerName;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public List<Likes> getLikes() {
		return likes;
	}

	public void setLikes(List<Likes> likes) {
		this.likes = likes;
	}

	public List<Ratings> getRatings() {
		return ratings;
	}

	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}
	
	
}
	
	