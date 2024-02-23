package com.dnx.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 0452_throws入门案例
 * 2024年2月14日
 *
 * @author DNX
 */
public class Throws {
    public static void main(String[] args) throws FileNotFoundException{
        f1();
    }

    public static void f1() throws FileNotFoundException, NullPointerException, ArithmeticException {
        //创建了一个文件流对象
        //这里是FileNotFoundException编译异常
        //可以使用
        //1. 使用try-catch-finally处理
        //2. 使用throws抛出异常，让调用f2方法的调用者(方法)处理
        //throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        //throws关键字后也可以是异常列表，即 可以抛出多个异常
        FileInputStream fis = new FileInputStream("d://dnx.txt");
        System.out.println("程序继续运行。");
    }
}
