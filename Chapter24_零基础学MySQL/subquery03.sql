#Created by ZZHow(ZZHow1024) on 2024/7/15.
#子查询练习
#在 FROM 子句中使用子查询
-- 查找每个部门工资高于本部门平均工资的人的资料，这里要用到数据查询的小技巧，把一个子查询当作一个临时表使用
	-- 1. 先得到每个部门的部门号和对应的平均工资
SELECT `deptno`, AVG(`sal`)
	FROM `emp` GROUP BY `deptno`;
	-- 2. 把上面的结果当作子查询，和 emp 表进行多表查询
SELECT `ename`, `sal`, `temp`.`avg_sal`, `emp`.`deptno`
	FROM `emp`, (
		SELECT `deptno`, AVG(`sal`) AS 'avg_sal'
		FROM `emp`
		GROUP BY `deptno`) `temp`
	WHERE `emp`.`deptno` = `temp`.`deptno` AND `emp`.`sal` > `temp`.`avg_sal`;

-- 查询每个部门工资最高的人的详细资料
SELECT `ename`, `sal`, `temp`.`max_sal`, `emp`.`deptno`
	FROM `emp`, (
		SELECT `deptno`, MAX(`sal`) AS 'max_sal'
		FROM `emp`
		GROUP BY `deptno`) `temp`
	WHERE `emp`.deptno = `temp`.`deptno` AND `emp`.`sal` = `temp`.`max_sal`;

-- 查询每个部门的信息（部门名，编号，地址）和人员数量
	-- 1. 先得到每个部门的人数
SELECT COUNT(*), `deptno`
	FROM `emp`
	GROUP BY `deptno`;
	-- 2. 把上面的结果当作子查询，和 emp 表进行多表查询
SELECT `dname`, `dept`.`deptno`, `loc`, `emp_num`
	FROM `dept`, (
		SELECT COUNT(*) AS 'emp_num', `deptno`
		FROM `emp`
		GROUP BY `deptno`) `temp`
	WHERE `dept`.`deptno` = `temp`.`deptno`;
	-- 表.* 表示将该表所有列都显示出来
SELECT `temp`.*, `dname`, `loc`
	FROM `dept`, (
		SELECT COUNT(*) AS 'emp_num', `deptno`
		FROM `emp`
		GROUP BY `deptno`) `temp`
	WHERE `dept`.`deptno` = `temp`.`deptno`;