package com.zzhow.array_;

import java.util.Arrays;
import java.util.List;

/**
 * 2024年3月12日
 *
 * @author ZZHow
 */
public class ArrayMethod02 {
    public static void main(String[] args) {
        //案例：二分搜索法查找
        Integer[] arr = {1, 3, 5, 7, 9};

        //1. binarySearch 通过二分搜索法进行查找，要求必须排好序
        //提示：
        //1. 使用 binarySearch 二叉查找
        //2. 要求该数组是有序的，如果该数组是无序的，不能使用binarySearch
        //3. 如果数组不存在该元素，就返回 -(low + 1); // key not found
        System.out.println("1. binarySearch 方法演示");

        int index = Arrays.binarySearch(arr, 3);
        System.out.println("index = " + index);
        System.out.println();

        //2. copyOf 数组元素的复制
        //提示：
        //1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr数组中
        //2. 如果拷贝长度
        System.out.println("2. copyOf 方法演示");

        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("===拷贝执行完毕后===");
        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println();

        //3. fill 数组元素的填充
        System.out.println("3. fill 方法演示");

        Integer[] num = new Integer[]{5, 3, 1};
        //提示：
        //使用 99 去填充 num 数组，可以理解成是替换原来的元素。
        Arrays.fill(num, 99);
        System.out.println("===num 数组填充后===");
        System.out.println(Arrays.toString(num));
        System.out.println();

        //4. equals 比较两个数组元素内容是否完全一致
        System.out.println("4. equals 方法演示");

        Integer[] arr2 = {5, 3, 1};
        //提示：
        //1. 如果arr 和 arr2 数组的元素一样，则返回 true。
        //2. 如果不是完全一样，返回false。
        System.out.println(Arrays.equals(arr, arr2));
        System.out.println();

        //5. asList 将一组值，转换成list
        System.out.println("5. asList 方法演示");
        //提示：
        //1. asList方法，会将(2, 4, 6, 8, 10)数据转成一个List集合
        //2. 返回的 asList 编译类型是 List(接口)
        //3. asList 运行类型是 java.util.Arrays$ArrayList
        // java.util.Arrays$ArrayList 是 Arrays 类的
        // 静态内部类 private static class ArrayList<E> extends AbstractList<E>
        //        implements RandomAccess, java.io.Serializable
        List<Integer> asList = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("asList" + asList);
        System.out.println("asList的运行类型：" + asList.getClass());
    }
}
