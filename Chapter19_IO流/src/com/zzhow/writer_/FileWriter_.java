package com.zzhow.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 2024/5/14
 *
 * @author ZZHow
 * 案例：使用 FileWriter 在 D:\hello.txt 文件中用 5 种方式写入数据
 */
public class FileWriter_ {
    public static void main(String[] args) {
        writeFile();
    }

    public static void writeFile() {
        String filePath = "D:\\hello.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            String string = "Hello World\n";
            char[] charArray = string.toCharArray();

            //1. write(int)：写入单个字符
            fileWriter.write('A');
            //2. write(char[])：写入指定数组
            fileWriter.write(charArray);
            //3. write(char[], off, len)：写入指定数组的指定部分
            fileWriter.write(charArray, 0, charArray.length);
            //4. write(string)：写入整个字符串
            fileWriter.write(string);
            //5. write(string, off, len)：写入字符串的指定部分
            fileWriter.write(string, 0, string.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
