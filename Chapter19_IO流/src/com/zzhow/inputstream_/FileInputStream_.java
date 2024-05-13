package com.zzhow.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 2024/5/13
 *
 * @author ZZHow
 * 演示 FileInputStream 的使用(字节输入流 文件 -> 程序)
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        System.out.println("1. 使用 read() 方法按字节读取文件");
        readFile1();
        System.out.println("\n2. 使用 read(byte[] b) 读取文件，提高效率");
        readFile2();
    }

    /**
     * 使用 read() 方法按字节读取文件
     */
    public static void readFile1() {
        String filePath = "D:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;

        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);

            //从该输入流中读取一个字节的数据，如果没有输入可用将被阻止
            //返回 -1 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //关闭文件流，释放资源
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (NullPointerException | IOException e) {
                    System.out.print(e.getMessage());
                }
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     * 一次读取 32 个字节
     */
    public static void readFile2() {
        String filePath = "D:\\hello.txt";
        FileInputStream fileInputStream = null;
        byte[] buffer = new byte[32]; //字节数组
        int readLength = 0;

        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);

            //read(byte[] b) 返回实际读取的字节数
            //返回 -1 表示读取完毕
            while ((readLength = fileInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLength));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            //关闭文件流，释放资源
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
