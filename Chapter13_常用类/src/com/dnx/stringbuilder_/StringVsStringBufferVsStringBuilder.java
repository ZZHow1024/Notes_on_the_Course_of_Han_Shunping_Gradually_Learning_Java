package com.dnx.stringbuilder_;

/**
 * 0479_StringBuilder应用
 * 2024年2月25日
 *
 * @author 韩顺平
 * @version 1.0
 */
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间：" + (endTime - startTime));
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuilder 拼接 20000 次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间：" + (endTime - startTime));
        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间：" + (endTime - startTime));
    }
}