#Created by ZZHow(ZZHow1024) on 2024/6/24.
#演示 FLOAT、DOUBLE 和 DECIMAL 类型使用
#创建表
CREATE TABLE t6 (
	num1 FLOAT,
	num2 DOUBLE,
	num3 DECIMAL(30, 20));

#插入数据
INSERT INTO t6 VALUES(768.567453123546897,768.567453123546897,768.567453123546897);

#查询数据
SELECT * FROM t6;

#DECIMAL 可以存放很大的数
CREATE TABLE t7 (num1 BIGINT UNSIGNED, num2 DECIMAL(65));
INSERT INTO t7 VALUES(845967654865468546854678567985329593240, 845967654865468546854678567985329593240);
INSERT INTO t7 VALUES(8459676548654685468, 845967654865468546854678567985329593240);
SELECT * FROM t7;