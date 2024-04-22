package com.zzhow.innerclass_;

/**
 * 静态内部类演示
 * 2024年2月8日
 *
 * @author ZZHow
 */

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.m1();

        //外部其他类使用静态内部类的三种方法。
        //1. new Outer04.Inner04();
        //因为静态内部类是可以通过类名直接访问的(前提是满足访问权限)
        System.out.println("方法一：");
        Outer04.Inner04 inner04a = new Outer04.Inner04();
        inner04a.say();

        //2. 在外部类中编写一个方法，可以返回 Inner04 对象
        System.out.println("方法二：");
        Outer04.Inner04 inner04b = outer04.getInner04Instance();
        inner04b.say();

        //3. 在外部类中编写一个静态方法，可以返回 Inner04 对象
        System.out.println("方法三：");
        Outer04.Inner04 inner04c = Outer04.getInner04();
        inner04c.say();
    }
}

class Outer04 {
    private int n1 = 10;
    private static String name = "DNX";

    //Inner04是静态内部类
    //1. 放在外部类的成员位置
    //2. 使用 static 修饰
    //3. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
    //4. 可以添加任意修饰符(public、protected、默认、private)，因为它的地位就是一个成员
    //5. 作用域：同其他的成员，为整个类体
    public static class Inner04 {
        private static String name = "2024年2月8日";

        public void say() {
            //不能访问非静态成员
            //System.out.println(n1); //×
            System.out.println("Inner04 的 name = " + name); //√
            System.out.println("Outer04 的 name = " + Outer04.name); //√
        }
    }

    public Inner04 getInner04Instance() {
        return new Inner04();
    }

    public static Inner04 getInner04() {
        return new Inner04();
    }

    public void m1() {
        Inner04 inner04 = new Inner04();
        inner04.say();
    }
}
