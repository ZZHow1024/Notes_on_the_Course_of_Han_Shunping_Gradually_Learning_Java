package com.zzhow.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024年3月27日
 *
 * @author ZZHow1024
 */
@SuppressWarnings("all")
public class CollectionMethod {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        //1. add：添加单个元素
        System.out.println("1. add方法演示");
        list1.add("Hello");
        list1.add("World");
        list1.add("World");
        list1.add("World");
        list1.add(100);
        System.out.println("list1 = " + list1 + "\n");

        //2. remove：删除指定元素
        System.out.println("2. remove方法演示");
        list1.remove(0); //删除第一个元素，返回值类型：E
        list1.remove("World"); //删除一个对应元素，返回值类型：boolean
        System.out.println("list1 = " + list1 + "\n");

        //3. contains：查找元素是否存在
        System.out.println("3. contains方法演示");
        System.out.println("list1.contains(100) = " + list1.contains(100) + "\n");


        //4. size：获取元素个数
        System.out.println("4. size方法演示");
        System.out.println("list1.size() = " + list1.size() + "\n");

        //5. isEmpty：判断是否为空
        System.out.println("5. isEmpty方法演示");
        System.out.println("list1.isEmpty() = " + list1.isEmpty() + "\n");

        //6. clear：清空
        System.out.println("6. clear方法演示");
        list1.clear();
        System.out.println("list1 = " + list1 + "\n");

        //7. addAll：添加多个元素
        System.out.println("7. addAll方法演示");
        List list2 = new ArrayList();
        list2.add("abc");
        list2.add("xyz");
        list1.addAll(list2);
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1 + "\n");

        //8. containsAll：查找多个元素是否都存在
        System.out.println("8. containsAll方法演示");
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2) + "\n");

        //9. removeAll：删除多个元素
        System.out.println("9. removeAll方法演示");
        list1.removeAll(list2);
        System.out.println("list1 = " + list1);
    }
}
