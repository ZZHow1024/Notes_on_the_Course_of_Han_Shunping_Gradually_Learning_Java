package com.zzhow.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024年3月29日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class List_ {
    public static void main(String[] args) {
        //List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复。
        System.out.println("1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复。");
        List list = new ArrayList();
        list.add("Tom");
        list.add("Jack");
        list.add("Mike");
        list.add("Jack");
        list.add("Tom");

        System.out.println("list = " + list + "\n");

        //List 集合中的每个元素都有其对应的顺序索引，即支持索引。
        //  索引从0开始
        System.out.println("2. List 集合中的每个元素都有其对应的顺序索引，即支持索引。");
        System.out.println("list.get(2) = " + list.get(2));
    }
}
