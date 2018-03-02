CREATE TABLE Users (uid INT NOT NULL, username VARCHAR(50) NOT NULL,role_group VARCHAR(20) NOT NULL,PRIMARY KEY (uid));
INSERT INTO Users VALUES(1,'shyam','admin');
INSERT INTO Users VALUES(2,'lakshmi','admin');
INSERT INTO Users VALUES(3,'arathi','admin');
INSERT INTO Users VALUES(4,'sooraj','admin');
CREATE TABLE roles (rid INT NOT NULL, role_name VARCHAR(20));