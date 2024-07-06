#Created by ZZHow(ZZHow1024) on 2024/7/4.
#演示字符串使用 char varchar
-- CHAR(size) 0～255 字符
-- 固定长度字符串，最大 255 字符
-- VARCHAR(size) 0～最大字符数（最大字符数取决于编码）
-- 可变长度字符串，最大 65535 字节
-- [utf8 编码最大 21844 字符 1-3 个字节用于记录大小]
-- 如果表的编码是 UTF-8 VARCHAR(size) size = (65535 - 3) / 3 = 21844
-- 如果表的编码是 GBK VARCHAR(size) size = (65535 - 3) / 2 = 32766

#创建表（CHAR 类型）
CREATE TABLE t9 (`name` CHAR(255));

#创建表（VARCHAR 类型）
#默认 UTF-8 编码
CREATE TABLE t10 (`name` VARCHAR(21845));
CREATE TABLE t10 (`name` VARCHAR(21844));

#删除 t10 表
DROP TABLE t10;

#创建表（VARCHAR 类型）
#指定为 GBK 编码
CREATE TABLE t10 (`name` VARCHAR(32767)) CHARSET gbk;
CREATE TABLE t10 (`name` VARCHAR(32766)) CHARSET gbk;