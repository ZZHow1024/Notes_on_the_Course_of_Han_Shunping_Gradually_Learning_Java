package com.zzhow.wrapper;

/**
 * 0462_包装类方法
 * 2024年2月21日
 *
 * @author ZZHow
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //案例：Integer 与 String 相互转换
        //包装类(Integer) -> String
        Integer i1 = 100; //自动装箱
        //方式1
        String str1 = i1 + "";
        //方式2
        String str2 = i1.toString();
        //方式3
        String str3 = String.valueOf(i1);

        //String -> 包装类(Integer)
        String str4 = "123";
        //方式1
        Integer i2 = Integer.parseInt(str4); //使用到自动装箱
        //方式2
        Integer i3 = new Integer(str4); //构造器

        System.out.println("ok");
    }
}
