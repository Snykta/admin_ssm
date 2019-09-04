


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_cms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm_cms`;

/*Table structure for table `admin_user` */

DROP TABLE IF EXISTS `admin_user`;

CREATE TABLE `admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `users` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(25) NOT NULL COMMENT '密码',
  `names` varchar(25) DEFAULT NULL COMMENT '姓名',
  `email` varchar(40) DEFAULT NULL COMMENT '邮箱',
  `dates` varchar(35) DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(30) DEFAULT NULL COMMENT '部门名称',
  `datas` varchar(40) DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Table structure for table `link` */

DROP TABLE IF EXISTS `link`;

CREATE TABLE `link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(20) DEFAULT NULL COMMENT '关键字',
  `linkad` varchar(40) DEFAULT NULL COMMENT '短链地址',
  `states` varchar(15) DEFAULT NULL COMMENT '状态',
  `datas` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Table structure for table `login_log` */

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列',
  `login_ip` varchar(20) DEFAULT NULL COMMENT '登录ip',
  `site` varchar(20) DEFAULT NULL COMMENT '地点',
  `dates` varchar(20) DEFAULT NULL COMMENT '登录时间',
  `endlog` varchar(10) DEFAULT NULL COMMENT '结果',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL COMMENT '文章标题',
  `keyword` varchar(25) DEFAULT NULL COMMENT '关键字',
  `descs` varchar(25) DEFAULT NULL COMMENT '描述',
  `sort` varchar(15) DEFAULT NULL COMMENT '分类',
  `imgs` varchar(35) DEFAULT NULL COMMENT '封面图',
  `source` varchar(30) DEFAULT NULL COMMENT '来源',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `datas` varchar(35) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Table structure for table `newtype` */

DROP TABLE IF EXISTS `newtype`;

CREATE TABLE `newtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `names` varchar(25) DEFAULT NULL COMMENT '类别名称',
  `dates` varchar(35) DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Table structure for table `p_users` */

DROP TABLE IF EXISTS `p_users`;

CREATE TABLE `p_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `names` varchar(20) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `iphone` varchar(40) DEFAULT NULL COMMENT '手机号',
  `email` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `states` varchar(10) DEFAULT NULL COMMENT '状态',
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id_KY` (`dept_id`),
  CONSTRAINT `dept_id_KY` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
