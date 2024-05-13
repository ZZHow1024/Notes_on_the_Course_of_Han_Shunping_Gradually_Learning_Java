package com.zzhow.file;

import java.io.File;

/**
 * 2024/5/13
 *
 * @author ZZHow
 */
public class Directory_ {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    public static void m1() {
        // 判断 D:\new.txt 是否存在，如果存在就删除
        String parentPath = "D:\\";
        String fileName = "new.txt";

        File file = new File(parentPath, fileName);

        if (file.exists())
            if (file.delete())
                System.out.println("删除 " + fileName + " 成功");
            else
                System.out.println(fileName + " 存在，但删除失败");
        else
            System.out.println(fileName + " 不存在");
    }

    public static void m2() {
        //判断 D:\demo 目录是否存在，存在就删除，否则提示不存在
        String directoryPath = "D:\\demo";

        File directory = new File(directoryPath);

        if (directory.exists())
            if (directory.isDirectory())
                if (directory.delete())
                    System.out.println(directoryPath + " 目录删除成功");
                else
                    System.out.println(directoryPath + " 目录存在，但删除失败，可能目录不为空");
            else
                System.out.println(directoryPath + " 存在，但不是目录，不执行删除操作");
        else
            System.out.println(directoryPath + " 不存在");
    }

    public static void m3() {
        //判断 D:\demo\a\b\c 目录是否存在，如果存在就提示已经存在，否则就创建
        String directoryPath = "D:\\demo\\a\\b\\c";

        File directory = new File(directoryPath);

        if (directory.exists())
            if (directory.isDirectory())
                System.out.println(directoryPath + " 目录存在");
            else
                System.out.println(directoryPath + " 存在，但不是目录");
        else if (directory.mkdirs())
            System.out.println(directoryPath + " 目录创建成功");
        else
            System.out.println(directoryPath + " 目录不存在，也创建失败，可能存在父级但不是目录");
    }
}
