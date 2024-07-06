#Created by ZZHow(ZZHow1024) on 2024/6/22.
#演示数据库的操作
#1. 创建一个名称为 test_db01 的数据库。[图形化和指令 演示]
	#以 Navicat 为例：右击 MySQL - 新建数据库 - 填写数据库名 - 点击创建
	#使用指令创建数据库
	CREATE DATABASE test_db01;
	#删除数据库指令
	DROP DATABASE test_db01;
	#如果不指定数据库字符集，则默认为：utf8
	#如果不指定数据库排序规则，则默认为：utf8_general_ci

#2. 创建一个使用 utf8 字符集的 test_db02 数据库
	CREATE DATABASE test_db02 CHARACTER SET utf8;

#3. 创建一个使用 utf8 字符集，并带校对规则的 test_db03 数据库
	CREATE DATABASE test_db03 CHARACTER SET utf8 COLLATE utf8_bin;

#下面是一条查询的 SQL 语句，select：查询，*：所有字段，FROM：从哪个表
#	WHERE：从哪个字段，NAME=‘tom'：查询的名字是tom
SELECT * FROM t1 WHERE NAME = 'tom';