#Created by ZZHow(ZZHow1024) on 2024/7/14.
#多子句查询演示
-- 案例：
	-- 统计各个部门的(GROUP BY)平均工资(AVG)
	-- 并且是大于 1000 的(HAVING)
	-- 并且按照平均工资从高到低排序(ORDER BY)(DESC)
	-- 取出前两行记录(LIMIT 0, 2)
SELECT `deptno`, AVG(`sal`) AS 'avg_sal'
	FROM `emp`
	GROUP BY `deptno`
	HAVING `avg_sal` > 1000
	ORDER BY `avg_sal` DESC
	LIMIT 0, 2;