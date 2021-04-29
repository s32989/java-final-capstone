package com.techelevator.dao;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class CloudinaryUpload {
	private Cloudinary cloudinary;
	
	public Map <String, String> toCloud(File file, int userID) throws IOException {
		
		
		cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dr1xyxwvj",
				"api_key", "238366875587185",
				"api_secret", "95NwCdjBedugKSkoqmfoMUIdRh0"));
		
		Map <String, String>uploadResult = cloudinary.uploader().upload(file, ObjectUtils.asMap("folder", userID+"/"));
		
		return uploadResult;
		
	}

}
