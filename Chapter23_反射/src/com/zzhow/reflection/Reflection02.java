package com.zzhow.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZZHow
 * @date 2024/6/4
 */
public class Reflection02 {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    //传统方法调用 T 中的 test() 方法
    public static void m1() {
        T t = new T();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 999999999; i++)
            t.test();

        long end = System.currentTimeMillis();

        System.out.println("m1: " + (end - start) + " ms");
    }

    //反射机制调用 T 中的 test() 方法
    public static void m2() {
        try {
            Class<?> aClass = Class.forName("com.zzhow.reflection.T");
            T t = (T) aClass.newInstance();
            Method test = aClass.getMethod("test");
            long start = System.currentTimeMillis();

            for (int i = 0; i < 999999999; i++) {
                test.invoke(t);
            }

            long end = System.currentTimeMillis();

            System.out.println("m2: " + (end - start) + " ms");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    //反射机制优化 -> 关闭访问检查
    public static void m3() {
        try {
            Class<?> aClass = Class.forName("com.zzhow.reflection.T");
            T t = (T) aClass.newInstance();
            Method test = aClass.getMethod("test");

            //关闭访问检查
            test.setAccessible(true);

            long start = System.currentTimeMillis();

            for (int i = 0; i < 999999999; i++) {
                test.invoke(t);
            }

            long end = System.currentTimeMillis();

            System.out.println("m2: " + (end - start) + " ms");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

class T {
    public void test() {
        int i = 1 + 1;
    }
}
