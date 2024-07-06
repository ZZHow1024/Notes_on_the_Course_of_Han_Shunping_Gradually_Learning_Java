#Created by ZZHow(ZZHow1024) on 2024/6/22.
#备份 test_db02 和 test_db03 数据库中的数据并恢复

#备份，要在终端执行 mysqldump
#	生成的备份文件就是对应的 SQL 语句
mysqldump -u root -p -B test_db02 test_db03 > bak.sql

#删除已经备份的数据库
DROP DATABASE test_db02;
DROP DATABASE test_db03;

#恢复
#	方法一：在 MySQL 命令行执行
source bak.sql
#	方法二：执行 bak.sql 中的 SQL 语句