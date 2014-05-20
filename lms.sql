/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50605
Source Host           : localhost:3306
Source Database       : lms

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2014-05-20 18:45:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `lms_sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `lms_sys_user`;
CREATE TABLE `lms_sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `job_number` bigint(20) DEFAULT NULL,
  `login_email` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `level` int(1) DEFAULT NULL COMMENT '借阅级别',
  `status` int(1) DEFAULT '0' COMMENT '用户状态 0有效 1失效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lms_sys_user
-- ----------------------------
INSERT INTO `lms_sys_user` VALUES ('1', '10010', 'ysw@yswsoft.com', 'yusw', '21232f297a57a5a743894a0e4a801fc3', null, '1', '0');
