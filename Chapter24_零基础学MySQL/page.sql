#Created by ZZHow(ZZHow1024) on 2024/7/14.
#演示分页查询
-- 1. 按雇员的 id 号升序取出，每页显示 3 条记录，请分别显示第 1 页，第 2 页，第 3 页
	-- 第 1 页
SELECT * FROM `emp`
	ORDER BY `empno` ASC
	LIMIT 0, 3;
	-- 第 2 页
SELECT * FROM `emp`
	ORDER BY `empno` ASC
	LIMIT 3, 3;
	-- 第 3 页
SELECT * FROM `emp`
	ORDER BY `empno` ASC
	LIMIT 6, 3;
	-- 推导出公式
SELECT * FROM `emp`
	ORDER BY `empno` ASC
	LIMIT 每页显示记录数 * (第几页 - 1), 每页显示记录数;

-- 2. 按雇员的 id 号降序取出，每页显示 5 条记录，请分别显示第 3 页，第 5 页
	-- 第 3 页
SELECT * FROM `emp`
	ORDER BY `empno` DESC
	LIMIT 6, 3;
	-- 第 5 页
SELECT * FROM `emp`
	ORDER BY `empno` DESC
	LIMIT 12, 3;
	-- 推导出公式
SELECT * FROM `emp`
	ORDER BY `empno` DESC
	LIMIT 每页显示记录数 * (第几页 - 1), 每页显示记录数;