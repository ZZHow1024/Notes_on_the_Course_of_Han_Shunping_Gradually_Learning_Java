package com.zzhow.stringbuffer_;

/**
 * 0475_StringBuffer转换
 * 2024年2月25日
 *
 * @author ZZHow
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String ---> StringBuffer 演示
        System.out.println("String ---> StringBuffer 演示");
        String str = "abc";
        System.out.println("str = " + str);

        //方式1 使用构造器
        //注意： 返回的才是StringBuffer对象，对str本身没有影响。
        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println("stringBuffer1 = " + stringBuffer1);

        //方式2 使用append方法
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2 = stringBuffer2.append(str);
        System.out.println("stringBuffer2 = " + stringBuffer2);


        //StringBuffer ---> String 演示
        System.out.println("\nStringBuffer ---> String 演示");
        StringBuffer stringBuffer = new StringBuffer("ijk");
        System.out.println("stringBuffer = " + stringBuffer);

        //方式1 使用StringBuffer提供的 toString方法
        String str1 = stringBuffer.toString();
        System.out.println("str1 = " + str1);

        //方式2 使用构造器
        String str2 = new String(stringBuffer);
        System.out.println("str2 = " + str2);
    }
}
