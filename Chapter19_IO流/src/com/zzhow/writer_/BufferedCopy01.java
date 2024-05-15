package com.zzhow.writer_;

import java.io.*;

/**
 * 2024/5/15
 *
 * @author ZZHow
 * 案例：综合使用 BufferedReader 与 BufferedWriter 进行文件拷贝
 */
public class BufferedCopy01 {
    public static void main(String[] args) {
        String srcFilePath = "D:\\hello.txt";
        String destFilePath = "D:\\hello1.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                if ((line = bufferedReader.readLine()) != null)
                    bufferedWriter.newLine();
            }

            System.out.println("拷贝成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
