#Created by ZZHow(ZZHow1024) on 2024/7/4.
#创建表的课堂练习
-- 字段						属性
-- ID							整型
-- name						字符型
-- gender 				字符型
-- birthday				日期型(date)
-- entry_date			日期型(date)
-- job						字符型
-- salary					小数型
-- resume（简历）		文本型
#开始
-- 创建表
CREATE TABLE `emp`(
	`id` INT,
	`name` VARCHAR(32),
	`gender` CHAR(1),
	`birthday` DATE,
	`entry_date` DATETIME,
	`job` VARCHAR(32),
	`salary` DOUBLE,
	`resume` TEXT) CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;
-- 插入数据
INSERT INTO `emp`
	VALUES(101, 'Tom', '♂', '2023-11-11',
		'2024-11-11 11:11:11', 'Catching mice', 3000,
		'Tom is a pampered British shorthair cat');
-- 查询数据
SELECT * FROM `emp`;