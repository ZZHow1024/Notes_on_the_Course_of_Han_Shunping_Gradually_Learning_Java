#Created by ZZHow(ZZHow1024) on 2024/7/14.
#增强 GROUP BY 的使用
-- 使用分组函数和分组子句 GROUP BY
	-- 1. 显示每种岗位的雇员总数、平均工资
SELECT COUNT(*) AS '雇员总数', AVG(`sal`) AS '平均工资', `job` AS '岗位'
	FROM `emp`
	GROUP BY `job`;
	-- 2. 显示雇员总数，以及获得补助的雇员数（统计 comm 字段不为 NULL 的数量）
SELECT COUNT(*) AS '雇员总数', COUNT(`comm`) AS '获得补助的雇员数'
	FROM `emp`;
	-- 扩展：统计没有获得补助的雇员数（统计 comm 字段为 NULL 的数量）
SELECT COUNT(*) AS '雇员总数', COUNT(if(`comm` IS NULL, 1, NULL)) AS '没有获得补助的雇员数'
	FROM `emp`;
SELECT COUNT(*) AS '雇员总数', (COUNT(*) - COUNT(`comm`)) AS '没有获得补助的雇员数'
	FROM `emp`;
	-- 3. 显示管理者的总人数（对 mgr 字段去重）
SELECT COUNT(DISTINCT `mgr`) AS '管理者的总人数'
	FROM `emp`;
	-- 4. 显示雇员工资的最大差额
SELECT (MAX(`sal`) - MIN(`sal`)) AS '雇员工资的最大差额'
	FROM `emp`;