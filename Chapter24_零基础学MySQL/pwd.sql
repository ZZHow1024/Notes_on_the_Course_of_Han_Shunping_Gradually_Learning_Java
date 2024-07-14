#Created by ZZHow(ZZHow1024) on 2024/7/14.
# 演示加密函数和系统函数
-- | USER() | 查询登录到 MySQL 的用户及登录 IP，返回用户@IP地址 |
SELECT USER() FROM DUAL;

-- | DATABASE() | 查询当前使用的数据库名称 |
SELECT DATABASE() FROM DUAL;

-- | MD5(str) | 为字符串算出一个 MD5 32 的字符串，（用户密码）加密 |
SELECT MD5('abc') FROM DUAL;
SELECT LENGTH(MD5('abc')) FROM DUAL;
-- 案例：创建一个用户表，要求 password 字段存储经过 MD5 加密后的密码
CREATE TABLE `users`(
	`id` INT,
	`name` VARCHAR(32)  NOT NULL  DEFAULT '',
	`password` CHAR(32)  NOT NULL  DEFAULT '');
INSERT INTO `users` VALUES(1, 'Tom', MD5('abc'));
INSERT INTO `users` VALUES(2, 'Jerry', MD5('ijk'));
INSERT INTO `users` VALUES(3, 'Spike', MD5('xyz'));
SELECT * FROM `users`;
SELECT * FROM `users` WHERE `name`='Tom' AND `password`='abc'; -- 查询不到 Tom
SELECT * FROM `users` WHERE `name`='Tom' AND `password`=MD5('abc'); -- 查询到 Tom

-- | PASSWORD(str) | 从原文密码 str 计算并返回密码字符串，通常用于对 mysql 数据库的用户密码加密 |
-- 从 MySQL 5.7.6 版本开始，PASSWORD() 函数已被弃用
SELECT PASSWORD('abc') FROM DUAL;

--  SELECT * FROM mysql.`user` | MySQL 用户表 |
SELECT * FROM mysql.`user`;