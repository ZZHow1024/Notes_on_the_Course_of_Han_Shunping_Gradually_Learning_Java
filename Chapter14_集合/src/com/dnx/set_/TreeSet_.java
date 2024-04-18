package com.dnx.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 2024年4月18日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class TreeSet_ {
    public static void main(String[] args) {
        //案例：按字符串字典序(正序)排序 和 按字符串长度(从短到长)排序
        //treeSet1 按字符串字典序(正序)排序
        System.out.println("treeSet1 按字符串字典序(正序)排序");
        TreeSet treeSet1 = new TreeSet(new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });

        treeSet1.add("Camera");
        treeSet1.add("Alfa");
        treeSet1.add("Banana");
        treeSet1.add("Cinema");
        treeSet1.add("Dog");

        System.out.println("treeSet1 = " + treeSet1 + "\n");

        //treeSet2 按字符串长度(从短到长)排序
        System.out.println("treeSet2 按字符串长度(从短到长)排序");
        TreeSet treeSet2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet2.add("abc");
        treeSet2.add("def"); //长度一样，加不进去
        treeSet2.add("a");
        treeSet2.add("abcde");
        treeSet2.add("vwxyz"); //长度一样，加不进去

        System.out.println("treeSet2 = " + treeSet2);
    }
}
