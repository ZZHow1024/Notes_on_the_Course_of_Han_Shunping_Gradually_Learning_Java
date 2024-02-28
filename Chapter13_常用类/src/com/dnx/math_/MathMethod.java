package com.dnx.math_;

import java.util.Scanner;

/**
 * 0480_Math方法
 * 2024年2月28日
 *
 * @author 韩顺平
 * @author DNX
 */
public class MathMethod {
    public static void main(String[] args) {
        //Math常用方法(静态方法)演示
        //1. abs 绝对值(返回值类型：int)
        System.out.println("1. abs演示");
        int abs = Math.abs(-9);
        System.out.println("Math.abs(-9) = " + abs + "\n");

        //2. pow 求幂(返回值类型：double)
        System.out.println("2. pow演示");
        double pow = Math.pow(2, 4);
        System.out.println("Math.pow(2, 4) = " + pow + "\n");

        //3. ceil 向上取整，返回 >= 该参数的最小整数(返回值类型：double)
        System.out.println("3. pow演示");
        double ceil = Math.ceil(-3.00001);
        System.out.println("Math.ceil(-3.00001) = " + ceil + "\n");

        //4. floor 向下取整，返回 <= 该参数的最大整数(返回值类型：double)
        System.out.println("4. floor演示");
        double floor = Math.floor(4.001);
        System.out.println("Math.floor(4.001) = " + floor + "\n");

        //5. round 四舍五入 Math.floor(返回值类型：long)
        System.out.println("5. round演示");
        long round = Math.round(5.55555);
        System.out.println("Math.round(5.51) = " + round + "\n");

        //6. sqrt 求开方(返回值类型：double)
        System.out.println("6. sqrt演示");
        double sqrt = Math.sqrt(9.0);
        System.out.println("Math.sqrt(9.0) = " + sqrt);
        sqrt = Math.sqrt(-9.0);
        System.out.println("Math.sqrt(-9.0) = " + sqrt + "\n");

        //7. random 求随机数(返回值类型：double)
        // 返回的是 0 <= x < 1 之间的一个随机小数。
        //案例：求一个 a-b 之间的随机整数。
        System.out.println("7. random演示");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入a：");
        int a = scanner.nextInt();
        System.out.println("请输入b：");
        int b = scanner.nextInt();
        for(int i = 0; i < 5; i++)
        {
            int randomInt = (int) (a + Math.random() * (b - a + 1));
            System.out.println(a + "-" + b + "之间的随机数为：" + randomInt);
        }
        System.out.println();

        //8. max 返回最大值，min 返回最小值(返回值类型：)
        System.out.println("8. max min 演示");
        int min = Math.min(1, 9);
        int max = Math.max(11,99);
        System.out.println("Math.min(1, 9) = " + min);
        System.out.println("Math.max(11,99) = " + max);
    }
}
