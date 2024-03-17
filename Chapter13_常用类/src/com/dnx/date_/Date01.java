package com.dnx.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2024年3月17日
 *
 * @author DNX
 */
public class Date01 {
    public static void main(String[] args) {
        //案例：Date应用实例

        //提示：
        //1. 这里的 Date 类是在 java.util 包
        //2. 默认输出的日期格式是国外的方式，因此通常需要对格式进行转换
        System.out.println("1. 获取当前系统时间");
        Date date = new Date(); //获取当前系统时间
        System.out.println("当前的日期：" + date);

        System.out.println("使用 SimpleDateFormat 格式化后");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 kk:mm:ss E");
        String dateFormat = simpleDateFormat.format(date);
        System.out.println("当前的日期：" + dateFormat);
        System.out.println();

        System.out.println("2. 通过毫秒数得到时间");
        Date d1 = new Date(123456789);
        System.out.println(d1 + "\n");

        System.out.println("3. 把一个格式化的 String 转成对应的 Date");
        String str = "2024年1月1日 00:00:00 星期一";
        Date d2 = null;
        try {
            d2 = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            System.out.println("日期格式不正确");
        }
        System.out.println(d2);
    }
}
