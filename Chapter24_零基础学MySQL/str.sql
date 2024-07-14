#Created by ZZHow(ZZHow1024) on 2024/7/9.
#演示字符串相关函数的使用，使用 emp 表来演示
-- | CHARSET(str) | 返回字符串字符集 |
SELECT CHARSET(`ename`) FROM `emp`;

-- | CONCAT(string2 [, …]) | 连接字符串 |
SELECT CONCAT(`ename`, ' job is ', `job`) FROM `emp`;

-- | INSTR(string, substring) | 返回 substring 在 string 中出现的位置，没有返回 0 |
SELECT INSTR('abcde', 'c') FROM DUAL; -- DUAL 叫亚元表，是系统表，可以作为测试表使用

-- | UCASE(string2) | 转换成大写 |
SELECT UCASE(`ename`) FROM `emp`;

-- | LCASE(string2) | 转换成小写 |
SELECT LCASE(`ename`) FROM `emp`;

-- | LEFT(string2, length) | 从 string2 中的左边起取 length 个字符 |
-- | RIGHT(string2, length) | 从 string2 中的右边起取 length 个字符 |
SELECT LEFT(`ename`, 2) FROM `emp`;

-- | LENGTH(string) | string 长度[按照字节] |
SELECT LENGTH('abcde') FROM DUAL;
SELECT LENGTH('一二三四五') FROM DUAL;

-- | REPLACE(str, search_str, replace_str) | 在 str 中用 replace_str 替换 search_str |
SELECT REPLACE(`job`, 'MANAGER', '经理') FROM `emp`;

-- | STRCMP(string1, string2) | 逐字符比较两字串大小 |
SELECT STRCMP('abc', 'ABC') FROM DUAL;
SELECT STRCMP('abc', 'xyz') FROM DUAL;

-- | SUBSTRING(str, position [,length]) | 从 str 的 position 开始[从 1 开始计算]，取 length 个字符 |
SELECT SUBSTRING(`ename`, 1, 2) FROM `emp`;

-- | LTRIM(string2) RTRIM(string2) trim | 去除前端空格或后端空格 |
SELECT LTRIM('     五个空格     ') FROM DUAL;
SELECT RTRIM('     五个空格     ') FROM DUAL;
SELECT TRIM('     五个空格     ') FROM DUAL;

#练习：以首字母小写的方式显示所有员工 emp 表的姓名
-- 思路：取出 `ename` 的第一个字符，转成小写的，将它和后面的字符串进行拼接后输出
-- 方法1
SELECT CONCAT(LCASE(SUBSTRING(`ename`, 1, 1)), SUBSTRING(`ename`, 2)) AS new_name FROM `emp`;
-- 方法2
SELECT CONCAT(LCASE(LEFT(`ename`, 1)), SUBSTRING(`ename`, 2)) AS new_name FROM `emp`;