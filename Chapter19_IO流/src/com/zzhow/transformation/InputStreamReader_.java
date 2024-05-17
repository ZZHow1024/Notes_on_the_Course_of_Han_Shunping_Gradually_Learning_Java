package com.zzhow.transformation;

import java.io.*;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：节流 FilelnputStream 包装成字符流 InputStreamReader
 * 对文件进行读取（按照 UTF-8 格式），进而在包装成 BufferedReader
 */
public class InputStreamReader_ {
    public static void main(String[] args) {
        String filePath = "D:\\a.txt";
        //该文件使用 GBK 编码
        String charSet = "gbk";

        //把 FileInputStream 包装成 InputStreamReader 再包装成 BufferedReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), charSet))) {
            System.out.println("以 " + charSet + " 编码读取到的内容：" + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
