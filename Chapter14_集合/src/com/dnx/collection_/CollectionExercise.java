package com.dnx.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2024年3月28日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class CollectionExercise {
    public static void main(String[] args) {
        /*
        案例：
        1. 创建3个Dog{name，age}对象，放入到 ArrayList 中，赋给 List 引用。
        2. 用选代器和增强 for 循环两种方式来遍历。
        3. 重写 Dog 的toString方法，输出 name 和 age。
         */
        List list = new ArrayList();
        list.add(new Dog("小黑", 1));
        list.add(new Dog("小黄", 3));
        list.add(new Dog("小花", 5));

        //使用迭代器遍历：
        System.out.println("使用迭代器遍历 list");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog = " + dog);
        }

        System.out.println("\n使用增强 for 循环遍历 list");
        //使用增强 for 循环遍历：
        for (Object dog : list) {
            System.out.println("dog = " + dog);
        }
    }
}

class Dog {
    private String name = null;
    private int age = 0;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
