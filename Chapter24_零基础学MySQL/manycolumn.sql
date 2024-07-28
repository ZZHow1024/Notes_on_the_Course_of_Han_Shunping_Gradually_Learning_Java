#Created by ZZHow(ZZHow1024) on 2024/7/15.
#多列子查询
#案例：查询与 ALLEN 的部门和岗位完全相同的所有雇员（并且不含 ALLEN 本人）
	-- (字段 1, 字段 2…) = (SELECT 字段 1, 字段 2 FROM…)
		-- 1. 得到 SMITH 的部门和岗位
SELECT `deptno`, `job`
	FROM `emp`
	WHERE `ename` = 'ALLEN';
		-- 2. 把上面的查询当做子查询来使用，并且使用多列子查询的语法进行匹配
SELECT *
	FROM `emp`
	WHERE (`deptno`, `job`) = (
		SELECT `deptno`, `job`
		FROM `emp`
		WHERE `ename` = 'ALLEN') AND `ename` != 'ALLEN';