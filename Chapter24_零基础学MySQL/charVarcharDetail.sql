#Created by ZZHow(ZZHow1024) on 2024/7/4.
#演示字符串类型的使用细节
# CHAR(4) 和 VARCHAR(4) 中的 4 表示字符而不是字节

#创建表 t11 (CHAR 类型)
CREATE TABLE t11(`name` CHAR(4));

#插入数据
INSERT INTO t11 VALUES('abcde'); -- 失败
INSERT INTO t11 VALUES('abcd'); -- 成功
INSERT INTO t11 VALUES('一二三四a') -- 失败
INSERT INTO t11 VALUES('一二三四') -- 成功

#查询数据
SELECT * FROM t11;

#创建表 t12 (VARCHAR 类型)
CREATE TABLE t12(`name` VARCHAR(4));

#插入数据
INSERT INTO t12 VALUES('abcde'); -- 失败
INSERT INTO t12 VALUES('abcd'); -- 成功
INSERT INTO t12 VALUES('一二三四a') -- 失败
INSERT INTO t12 VALUES('一二三四') -- 成功

#查询数据
SELECT * FROM t12;

#如果 VARCHAR 不够用，可以考虑使用 TEXT、MEDIUMTEXT 或 LONGTEXT
CREATE TABLE t13(content1 TEXT, content2 MEDIUMTEXT, content3 LONGTEXT);

#插入数据
INSERT INTO t13 VALUES('Tom', 'Jerry', 'Spike');

#查询数据
SELECT * FROM t13;