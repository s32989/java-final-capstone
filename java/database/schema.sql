BEGIN TRANSACTION;

DROP TABLE IF EXISTS ratings;
DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS likes;
DROP TABLE IF EXISTS pictures;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	activated boolean DEFAULT (true),
	deleted boolean DEFAULT (false),
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

CREATE TABLE pictures(
        picture_id serial PRIMARY KEY, 
        user_id integer,
        pic_url varchar(350),
        pic_name varchar(50),
        pic_server_name varchar(50),
        description varchar(50),
        private boolean DEFAULT (false),
        favorite boolean DEFAULT (false),
        
        FOREIGN KEY (user_id) REFERENCES users(user_id) 
        
);

CREATE TABLE likes (
        like_id serial PRIMARY KEY,
        picture_id integer,
        user_id integer,
        
        FOREIGN KEY (picture_id) REFERENCES pictures(picture_id),
        FOREIGN KEY (user_id) REFERENCES users(user_id)

);

CREATE TABLE comments (
        comment_id serial PRIMARY KEY,
        picture_id integer,
        user_id integer,
        comment varchar(300),
        
        FOREIGN KEY (picture_id) REFERENCES pictures(picture_id),
        FOREIGN KEY (user_id) REFERENCES users(user_id)

);
CREATE TABLE ratings (
        rating_id serial PRIMARY KEY,
        picture_id integer,
        user_id integer,
        rating integer,
        
        FOREIGN KEY (picture_id) REFERENCES pictures(picture_id),
        FOREIGN KEY (user_id) REFERENCES users(user_id)

);

COMMIT TRANSACTION;
