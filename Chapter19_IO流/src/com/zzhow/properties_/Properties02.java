package com.zzhow.properties_;

import java.io.FileOutputStream;
import java.util.Properties;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：使用 Properties 来创建配置文件，修改配置文件内容
 */
public class Properties02 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //创建配置文件
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "Tom");
        properties.setProperty("password", "123");

        //将 K-V 存储到文件中
        try {
            properties.store(new FileOutputStream("src\\mysql2.properties"), null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("保存成功");
    }
}
