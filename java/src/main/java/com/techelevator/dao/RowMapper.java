package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.model.Comments;
import com.techelevator.model.Likes;
import com.techelevator.model.Picture;
import com.techelevator.model.Ratings;

public class RowMapper {
	

	
	public static Picture mapRowsetToPicture(SqlRowSet rowSet) {
		Picture newPic = null;
		if (rowSet.next())
			newPic = new Picture(rowSet.getInt("picture_id"), rowSet.getInt("user_id"),
					rowSet.getString("username"), rowSet.getString("pic_url"),
					rowSet.getString("pic_server_name"), rowSet.getString("pic_name"), 
					rowSet.getString("description"),rowSet.getBoolean("private"), rowSet.getBoolean("favorite"));

		return newPic;

	}
	
	public static List<Picture> mapRowsetToPictureList(SqlRowSet rowSet) {
		List<Picture> picList =new ArrayList<Picture>();
		while(rowSet.next()) {
		Picture  newPic = new Picture(rowSet.getInt("picture_id"), rowSet.getInt("user_id"),
				rowSet.getString("username"), rowSet.getString("pic_url"),
				rowSet.getString("pic_server_name"), rowSet.getString("pic_name"), 
				rowSet.getString("description"),rowSet.getBoolean("private"), rowSet.getBoolean("favorite"));
		picList.add(newPic);
		}

		return picList;

	}
	
	public static List<Likes> mapRowsetToLikeList(SqlRowSet rowSet) {
		List<Likes> likeList =new ArrayList<Likes>();
		while(rowSet.next()) {
		Likes  newLike = new Likes(rowSet.getInt("like_id"), rowSet.getInt("picture_id"), rowSet.getInt("user_id"), rowSet.getString("username"));
		likeList.add(newLike);
		}
		return likeList;
	}
	
	public static List<Comments> mapRowsetToCommentList(SqlRowSet rowSet) {
		List<Comments> commentList =new ArrayList<Comments>();
		while(rowSet.next()) {
			Comments  newComment= new Comments(rowSet.getInt("comment_id"), rowSet.getInt("picture_id"), rowSet.getInt("user_id"),
					rowSet.getString("comment"), rowSet.getString("username"));
			commentList.add(newComment);
		}
		return commentList;
	}
	public static List<Ratings> mapRowsetToRatingList(SqlRowSet rowSet) {
		List<Ratings> ratingList =new ArrayList<Ratings>();
		while(rowSet.next()) {
			Ratings  newRating= new Ratings(rowSet.getInt("rating_id"), rowSet.getInt("picture_id"), rowSet.getInt("user_id"),
					rowSet.getInt("rating"),rowSet.getString("username"));
			
			ratingList.add(newRating);
		}
		return ratingList;
	}
	

}
