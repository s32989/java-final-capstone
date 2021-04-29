package com.techelevator.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.techelevator.model.Picture;

@Component
public class UploadSqlDAO implements UploadDAO {
	private JdbcTemplate jdbcTemplate;
	

	public UploadSqlDAO(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
		
	}

	@Override
	public Picture upload(MultipartFile file, int userID, String desc, boolean isPrivate) {

		CloudinaryUpload uploadToCloudinary = new CloudinaryUpload();
		Map<String, String> cloudReturn = null;
		try {
			cloudReturn = uploadToCloudinary.toCloud(convert(file), userID);
		} catch (IOException e) {

			e.printStackTrace();
		}

		int pictureID = picNextVal();
		String picName = file.getOriginalFilename();
		String picUrl = cloudReturn.get("secure_url").toString();
		String serverName = cloudReturn.get("public_id").toString();

		String sql = "INSERT INTO pictures (picture_id, user_id, pic_url, pic_name, pic_server_name, description, private) "
				+ "VALUES (?,?,?,?,?,?,?)";
		
		SqlRowSet readBack;
		String readBackSql = "SELECT picture_id, p.user_id, u.username, pic_url, pic_name, pic_server_name, description, private, favorite FROM pictures p "
        		+ "JOIN users u ON u.user_id=p.user_id WHERE p.picture_id = ?";
		try {
			jdbcTemplate.update(sql, pictureID, userID, picUrl, picName, serverName, desc, isPrivate);
			readBack = jdbcTemplate.queryForRowSet(readBackSql, pictureID);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}

		cleanTemp();

		return RowMapper.mapRowsetToPicture(readBack);
	}

	// helpers
	private File convert(MultipartFile file) throws IOException {
		File temp = new File("src/main/resources/temp.jpg");
		FileOutputStream fos = new FileOutputStream(temp);
		fos.write(file.getBytes());
		fos.close();
		return temp;
	}

	private int picNextVal() {
		SqlRowSet nextVal = jdbcTemplate.queryForRowSet("SELECT nextval('pictures_picture_id_seq')");

		if (nextVal.next()) {
			return nextVal.getInt(1);
		} else {
			throw new RuntimeException("Error unable to get an id for the new picture");
		}
	}


	private void cleanTemp() {
		Path tempToDeletePath = Paths.get("src/main/resources/temp.jpg");
		try {
			Files.deleteIfExists(tempToDeletePath);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
