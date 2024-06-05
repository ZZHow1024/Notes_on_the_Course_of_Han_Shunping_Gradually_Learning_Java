package com.zzhow.class_;

import java.io.Serializable;

/**
 * @author ZZHow
 * @date 2024/6/5
 * 演示哪些类型有 Class 对象
 */
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> stringClass = String.class; //外部类
        Class<Serializable> serializableClass = Serializable.class; //接口
        Class<Integer[]> aClass1 = Integer[].class; //一维数组
        Class<Integer[][]> aClass2 = Integer[][].class;//二维数组
        Class<Thread.State> stateClass = Thread.State.class; //枚举
        Class<Override> overrideClass = Override.class; //注解
        Class<Integer> integerClass = int.class; //基本数据类型
        Class<Void> voidClass = void.class; //void
        Class<Class> classClass = Class.class; //Class 类

        System.out.println("如下类型有 Class 对象");
        System.out.println("1. 外部类，成员内部类，静态内部类，局部内部类，匿名内部类");
        System.out.println("    stringClass = " + stringClass);
        System.out.println("    classClass = " + classClass);

        System.out.println("2. interface：接口");
        System.out.println("    serializableClass = " + serializableClass);

        System.out.println("3. 数组");
        System.out.println("    一维数组得到的 aClass1 = " + aClass1);
        System.out.println("    二维数组得到的 aClass2 = " + aClass2);

        System.out.println("4. enum：枚举");
        System.out.println("    stateClass = " + stateClass);

        System.out.println("5. annotation：注解");
        System.out.println("    overrideClass = " + overrideClass);

        System.out.println("6. 基本数据类型");
        System.out.println("    integerClass = " + integerClass);

        System.out.println("7. void");
        System.out.println("    voidClass = " + voidClass);
    }
}
