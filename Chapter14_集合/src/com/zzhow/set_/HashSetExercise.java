package com.zzhow.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * 2024年4月11日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {
        /*
        - HashSet 课堂练习
                - 定义一个 Employee 类，该类包含：private 成员属性name, age。
        1. 创建 3 个 Employee 放入 HashSet 中
        2. 当 name 和 age 的值相同时，认为是相同员工，不能添加到 HashSet 集合中
        */
        HashSet hashSet = new HashSet();

        hashSet.add(new Employee("ZhangSan", 20));
        hashSet.add(new Employee("Jack", 23));
        hashSet.add(new Employee("ZhangSan", 20));

        System.out.println("hashSet = " + hashSet);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
