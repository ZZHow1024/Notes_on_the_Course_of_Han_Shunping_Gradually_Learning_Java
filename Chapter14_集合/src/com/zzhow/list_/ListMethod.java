package com.zzhow.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024年3月30日
 *
 * @author ZZHow1024
 */
@SuppressWarnings("all")
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Python");
        list.add("C++");
        System.out.println("list = " + list + "\n");

        //1. add：在 index 位置插入 ele 元素
        System.out.println("1. add 方法演示");
        list.add(0, "Java");
        System.out.println("list = " + list + "\n");

        //2. addAll：从 index 位置开始将 eles 中的所有元素添加进来
        System.out.println("2. addAll 方法演示");
        List newList = new ArrayList();
        newList.add("Java");
        newList.add("PHP");
        newList.add("Rust");
        list.addAll(2, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list + "\n");

        //3. get：获取指定 index 位置的元素
        System.out.println("3. get 方法演示");
        System.out.println("list 中第3个元素是" + list.get(2) + "\n");

        //4. indexOf：返回 obj 在集合中首次出现的位置
        System.out.println("4. indexOf 方法演示");
        System.out.println("list 中 \"Java\" 首次出现的位置(索引)为" + list.indexOf("Java") + "\n");

        //5. lastIndexOf：返回 obj 在当前集合中末次出现的位置
        System.out.println("5. lastIndexOf 方法演示");
        System.out.println("list 中 \"Java\" 末次出现的位置(索引)为" + list.lastIndexOf("Java") + "\n");

        //6. remove：移除指定 index 位置的元素，并返回此元素
        System.out.println("6. remove 方法演示");
        list.remove(1);
        System.out.println("list = " + list + "\n");

        //7. set：设置指定 index 位置的元素为 ele 相当于是替换
        System.out.println("7. set 方法演示");
        list.set(1, "Python");
        System.out.println("list = " + list + "\n");

        //8. subList：返回从 fromlndex 到 tolndex 位置的子集合
        System.out.println("8. subList 方法演示");
        List returnList = list.subList(2, 5);
        System.out.println("returnList = " + returnList);
    }
}
