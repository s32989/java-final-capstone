package com.techelevator.model;

public class Comments {
	
	private int commentId;
	private int pictureId;
	private int userId;
	private String comment;
	private String byUser;
	
	public Comments(int commentId, int pictureId, int userId, String comment, String byUser) {
		
		this.commentId = commentId;
		this.pictureId = pictureId;
		this.userId = userId;
		this.comment = comment;
		this.byUser = byUser;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getByUser() {
		return byUser;
	}

	public void setByUser(String byUser) {
		this.byUser = byUser;
	}
	
	
	
	

}
