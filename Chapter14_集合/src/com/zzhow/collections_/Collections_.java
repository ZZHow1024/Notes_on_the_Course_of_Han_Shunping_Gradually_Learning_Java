package com.zzhow.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 2024年4月19日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bb");
        list.add("c");
        list.add("dddd");
        list.add("eeeee");

        //一、排序操作方法
        System.out.println("一、排序操作方法");
        //1. void reverse(List)：反转 List 中元素的顺序
        System.out.println("1. reverse 方法演示");
        System.out.println("反转前 list = " + list);
        Collections.reverse(list);
        System.out.println("反转后 list = " + list + "\n");

        //2. void shuffle(List)：对 List 集合元素进行随机排序
        System.out.println("2. shuffle 方法演示");
        System.out.println("随机排序前 list = " + list);
        Collections.shuffle(list);
        System.out.println("随机排序后 list = " + list + "\n");

        //3. void sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        System.out.println("3. sort 方法演示");
        System.out.println("排序前 list = " + list);
        Collections.sort(list);
        System.out.println("排序后 list = " + list + "\n");

        //4. void sort(List, Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        System.out.println("4. sort 方法(指定 Comparator)演示");
        System.out.println("排序前 list = " + list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String)
                    return ((String)o1).length() - ((String)o2).length();
                else
                    return 0;
            }
        });
        System.out.println("排序后 list = " + list + "\n");

        //5. void swap(List, int, int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
        System.out.println("5. swap 方法演示");
        System.out.println("替换前 list = " + list);
        Collections.swap(list, 1, 3);
        System.out.println("替换后 list = " + list + "\n");

        //二、查找、替换操作方法
        System.out.println("二、查找、替换操作方法");
        //1. Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("1. max 方法演示");
        System.out.println("Collections.max(list) = " + Collections.max(list) + "\n");

        //2. Object max(Collection, Comparator)：根据 Comparator 指定的顺序返回给定集合中的最大元素
        System.out.println("2. max 方法(指定 Comparator)演示");
        System.out.println("返回字符串长度最长的元素" +
                Collections.max(list,new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    if (o1 instanceof String && o2 instanceof String)
                        return ((String)o1).length() - ((String)o2).length();
                    else
                        return 0;
                }
        }) + "\n");

        //3. Object min(Collection)：根据元素的自然顺序，返回给定集合中的最小元素
        System.out.println("3. min 方法演示");
        System.out.println("Collections.min(list) = " + Collections.min(list) + "\n");

        //4. Object min(Collection, Comparator)：根据 Comparator 指定的顺序返回给定集合中的最小元素
        System.out.println("4. min 方法(指定 Comparator)演示");
        System.out.println("返回字符串长度最短的元素" +
                Collections.min(list,new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        if (o1 instanceof String && o2 instanceof String)
                            return ((String)o1).length() - ((String)o2).length();
                        else
                            return 0;
                    }
                }) + "\n");

        //5. int frequency(Collection, Object)：返回指定集合中指定元素的出现次数
        System.out.println("5. frequency 方法演示");
        System.out.println("Collections.frequency(list, \"aaa\") = " + Collections.frequency(list, "aaa") + "\n");

        //6. void copy(List dest, List src)：将 src 中的内容复制到 dest 中
        System.out.println("6. copy 方法演示");
        List dest = new ArrayList();
        //Collections.copy(dest, list); //抛出 IndexOutOfBoundsException
        for (int i = 0; i < list.size(); i++) {
            dest.add(i);
        }
        Collections.copy(dest, list);
        System.out.println("list(src) = " + list);
        System.out.println("dest = " + dest + "\n");

        //7. boolean replaceAll(List list, Object oldVal, Object newVal)：使用新值替换 List 对象的所有旧值
        System.out.println("7. replaceAll");
        Collections.replaceAll(list, "aaa", "AAA");
        System.out.println("替换后 list = " + list);
    }
}
