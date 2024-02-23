package com.dnx.houserent.utils;

/**
 * @author DNX
 * 2024年2月3日
 */

public class TestUtility {
    public static void main(String[] args){

        //这是一个测试类。

        //要求输入一个字符串，长度最大为3。
        String s1 = Utility.readString(3);
        System.out.println("s1 = " + s1);

        //要求输入一个字符串，长度最大为10，如果用户直接回车，就给一个默认值。
        String s2 = Utility.readString(10,"dnx");
        System.out.println("s2 = " + s2);

        //解释一个问题：
        //直接使用类.方法() → 因为当一个方法是static时，就是一个静态方法，
        //静态方法可以直接通过类名调用。
    }
}
