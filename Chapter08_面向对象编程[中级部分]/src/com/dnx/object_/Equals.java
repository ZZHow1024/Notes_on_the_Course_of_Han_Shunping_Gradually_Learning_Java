package com.dnx.object_;
//DNX写于2024年1月27日

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        B bb = a;
        System.out.println(bb == c);
        //引用数据类型，判断地址是否相等。

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);
        //基本数据类型，判断值是否相等。

        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2); // false
        System.out.println(integer1.equals(integer2)); // true

        String str1 = new String("dnx");
        String str2 = new String("dnx");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
    }
}

class A extends B {
}

class B {
}