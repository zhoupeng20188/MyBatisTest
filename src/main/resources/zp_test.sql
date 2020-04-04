# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.25)
# Database: zp_test
# Generation Time: 2020-04-04 13:18:35 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE=''NO_AUTO_VALUE_ON_ZERO'' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_banner
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_banner`;

CREATE TABLE `t_banner` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `small_image` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `bannerType` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_banner` WRITE;
/*!40000 ALTER TABLE `t_banner` DISABLE KEYS */;

INSERT INTO `t_banner` (`id`, `small_image`, `path`, `title`, `link`, `description`, `sort`, `bannerType`)
VALUES
	(1,''https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3386247472,87720242&fm=26&gp=0.jpg'',NULL,NULL,NULL,NULL,NULL,0),
	(2,''https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2534506313,1688529724&fm=26&gp=0.jpg'',NULL,NULL,NULL,NULL,NULL,0),
	(3,''https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1208538952,1443328523&fm=26&gp=0.jpg'',NULL,NULL,NULL,NULL,NULL,0),
	(4,''https://img.alicdn.com/imgextra/https://gw.alicdn.com/imgextra/i4/1035301420/O1CN01gALXUv1MMP0QRauNd_!!1035301420-0-pixelsss.jpg_430x430q90.jpg'',NULL,NULL,NULL,NULL,NULL,1),
	(5,''https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i1/1035301420/O1CN01QnL02y1MMOy6f4vVZ_!!1035301420.jpg_430x430q90.jpg'',NULL,NULL,NULL,NULL,NULL,1);

/*!40000 ALTER TABLE `t_banner` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_book
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_book`;

CREATE TABLE `t_book` (
  `book_id` int(11) NOT NULL,
  `image_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table t_comment
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `comment_id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table t_goods
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_goods`;

CREATE TABLE `t_goods` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `goodType` int(11) DEFAULT NULL,
  `small_image` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` decimal(5,2) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `t_goods` WRITE;
/*!40000 ALTER TABLE `t_goods` DISABLE KEYS */;

INSERT INTO `t_goods` (`id`, `goodType`, `small_image`, `path`, `title`, `description`, `price`, `num`, `detail`)
VALUES
	(1,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,66.26,11,NULL),
	(2,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,89.00,12,NULL),
	(3,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,308.00,13,NULL),
	(4,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,88.88,11,NULL),
	(5,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,99.99,11,NULL),
	(6,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,100.00,11,NULL),
	(7,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,99.00,12,NULL),
	(8,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,199.00,12,NULL),
	(9,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(10,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,198.00,13,NULL),
	(11,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,233.00,13,NULL),
	(12,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(13,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,100.00,11,NULL),
	(14,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,100.00,11,NULL),
	(15,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,100.00,11,NULL),
	(16,0,''https://img.alicdn.com/imgextra/i3/43388146/O1CN01vHoUcH2A2ur0yDxzX_!!2-saturn_solar.png_240x240.jpg'',NULL,''2020夏新款宽松直筒裙子小个子显瘦小黑裙很仙的法国小众连衣裙女'',NULL,100.00,11,NULL),
	(17,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(18,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(19,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(20,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(21,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(22,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(23,1,''https://g-search1.alicdn.com/img/bao/uploaded/i4/imgextra/i4/32764303/O1CN017lEfLY1heopTTtCKj_!!0-saturn_solar.jpg_460x460Q90.jpg_.webp'',NULL,''春季卫衣女2020年新款潮ins宽松韩版连帽中长款时尚春秋薄款外套'',NULL,229.00,12,NULL),
	(24,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(25,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(26,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(27,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(28,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(29,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(30,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(31,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(32,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL),
	(33,2,''https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/1766047907/O1CN01C1cpa828HSHID3ojw_!!0-item_pic.jpg_460x460Q90.jpg_.webp'',NULL,''卫衣2020年春装新款中长款假两件拼接外套慵懒风女装网红超仙上衣'',NULL,355.00,13,NULL);

/*!40000 ALTER TABLE `t_goods` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_goods_banner
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_goods_banner`;

CREATE TABLE `t_goods_banner` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `goods_id` int(11) DEFAULT NULL,
  `banner_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `t_goods_banner` WRITE;
/*!40000 ALTER TABLE `t_goods_banner` DISABLE KEYS */;

INSERT INTO `t_goods_banner` (`id`, `goods_id`, `banner_id`)
VALUES
	(1,1,4),
	(2,1,5);

/*!40000 ALTER TABLE `t_goods_banner` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table t_image
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_image`;

CREATE TABLE `t_image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT ''@desc 图片id'',
  `title` varchar(255) DEFAULT NULL COMMENT ''@desc 图片标题'',
  `small_image` varchar(255) NOT NULL DEFAULT '''' COMMENT ''@desc 图片缩略图'',
  `path` varchar(255) NOT NULL DEFAULT '''' COMMENT ''@desc 原图地址'',
  `create_user` int(11) DEFAULT NULL COMMENT ''@desc 创建者'',
  `create_time` datetime DEFAULT NULL COMMENT ''@desc 创建时间'',
  `update_user` int(11) DEFAULT NULL COMMENT ''@desc 更新者'',
  `update_time` datetime DEFAULT NULL COMMENT ''@desc 更新时间'',
  `is_delete` char(1) NOT NULL DEFAULT ''0'' COMMENT ''@desc 是否删除 @values 0：否|1：是'',
  `is_enable` char(1) NOT NULL DEFAULT ''1'' COMMENT ''@desc 是否启用 @values 0：否|1：是'',
  PRIMARY KEY (`image_id`),
  KEY `title_id` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT=''图片表'';

LOCK TABLES `t_image` WRITE;
/*!40000 ALTER TABLE `t_image` DISABLE KEYS */;

INSERT INTO `t_image` (`image_id`, `title`, `small_image`, `path`, `create_user`, `create_time`, `update_user`, `update_time`, `is_delete`, `is_enable`)
VALUES
	(2472251,''第1个标题'',''https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3386247472,87720242&fm=26&gp=0.jpg'',''test.jpg'',NULL,''2020-03-16 21:34:52'',NULL,NULL,''0'',''1''),
	(2472252,''第2个标题'',''https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2534506313,1688529724&fm=26&gp=0.jpg'',''test.jpg'',NULL,''2020-03-16 21:34:52'',NULL,NULL,''0'',''1''),
	(2472253,''第3个标题'',''https://dss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1208538952,1443328523&fm=26&gp=0.jpg'',''test.jpg'',NULL,''2020-03-16 21:34:52'',NULL,NULL,''0'',''1''),
	(2472254,''第4个标题'',''test.jpg'',''test.jpg'',NULL,''2020-03-16 21:34:52'',NULL,NULL,''0'',''1''),
	(2472255,''第5个标题'',''https://i0.hdslb.com/bfs/bangumi/image/d6b96118a865be0a88eb69f4ee7c455c82d4276e.jpg@140w_140h_1c_100q.webp'',''test.jpg'',NULL,''2020-03-16 21:34:52'',NULL,NULL,''0'',''1''),
	(2472256,''第6个标题'',''https://i0.hdslb.com/bfs/live/9b936099ac0d6e1309cbb6a9ed68cd7b796138e5.jpg@640w_660h_1c_100q.webp'',''test.jpg'',NULL,''2020-03-16 21:34:53'',NULL,NULL,''0'',''1''),
	(2472257,''第7个标题'',''https://i0.hdslb.com/bfs/live/74992d29f099d947be9701f234216685d5935c69.jpg@640w_660h_1c_100q.webp'',''test.jpg'',NULL,''2020-03-16 21:34:53'',NULL,NULL,''0'',''1''),
	(2472258,''第8个标题'',''https://i0.hdslb.com/bfs/bangumi/93c84574c21b240960d47edb273e1a7ea0c04c03.png@140w_140h_1c_100q.webp'',''test.jpg'',NULL,''2020-03-16 21:34:53'',NULL,NULL,''0'',''1'');

/*!40000 ALTER TABLE `t_image` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
