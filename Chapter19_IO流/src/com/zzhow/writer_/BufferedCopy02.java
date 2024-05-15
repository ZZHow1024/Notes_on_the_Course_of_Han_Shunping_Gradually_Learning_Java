package com.zzhow.writer_;

import java.io.*;

/**
 * 2024/5/15
 *
 * @author ZZHow
 * 案例：编程完成图片/音乐的拷贝（要求使用 Buffered 流）
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "D:\\hello.png";
        String destFilePath = "D:\\hello1.png";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFilePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath))) {
            byte[] buffer = new byte[1024]; //缓冲
            int readLen = 0;

            while ((readLen = bis.read(buffer)) != -1)
                bos.write(buffer, 0, readLen);

            System.out.println("拷贝成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
