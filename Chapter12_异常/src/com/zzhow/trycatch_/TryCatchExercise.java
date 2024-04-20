package com.zzhow.trycatch_;

import java.util.Scanner;

/**
 * 0451_tryCatch最佳实践
 * 2024年2月14日
 *
 * @author ZZHow1024
 */
public class TryCatchExercise {
    //案例：如果用户输入的不是一个整数，
    // 就提示他反复输入，直到输入一个整数为止。
    public static void main(String[] args) {
        //思路：
        //1. 创建Scanner对象
        //2. 使用无限循环，去接收一个输入
        //3. 然后将该输入的值，转成int
        //4. 如果在转换时抛出异常，说明输入的内容不是一个可以转成int的内容
        //5. 如果没有抛出异常，则break该循环
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.print("请输入一个整数：");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
                //这里可能抛出异常
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数。");
            }
        }
        System.out.println("您输入的整数是：" + num);
    }
}
