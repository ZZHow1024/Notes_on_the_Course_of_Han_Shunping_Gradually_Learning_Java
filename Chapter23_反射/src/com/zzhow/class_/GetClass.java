package com.zzhow.class_;

/**
 * @author ZZHow
 * @date 2024/6/5
 * 演示得到 Class 对象的各种方式（6种）
 */
public class GetClass {
    public static void main(String[] args) {
        try {
            //1. Class.forName
            String classPath = "com.zzhow.class_.Car";
            Class<?> aClass1 = Class.forName(classPath);
            System.out.println("1. 通过 Class.forName 得到: " + aClass1);

            //2. 类名.class
            Class<?> aClass2 = Car.class;
            System.out.println("2. 通过 类名.class 得到: " + aClass2);

            //3. 对象名.getClass()
            Car car = new Car();
            Class<? extends Car> aClass3 = car.getClass();
            System.out.println("3. 对象名.getClass() 得到" + aClass3);

            //4. 通过类加载器（4种）来获取类的 Class 对象
            //  (1)先得到类加载器 car
            ClassLoader classLoader = car.getClass().getClassLoader();
            //  (2)通过类加载器得到 Class 对象
            Class<?> aClass4 = classLoader.loadClass(classPath);
            System.out.println("4. 通过类加载器得到: " + aClass4);

            //5. 基本数据(int, char, boolean, float, double, byte, long, short)按如下方式得到 Class 类对象
            //  会发生自动装箱和自动拆箱
            Class<Integer> integerClass = int.class;
            Class<Character> characterClass = char.class;
            Class<Boolean> booleanClass = boolean.class;
            System.out.println("5. 基本数据");
            System.out.println("    int 得到: " + integerClass);
            System.out.println("    char 得到: " + characterClass);
            System.out.println("    boolean 得到: " + booleanClass);

            //6. 基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
            Class<Integer> type1 = Integer.TYPE;
            Class<Character> type2 = Character.TYPE;
            System.out.println("6. 基本数据类型对应的包装类");
            System.out.println("    Integer.TYPE 得到: " + type1);
            System.out.println("    Character.TYPE 得到: " + type2);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception message: " + e);
        }
    }
}
