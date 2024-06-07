package com.zzhow.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ZZHow
 * @date 2024/6/7
 * 演示通过反射机制创建实例
 */
public class ReflectCreateInstance {
    public static void main(String[] args) {
        try {
            //1. 获取 User 类的 Class 类的对象
            System.out.println("1. 获取 User 类的 Class 类的对象：");
            Class<?> userClass = Class.forName("com.zzhow.reflection.User");
            System.out.println(userClass + "\n");

            //2. 通过 public 的无参构造器创建实例
            System.out.println("2. 通过 public 的无参构造器创建实例：");
            User user1 = (User) userClass.newInstance();
            System.out.println(user1 + "\n");

            //3. 通过 public 的有参构造器创建实例
            System.out.println("3. 通过 public 的有参构造器创建实例：");
            Constructor<?> constructor = userClass.getConstructor(String.class);
            User user2 = (User) constructor.newInstance("Zhang");
            System.out.println(user2 + "\n");

            //4. 通过非 public 的有参构造器创建实例
            System.out.println("4. 通过非 public 的有参构造器创建实例：");
            Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true); //爆破[暴力破解]，使用反射可以访问 private 构造器/方法/属性
            User user3 = (User) declaredConstructor.newInstance("Wang", 30);
            System.out.println(user3);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

class User {
    private String name = "Li";
    private int age = 20;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
