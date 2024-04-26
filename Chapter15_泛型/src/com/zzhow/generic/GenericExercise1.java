package com.zzhow.generic;

import java.util.*;

/**
 * 2024年4月22日
 *
 * @author ZZHow
 */
public class GenericExercise1 {
    public static void main(String[] args) {
        /*
        - 练习：
            1. 创建 3 个学生对象
            2. 放入到 HashSet 中学生对象使用
            3. 放入到 HashMap 中，要求 Key 是 String name, Value 就是学生对象
            4. 使用两种方式遍历
         */
        //在 HashSet 中添加学生
        System.out.println("一、在 HashSet 中添加学生");
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("Tom", 13));
        studentHashSet.add(new Student("Mike", 15));
        studentHashSet.add(new Student("Jack", 16));

        //遍历(增强 for 循环)：
        System.out.println("1. 遍历(增强 for 循环)：");
        for (Student student : studentHashSet)
            System.out.println(student);
        System.out.println();
        //遍历(迭代器)：
        System.out.println("2. 遍历(迭代器)：");
        Iterator<Student> iterator1 = studentHashSet.iterator();
        while (iterator1.hasNext()) {
            Student next = iterator1.next();
            System.out.println(next);
        }
        System.out.println();

        //在 HashMap 中添加学生
        System.out.println("二、在 HashMap 中添加学生");
        HashMap<String, Student> studentsHashMap = new HashMap<>();
        studentsHashMap.put("Tom", new Student("Tom", 13));
        studentsHashMap.put("Mike", new Student("Mike", 15));
        studentsHashMap.put("Jack", new Student("Jack", 16));

        Set<Map.Entry<String, Student>> entries = studentsHashMap.entrySet();

        //遍历(增强 for 循环)：
        System.out.println("1. 遍历(增强 for 循环)：");
        for (Map.Entry<String, Student> entry : entries)
            System.out.println(entry.getKey() + " - " + entry.getValue());
        System.out.println();

        //遍历(迭代器)：
        System.out.println("2. 遍历(迭代器)：");
        Iterator<Map.Entry<String, Student>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Student> next = iterator2.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
