#Created by ZZHow(ZZHow1024) on 2024/7/9.
#演示数学相关函数的使用
-- | ABS(num) | 绝对值 |
SELECT ABS(10) FROM DUAL;
SELECT ABS(-10) FROM DUAL;

-- | BIN(decimal_number) | 十进制转二进制 |
SELECT BIN(10) FROM DUAL;

-- | CEILING(number2) | 向上取整，得到比 num2 大的最小整数 |
SELECT CEILING(1.1) FROM DUAL;
SELECT CEILING(-1.1) FROM DUAL;

-- | CONV(number2, from_base, to_base) | 进制转换 |
SELECT CONV(11, 10, 2) FROM DUAL; -- 将十进制的 11 转换成二进制输出

-- | FLOOR(number2) | 向下取整，得到比 num2 小的最大整数 |
SELECT FLOOR(1.1) FROM DUAL;
SELECT FLOOR(-1.1) FROM DUAL;

-- | FORMAT(number, decimal_places ) | 保留小数位数（四舍五入） |
SELECT FORMAT(56.3458943589, 2) FROM DUAL;

-- | HEX(DecimalNumber) | 转十六进制 |
SELECT HEX(15) FROM DUAL;

-- | LEAST(number, number2 [, …]) | 求最小值 |
SELECT LEAST(6, 43, 7, 0, -43, -1) FROM DUAL;

-- | MOD(numerator, denominator) | 求余 |
SELECT MOD(10, 3) FROM DUAL;

-- | RAND([seed]) | RAND([seed]) 其范围內 0 ≤ v ≤ 1.0 |
	-- rand() 返回一个随机浮点值 v 范围在 0 到 1 之间（即其范围为 0 ≤ v ≤  1.0）。若已指定一个整数参数 N，则它被用作种子值，用来产生重复序列
	-- 1. 如果使用 rand() 每次返回不同的随机数，在 0 ≤ v ≤ 1.0
	-- 2. 如果使用 rand(seed) 返回随机数，范围 0 ≤ v ≤ 1.0，如果 seed 不变，该随机数也不变
SELECT RAND() FROM DUAL;