package com.zzhow.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 2024/5/30
 *
 * @author ZZHow
 */
public class ReflectionQuestion {
    public static void main(String[] args) {
        //1. 使用 Properties 类读取配置文件
        Properties properties = new Properties();
        String classFullPath = "";
        String methodName = "";

        try {
            properties.load(new FileInputStream("src/com/zzhow/reflection/re.properties"));
            classFullPath = properties.getProperty("classFullPath");
            methodName = properties.getProperty("methodName");
            System.out.println("classFullPath = " + classFullPath);
            System.out.println("methodName = " + methodName + "\n");
        } catch (IOException e) {
            System.out.println("Exception message: " + e.getMessage());
        }

        //2. 使用反射机制
        try {
            //(1) 加载类，返回 Class 类型的对象 aClass
            Class<?> aClass = Class.forName(classFullPath);

            //(2) 通过 aClass 得到加载的类的对象实例
            Cat cat = (Cat) aClass.newInstance();
            System.out.println("cat 的运行类型是：" + cat.getClass() + "\n");

            //(3) 通过 aClass 得到加载到的类 Cat 的 methodName "hi" 的方法对象
            //  在反射中把方法视为对象（万物皆对象）
            Method method = aClass.getMethod(methodName);

            //(4) 通过 method 来调用方法
            method.invoke(cat);
        } catch (InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Exception message: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("找不到 " + classFullPath + " 类");
        } catch (NoSuchMethodException e) {
            System.out.println("找不到 " + methodName + " 方法");
        }

    }
}
