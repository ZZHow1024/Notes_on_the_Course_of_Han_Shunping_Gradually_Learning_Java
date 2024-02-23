package com.dnx.annotation_;

import java.util.ArrayList;

/**
 * 0434_SuppressWarnings注解
 * 2024年2月11日
 *
 * @author DNX
 */
public class SuppressWarnings_ {
    //提示：
    //1. 当我们不希望看到这些警告的时候，
    // 可以使用 SuppressWarnings 注解来抑制警告信息
    //2. 在{""}中，可以写入希望抑制(不显示)警告信息
    //3. SuppressWarnings 的作用范围是与放置的位置相关
    //比如：@SuppressWarnings 放置在main方法，
    // 那么抑制警告的范围就是main

    //看源码：
    //1. 放置的位置就是 TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR,LOCAL_VARIABLE
    //2. 该注解类有数组 String[] values() 设置一个数组比如 {"rawtypes","unchecked","unused"}
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Tom");
        list.add("Mary");
        int i;
        System.out.println(list.get(1));
    }

    public void f1(){
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Tom");
        list.add("Mary");
        int i;
        System.out.println(list.get(1));
    }
}
