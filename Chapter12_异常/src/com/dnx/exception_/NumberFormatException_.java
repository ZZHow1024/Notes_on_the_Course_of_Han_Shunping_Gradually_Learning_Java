package com.dnx.exception_;

/**
 * 0446_五大运行时异常
 * NumberFormatException数字格式不正确异常
 * 2024年2月13日
 *
 * @author DNX
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "DNX";
        //将String 转成 int
        int num = Integer.parseInt(name);
        //抛出NumberFormatException数字格式不正确异常
        System.out.println(num);
    }
}
