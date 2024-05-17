package com.zzhow.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：PrintWriter 演示
 */
public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello World");
        pw.close();

        try (PrintWriter pw2 = new PrintWriter(new FileWriter("D:\\hello.txt"))) {
            pw2.println("Hello World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
