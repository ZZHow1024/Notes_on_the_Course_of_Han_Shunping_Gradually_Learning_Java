package com.dnx.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 2024年3月25日
 *
 * @author DNX
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //案例：第三代日期

        //使用 now() 返回表示当前时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        //可以获取年月日时分秒
        System.out.println(ldt);
        System.out.println("年：" + ldt.getYear());
        System.out.println("月：" + ldt.getMonth());
        System.out.println("月：" + ldt.getMonthValue());
        System.out.println("日：" + ldt.getDayOfMonth());
        System.out.println("时：" + ldt.getHour());
        System.out.println("分：" + ldt.getMinute());
        System.out.println("秒：" + ldt.getSecond());

        LocalDate ld = LocalDate.now(); //可以获取年月日
        LocalTime lt = LocalTime.now(); //可以获取时分秒
    }
}
