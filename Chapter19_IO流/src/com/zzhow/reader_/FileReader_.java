package com.zzhow.reader_;

import java.io.FileReader;
import java.io.IOException;

/**
 * 2024/5/14
 *
 * @author ZZHow
 * 案例：使用 FileReader 从 hello.txt 读取内容并显示
 */
public class FileReader_ {
    public static void main(String[] args) {
        System.out.println("1. 使用 read() 方法按字节读取文件");
        read1();
        System.out.println("\n2. 使用 read(char[] b) 读取文件，提高效率");
        read2();
    }

    /**
     * 使用 read() 方法按字符读取文件
     */
    public static void read1() {
        String filePath = "D:\\hello.txt";

        try (FileReader fileReader = new FileReader(filePath)) {
            //循环读取
            int data = 0;
            while ((data = fileReader.read()) != -1)
                System.out.print((char) data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 使用 read(char[] b) 读取文件，提高效率
     * 一次读取 32 个字符
     */
    public static void read2() {
        String filePath = "D:\\hello.txt";

        try (FileReader fileReader = new FileReader(filePath)) {
            char[] buffer = new char[32]; //一次读 32 个字符
            int readLength = 0;
            while ((readLength = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLength));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
