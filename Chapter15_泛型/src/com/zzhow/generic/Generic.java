package com.zzhow.generic;

import java.util.ArrayList;

/**
 * 2024年4月21日
 *
 * @author ZZHow
 */
public class Generic {
    public static void main(String[] args) {
        /*
        - 案例：
            1. 编写程序，在 ArrayList 中，
                添加 3 个 Dog 对象
            2. Dog 对象含有 name 和 age，
                并输出 name 和 age（要求使用 getXxx()）
         */
        //解读：
        //1. 我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型
        //2. 果编译器发现添加的类型，不满足要求，就会报错
        //3. 遍历的时候，可以直接取出 Dog 类型而不是 Object
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("ADog",3));
        arrayList.add(new Dog("BDog",5));
        arrayList.add(new Dog("CDog",6));

        //假如不小心添加了一只猫
        //arrayList.add(new Cat("Cat",7));
        //'add(com.zzhow.generic.Dog)' in 'java.util.ArrayList' cannot be applied to '(com.zzhow.generic.Cat)'

        System.out.println("---遍历输出---");
        for(Dog dog : arrayList){
            System.out.println(dog.getName() + " --- " + dog.getAge());
        }
    }
}

class Dog{
    private String name;
    private int age;

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
}

class Cat{
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
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
}
