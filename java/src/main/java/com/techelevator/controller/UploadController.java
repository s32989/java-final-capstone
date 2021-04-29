package com.techelevator.controller;

import java.io.IOException;
import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.techelevator.dao.UploadDAO;
import com.techelevator.dao.UserDAO;
import com.techelevator.model.Picture;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class UploadController {

	private UploadDAO uploadDAO;
	private UserDAO userDAO;

	public UploadController(UploadDAO uploadDAO, UserDAO userDAO) {

		this.uploadDAO = uploadDAO;
		this.userDAO =userDAO;
	}
	
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Picture upload(@RequestParam("file") MultipartFile file, 
			@RequestParam(value = "desc", defaultValue = "...") String desc,
			@RequestParam(value = "isPrivate", required = false) boolean isPrivate, Principal principal) {
		
		int userID=userDAO.findIdByUsername(principal.getName());
	
		return uploadDAO.upload(file, userID, desc, isPrivate);
	}

}
