CREATE DATABASE IF NOT EXISTS `bookdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bookdb`;

CREATE TABLE IF NOT EXISTS `ssm_log` (
  `logid` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(1000) DEFAULT NULL,
  `cre_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_book` (
  `bookid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `cnt` int(11) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;