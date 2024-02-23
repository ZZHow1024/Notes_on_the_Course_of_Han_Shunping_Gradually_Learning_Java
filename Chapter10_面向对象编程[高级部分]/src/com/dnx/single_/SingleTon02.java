package com.dnx.single_;

/**
 * 演示懒汉式单例模式
 * 2024年2月5日
 * @author DNX
 */

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        //此时cat对象并没有被创建
        Cat instance1 = Cat.getInstance();
        //此时cat对象被创建
        System.out.println(instance1);
        Cat instance2 = Cat.getInstance();
        //instance1和instance2这两个对象是一样的
        System.out.println(instance2);
    }

}

class Cat {
    private String name;
    private static Cat cat;
    public static int n1 = 100;

    /*
    如何保证只能创建一个Cat
    单例模式-懒汉式
    1. 将构造器私有化
    2. 定义一个static静态属性对象
    3. 提供一个public的static方法，返回对象
     */
    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        //如果还没有创建cat对象，那么创建cat对象
        if (cat == null) {
            cat = new Cat("Tom");
        }

        return cat;
    }
}
