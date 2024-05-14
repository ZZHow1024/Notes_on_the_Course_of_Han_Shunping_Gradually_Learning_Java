package com.zzhow.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2024/5/14
 *
 * @author ZZHow
 * 案例：使用 FileOutputStream 在 D:\hello.txt 文件中写入 “Hello World”
 * 如果文件不存在，会创建文件（注意：前提是目录已经存在）
 */
public class FileOutputStream_ {
    public static void main(String[] args) {
        writeFile();
    }

    public static void writeFile() {
        String filePath = "D:\\hello.txt";

        //创建 FileOutputStream
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            //方法①：写入一个字节
            fileOutputStream.write('a'); // 写入字符 'a'

            //方法②：写入字符串
            String string = "Hello World";
            //需要将字符串转为字节数组
            fileOutputStream.write(string.getBytes()); // 写入字符串 "Hello World"

            //方法③：写入字节数组的某一段字符
            fileOutputStream.write(string.getBytes(), 0, 5); // 写入字符串 "Hello"
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
