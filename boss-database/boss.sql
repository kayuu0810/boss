/*
SQLyog v10.2 
MySQL - 5.5.27 : Database - boss
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`boss` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `boss`;

/*Table structure for table `cms_article` */

DROP TABLE IF EXISTS `cms_article`;

CREATE TABLE `cms_article` (
  `article_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '文章编号',
  `title` varchar(200) NOT NULL COMMENT '文章标题',
  `author` varchar(50) DEFAULT NULL COMMENT '文章原作者',
  `fromurl` varchar(300) DEFAULT NULL COMMENT '转载来源网址',
  `image` varchar(300) DEFAULT NULL COMMENT '封面图',
  `keywords` varchar(100) DEFAULT NULL COMMENT '关键字',
  `description` varchar(500) DEFAULT NULL COMMENT '简介',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
  `allowcomments` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否允许评论(0:不允许,1:允许)',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态(-1:不通过,0未审核,1:通过)',
  `content` mediumtext COMMENT '内容',
  `user_id` int(10) unsigned NOT NULL COMMENT '发布人id',
  `readnumber` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '阅读数量',
  `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
  `orders` bigint(20) unsigned NOT NULL COMMENT '排序',
  PRIMARY KEY (`article_id`),
  KEY `cms_article_orders` (`orders`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

/*Data for the table `cms_article` */

/*Table structure for table `cms_article_category` */

DROP TABLE IF EXISTS `cms_article_category`;

CREATE TABLE `cms_article_category` (
  `article_category_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(10) unsigned NOT NULL COMMENT '文章编号',
  `category_id` int(10) unsigned NOT NULL COMMENT '类目编号',
  PRIMARY KEY (`article_category_id`),
  KEY `cms_article_category_article_id` (`article_id`),
  KEY `cms_article_category_category_id` (`category_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`category_id`) REFERENCES `cms_category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`article_id`) REFERENCES `cms_article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章类目关联表';

/*Data for the table `cms_article_category` */

/*Table structure for table `cms_article_tag` */

DROP TABLE IF EXISTS `cms_article_tag`;

CREATE TABLE `cms_article_tag` (
  `article_tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(10) unsigned NOT NULL COMMENT '文章编号',
  `tag_id` int(10) unsigned NOT NULL COMMENT '标签编号',
  PRIMARY KEY (`article_tag_id`),
  KEY `cms_article_tag_article_id` (`article_id`),
  KEY `cms_article_tag_tag_id` (`tag_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`article_id`) REFERENCES `cms_article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`tag_id`) REFERENCES `cms_tag` (`tag_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章标签关联表';

/*Data for the table `cms_article_tag` */

/*Table structure for table `cms_book` */

DROP TABLE IF EXISTS `cms_book`;

CREATE TABLE `cms_book` (
  `book_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `name` varchar(45) NOT NULL COMMENT '书名',
  PRIMARY KEY (`book_id`),
  KEY `FK_book_1` (`user_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`user_id`) REFERENCES `cms_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='书';

/*Data for the table `cms_book` */

/*Table structure for table `cms_category` */

DROP TABLE IF EXISTS `cms_category`;

CREATE TABLE `cms_category` (
  `category_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '类目编号',
  `pid` int(10) unsigned DEFAULT NULL COMMENT '上级编号',
  `level` tinyint(4) NOT NULL COMMENT '层级',
  `name` varchar(20) NOT NULL COMMENT '名称',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `type` tinyint(3) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
  `alias` varchar(20) DEFAULT NULL COMMENT '别名',
  `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
  `orders` bigint(255) unsigned NOT NULL COMMENT '排序',
  PRIMARY KEY (`category_id`),
  KEY `cms_category_orders` (`orders`),
  KEY `cms_category_pid` (`pid`),
  KEY `cms_category_alias` (`alias`),
  KEY `cms_category_level` (`level`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`pid`) REFERENCES `cms_category` (`category_id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='类目表';

/*Data for the table `cms_category` */

insert  into `cms_category`(`category_id`,`pid`,`level`,`name`,`description`,`icon`,`type`,`alias`,`ctime`,`orders`) values (1,NULL,1,'1','1','1',1,'1',1486817307355,1486817307355),(2,1,2,'2','2','2',1,'2',1486817333962,1486817333962);

/*Table structure for table `cms_category_tag` */

DROP TABLE IF EXISTS `cms_category_tag`;

CREATE TABLE `cms_category_tag` (
  `category_tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `category_id` int(10) unsigned NOT NULL COMMENT '类目编号',
  `tag_id` int(10) unsigned NOT NULL COMMENT '标签编号',
  PRIMARY KEY (`category_tag_id`),
  KEY `cms_category_tag_tag_id` (`tag_id`),
  KEY `cms_category_tag_category_id` (`category_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`category_id`) REFERENCES `cms_category` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`tag_id`) REFERENCES `cms_tag` (`tag_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类目标签关联表';

/*Data for the table `cms_category_tag` */

/*Table structure for table `cms_comment` */

DROP TABLE IF EXISTS `cms_comment`;

CREATE TABLE `cms_comment` (
  `comment_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pid` int(10) unsigned DEFAULT NULL COMMENT '回复楼中楼编号回复楼中楼编号',
  `article_id` int(10) unsigned NOT NULL COMMENT '文章编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `content` text NOT NULL COMMENT '评论内容',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态(-1:不通过,0:未审核,1:通过)',
  `ip` varchar(30) DEFAULT NULL COMMENT '评论人ip地址',
  `agent` varchar(200) DEFAULT NULL COMMENT '评论人终端信息',
  `ctime` bigint(20) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`comment_id`),
  KEY `cms_comment_article_id` (`article_id`),
  KEY `FK_Reference_2` (`pid`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`article_id`) REFERENCES `cms_article` (`article_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`pid`) REFERENCES `cms_comment` (`comment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

/*Data for the table `cms_comment` */

/*Table structure for table `cms_page` */

DROP TABLE IF EXISTS `cms_page`;

CREATE TABLE `cms_page` (
  `page_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pid` int(10) DEFAULT NULL,
  `alias` varchar(20) DEFAULT NULL,
  `content` mediumtext,
  `keywords` varchar(100) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `ctime` bigint(20) DEFAULT NULL,
  `orders` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`page_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='页面';

/*Data for the table `cms_page` */

/*Table structure for table `cms_setting` */

DROP TABLE IF EXISTS `cms_setting`;

CREATE TABLE `cms_setting` (
  `setting_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `setting_key` varchar(10) DEFAULT NULL,
  `setting_value` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`setting_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='网站配置';

/*Data for the table `cms_setting` */

/*Table structure for table `cms_tag` */

DROP TABLE IF EXISTS `cms_tag`;

CREATE TABLE `cms_tag` (
  `tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '标签编号',
  `name` varchar(20) NOT NULL COMMENT '名称',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '类型(1:普通,2:热门...)',
  `alias` varchar(20) DEFAULT NULL COMMENT '别名',
  `ctime` bigint(20) unsigned NOT NULL COMMENT '创建时间',
  `orders` bigint(20) unsigned NOT NULL COMMENT '排序',
  PRIMARY KEY (`tag_id`),
  KEY `cms_tag_orders` (`orders`),
  KEY `cms_tag_alias` (`alias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='标签表';

/*Data for the table `cms_tag` */

/*Table structure for table `cms_user` */

DROP TABLE IF EXISTS `cms_user`;

CREATE TABLE `cms_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(32) DEFAULT NULL COMMENT '账号',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `nickname` varchar(32) DEFAULT NULL COMMENT '昵称',
  `sex` int(11) DEFAULT NULL COMMENT '0未知,1男,2女',
  `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `content` text COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `cms_user` */

/*Table structure for table `pay_in_order` */

DROP TABLE IF EXISTS `pay_in_order`;

CREATE TABLE `pay_in_order` (
  `pay_in_order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pay_vendor_id` int(10) DEFAULT NULL,
  `pay_mch_id` int(10) DEFAULT NULL,
  `amount` decimal(10,0) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `ctime` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`pay_in_order_id`),
  KEY `FK_Reference_32` (`pay_vendor_id`),
  KEY `FK_Reference_38` (`pay_mch_id`),
  CONSTRAINT `FK_Reference_32` FOREIGN KEY (`pay_vendor_id`) REFERENCES `pay_vendor` (`pay_vendor_id`),
  CONSTRAINT `FK_Reference_38` FOREIGN KEY (`pay_mch_id`) REFERENCES `pay_mch` (`pay_mch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收入订单表';

/*Data for the table `pay_in_order` */

/*Table structure for table `pay_in_order_detail` */

DROP TABLE IF EXISTS `pay_in_order_detail`;

CREATE TABLE `pay_in_order_detail` (
  `pay_in_order_detail_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pay_in_order_id` int(10) DEFAULT NULL,
  `product_id` varchar(50) DEFAULT NULL,
  `product_name` varchar(100) DEFAULT NULL,
  `product_price` decimal(10,0) DEFAULT NULL,
  `product_count` int(10) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`pay_in_order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收入订单明细表';

/*Data for the table `pay_in_order_detail` */

/*Table structure for table `pay_mch` */

DROP TABLE IF EXISTS `pay_mch`;

CREATE TABLE `pay_mch` (
  `pay_mch_id` int(10) NOT NULL AUTO_INCREMENT,
  `mch_id` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `reqKey` varchar(50) DEFAULT NULL,
  `resKey` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pay_mch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支付中心商户管理表';

/*Data for the table `pay_mch` */

/*Table structure for table `pay_out_order` */

DROP TABLE IF EXISTS `pay_out_order`;

CREATE TABLE `pay_out_order` (
  `pay_out_order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pay_mch_id` int(10) DEFAULT NULL,
  `pay_vendor_id` int(10) DEFAULT NULL,
  `amount` decimal(10,0) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `ctime` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`pay_out_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支出订单表';

/*Data for the table `pay_out_order` */

/*Table structure for table `pay_out_order_detail` */

DROP TABLE IF EXISTS `pay_out_order_detail`;

CREATE TABLE `pay_out_order_detail` (
  `pay_out_order_detail_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pay_out_order_id` int(10) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`pay_out_order_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支出订单明细表';

/*Data for the table `pay_out_order_detail` */

/*Table structure for table `pay_pay` */

DROP TABLE IF EXISTS `pay_pay`;

CREATE TABLE `pay_pay` (
  `pay_pay_id` int(10) NOT NULL AUTO_INCREMENT,
  `pay_type_id` int(10) DEFAULT NULL,
  `param` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`pay_pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支付参数配置表';

/*Data for the table `pay_pay` */

/*Table structure for table `pay_type` */

DROP TABLE IF EXISTS `pay_type`;

CREATE TABLE `pay_type` (
  `pay_type_id` int(10) NOT NULL AUTO_INCREMENT,
  `pay_vendor_id` int(10) DEFAULT NULL,
  `pay_mch_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`pay_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商户支持支付类型表';

/*Data for the table `pay_type` */

/*Table structure for table `pay_vendor` */

DROP TABLE IF EXISTS `pay_vendor`;

CREATE TABLE `pay_vendor` (
  `pay_vendor_id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `appid` varchar(50) DEFAULT NULL,
  `appsecret` varchar(150) DEFAULT NULL,
  `config` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`pay_vendor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='第三方支付标识表';

/*Data for the table `pay_vendor` */

/*Table structure for table `pay_vest` */

DROP TABLE IF EXISTS `pay_vest`;

CREATE TABLE `pay_vest` (
  `pay_vest_id` int(10) NOT NULL AUTO_INCREMENT,
  `pay_type_id` int(10) DEFAULT NULL,
  `prefix` varchar(20) DEFAULT NULL,
  `param` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`pay_vest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='马甲支付参数配置表';

/*Data for the table `pay_vest` */

/*Table structure for table `tmp_upms_organization` */

DROP TABLE IF EXISTS `tmp_upms_organization`;

CREATE TABLE `tmp_upms_organization` (
  `organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `system_id` int(10) unsigned NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='组织';

/*Data for the table `tmp_upms_organization` */

/*Table structure for table `tmp_upms_permission` */

DROP TABLE IF EXISTS `tmp_upms_permission`;

CREATE TABLE `tmp_upms_permission` (
  `permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `system_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='权限';

/*Data for the table `tmp_upms_permission` */

insert  into `tmp_upms_permission`(`permission_id`,`system_id`) values (1,1);

/*Table structure for table `tmp_upms_user` */

DROP TABLE IF EXISTS `tmp_upms_user`;

CREATE TABLE `tmp_upms_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `system_id` int(10) unsigned NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `salt` varchar(32) DEFAULT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `avatar` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `ctime` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户';

/*Data for the table `tmp_upms_user` */

insert  into `tmp_upms_user`(`user_id`,`system_id`,`username`,`password`,`salt`,`realname`,`avatar`,`phone`,`email`,`sex`,`ctime`) values (1,1,'admin','C1F3459C3869B0D28DA59A966D33810E','2e1dba52a94d4c30ba27999d823c82ac','管理员',NULL,NULL,NULL,1,1);

/*Table structure for table `upms_organization` */

DROP TABLE IF EXISTS `upms_organization`;

CREATE TABLE `upms_organization` (
  `organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '组织名称',
  `description` varchar(1000) DEFAULT NULL COMMENT '组织描述',
  `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COMMENT='组织';

/*Data for the table `upms_organization` */

insert  into `upms_organization`(`organization_id`,`name`,`description`,`ctime`) values (1,'总部','北京总部',1),(4,'河北分部','河北石家庄',1488122466236),(5,'河南分部','河南郑州',1488122480265),(6,'湖北分部','湖北武汉',1488122493265),(7,'湖南分部','湖南长沙',1488122502752);

/*Table structure for table `upms_permission` */

DROP TABLE IF EXISTS `upms_permission`;

CREATE TABLE `upms_permission` (
  `permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `system_id` int(10) unsigned NOT NULL COMMENT '所属系统',
  `pid` int(10) DEFAULT NULL COMMENT '所属上级',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型(1:菜单,2:按钮)',
  `permission_value` varchar(50) DEFAULT NULL COMMENT '权限值',
  `uri` varchar(100) DEFAULT NULL COMMENT '路径',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态(0:禁止,1:正常)',
  `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `orders` bigint(20) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`permission_id`),
  KEY `FK_Reference_29` (`system_id`),
  CONSTRAINT `FK_Reference_29` FOREIGN KEY (`system_id`) REFERENCES `upms_system` (`system_id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COMMENT='权限';

/*Data for the table `upms_permission` */

insert  into `upms_permission`(`permission_id`,`system_id`,`pid`,`name`,`type`,`permission_value`,`uri`,`icon`,`status`,`ctime`,`orders`) values (1,1,0,'系统组织管理',1,'','','zmdi zmdi-accounts-list',1,1,1),(2,1,1,'系统管理',2,'upms:system:read','/manage/system/index','',1,2,2),(3,1,1,'组织管理',2,'upms:organization:read','/manage/organization/index','',1,3,3),(4,1,0,'角色用户管理',1,'','','zmdi zmdi-accounts',1,4,4),(5,1,4,'角色管理',2,'upms:role:read','/manage/role/index','',1,6,6),(6,1,4,'用户管理',2,'upms:user:read','/manage/user/index','',1,5,5),(7,1,0,'权限资源管理',1,'','','zmdi zmdi-lock-outline',1,7,7),(12,1,0,'其他数据管理',1,'','','zmdi zmdi-more',1,12,12),(13,1,12,'公共码表',2,'upms:coder:read','/manage/coder/index','',1,13,13),(14,1,12,'会话管理',2,'upms:session:read','/manage/session/index','',1,14,14),(15,1,12,'日志记录',2,'upms:log:read','/manage/log/index','',1,15,15),(16,1,12,'键值设置',2,'upms:map:read','/manage/map/index','',1,16,16),(17,2,0,'标签类目管理',1,NULL,NULL,'zmdi zmdi-menu',1,17,17),(18,2,17,'标签管理',2,'cms:tag:read','/manage/tag/index',NULL,1,18,18),(19,2,17,'类目管理',2,'cms:category:read','/manage/category/index',NULL,1,19,19),(20,2,0,'文章内容管理',1,NULL,NULL,'zmdi zmdi-collection-text',1,20,20),(21,2,20,'文章管理',2,'cms:article:read','/manage/article/index',NULL,1,21,21),(22,2,20,'回收管理',2,'cms:article:read','/manage/article/recycle',NULL,1,22,22),(24,1,2,'新增系统',3,'upms:system:create','/manage/system/create','zmdi zmdi-plus',1,24,24),(25,1,2,'编辑系统',3,'upms:system:update','/manage/system/update','zmdi zmdi-edit',1,25,25),(26,1,2,'删除系统',3,'upms:system:delete','/manage/system/delete','zmdi zmdi-close',1,26,26),(27,1,3,'新增组织',3,'upms:organization:create','/manage/organization/create','zmdi zmdi-plus',1,27,27),(28,1,3,'编辑组织',3,'upms:organization:update','/manage/organization/update','zmdi zmdi-edit',1,28,28),(29,1,3,'删除组织',3,'upms:organization:delete','/manage/organization/delete','zmdi zmdi-close',1,29,29),(30,1,6,'新增用户',3,'upms:user:create','/manage/user/create','zmdi zmdi-plus',1,30,30),(31,1,6,'编辑用户',3,'upms:user:update','/manage/user/update','zmdi zmdi-edit',1,31,31),(32,1,6,'删除用户',3,'upms:user:delete','/manage/user/delete','zmdi zmdi-close',1,32,32),(33,1,5,'新增角色',3,'upms:role:create','/manage/role/create','zmdi zmdi-plus',1,33,33),(34,1,5,'编辑角色',3,'upms:role:update','/manage/role/update','zmdi zmdi-edit',1,34,34),(35,1,5,'删除角色',3,'upms:role:delete','/manage/role/delete','zmdi zmdi-close',1,35,35),(36,1,39,'新增权限',3,'upms:permission:create','/manage/permission/create','zmdi zmdi-plus',1,36,36),(37,1,39,'编辑权限',3,'upms:permission:update','/manage/permission/update','zmdi zmdi-edit',1,37,37),(38,1,39,'删除权限',3,'upms:permission:delete','/manage/permission/delete','zmdi zmdi-close',1,38,38),(39,1,7,'权限管理',2,'upms:permission:read','/manage/permission/index',NULL,1,39,39),(46,1,5,'角色权限',3,'upms:role:permission','/manage/role/permission','zmdi zmdi-key',1,1488091928257,1488091928257),(48,1,6,'用户组织',3,'upms:user:organization','/manage/user/organization','zmdi zmdi-accounts-list',1,1488120011165,1488120011165),(50,1,6,'用户角色',3,'upms:user:role','/manage/user/role','zmdi zmdi-accounts',1,1488120554175,1488120554175),(51,1,6,'用户权限',3,'upms:user:permission','/manage/user/permission','zmdi zmdi-key',1,1488092013302,1488092013302),(53,1,14,'强制退出',3,'upms:session:forceout','/manage/session/forceout','zmdi zmdi-run',1,1488379514715,1488379514715);

/*Table structure for table `upms_role` */

DROP TABLE IF EXISTS `upms_role`;

CREATE TABLE `upms_role` (
  `role_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `title` varchar(20) DEFAULT NULL COMMENT '角色标题',
  `description` varchar(1000) DEFAULT NULL COMMENT '角色描述',
  `ctime` bigint(20) NOT NULL COMMENT '创建时间',
  `orders` bigint(20) NOT NULL COMMENT '排序',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='角色';

/*Data for the table `upms_role` */

insert  into `upms_role`(`role_id`,`name`,`title`,`description`,`ctime`,`orders`) values (1,'super','超级管理员','拥有所有权限',1,1),(2,'admin','管理员','拥有除权限管理系统外的所有权限',1487471013117,1487471013117);

/*Table structure for table `upms_role_permission` */

DROP TABLE IF EXISTS `upms_role_permission`;

CREATE TABLE `upms_role_permission` (
  `role_permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `role_id` int(10) unsigned NOT NULL COMMENT '角色编号',
  `permission_id` int(10) unsigned NOT NULL COMMENT '权限编号',
  PRIMARY KEY (`role_permission_id`),
  KEY `FK_Reference_23` (`role_id`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`role_id`) REFERENCES `upms_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COMMENT='角色权限关联表';

/*Data for the table `upms_role_permission` */

insert  into `upms_role_permission`(`role_permission_id`,`role_id`,`permission_id`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,39),(12,1,12),(13,1,13),(14,1,14),(15,1,15),(16,1,16),(17,1,17),(18,1,18),(19,1,19),(20,1,20),(21,1,21),(22,1,22),(24,1,24),(27,1,27),(28,1,28),(29,1,29),(30,1,30),(31,1,31),(32,1,32),(33,1,33),(34,1,34),(35,1,35),(36,1,36),(37,1,37),(38,1,38),(39,1,46),(40,1,51),(41,1,26),(42,1,26),(43,1,25),(44,1,48),(45,1,50),(47,1,53);

/*Table structure for table `upms_system` */

DROP TABLE IF EXISTS `upms_system`;

CREATE TABLE `upms_system` (
  `system_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `basepath` varchar(100) DEFAULT NULL COMMENT '根目录',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态(-1:黑名单,1:正常)',
  `name` varchar(20) DEFAULT NULL COMMENT '系统名称',
  `title` varchar(20) DEFAULT NULL COMMENT '系统标题',
  `description` varchar(300) DEFAULT NULL COMMENT '系统描述',
  `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `orders` bigint(20) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`system_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COMMENT='系统';

/*Data for the table `upms_system` */

insert  into `upms_system`(`system_id`,`icon`,`basepath`,`status`,`name`,`title`,`description`,`ctime`,`orders`) values (1,'zmdi zmdi-shield-security','http://boss.upms.com',1,'boss-upms-server','权限管理系统','用户权限管理系统（RBAC细粒度用户权限、统一后台、单点登录、会话管理）',1,1),(2,'zmdi zmdi-wikipedia','http://boss.cms.com:2222',1,'boss-cms-admin','内容管理系统','内容管理系统（门户、博客、论坛、问答等）',2,2);

/*Table structure for table `upms_user` */

DROP TABLE IF EXISTS `upms_user`;

CREATE TABLE `upms_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(20) NOT NULL COMMENT '帐号',
  `password` varchar(32) NOT NULL COMMENT '密码MD5(密码+盐)',
  `salt` varchar(32) DEFAULT NULL COMMENT '盐',
  `realname` varchar(20) DEFAULT NULL COMMENT '姓名',
  `avatar` varchar(50) DEFAULT NULL COMMENT '头像',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  `locked` tinyint(4) DEFAULT NULL COMMENT '状态(0:正常,1:锁定)',
  `ctime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='用户';

/*Data for the table `upms_user` */

insert  into `upms_user`(`user_id`,`username`,`password`,`salt`,`realname`,`avatar`,`phone`,`email`,`sex`,`locked`,`ctime`) values (1,'admin','3038D9CB63B3152A79B8153FB06C02F7','66f1b370c660445a8657bf8bf1794486','闵华勇','/resources/boss-ui/images/avatar.jpg','','469741414@qq.com',1,0,1);

/*Table structure for table `upms_user_organization` */

DROP TABLE IF EXISTS `upms_user_organization`;

CREATE TABLE `upms_user_organization` (
  `user_organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `organization_id` int(10) unsigned NOT NULL COMMENT '组织编号',
  PRIMARY KEY (`user_organization_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COMMENT='用户组织关联表';

/*Data for the table `upms_user_organization` */

insert  into `upms_user_organization`(`user_organization_id`,`user_id`,`organization_id`) values (19,1,1),(20,1,4),(21,1,5),(22,1,6),(23,1,7);

/*Table structure for table `upms_user_permission` */

DROP TABLE IF EXISTS `upms_user_permission`;

CREATE TABLE `upms_user_permission` (
  `user_permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `permission_id` int(10) unsigned NOT NULL COMMENT '权限编号',
  PRIMARY KEY (`user_permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户权限关联表';

/*Data for the table `upms_user_permission` */

/*Table structure for table `upms_user_role` */

DROP TABLE IF EXISTS `upms_user_role`;

CREATE TABLE `upms_user_role` (
  `user_role_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `role_id` int(10) DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='用户角色关联表';

/*Data for the table `upms_user_role` */

insert  into `upms_user_role`(`user_role_id`,`user_id`,`role_id`) values (1,1,1),(2,1,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
