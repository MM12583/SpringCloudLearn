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

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` varchar(200) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

/*Data for the table `payment` */

LOCK TABLES `payment` WRITE;

insert  into `payment`(`id`,`serial`) values 
(1,'20491130235750_Product33'),
(2,'20361103114205_Product37'),
(3,'20391117135031_Product11'),
(4,'20361129203942_Product56'),
(5,'20381120012918_Product2'),
(6,'20441105132419_Product42'),
(7,'20241102115202_Product56'),
(8,'20391120040240_Product23'),
(9,'20441102182758_Product49'),
(10,'20201114134358_Product73');

UNLOCK TABLES;

/*Table structure for table `payment_memory` */

DROP TABLE IF EXISTS `payment_memory`;

CREATE TABLE `payment_memory` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` varchar(200) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

/*Data for the table `payment_memory` */

LOCK TABLES `payment_memory` WRITE;

insert  into `payment_memory`(`id`,`serial`) values 
(1,'20491130235750_Product33'),
(2,'20361103114205_Product37'),
(3,'20391117135031_Product11'),
(4,'20361129203942_Product56'),
(5,'20381120012918_Product2'),
(6,'20441105132419_Product42'),
(7,'20241102115202_Product56'),
(8,'20391120040240_Product23'),
(9,'20441102182758_Product49'),
(10,'20201114134358_Product73');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
