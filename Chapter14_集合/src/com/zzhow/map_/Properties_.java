package com.zzhow.map_;

import java.util.Properties;

/**
 * 2024年4月18日
 *
 * @author ZZHow1024
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();

        //增加
        System.out.println("1. put 方法(增加)演示：");
        //properties.put(null, 0); //抛出 NullPointerException
        //properties.put("zero", null); //抛出 NullPointerException
        properties.put("One", 1);
        properties.put("Two", 2);
        properties.put("Three", 3);
        properties.put("Three", "Ⅲ"); //"Ⅲ" 替换了 3
        System.out.println("properties = " + properties + "\n");

        //通过 key 获取对应值
        System.out.println("2. get 方法(查找)演示：");
        System.out.println("Three = " + properties.get("Three") + "\n");

        //删除
        System.out.println("3. remove 方法(删除)演示：");
        properties.remove("Two");
        System.out.println("properties = " + properties + "\n");

        //修改(还是 put 方法)
        System.out.println("4. put 方法(修改)演示：");
        properties.put("One", "Ⅰ");
        System.out.println("properties = " + properties + "\n");

        //查
        System.out.println("5. getProperty 方法(查找)演示：");
        System.out.println("properties.getProperty(\"One\") = " + properties.getProperty("One"));
        System.out.println("注意：getProperty 方法只能传入 String 类型数据，返回 String 类型数据");
    }
}
