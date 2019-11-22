/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : zp_test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-11-22 16:29:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `book_id` int(11) NOT NULL,
  `image_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `comment_id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_image
-- ----------------------------
DROP TABLE IF EXISTS `t_image`;
CREATE TABLE `t_image` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '@desc 图片id',
  `title` varchar(255) DEFAULT NULL COMMENT '@desc 图片标题',
  `small_image` varchar(255) NOT NULL DEFAULT '' COMMENT '@desc 图片缩略图',
  `path` varchar(255) NOT NULL DEFAULT '' COMMENT '@desc 原图地址',
  `create_user` int(11) DEFAULT NULL COMMENT '@desc 创建者',
  `create_time` datetime DEFAULT NULL COMMENT '@desc 创建时间',
  `update_user` int(11) DEFAULT NULL COMMENT '@desc 更新者',
  `update_time` datetime DEFAULT NULL COMMENT '@desc 更新时间',
  `is_delete` char(1) NOT NULL DEFAULT '0' COMMENT '@desc 是否删除 @values 0：否|1：是',
  `is_enable` char(1) NOT NULL DEFAULT '1' COMMENT '@desc 是否启用 @values 0：否|1：是',
  PRIMARY KEY (`image_id`),
  KEY `title_id` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=2472251 DEFAULT CHARSET=utf8 COMMENT='图片表';
