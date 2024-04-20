package com.zzhow.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 2024年3月25日
 *
 * @author ZZHow
 */
public class DateTimeFormatter_ {
    public static void main(String[] args) {
        //案例：第三代日期使用 DateTimeFormatter 进行格式化
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("===格式化后===");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);
    }
}
