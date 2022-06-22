/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.25 : Database - springcloudlearn
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springcloudlearn` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `springcloudlearn`;

/* Function  structure for function  `rand_serial` */

/*!50003 DROP FUNCTION IF EXISTS `rand_serial` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `rand_serial`() RETURNS varchar(255) CHARSET utf8 COLLATE utf8_unicode_ci
begin        
  DECLARE randDate CHAR(30)DEFAULT "";
  DECLARE randTime CHAR(30)DEFAULT "";
  declare return_str char(255) default "";        
  
  SET randDate = SUBSTRING(CONVERT(MAKEDATE(
		   2020 + FLOOR(RAND()*30) , FLOOR(305 + RAND() * 30)
		   )
               , CHAR), 1, 10);
  SET randDate = REPLACE(randDate, '-', '');
  
  SET randTime = SUBSTRING(CONVERT(MAKETIME(
		   FLOOR(RAND()*24), -- 0-23時
		   FLOOR(RAND()*60), -- 0-59分
		   FLOOR(RAND()*60) -- 0-59秒
		   ) 
               , CHAR), 1, 8); 
  SET randTime = REPLACE(randTime, ':', '');
  -- Proudct 1-100
  SET return_str = CONCAT(randDate, randTime, "_Product", CONVERT(FLOOR(1 + (RAND() * 100)), CHAR));
  
  return return_str;    
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
