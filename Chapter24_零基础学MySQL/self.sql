#Created by ZZHow(ZZHow1024) on 2024/7/14.
#多表查询的自连接
#案例：显示公司员工和他的上级的名字
	-- 员工和上级通过 emp 表的 mgr 字段关联
SELECT `worker`.`ename` AS '职员名', `boss`.`ename` AS '上级名'
	FROM `emp` `worker`, `emp` `boss`
	WHERE `worker`.`mgr` = `boss`.`empno`;