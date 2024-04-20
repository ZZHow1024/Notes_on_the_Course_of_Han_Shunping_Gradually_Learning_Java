package com.zzhow.date_;

import java.time.Instant;
import java.util.Date;

/**
 * 2024年3月25日
 *
 * @author ZZHow
 */
public class Instant_ {
    public static void main(String[] args) {
        //案例：Instant 时间戳

        //1. 通过静态方法 now() 获取当前时间戳的对象
        Instant now = Instant.now();
        System.out.println("Instant时间戳：" + now);

        //2. 通过 Date 的 from() 可以把 Instant 转成 Date
        Date date = Date.from(now);
        System.out.println("Instant → Date：" + date);

        //3. 通过 date 的 toInstant() 可以把 date 转成 Instant 对象
        Instant instant = date.toInstant();
        System.out.println("Date → Instant：" + instant);
    }
}
