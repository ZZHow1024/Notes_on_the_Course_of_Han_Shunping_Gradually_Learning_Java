package com.dnx.innerclass_;

/**
 * 匿名内部类演示
 * 2024年2月6日
 *
 * @author DNX
 */
public class AnonymousLocalInnerClass {
    public static void main(String[] args) {
        new Outer02().method();
    }
}

class Outer02 { //外部类
    private int n1 = 1; //属性

    public void method() { //方法
        //基于接口的匿名内部类
        //1. 需求：想使用IA接口，并创建对象
        //2. 传统方式：写一个类，实现该接口，并创建对象
        //3. 需求升级：Tiger类只是用一次，后面不再使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型 IA
        //6. tiger的运行类型 就是匿名内部类 xxx -> Outer02$1
        /*
        看底层：
        class xxx implements IA {
            @Override
            public void cry() {
                System.out.println("老虎叫。");
            }
        }
         */
        //7. JDK底层在创建匿名内部类 Outer02$1后
        //立马就创建了Outer02$1实例，并且把地址返回给tiger
        //8. 匿名内部类使用一次，就不能再使用，但是对象是在的
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫。");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //基于类的匿名内部类
        //1. father编译类型 Father
        //2. father运行类型 Outer02$2
        //3. 底层会创建匿名内部类
        /*
            class Outer02$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        Father father = new Father("Jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型 = " + father.getClass());
        father.test();

        new Father("Mike") {
        }.ok("abc");

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("匿名内部类重写了eat方法");
            }
        };
        animal.eat();
    }
}

interface IA { //接口
    public void cry();
}

class Father { //类
    public Father(String name) { //构造器

    }

    public void test() { //方法

    }

    public void ok(String str) {
        System.out.println("ok, " + str);
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}
