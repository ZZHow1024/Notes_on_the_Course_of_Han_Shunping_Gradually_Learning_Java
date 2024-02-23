package com.dnx.exception_;

/**
 * 0446_五大运行时异常
 * NullPointerException空指针异常
 * 2024年2月13日
 *
 * @author DNX
 */
public class NullPointerException_ {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
        //抛出NullPointerException空指针异常
    }
}
