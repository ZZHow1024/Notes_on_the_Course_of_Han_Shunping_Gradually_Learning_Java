package com.zzhow.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 2024年3月27日
 *
 * @author ZZHow1024
 */
@SuppressWarnings("all")
public class CollectionFor {
    public static void main(String[] args) {
        //案例：增强 for 循环演示
        Collection list = new ArrayList();

        list.add(new Book("Discrete mathematics", "Jack", 50.00));
        list.add(new Book("Linear algebra", "Tom", 60.50));
        list.add(new Book("Data structure", "Jerry", 12.35));

        System.out.println("list = " + list + "\n");

        //增强 for 在 Collection 集合使用
        //在 Collection 集合使用的增强 for 底层仍然是迭代器
        //证明：Debug 时使用 Force Step Into
        for (Object book : list) {
            System.out.println("book = " + book);
        }
        System.out.println();

        //增强 for 也可以用在数组上
        int[] nums = {1, 3, 5};
        for (int i : nums) {
            System.out.println("i = " + i);
        }
    }
}
