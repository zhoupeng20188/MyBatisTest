/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : zp_test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2020-09-16 18:29:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `subject` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `stu` (`class_name`,`name`,`subject`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `image_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB AUTO_INCREMENT=2472252 DEFAULT CHARSET=utf8 COMMENT='图片表';

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `area` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user_extra_info
-- ----------------------------
DROP TABLE IF EXISTS `user_extra_info`;
CREATE TABLE `user_extra_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `hobby` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
