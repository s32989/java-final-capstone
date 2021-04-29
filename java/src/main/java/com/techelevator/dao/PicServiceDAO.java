package com.techelevator.dao;



import com.techelevator.model.Comments;
import com.techelevator.model.Likes;
import com.techelevator.model.Picture;
import com.techelevator.model.Ratings;

public interface PicServiceDAO {
	
	Likes addLike (int pictureId, int userId);
	void removeLike (int pictureId, int userId);
	Comments addComment (int pictureId, int userId, String comment);
	void removeComment (int commentId);
	Ratings addRating (int pictureId, int userId, int rating);
	Ratings changeRating (int ratingId, int rating);
	Picture updateFavorite(Picture picture);
	Picture updatePrivate(Picture picture);

}
