package com.zzhow.innerclass_;

/**
 * 局部内部类演示
 * 2024年2月6日
 * @author ZZHow
 */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();
    }
}

class Outer01{
    private int n1 = 1;
    private void m2(){ // 私有方法
        System.out.println("Outer01.m2()");
    }
    public void m1(){ // 方法
        //局部内部类是定义在外部类的局部位置，
        //比如方法中，并且有类名。
        //2. 不能添加访问修饰符，但是可以使用final修饰。
        //3. 作用域：仅仅在定义它的方法或代码块中
        final class Inner01{ // 局部内部类(本质仍然是一个类)
            //1. 可以直接访问外部类的所有成员，包含私有的
            private int n1 = 0;
            public void f1(){
                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，
                //如果想访问外部类的成员，则可以使用 外部类名.this.成员 去访问
                System.out.println("n1 = " + Outer01.this.n1);
                m2();
            }
        }
        //4. 外部类在方法中可以创建Inner02的对象，然后调用方法
        Inner01 inner01 = new Inner01();
        inner01.f1();

//        class Inner02 extends Inner01{
//
//        }
    }
}
