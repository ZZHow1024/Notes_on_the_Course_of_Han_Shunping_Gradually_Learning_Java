#Created by ZZHow(ZZHow1024) on 2024/7/14.
#多表查询
-- 案例：
	-- 1. 显示雇员名，雇员工资及所在部门的名字（笛卡尔集）
	-- 技巧：多表查询的条件不能少于表的个数 - 1，否则会出现笛卡尔集
SELECT `ename`, `sal`, `dname`, `emp`.`deptno`
	FROM `emp`, `dept`
	WHERE `emp`.`deptno` = `dept`.`deptno`;
	-- 2. 显示部门号为 10 的部门名、员工名和工资
SELECT `ename`, `sal`, `dname`, `emp`.`deptno`
	FROM `emp`, `dept`
	WHERE `emp`.`deptno` = `dept`.`deptno` AND `emp`.`deptno` = 10;
	-- 3. 显示各个员工的姓名、工资及其工资的级别
SELECT `ename`, `sal`, `grade`
	FROM `emp`, `salgrade`
	WHERE `sal` BETWEEN `losal` AND `hisal`;
	-- 4. 显示雇员名，雇员工资及所在部门的名字，并按部门进行降序排序
SELECT `ename` AS '雇员名', `sal` AS '雇员工资', `dname` AS '所在部门'
	FROM `emp`, `dept`
	WHERE `emp`.`deptno` = `dept`.`deptno`
	ORDER BY `sal` DESC;