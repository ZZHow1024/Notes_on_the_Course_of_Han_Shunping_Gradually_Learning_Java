package com.zzhow.transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：一个中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) {
        String filePath = "D:\\a.txt";
        //该文件使用 GBK 编码

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println("读取到的内容：" + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
