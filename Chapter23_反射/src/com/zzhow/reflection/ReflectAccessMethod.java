package com.zzhow.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZZHow
 * @date 2024/6/7
 * 演示反射操作方法
 */
public class ReflectAccessMethod {
    public static void main(String[] args) {
        try {
            //1. 得到 Boss 类对应的 Class 类的对象
            Class<?> bossClass = Class.forName("com.zzhow.reflection.Boss");
            System.out.println("1. 得到 Boss 类对应的 Class 类的对象：" + bossClass + "\n");

            //2. 创建对象
            Boss boss = (Boss) bossClass.getDeclaredConstructor().newInstance();
            System.out.println("2. 创建对象：" + boss + "\n");

            //3. 通过反射调用公开的方法 hi
            System.out.println("3. 通过反射调用公开的方法 hi");
            //  (1).得到 hi 方法的对象
            Method hi = bossClass.getMethod("hi", String.class);
            //  (2).调用
            hi.invoke(boss, "aaa\n");

            //4. 通过反射调用私有的静态的方法 say
            System.out.println("4. 通过反射调用私有的静态的方法 say");
            //  (1).得到 say 方法的对象
            Method say = bossClass.getDeclaredMethod("say", String.class, int.class, char.class);
            //  (2).爆破
            say.setAccessible(true);
            //  (3).调用
            //  如果方法有返回值，统一以 Object 类型返回
            System.out.println(say.invoke(boss, "aaa", 111, '√'));
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

class Boss {
    public String name;
    private static int age;

    public Boss() {

    }

    public void hi(String message) {
        System.out.println("hello " + message);
    }

    private static String say(String a, int b, char c) {
        return "say " + a + " " + b + " " + c;
    }
}
