package com.dnx.exception_;

/**
 * 0446_五大运行时异常
 * ClassCastException类型转换异常
 * 2024年2月13日
 *
 * @author DNX
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b1 = new B(); //向上转型
        B b2 = (B) b1; //向下转型
        C c1 = (C) b1;
        //抛出ClassCastException类型转换异常
    }
}

class A {
}

class B extends A {
}

class C extends A {
}
