package com.dnx.smallchange.oop;
//DNX写于2024年1月29日

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author DNX
 * 该类是完成零钱通的各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法。
 */
public class SmallChangeSysOOP {
    //属性：
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2.完成零钱通明细思路：
    //(1).把收益入账和消费保存到数组。(2).可以使用对象。(3).简单的话可以使用String拼接。
    //(3).String拼接：
    String details = "------------零钱通明细------------";

    //3.完成收益入账：
    //定义新的变量。
    double money = 0;
    double balance = 0;
    Date date = null; // Date是java.util.Date类型，表示日期。
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 可以用于日期格式化的对象。
    String choice = "";

    //4.完成消费：
    //定义新变量。
    String note = "";


    //先完成显示菜单，并可以选择。
    public void mainMenu(){
        do {
            System.out.println("------------零钱通菜单(OOP)------------");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请选择(1-4)：");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误");
            }
            System.out.println();
        } while (loop);
    }

    //完成零钱通明细。
    public void detail(){
        System.out.println(details);
    }

    public void income(){
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money需要范围校验。
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0。");
            return;//退出方法，不再执行后面的代码。
        }
        //字符串拼接
        date = new Date();
        balance += money;
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay(){
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        //money需要范围校验。
        if (money <= 0 || money > balance) {
            System.out.println("消费金额需要在 0 - " + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到details。
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit(){
        do {
            System.out.print("确定要退出码？(y/n)：");
            choice = scanner.next();
            if ("y".equals(choice) || "Y".equals(choice)
                    || "n".equals(choice) || "N".equals(choice)) {
                break;
            }
        } while (true);

        if ("y".equals(choice) || "Y".equals(choice)) {
            loop = false;
        }
    }


}
