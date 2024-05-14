package com.zzhow.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2024/5/14
 *
 * @author ZZHow
 * 将 D:\hello.txt 拷贝到 D:\hello1.txt
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\hello.txt";
        String destFilePath = "D:\\hello1.txt";

        try (FileInputStream fileInputStream = new FileInputStream(srcFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(destFilePath)) {
            //定义字节数组，提高读取效果
            byte[] buffer = new byte[1024]; //一次读 1024 个字节
            int readLen = 0;
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                //边读边写
                fileOutputStream.write(buffer, 0, readLen);
            }

            System.out.println("拷贝完成");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
