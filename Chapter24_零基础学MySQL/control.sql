#Created by ZZHow(ZZHow1024) on 2024/7/14.
#演示流程控制语句

-- | IF(expr1, expr2, expr3) | 如果 expr1 为 True，则返回 expr2 否则返回 expr3 |
SELECT IF(TRUE, 'A', 'B') FROM DUAL;
SELECT IF(FALSE, 'A', 'B') FROM DUAL;

-- | IFNULL(expr1, expr2) | 如果 expr1 不为空 NULL，则返回 expr1，否则返回 expr2 |
SELECT IFNULL(NULL, 'A') FROM DUAL;
SELECT IFNULL('Tom', 'A') FROM DUAL;

-- | SELECT CASE WHEN expr1 THEN expr2 END; | 如果 expr1 为 True，则返回 expr2；如果 expr2 为 True，则返回 expr4，否则返回 expr5 |
SELECT CASE
	WHEN FALSE THEN 'Tom'
	WHEN TRUE THEN 'Jerry'
	ELSE 'Spike'
END;

#案例
-- 1. 查询 emp 表，如果 comm 是 NULL，则显示 0.0
SELECT `ename`, IF(`comm` IS NULL, 0.0, `comm`) FROM `emp`;
SELECT `ename`, IFNULL(`comm`, 0.0) FROM `emp`;

-- 2. 如果 emp 表的 job 是 CLERK 则显示“职员”，如果是 MANAGER 则显示“经理”如果是 SALESMAN 则显示“销售人员”，其它正常显示
SELECT `ename`,
		(SELECT CASE 
			WHEN `job`='CLERK' THEN '职员'
			WHEN `job`='MANAGER' THEN '经理'
			WHEN `job`='SALESMAN' THEN '销售人员'
			ELSE `job`
		END) AS 'job'
	FROM `emp`;