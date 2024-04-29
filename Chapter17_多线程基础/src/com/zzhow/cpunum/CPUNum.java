package com.zzhow.cpunum;

/**
 * 2024年4月29日
 *
 * @author ZZHow
 * 查看CPU核心数
 */
public class CPUNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("当前电脑的 CPU 核心数为 " + runtime.availableProcessors());
    }
}
