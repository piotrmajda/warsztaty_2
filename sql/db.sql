CREATE DATABASE krks02_warsztat2
	DEFAULT CHARACTER SET utf8
	DEFAULT COLLATE utf8_general_ci;

CREATE TABLE users(
	id INT auto_increment,
	username VARCHAR(255) UNIQUE,
	email VARCHAR(255) UNIQUE,
	password VARCHAR(255),
	person_group_id INT,
	PRIMARY KEY(id)
	);