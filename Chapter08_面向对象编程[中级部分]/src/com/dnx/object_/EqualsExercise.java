package com.dnx.object_;
//DNX写于2024年1月27日

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("DNX", 18, '男');
        Person person2 = new Person("DNX", 18, '男');
        Person person3 = new Person("Jack", 18, '男');

        //案例：判断两个Person对象的内容是否相等，
        //如果两个Person对象的各个属性值都一样，则返回true，反之false。
        //通过重写equals方法。
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        //判断比较的两个对象是否为同一个对象。
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name)
                    && this.age == p.age
                    && this.gender == p.gender;
        }

        return false;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}