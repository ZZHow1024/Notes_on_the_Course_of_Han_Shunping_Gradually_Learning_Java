package com.dnx.array_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2024年3月12日
 *
 * @author DNX
 */
public class ArraySortCustom {
    public static void main(String[] args) {
        //案例：模拟排序
        System.out.println("1. 冒泡排序演示");
        int[] arr = {1, -1, 0, 45, 78, 34, 56};
        System.out.println("===排序前===");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("2. 冒泡定制排序演示");
        int[] arr1 = {1, -1, 0, 45, 78, 34, 56};
        System.out.println("===排序前===");
        System.out.println(Arrays.toString(arr1));
        bubbleSortCus(arr1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;

                //改变这里 return 的值可以实现不同的排序法则
                //return i1 - i2; //从小到大排序
                return i2 - i1;
            }
        });
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr1));
    }

    //冒泡排序方法
    public static void bubbleSort(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
    }

    //结合冒泡 + 定制
    public static void bubbleSortCus(int[] arr, Comparator c){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                //数组的排序方法由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
    }
}
