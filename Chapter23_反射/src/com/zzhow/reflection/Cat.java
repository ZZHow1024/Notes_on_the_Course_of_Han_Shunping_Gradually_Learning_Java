package com.zzhow.reflection;

/**
 * 2024/5/30
 *
 * @author ZZHow
 */
public class Cat {
    private String name;
    public int age;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hi() {
        System.out.println("hi~~~");
    }

    public void cry() {
        System.out.println("meow~~~");
    }
}
