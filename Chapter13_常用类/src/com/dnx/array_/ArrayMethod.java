package com.dnx.array_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2024年3月8日
 *
 * @author DNX
 */
public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{9, 7, 5, 3, 1};

        //1. Arrays 类的 toString 方法演示
        System.out.println("1. Arrays.toString()方法演示");
        for(int i = 0; i < integers.length; i++)
            System.out.print(integers[i] + " ");
        System.out.println();

        System.out.println(Arrays.toString(integers) + "\n");

        //2. Arrays 类的 sort 方法演示
        System.out.println("2. Arrays 类的 sort 方法演示");
        System.out.println("===排序前===");
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(integers));
        System.out.println("===定制排序_正序排序后===");
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
