# noinspection SqlNoDataSourceInspectionForFile

/*
 Navicat Premium Data Transfer

 Source Server         : BeyondASOP
 Source Server Type    : MariaDB
 Source Server Version : 50556
 Source Host           : 10.20.1.182:3306
 Source Schema         : BeyondASOP

 Target Server Type    : MariaDB
 Target Server Version : 50556
 File Encoding         : 65001

 Date: 04/09/2018 14:47:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for metrics
-- ----------------------------
DROP TABLE IF EXISTS `metrics`;
CREATE TABLE `metrics`  (
  `id` bigint(20) NOT NULL,
  `name_zh` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '中文名',
  `name_en` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '英文名',
  `unit` varchar(16) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位',
  `resource_type` int(5) DEFAULT NULL COMMENT '平台资源类型（redis 1, zk 2, kafka 3）',
  `metrics_type` varchar(16) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '监控指标类型（资源1、性能2）',
  `checked` tinyint(5) DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_alarmed` tinyint(5) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
