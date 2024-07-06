#Created by ZZHow(ZZHow1024) on 2024/6/22.
#演示删除和查询数据库
#1. 查看当前数据库服务器中的所有数据库
SHOW DATABASES;

#2. 查看前面创建的 test_db01 数据库的定义信息
SHOW CREATE DATABASE `test_db01`;
#	在创建数据、表的时候，为了规避关键字，可以使用反引号``

#3. 删除前面创建的 test_db01 数据库
DROP DATABASE IF EXISTS `test_db01`;