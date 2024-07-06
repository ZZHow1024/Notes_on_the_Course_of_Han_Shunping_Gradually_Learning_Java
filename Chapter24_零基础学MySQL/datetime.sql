#Created by ZZHow(ZZHow1024) on 2024/7/4.
#演示时间相关的类型
#创建一张表：DATE, DATETIME, TIMESTAMP;
CREATE TABLE t14(
			`birthday` DATE, -- 生日
			`job_time` DATETIME, -- 工作时间，记录年月日时分秒
			`login_time` TIMESTAMP -- 登录时间，记录时间戳
				NOT NULL DEFAULT CURRENT_TIMESTAMP -- 不允许为空，默认为当前时间戳
				ON UPDATE CURRENT_TIMESTAMP); -- 更新时变为当前时间戳

#插入数据
INSERT INTO t14(`birthday`, `job_time`)
			VALUES('2024-7-4', '2024-7-4 12:41:30');
-- 更新 t14 表的某条记录，login_time 列自动更新

#查询数据
SELECT * FROM t14;