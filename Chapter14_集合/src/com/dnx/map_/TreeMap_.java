package com.dnx.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 2024年4月18日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class TreeMap_ {
    public static void main(String[] args) {
        //案例：按字符串字典序(倒序)排序 和 按字符串长度(从长到短)排序
        //treeMap1 按字符串字典序(倒序)排序
        System.out.println("treeMap1 按字符串字典序(倒序)排序");
        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });

        treeMap1.put("ccc", "3");
        treeMap1.put("ccc", "No"); //字符串一样，发生替换
        treeMap1.put("aaa", "1");
        treeMap1.put("aaa", "No"); //字符串一样，发生替换
        treeMap1.put("bbb", "2");

        System.out.println("treeMap1 = " + treeMap1 + "\n");

        //treeMap2 按字符串长度(从短到长)排序
        System.out.println("treeMap2 按字符串长度(从长到短)排序");
        TreeMap treeMap2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });

        treeMap2.put("ttt", "3");
        treeMap2.put("aaa", "No"); //长度一样，发生替换
        treeMap2.put("t", "1");
        treeMap2.put("a", "No"); //长度一样，发生替换
        treeMap2.put("tt", "2");

        System.out.println("treeMap2 = " + treeMap2);
    }
}
