package com.zzhow.innerclass_;

/**
 * 成员内部类演示
 * 2024年2月8日
 *
 * @author ZZHow
 */

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.t1();

        //外部其他类使用成员内部类的三种方法。
        //1. outer03.new Inner03()
        System.out.println("方法一：");
        Outer03.Inner03 inner03a = outer03.new Inner03();
        inner03a.say();

        //2. 在外部类中编写一个方法，可以返回 Inner03 对象
        System.out.println("方法二：");
        Outer03.Inner03 inner03b = outer03.getInner03Instance();
        inner03b.say();

        //3. new Outer03().new Inner03()
        System.out.println("方法三：");
        Outer03.Inner03 inner03c = new Outer03().new Inner03();
        inner03c.say();
    }
}

//注意：成员内部类是定义在外部类的成员位置上
class Outer03 { //外部类
    private int n1 = 10;
    public String name = "DNX";

    private void hi() {
        System.out.println("hi()方法");
    }

    public class Inner03 { //成员内部类
        private int n1 = 11;
        private int num = 1;

        public void say() {
            //如果外部类和内部类的成员重名时，内部类访问成员默认遵循就近原则
            System.out.println("Outer03 的 n1 = " + Outer03.this.n1);
            System.out.println("Inner03 的 n1 = " + n1 + ", name = " + name);
            hi();
        }
    }

    public Inner03 getInner03Instance() {
        return new Inner03();
    }

    //写方法
    public void t1() {
        Inner03 inner03 = new Inner03();
        inner03.say();
        System.out.println("inner03.num = " + inner03.num);
    }
}
