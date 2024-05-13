package com.zzhow.file;

import java.io.File;
import java.io.IOException;

/**
 * 2024/5/13
 *
 * @author ZZHow
 * 演示创建文件
 */
public class FileCreate {
    /**
     * 案例：在 D 盘下，创建文件 news1.txt、news2.txt、news3.txt，用三种不同方式创建
     */
    public static void main(String[] args) {
        create1();
        create2();
        create3();
    }

    /**
     * 方式 1：new File(String pathname) 根据路径构建一个 File 对象
     */
    public static void create1() {
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);

        try {
            if (file.createNewFile())
                System.out.println("news1.txt 创建成功");
            else
                System.out.println("未执行创建 news1.txt 的操作，文件可能已存在");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 方法 2：new File(File parent, String child) 根据父目录文件 + 子路径构建
     */
    public static void create2() {
        File parentFile = new File("D:\\");
        String filePath = "news2.txt";

        File file = new File(parentFile, filePath);

        try {
            if (file.createNewFile())
                System.out.println("news2.txt 创建成功");
            else
                System.out.println("未执行创建 news2.txt 的操作，文件可能已存在");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 方法 3：new File(String parent, String child) 根据父目录 + 子路径构建
     */
    public static void create3() {
        String parentPath = "D:\\";
        String fileName = "news3.txt";

        File file = new File(parentPath, fileName);

        try {
            if (file.createNewFile())
                System.out.println("news3.txt 创建成功");
            else
                System.out.println("未执行创建 news3.txt 的操作，文件可能已存在");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
