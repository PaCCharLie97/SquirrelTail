
CREATE SCHEMA `chipdrunks` ;

USE mysql;

CREATE USER 'chipdrunk_user'@'localhost' IDENTIFIED BY 'chipies';
GRANT ALL PRIVILEGES ON chipdrunks.* TO 'chipdrunks_user'@'localhost';
FLUSH PRIVILEGES;

USE chipdrunks;
