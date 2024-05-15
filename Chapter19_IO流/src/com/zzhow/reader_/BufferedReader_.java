package com.zzhow.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2024/5/15
 *
 * @author ZZHow
 * 案例：使用 BufferedReader 读取文本文件，并显示在控制台
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "D:\\hello.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null)
                System.out.print(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
