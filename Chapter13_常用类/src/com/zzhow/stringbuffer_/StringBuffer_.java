package com.zzhow.stringbuffer_;

/**
 * 0475_StringBuffer转换
 * 2024年2月25日
 *
 * @author ZZHow
 */
public class StringBuffer_ {
    public static void main(String[] args) {
        //构造器的使用演示
        //1. 创建一个大小为16的 char[]，用于存放字符内容。
        StringBuffer stringBuffer1 = new StringBuffer();

        //2. 通过构造器指定 char[] 大小
        StringBuffer stringBuffer2 = new StringBuffer(100);

        //3. 通过给一个 String 创建 StringBuffer，
        // char[] 大小就是 str.length() + 16。
        StringBuffer stringBuffer3 = new StringBuffer("Hello");
    }
}
