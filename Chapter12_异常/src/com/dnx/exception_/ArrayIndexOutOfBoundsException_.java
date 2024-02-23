package com.dnx.exception_;

/**
 * 0446_五大运行时异常
 * ArrayIndexOutOfBoundsException数组下标越界异常
 * 2024年2月13日
 *
 * @author DNX
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
