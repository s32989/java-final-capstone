package com.techelevator.dao;



import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Ratings;
import com.techelevator.model.Comments;
import com.techelevator.model.Likes;
import com.techelevator.model.Picture;

@Component
public class PicServiceSqlDAO implements PicServiceDAO{
	
	private JdbcTemplate jdbcTemplate;
	public PicServiceSqlDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}
	@Override
	public Likes addLike(int pictureId, int userId) {
		String sql ="INSERT INTO likes ( like_id, picture_id, user_id) VALUES (?, ?, ?)";
		
		String readBackSql="SELECT like_id, picture_id, l.user_id, u.username FROM likes l "
				+ "JOIN users u ON u.user_id=l.user_id WHERE like_id=?";
		
		int nextVal=nextLikeId();
		SqlRowSet readBack; 
		
		try {
			jdbcTemplate.update(sql, nextVal,pictureId, userId);
			readBack= jdbcTemplate.queryForRowSet(readBackSql, nextVal);
			
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToLikeList(readBack).get(0);
	}
	
	
	@Override
	public void removeLike(int pictureId, int userId) {
		String sql ="DELETE FROM likes WHERE picture_id=? AND user_id=?";
		
		try {
			jdbcTemplate.update(sql, pictureId, userId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		
	}
	@Override
	public Comments addComment(int pictureId, int userId, String comment) {
		String sql ="INSERT INTO comments ( comment_id, picture_id, user_id, comment) VALUES ( ?,?, ?, ?)";
		
		String readBackSql="SELECT comment_id, picture_id, c.user_id, comment, u.username FROM comments c "
				+ "JOIN users u ON u.user_id=c.user_id WHERE c.comment_id=?";
		
		int nextVal=nextCommentId();
		SqlRowSet readBack; 
		
		try {
			jdbcTemplate.update(sql, nextVal, pictureId, userId, comment);
			readBack= jdbcTemplate.queryForRowSet(readBackSql, nextVal);
			
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToCommentList(readBack).get(0);
	}
	
	
	@Override
	public void removeComment(int commentId) {
		String sql ="DELETE FROM comments WHERE comment_id=?";
		
		try {
			jdbcTemplate.update(sql, commentId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		
	}
	@Override
	public Ratings addRating(int pictureId, int userId, int rating) {
		String sql ="INSERT INTO ratings ( rating_id, picture_id, user_id, rating) VALUES ( ?,?, ?, ?)";
		String readBackSql="SELECT rating_id, picture_id, r.user_id, rating, u.username FROM ratings r "
				+ "JOIN users u ON u.user_id=r.user_id WHERE r.rating_id=?";
		
		int nextVal=nextRateId();
		SqlRowSet readBack; 
		
		try {
			jdbcTemplate.update(sql, nextVal, pictureId, userId, rating);
			readBack= jdbcTemplate.queryForRowSet(readBackSql, nextVal);
			
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToRatingList(readBack).get(0);
	}
	@Override
	public Ratings changeRating(int ratingId, int rating) {
		String sql ="UPDATE ratings SET rating=? WHERE rating_id=?";
		String readBackSql="SELECT rating_id, picture_id, r.user_id, rating, u.username FROM ratings r "
				+ "JOIN users u ON u.user_id=r.user_id WHERE r.rating_id=?";

		SqlRowSet readBack; 
		
		try {
			jdbcTemplate.update(sql, rating, ratingId);
			readBack= jdbcTemplate.queryForRowSet(readBackSql, ratingId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToRatingList(readBack).get(0);
	}
	
	@Override
	public Picture updateFavorite(Picture picture) {
		String sql ="UPDATE pictures SET favorite=? WHERE picture_id=?";
		
		try {
			jdbcTemplate.update(sql, picture.isFavorite(), picture.getPictureId());
			
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return picture;
	
	}
	
	@Override
	public Picture updatePrivate(Picture picture) {
		String sql ="UPDATE pictures SET private=? WHERE picture_id=?";
		
		try {
			jdbcTemplate.update(sql, picture.isPrivate(), picture.getPictureId());
			
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return picture;
	
	}
	
	
	
	//helpers
	public List<Likes> getLikesByPicId(int pictureId){
		String sql ="SELECT like_id, picture_id, l.user_id, u.username FROM likes l "
				+ "JOIN users u ON u.user_id=l.user_id WHERE l.picture_id=?";
		SqlRowSet rowSet; 
		try {
			 rowSet= jdbcTemplate.queryForRowSet(sql, pictureId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToLikeList(rowSet);
	}
	
	public List<Comments> getCommentsByPicId(int pictureId){
		String sql ="SELECT comment_id, picture_id, c.user_id, comment, u.username FROM comments c "
				+ "JOIN users u ON u.user_id=c.user_id WHERE c.picture_id=?";
		SqlRowSet rowSet; 
		try {
			 rowSet= jdbcTemplate.queryForRowSet(sql, pictureId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToCommentList(rowSet);
	}
	
	public List<Ratings> getRatingsByPicId(int pictureId){
		String sql ="SELECT rating_id, picture_id, r.user_id, rating, u.username FROM ratings r "
				+ "JOIN users u ON u.user_id=r.user_id WHERE r.picture_id=?";
		SqlRowSet rowSet; 
		try {
			 rowSet= jdbcTemplate.queryForRowSet(sql, pictureId);
		} catch (DataAccessException e) {
			throw new DataAccessResourceFailureException("Can not reach database " + e.getMessage());
		}
		return RowMapper.mapRowsetToRatingList(rowSet);
	}
	 
	private int nextLikeId() {
		SqlRowSet nextVal = jdbcTemplate.queryForRowSet("SELECT nextval('likes_like_id_seq')");
		if (nextVal.next()) {
			return nextVal.getInt(1);
		} else {
			throw new RuntimeException("Error unable to get an id for the new picture");
		}
	}
	
	private int nextCommentId() {
		SqlRowSet nextVal = jdbcTemplate.queryForRowSet("SELECT nextval('comments_comment_id_seq')");
		if (nextVal.next()) {
			return nextVal.getInt(1);
		} else {
			throw new RuntimeException("Error unable to get an id for the new picture");
		}
	}
	private int nextRateId() {
		SqlRowSet nextVal = jdbcTemplate.queryForRowSet("SELECT nextval('ratings_rating_id_seq')");
		if (nextVal.next()) {
			return nextVal.getInt(1);
		} else {
			throw new RuntimeException("Error unable to get an id for the new picture");
		}
	}

	

}
