package com.zzhow.file;

import java.io.File;

/**
 * 2024/5/13
 *
 * @author ZZHow
 */
public class FileInformation {
    public static void main(String[] args) {
        fileInfo();
    }

    /**
     * 获取文件信息
     */
    public static void fileInfo() {
        //创建文件对象
        File file = new File("E:\\", "new.txt");

        //getName() 获取文件名
        System.out.println("文件名：" + file.getName());

        //getAbsolutePath() 获取文件绝对路径
        System.out.println("文件绝对路径：" + file.getAbsolutePath());

        //getParent() 获取文件父级目录
        System.out.println("文件父级目录：" + file.getParent());

        //length() 获取文件大小(字节 byte)
        System.out.println("文件大小(字节 byte)：" + file.length());

        //exists() 判断文件是否存在
        System.out.println("文件是否存在：" + file.exists());

        //isFile() 判断是否是一个文件
        System.out.println("是否是一个文件：" + file.isFile());

        //isDirectory() 判断是否是一个目录
        System.out.println("是否是一个目录：" + file.isDirectory());
    }
}
