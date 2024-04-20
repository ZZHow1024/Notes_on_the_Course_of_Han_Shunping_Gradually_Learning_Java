package com.zzhow.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2024年3月30日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class ListFor {
    public static void main(String[] args) {
        //案例：List三种遍历方式
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //遍历
        //1. 迭代器
        System.out.println("1. 迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

        //2. 增强 for
        System.out.println("2. 增强 for");
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println();

        //3. 普通 for
        System.out.println("3. 普通 for");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
