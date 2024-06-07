package com.zzhow.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ZZHow
 * @date 2024/6/7
 * 演示反射操作属性
 */
public class ReflectAccessProperty {
    public static void main(String[] args) {
        try {
            //1. 得到 Student 类对应的 Class 类的对象
            Class<?> studentClass = Class.forName("com.zzhow.reflection.Student");
            System.out.println("1. 得到 Student 类对应的 Class 类的对象：" + studentClass + "\n");

            //2. 创建对象
            Student student = (Student) studentClass.getDeclaredConstructor().newInstance();
            System.out.println("2. 创建对象：" + student + "\n");

            //3. 通过反射操作公开的属性 name
            Field name = studentClass.getField("name");
            name.set(student, "Zhang");
            System.out.println("3. 通过反射操作公开的属性 name：" + student + "\n");

            //4. 通过反射操作私有的静态的属性 age
            Field declaredField = studentClass.getDeclaredField("age");
            declaredField.setAccessible(true); //爆破
            declaredField.set(null, 10);
            System.out.println("4. 通过反射操作私有的静态的属性 age：" + student);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchFieldException |
                 InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

class Student {
    public String name;
    private static int age;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' + ", age=" + age +
                '}';
    }
}
