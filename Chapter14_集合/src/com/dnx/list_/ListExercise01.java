package com.dnx.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2024年3月30日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class ListExercise01 {
    public static void main(String[] args) {
        /*
        案例：
        添加 10 个以上的元素(比如 String "hello")，
        在 2 号位插入一个元素 "DNX"，
        获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，
        最后使用送代器遍历集合。
        要求：使用 List 的实现类 ArrayList 完成。
         */
        //1. 添加 10 个以上的元素(比如 String "hello")
        System.out.println("1. 添加 10 个以上的元素(比如 String \"hello\")");
        List list = new ArrayList();
        for (int i = 0; i < 12; i++)
            list.add("hello" + (i + 1));
        System.out.println("list = " + list + "\n");

        //2. 在 2 号位插入一个元素 "DNX"
        System.out.println("2. 在 2 号位插入一个元素 \"DNX\"");
        list.add(1, "DNX");
        System.out.println("list = " + list + "\n");

        //3. 获得第 5 个元素
        System.out.println("3. 获得第 5 个元素");
        System.out.println("第5个元素是：" + list.get(4) + "\n");

        //4. 删除第 6 个元素
        System.out.println("4. 删除第 6 个元素");
        list.remove(5);
        System.out.println("list = " + list + "\n");

        //5. 修改第 7 个元素
        System.out.println("5. 修改第 7 个元素");
        list.set(6, "DNX");
        System.out.println("list = " + list + "\n");

        //6. 最后使用送代器遍历集合
        System.out.println("6. 使用送代器遍历集合");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
