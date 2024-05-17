package com.zzhow.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：PrintStream 演示
 */
public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.print("Hello World");
        //print 底层使用的是 write，我们也可以直接调用 write 方法进行打印/输出
        out.close();

        //可以修改打印流输出的位置/设备
        try {
            System.setOut(new PrintStream("D:\\hello.txt"));
            System.out.println("Hello World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
