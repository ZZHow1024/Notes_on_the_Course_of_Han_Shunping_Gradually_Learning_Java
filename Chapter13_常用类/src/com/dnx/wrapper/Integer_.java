package com.dnx.wrapper;

/**
 * 0460_装箱和拆箱
 * 2024年2月21日
 *
 * @author DNX
 */
public class Integer_ {
    public static void main(String[] args){
        //演示int <-> Integer 的装箱和拆箱
        //JDK5之前是手动装箱和拆箱
        int n1 = 100;
        //手动装箱
        //int -> Integer
        Integer integer1 = new Integer(n1);
        Integer integer2 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i1 = integer1.intValue();

        //JDK5之后(含JDK5)，可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱
        //int -> Integer
        Integer integer3 = n2; //底层使用的是Integer.valueOf(n2);

        //自动拆箱
        //Integer -> int
        int i2 = integer3; //底层使用的是integer3.intValue();
    }
}
