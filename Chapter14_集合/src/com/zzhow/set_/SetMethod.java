package com.zzhow.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 2024年4月5日
 *
 * @author ZZHow1024
 */
@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        //案例：Set 接口的方法
        //以 HashSet 为例
        Set set = new HashSet();
        set.add("Tom");
        set.add("Jerry");
        set.add("Jerry"); //重复
        set.add("Spike");
        set.add(null);
        set.add(null); //重复

        System.out.println("set = " + set);

        //遍历：
        //方式1 迭代器
        System.out.println("遍历方式1 迭代器");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

        //方式2 增强 for 循环
        System.out.println("遍历方式2 增强 for 循环");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
