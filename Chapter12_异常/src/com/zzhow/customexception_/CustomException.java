package com.zzhow.customexception_;

import java.util.Scanner;

/**
 * 0454_自定义异常
 * 2024年2月15日
 *
 * @author ZZHow1024
 */
public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            String inputStr;
            try {
                System.out.print("请输入年龄：");
                inputStr = scanner.next();
                age = Integer.parseInt(inputStr);
                break;
            } catch (Exception e) {
                System.out.println("请输入整数！");
            }
        }
        //要求在18 - 120之间，否则抛出一个自定义异常
        if (!(18 <= age && age <= 120)) {
            throw new AgeException("年龄需要在18 - 120之间");
        }
        System.out.println("你的年龄范围正确。");
    }
}

//自定义异常：AgeException
class AgeException extends RuntimeException {
    public AgeException(String message) { //构造器
        super(message);
    }
}
