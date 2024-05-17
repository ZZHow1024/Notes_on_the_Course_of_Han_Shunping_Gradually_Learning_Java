package com.zzhow.transformation;

import java.io.*;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：将字节流 FileOutputStream 包装成字符流 OutputStreamWriter
 * 对文件进行写入（按照 GBK 格式，可以指定其他，比如 UTF-8）
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\a.txt";
        //希望以 UTF-8 编码
        String charSet = "utf-8";

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), charSet))) {
            bw.write("你好 世界");
            System.out.println("以 " + charSet + " 编码写入成功");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
