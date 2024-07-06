#Created by ZZHow(ZZHow1024) on 2024/7/5.
#修改表的操作练习
-- 创建表
CREATE TABLE `emp_alter`(
	`id` INT,
	`name` VARCHAR(32),
	`gender` CHAR(1),
	`birthday` DATE,
	`entry_date` DATETIME,
	`job` VARCHAR(32),
	`salary` DOUBLE,
	`resume` TEXT) CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;
-- 员工表 emp_alter 的上增加一个 image 列，varchar 类型（要求在 resume 后面）
ALTER TABLE `emp_alter`
	ADD image VARCHAR(32) NOT NULL DEFAULT ''
	AFTER `resume`;
-- 修改 job 列，使其长度为 60
ALTER TABLE `emp_alter`
	MODIFY `job` VARCHAR(60) NOT NULL DEFAULT '';
-- 删除 gender 列
ALTER TABLE `emp_alter`
	DROP `gender`;
-- 表名改为 employee
RENAME TABLE `emp_alter` TO `employee`;
-- 修改表的字符集为 utf8
ALTER TABLE `employee`
	CHARACTER SET utf8;
-- 列名 name 修改为 user_name
ALTER TABLE `employee`
	CHANGE `name` `user_name` VARCHAR(64) NOT NULL DEFAULT '';

#验证修改结果
DESC `emp_alter` -- 显示 emp_alter 表结构，可以查看表的所有列
DESC `employee` -- 显示 employee 表结构，可以查看表的所有列