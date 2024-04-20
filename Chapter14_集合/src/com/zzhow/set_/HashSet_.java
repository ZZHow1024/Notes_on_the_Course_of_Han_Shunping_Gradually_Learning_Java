package com.zzhow.set_;

import java.util.HashSet;

/**
 * 2024年4月9日
 *
 * @author ZZHow1024
 */
@SuppressWarnings("all")
public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println("1. add 方法演示");
        System.out.println(set.add("aaa")); //true
        System.out.println(set.add("bbb")); //true
        System.out.println(set.add("bbb")); //false
        System.out.println(set.add("ccc")); //true
        System.out.println(set.add("ddd")); //true
        System.out.println("set = " + set + "\n");

        System.out.println("2. remove 方法演示");
        set.remove("aaa");
        System.out.println("set = " + set + "\n");

        System.out.println("3. add 两个类的对象(属性相同)演示");
        set.add(new Dog("Spike")); //true
        set.add(new Dog("Spike")); //true
        System.out.println("set = " + set + "\n");

        System.out.println("4. add 两个字符串类的对象(字符串相同)演示");
        set.add(new String("DNX")); //true
        set.add(new String("DNX")); //false
        System.out.println("set = " + set);
    }
}

class Dog {
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
