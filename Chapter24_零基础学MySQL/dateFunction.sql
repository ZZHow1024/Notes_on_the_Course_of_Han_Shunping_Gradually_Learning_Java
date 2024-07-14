#Created by ZZHow(ZZHow1024) on 2024/7/10.
#演示日期相关函数的使用

#第一组
-- | CURRENT_DATE() | 当前日期 |
SELECT CURRENT_DATE() FROM DUAL;
-- | CURRENT_TIME() | 当前时间 |
SELECT CURRENT_TIME() FROM DUAL;
-- | CURRENT_TIMESTAMP() | 当前时间戳 |
SELECT CURRENT_TIMESTAMP() FROM DUAL;
-- 创建测试表
CREATE TABLE `mes`(id INT, content VARCHAR(30), send_time DATETIME);
-- 插入数据
INSERT INTO `mes` VALUES(1, 'aaa', CURRENT_TIMESTAMP());
-- 查询数据
SELECT * FROM `mes`;

#第二组
-- 插入数据
INSERT INTO `mes` VALUES(2, 'bbb', NOW());
INSERT INTO `mes` VALUES(3, 'ccc', NOW());
-- | DATA(datetime) | 返回 datetime 的日期部分 |
-- | DATE_ADD(date2, INTERVAL d_value d_type) | 在 date2 中加上日期或时间 |
-- | DATE_SUB(date2, INTERVAL d_value d_type) | 在 date2 上减去一个时间 |
-- | DATEDIFF （date1, date2  | 两个日期差（结果是天） |
-- | TIMEDIFF(date1, date2) | 两个时间差（多少小时多少分钟多少秒） |
-- 案例：
-- 显示所有新闻信息，发布日期只显示 日期，不用显示时间
SELECT `id`, `content`, DATE(`send_time`) FROM `mes`;

-- 请查询在10分钟内发布的新闻
SELECT * FROM `mes` WHERE DATE_ADD(`send_time`, INTERVAL 10 MINUTE) >= NOW();
SELECT * FROM `mes` WHERE `send_time` >= DATE_SUB(NOW(), INTERVAL 10 MINUTE);

-- 请在mysq1 的sq2语句中求出 2011-11-11 和 1990-1-1 相差多少天
SELECT DATEDIFF('2011-11-11', '1990-01-01') FROM DUAL;

-- 请用 MySQL 的 SQL 语句求出一个人活了多少天？[假设1900-11-11出生]
SELECT DATEDIFF(NOW(), '1900-11-11') FROM DUAL;
-- 如果能活 80 岁，求出一个人还能活多少天？[假设1900-11-11出生]
SELECT DATEDIFF(DATE_ADD('1900-11-11', INTERVAL 80 YEAR), NOW()) FROM DUAL;
-- 10:11:11 到 06:10:10 的时间差
SELECT TIMEDIFF('10:11:11', '06:10:10') FROM DUAL;

#第二组
-- | NOW() | 当前时间 |
SELECT NOW() FROM DUAL;
-- | YEAR|Month|DATE(datetime) | 年月日 |
SELECT YEAR(NOW()) FROM DUAL;
SELECT MONTH(NOW()) FROM DUAL;
SELECT DAY(NOW()) FROM DUAL;
SELECT MONTH(NOW()) FROM DUAL;
SELECT MONTH('2024-07-13') FROM DUAL;
-- | UNIX_TIMESTAMP() | 返回从 1970-01-01 到现在的秒数（UNIX 时间戳） |
SELECT UNIX_TIMESTAMP() FROM DUAL;
-- | FROM_UNIXTIME() | 把一个 UNIX_TIMESTAMP() 秒数，转成指定格式的日期 |
SELECT FROM_UNIXTIME(234123, '%Y-%m-%d') FROM DUAL;
SELECT FROM_UNIXTIME(234123, '%Y-%m-%d %H:%i:%s') FROM DUAL; 