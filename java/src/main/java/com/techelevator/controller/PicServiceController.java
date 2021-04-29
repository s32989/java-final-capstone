package com.techelevator.controller;

import java.security.Principal;

import org.springframework.http.HttpStatus;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.PicServiceDAO;
import com.techelevator.dao.UserDAO;
import com.techelevator.model.Comments;
import com.techelevator.model.Likes;
import com.techelevator.model.Picture;
import com.techelevator.model.Ratings;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class PicServiceController {
	
	private PicServiceDAO picServiceDAO;
	private UserDAO userDAO;
	
	public PicServiceController(PicServiceDAO picServiceDAO, UserDAO userDAO) {
		
		this.picServiceDAO = picServiceDAO;
		this.userDAO = userDAO;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/like/{pictureId}", method = RequestMethod.POST)
	public Likes addLike(@PathVariable int pictureId, Principal principal) {
		
		int userId=userDAO.findIdByUsername(principal.getName());
		return picServiceDAO.addLike(pictureId, userId);
		
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/rlike/{pictureId}", method = RequestMethod.DELETE)
	public void  removeLike(@PathVariable int pictureId, Principal principal) {
		
		int userId=userDAO.findIdByUsername(principal.getName());
		picServiceDAO.removeLike(pictureId,userId);
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/comment", method = RequestMethod.POST)
	
	public Comments addComment(@RequestBody Comments cmnt, Principal principal) {
		
		int userId=userDAO.findIdByUsername(principal.getName());
		return picServiceDAO.addComment(cmnt.getPictureId(), userId, cmnt.getComment());
		
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/comment/{commentId}", method = RequestMethod.DELETE)
	public void removeComment(@PathVariable int commentId) {
		picServiceDAO.removeComment(commentId);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/rate", method = RequestMethod.POST)
	public Ratings addRating(@RequestBody Ratings rating, Principal principal) {
		int userId=userDAO.findIdByUsername(principal.getName());
	return	picServiceDAO.addRating(rating.getPictureId(), userId, rating.getRating());
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/editrate", method = RequestMethod.PUT)
	public Ratings changeRating(@RequestBody Ratings rating) {
		
		return picServiceDAO.changeRating(rating.getRatingId(), rating.getRating());
		
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/editfav", method = RequestMethod.PUT)
	public Picture updateFavorite(@RequestBody Picture picture, Principal principal){
		
		//security check
		if(picture.getUserName().equals(principal.getName())) {
		return picServiceDAO.updateFavorite(picture);
		}else {
			throw new  UsernameNotFoundException("User " + picture.getUserName() + " not allowed to make change");
		}
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/editprivate", method = RequestMethod.PUT)
	public Picture updatePrivate(@RequestBody Picture picture, Principal principal){
		
		//security check
		if(picture.getUserName().equals(principal.getName())) {
		return picServiceDAO.updatePrivate(picture);
		}else {
			throw new  UsernameNotFoundException("User " + picture.getUserName() + " not allowed to make change");
		}
	}

}


