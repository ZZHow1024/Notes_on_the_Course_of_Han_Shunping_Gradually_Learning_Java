package com.dnx.exception_;

/**
 * 0443_异常处理入门
 * 2024年2月13日
 *
 * @author DNX
 */
public class Exception_ {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //解读：
        //1. num1 / num2 = 10 / 0
        //2. 当执行到num1 / num2 因为num2 = 0，
        // 程序就会出现(抛出)异常 ArithmeticException
        //3. 当抛出异常后，程序就退出
        //4. 不应该出现一个不算致命的问题就导致整个系统崩溃
        //5. Java设计者提供了异常处理机制来解决这个问题

        //int res = num1 / num2;

        //如果程序员认为一段代码可能出现异常，可以
        // 使用try-catch异常处理机制来解决，保证程序的健壮性

        //将代码块选中，按快捷键 Ctrl + Alt + t -> 选中try-catch
        try {
            int res = num1 / num2;
        } catch (java.lang.Exception e) {
            //throw new RuntimeException(e);
            System.out.println("出现异常的原因：" + e.getMessage());
        }
        System.out.println("程序继续执行。");
    }
}
