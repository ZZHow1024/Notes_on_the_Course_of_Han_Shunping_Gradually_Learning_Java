package com.dnx.interface_;

/**
 * 演示接口的多态传递现象
 * 2024年2月6日
 *
 * @author DNX
 */

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向实现了该接口的类的对象实例
        IG ig = new Teacher();
        //如果IG继承了IH接口，而Teacher类实现了IG接口
        //那么就相当于Teacher类也实现了IH接口
        //这就是接口的多态传递现象
        IH ih = new Teacher();
        System.out.println("ih.a = " + ih.a);
        ih.hi();
        System.out.println("ig.a = " + ig.a);
        ig.hi();
    }
}

interface IH {
    int a = 0;

    void hi();
}

interface IG extends IH {
    int a = 1;
}

class Teacher implements IG {
    @Override
    public void hi() {
        System.out.println("Hi, I am a teacher");
    }
}
