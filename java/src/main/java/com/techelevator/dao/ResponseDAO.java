package com.techelevator.dao;

import java.util.List;


import com.techelevator.model.Picture;

public interface ResponseDAO {
	List<Picture> userPic(int userId);
	List<Picture> userFav(int userId);
	List<Picture> home();
	List<Picture> photoDetail(int pictureID);
	List<Picture> userPhotos(int userID);

	

}
