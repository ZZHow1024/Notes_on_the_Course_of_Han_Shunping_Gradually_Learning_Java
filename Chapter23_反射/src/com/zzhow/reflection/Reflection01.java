package com.zzhow.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ZZHow
 * @date 2024/6/4
 */
public class Reflection01 {
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

        try {
            //java.lang.Class 代表一个类，Class 对象表示某个类加载后在堆中的对象
            //  (1) 加载类，返回 Class 类型的对象 aClass
            Class<?> aClass = Class.forName(classFullPath);

            //  (2) 通过 aClass 得到加载的类的对象实例
            Cat cat = (Cat) aClass.newInstance();
            System.out.println("1. 得到 Cat 的对象");
            System.out.println("cat 的运行类型是：" + cat.getClass() + "\n");

            //java.lang.reflect.Method：代表类的方法，Method 对象表示某个类的方法
            //  (3) 通过 aClass 得到加载到的类 Cat 的 methodName "hi" 的方法对象
            //  在反射中把方法视为对象（万物皆对象）
            System.out.println("2. 得到 Cat 中的方法");
            Method method = aClass.getMethod(methodName);
            //  (4) 通过 method 来调用方法
            method.invoke(cat);

            //java.lang.reflect.Field：代表类的成员变量，Field 对象表示某个类的成员变量
            //  (5) 通过 field 得到 name 字段
            // getField 不能得到私有的属性
            System.out.println("\n3. 得到 Cat 的对象的 age 属性");
            //Field nameField = aClass.getField("name"); //❌
            Field ageField = aClass.getField("age");
            System.out.println("age = " + ageField.get(cat) + "\n");

            //java.lang.reflect.Constructor：代表类的构造方法，Constructor 对象表示构造器
            System.out.println("4. 得到 Cat 的构造器");
            Constructor<?> constructor = aClass.getConstructor();
            System.out.println(constructor);
        } catch (InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("Exception message: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("找不到 " + classFullPath + " 类");
        } catch (NoSuchMethodException e) {
            System.out.println("找不到 " + methodName + " 方法");
        } catch (NoSuchFieldException e) {
            System.out.println("找不到字段 " + e.getMessage());
        }
    }
}
