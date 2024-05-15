package com.zzhow.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 2024/5/15
 *
 * @author ZZHow
 * 案例：使用 BufferedWriter 写入文本文件
 */
public class BufferedWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\hello.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine(); //插入与系统相关的换行符
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine(); //插入与系统相关的换行符
            bufferedWriter.write("Hello World");
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
