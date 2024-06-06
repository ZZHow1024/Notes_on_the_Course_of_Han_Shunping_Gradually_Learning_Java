package com.zzhow.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ZZHow
 * @date 2024/6/6
 * 演示通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {
        System.out.println("第一组：java.lang.Class 类的 API");
        api_01();
        System.out.println("第二组：java.lang.reflect.Field 类的 API");
        api_02();
        System.out.println("第三组：java.lang.reflect.Method 类");
        api_03();
        System.out.println("第四组：java.lang.reflect.Constructor 类");
        api_04();
    }

    //第一组 API
    public static void api_01() {
        try {
            //得到 Class 对象
            Class<?> aClass = Class.forName("com.zzhow.reflection.Person");

            //1. getName：获取全类名
            System.out.println("1. getName：获取全类名 -> " + aClass.getName() + "\n");

            //2. getSimpleName：获取简单类名
            System.out.println("2. getSimpleName：获取简单类名 -> " + aClass.getSimpleName() + "\n");

            //3. getFields：获取所有 public 修饰的属性，包含本类以及父类的
            System.out.println("3. getFields：获取所有 public 修饰的属性，包含本类以及父类的 -> ");
            Field[] fields = aClass.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }
            System.out.println();

            //4. getDeclaredFields：获取本类中所有属性
            Field[] declaredFields = aClass.getDeclaredFields();
            System.out.println("4. getDeclaredFields：获取本类中所有属性 -> ");
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }
            System.out.println();

            //5. getMethods：获取所有 public 修饰的方法，包含本类以及父类的
            Method[] methods = aClass.getMethods();
            System.out.println("5. getMethods：获取所有 public 修饰的方法，包含本类以及父类的 -> ");
            for (Method method : methods) {
                System.out.println(method);
            }
            System.out.println();

            //6. getDeclaredMethods：获取本类中所有方法
            Method[] declaredMethods = aClass.getDeclaredMethods();
            System.out.println("6. getDeclaredMethods：获取本类中所有方法 -> ");
            for (Method method : declaredMethods) {
                System.out.println(method);
            }
            System.out.println();

            //7. getConstructors：获取所有 public 修饰的构造器，包含本类以及父类的
            Constructor<?>[] constructors = aClass.getConstructors();
            System.out.println("7. getConstructors：获取本类所有 public 修饰的构造器 -> ");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
            System.out.println();

            //8. getDeclaredConstructors：获取本类中所有构造器
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            System.out.println("8. getDeclaredConstructors：获取本类中所有构造器 -> ");
            for (Constructor<?> constructor : declaredConstructors) {
                System.out.println(constructor);
            }
            System.out.println();

            //9. getPackage：以 Package 形式返回 包信息
            Package aPackage = aClass.getPackage();
            System.out.println("9. getPackage：以 Package 形式返回 包信息 -> " + aPackage + "\n");

            //10. getSuperClass：以 Class 形式返回父类信息
            Class<?> a = aClass.getSuperclass();
            System.out.println("10. getSuperClass：以 Class 形式返回父类信息 -> " + a + "\n");

            //11. getlnterfaces：以 Class[] 形式返回接口信息
            Class<?>[] interfaces = aClass.getInterfaces();
            System.out.println("11. getlnterfaces：以 Class[] 形式返回接口信息 -> ");
            for (Class<?> anInterface : interfaces) {
                System.out.println(anInterface);
            }
            System.out.println();

            //12. getAnnotations：以 Annotation[] 形式返回注解信息
            Annotation[] annotations = aClass.getAnnotations();
            System.out.println("12. getAnnotations：以 Annotation[] 形式返回注解信息 -> ");
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    //第二组 API
    public static void api_02() {
        try {
            //得到 Class 对象
            Class<?> aClass = Class.forName("com.zzhow.reflection.Person");

            //1. getModifiers：以 int 形式返回修饰符
            //2. getType：以 Class 形式返回类型
            //3. getName：返回属性名
            //  获取本类中所有属性
            Field[] declaredFields = aClass.getDeclaredFields();
            System.out.println("本类中的所有属性名 修饰符值 类型 -> ");
            for (Field field : declaredFields) {
                System.out.println(field.getName() + " " + field.getModifiers() + " " + field.getType().getSimpleName());
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    //第三组 API
    public static void api_03() {
        try {
            //得到 Class 对象
            Class<?> aClass = Class.forName("com.zzhow.reflection.Person");

            //1. getMlodifiers：以 int 形式返回修饰符
            //2. getReturnType：以 Class 返回方法返回值类型
            //3. getName：返回方法名
            //4. getParameterTypes：以 Class 返回参数类型数组
            //  获取本类中的所有方法
            Method[] declaredMethods = aClass.getDeclaredMethods();
            System.out.println("本类中的所有方法名 修饰符值 返回值类型 参数类型数组 -> ");
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod.getName() + " " + declaredMethod.getModifiers() + " " + declaredMethod.getReturnType() + " " + Arrays.toString(declaredMethod.getParameterTypes()));
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    //第四组 API
    public static void api_04() {
        try {
            //得到 Class 对象
            Class<?> aClass = Class.forName("com.zzhow.reflection.Person");

            //1. getModifiers：以 int 形式返回修饰符
            //2. getName：返回构造器名（全类名）
            //3. getParameterTypes：以 Class[] 返回参数类型数组
            //  获取本类中的所有构造器
            Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
            System.out.println("本类中的所有构造器名 修饰符值 参数类型数组 -> ");
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                System.out.println(declaredConstructor.getName() + " " + declaredConstructor.getModifiers() + " " + Arrays.toString(declaredConstructor.getParameterTypes()));
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}

interface IA {

}

interface IB {

}

class Father {
    //属性
    public String hobby;

    //构造器
    public Father() {

    }

    public Father(String hobby) {

    }

    //方法
    public void hi() {

    }
}

@Deprecated
class Person extends Father implements IA, IB {
    //属性
    public String name;
    protected int age;
    String job;
    private double salary;

    //构造器
    public Person() {

    }

    public Person(String name, int age, String job, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    //方法
    public void m1() {

    }

    protected void m2() {

    }

    void m3() {

    }

    private void m4() {

    }

    public int m5(int a, int b, int c) {
        return a + b + c;
    }
}
