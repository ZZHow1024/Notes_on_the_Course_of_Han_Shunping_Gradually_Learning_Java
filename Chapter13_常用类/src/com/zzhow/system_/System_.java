package com.zzhow.system_;

import java.util.Arrays;

/**
 * 2024年3月17日
 *
 * @author ZZHow
 */
public class System_ {
    public static void main(String[] args) {
        //1. exit 退出当前程序
        System.out.println("1. exit 方法演示");
        System.out.println("程序开始执行");
        //提示：
        // 1.exit(0) 表示程序退出
        // 2.0 表示一个状态，表示正常退出。
        //System.exit(0);
        System.out.println("ok" + "\n");

        //2. arrayCopy 复制数组元素
        System.out.println("2. arrayCopy 方法演示");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3]; //arr2 当前是{0, 0, 0}
        //参数解读：
        // src：源数组
        // srcPos：从源数组的哪个索引位置开始拷贝
        // dest：目标数组
        // destPos：把源数组的数据拷贝到目标数组的哪个索引
        // length：从源数组拷贝多少个数据到目标数组
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("arr2 = " + Arrays.toString(arr2) + "\n");

        //3. currentTimeMillis：返回当前时间距离1970-1-1的毫秒数
        System.out.println("3. currentTimeMillis 方法演示");
        System.out.println(System.currentTimeMillis() + "\n");

        //4. gc 运行垃圾回收机制
        System.out.println("4. gc 方法演示");
        System.gc();
    }

}
