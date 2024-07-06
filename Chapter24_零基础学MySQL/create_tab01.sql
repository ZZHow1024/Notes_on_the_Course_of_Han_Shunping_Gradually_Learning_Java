#Created by ZZHow(ZZHow1024) on 2024/6/23.
#通过 SQL 命令创建表
#案例：在 test_db02 和 test_db03 数据库中分别使用图形化和 SQL 命令创建 user 表   
#    id             整形
#    name           字符串
#    password       字符串
#    birthday       日期

CREATE TABLE `user`(
	`id` INT,
	`name` VARCHAR(255),
	`password` VARCHAR(255),
	`birthday` DATE)CHARACTER SET utf8 COLLATE utf8_bin ENGINE INNODB;