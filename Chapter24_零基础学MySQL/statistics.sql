#Created by ZZHow(ZZHow1024) on 2024/7/5.
#演示统计函数的使用

#创建测试表
CREATE TABLE `students`(
	`Name` VARCHAR(32),
	`Chinese` int,
	`Math` int,
	`English` int)
	CHARSET utf8 COLLATE utf8_bin ENGINE InnoDB;

#插入数据
INSERT INTO `students`
	VALUES('张一', 98, 98, 78),
				('张二', 98, 56, 76),
				('张三', 67, 67, 78),
				('张四', 58, 67, 98),
				('张五', 87, 89, 98);

#查询数据
SELECT * FROM `students`;
SELECT *, (Chinese + Math + English) AS `Total` FROM `students`
	ORDER BY `total` ASC;

#演示 COUNT 函数
-- 统计一个班级共有多少学生
SELECT COUNT(*) AS `全部学生个数` FROM `students`;
-- 统计数学成绩大于 90 的学生个数
SELECT COUNT(*) AS `数学成绩大于 90 的学生个数` FROM `students`
	WHERE `Math` > 90;
-- 统计总分大于 250 的学生个数
SELECT COUNT(*) AS `总分大于 250 的学生个数` FROM `students`
	WHERE (`Chinese` + `Math` + `English`) > 250;
-- count(*) 和 count(列)的区别
	-- count(*)：返回满足条件的记录的行数
	-- count(列)：统计满足条件的某列个数，但是会排除为 NULL 的情况
CREATE TABLE t15(`name` VARCHAR(20));
INSERT INTO t15 
	VALUES('Tom'), ('Jerry'), ('Spike'), (NULL);
SELECT * FROM t15;

#count(*)
SELECT COUNT(*) FROM t15;
SELECT COUNT(`name`) FROM t15;

#演示 SUM 函数
-- 统计一个班级数学总成绩
SELECT SUM(`Math`) AS `班级数学总成绩` FROM `students`;
-- 统计一个班级语文、数学和英语各科的总成绩
SELECT
	SUM(`Chinese`) AS `班级语文总成绩`,
	SUM(`Math`) AS `班级数学总成绩`,
	SUM(`English`) AS `班级英语总成绩`
		FROM `students`;
-- 统计一个班级语文、英语和数学的成绩总和
SELECT SUM(`Chinese` + `Math` + `English`) AS `语文、英语和数学的成绩总和`
	FROM `students`;
-- 统计一个班级语文成绩平均分
SELECT SUM(`Chinese`) / COUNT(`Name`) AS `语文成绩平均分`
	FROM `students`;

#演示 AVG 函数
-- 求一个班级数学平均分
SELECT AVG(`Math`) AS `数学平均分` FROM `students`;
-- 求一个班级总分平均分
SELECT AVG(`Chinese` + `Math` + `English`) AS `总分平均分` FROM `students`;

#演示 MAX / MIN 函数
-- 求数学最高分和最低分
SELECT
	MAX(`Math`) AS `数学最高分`,
	MIN(`Math`) AS `数学最低分`
	FROM `students`;
-- 求总分最高分和最低分
SELECT
	MAX(`Chinese` + `Math` + `English`) AS `总分最高分`,
	MIN(`Chinese` + `Math` + `English`) AS `总分最低分`
	FROM `students`;