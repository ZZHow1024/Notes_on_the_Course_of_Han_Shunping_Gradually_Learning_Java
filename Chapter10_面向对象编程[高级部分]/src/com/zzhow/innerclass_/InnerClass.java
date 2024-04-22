package com.zzhow.innerclass_;

/**
 * 内部类演示
 * 2024年2月6日
 *
 * @author ZZHow
 */

public class InnerClass { // 外部其他类
    public static void main(String[] args) {
        System.out.println("内部类演示");
    }
}

class Outer { // 内部类
    private int n1 = 1; // 属性

    { // 代码块
        System.out.println("代码块");
    }

    public Outer(int n1) { // 构造器
        this.n1 = n1;
    }

    public void m1() { // 方法
        System.out.println("m1");
    }

    class Inner { // 内部类

    }
}
