package com.dnx.date_;

import java.util.Calendar;

/**
 * 2024年3月25日
 *
 * @author DNX
 */
public class Calendar_ {
    public static void main(String[] args) {
        //提示
        //1. Calendar 是一个抽象类，并且构造器是 private
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员

        //创建日历类对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //获取日历对象的某个日历字段
        System.out.println("年：" + calendar.get(Calendar.YEAR));

        //注意：Calendar 返回月是从0开始的，需要+1
        System.out.println("月：" + calendar.get(Calendar.MONTH) + 1);

        System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + calendar.get(Calendar.HOUR));
        System.out.println("分钟：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒：" + calendar.get(Calendar.SECOND) + "\n");

        //Calendar 没有提供格式化的类，需要程序员自己组合
        System.out.println("Calendar 没有提供格式化的类，需要程序员自己组合");
        System.out.println(calendar.get(Calendar.YEAR) + "年" +
                calendar.get(Calendar.MONTH) + 1 + "月" +
                calendar.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.println("12小时制" + calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));

        //补充：如何显示24小时制的时间
        //  只需把 Calendar.HOUR 换成 Calendar.HOUR_OF_DAY
        System.out.println("24小时制" + calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));
    }
}
