package com.zzhow.class_;

import java.lang.reflect.Field;

/**
 * @author ZZHow
 * @date 2024/6/4
 * 演示 Class 类的常用方法
 */
public class ClassMethod {
    public static void main(String[] args) {
        String classPath = "com.zzhow.class_.Car";

        //获取到 Car 类对应的 Class 对象
        //  <?> 表示不确定的 Java 类型
        try {
            Class<?> aClass = Class.forName(classPath);
            //输出 aClass
            System.out.println("1. 输出 aClass");
            System.out.println("(1). 输出是哪个类的 Class 对象：" + aClass); //输出是哪个类的 Class 对象
            System.out.println("(2). 输出 aClass 的运行类型：" + aClass.getClass() + "\n"); //输出 aClass 的运行类型

            //得到包名
            System.out.println("2. 得到包名");
            System.out.println("包名：" + aClass.getPackage().getName() + "\n");

            //得到(全)类名
            System.out.println("3. 得到(全)类名");
            System.out.println("类名：" + aClass.getName() + "\n");

            //通过 aClass 创建对象实例
            Car car = (Car) aClass.newInstance();
            System.out.println("4. 创建对象实例" + car + "\n");

            //得到属性 brand
            Field brand = aClass.getField("brand");
            System.out.println("5. 获取属性 brand = " + brand.get(car) + "\n");

            //通过反射给属性赋值
            brand.set(car, "haha");
            System.out.println("6. 给属性赋值 brand = " + brand.get(car) + "\n");

            //得到所有属性
            Field[] fields = aClass.getFields();
            System.out.println("7. 得到所有属性");
            for (Field field : fields) {
                System.out.println(field.getName() + " = " + field.get(car));
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("Exception message: " + e.getMessage());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
