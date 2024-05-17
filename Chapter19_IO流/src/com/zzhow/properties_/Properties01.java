package com.zzhow.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：使用 Properties 类来读取 mysql1.properties 文件
 */
public class Properties01 {
    public static void main(String[] args) {
        //1. 创建 Properties 对象
        Properties properties = new Properties();

        try {
            //2. 加载指定配置文件
            properties.load(new FileReader("src\\mysql1.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //3. 把 k-v 显示到控制台上
        properties.list(System.out);

        //4. 根据 key 获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println();
        System.out.println("用户名 = " + user);
        System.out.println("密码 = " + pwd);
    }
}
