#Created by ZZHow(ZZHow1024) on 2024/7/14.
#使用 WHERE 子句
	-- 查找 1992.1.1 后入职的员工
SELECT * FROM `emp` WHERE `hiredate` > '1992-01-01';

#使用 LIKE 操作符
	-- %：表示 0 到多个字符，_：表示单个字符
	-- 显示首字符为 S 的员工姓名和工资
SELECT `ename`, `sal` FROM `emp` WHERE `ename` LIKE 'S%';
	-- 显示第三个字符为大写 O 的所有员工的姓名和工资
SELECT `ename`, `sal` FROM `emp` WHERE SUBSTRING(`ename`, 3, 1)='O';
SELECT `ename`,`sal` FROM `emp` WHERE `ename` LIKE '__O%';

#显示没有上级的雇员的情况
SELECT * FROM `emp` WHERE `mgr` IS NULL;

#查询表结构
DESC `emp`;

#使用 ORDER BY 子句
	-- 按照工资的从低到高的顺序，显示雇员的信息
SELECT * FROM `emp` ORDER BY `sal` ASC;
	-- 按照部门号升序而雇员的工资降序排列，显示雇员信息
SELECT * FROM `emp` ORDER BY `deptno` ASC, `sal` DESC;