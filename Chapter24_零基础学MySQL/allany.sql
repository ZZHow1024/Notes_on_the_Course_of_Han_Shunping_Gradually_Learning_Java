#Created by ZZHow(ZZHow1024) on 2024/7/15.
# ALL 和 ANY 的使用
#在多行子查询中使用 ALL 操作符
	-- 案例：显示工资比部门 30 的所有员工的工资高的员工的姓名、工资和部门号
SELECT `ename`, `sal`, `deptno`
	FROM `emp`
	WHERE `sal` > ALL(
		SELECT `sal`
			FROM `emp`
			WHERE `deptno` = 30);

SELECT `ename`, `sal`, `deptno`
	FROM `emp`
	WHERE `sal` > (
		SELECT MAX(`sal`)
			FROM `emp`
			WHERE `deptno` = 30);

#在多行子查询中使用 ANY 操作符
	-- 案例：显示工资比部门 30 的其中一个员工的工资高的员工的姓名、工资和部门号
SELECT `ename`, `sal`, `deptno`
	FROM `emp`
	WHERE `sal` > ANY(
		SELECT `sal`
			FROM `emp`
			WHERE `deptno` = 30);

SELECT `ename`, `sal`, `deptno`
	FROM `emp`
	WHERE `sal` > (
		SELECT MIN(`sal`)
			FROM `emp`
			WHERE `deptno` = 30);