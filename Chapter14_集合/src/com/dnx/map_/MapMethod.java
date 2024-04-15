package com.dnx.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * 2024年4月15日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();

        //1. put：添加
        System.out.println("1. put 方法演示");
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("3", "Ⅲ"); //替换
        map.put("0", null);
        map.put(null, "0");

        System.out.println("map = " + map + "\n");

        //2. remove：根据键删除映射关系
        System.out.println("2. remove方法演示");
        map.remove("1");
        System.out.println("map = " + map + "\n");

        //3. get：根据键获取值
        System.out.println("3. get 方法演示");
        Object value = map.get("3");
        System.out.println("value = " + value + "\n");

        //4. size：获取元素个数
        System.out.println("4. size 方法演示");
        System.out.println("k-v对数 = " + map.size() + "\n");

        //5. isEmpty：判断个数是否为 0
        System.out.println("5. isEmpty 方法演示");
        System.out.println("map.isEmpty() = " + map.isEmpty() + "\n");

        //6. clear：清除
        System.out.println("6. clear 方法演示");
        map.clear();
        System.out.println("map = " + map + "\n");

        //7. containsKey：查找键是否存在
        System.out.println("7. containsKey 方法演示");
        System.out.println("map.containsKey(\"1\") = " + map.containsKey("1"));
    }
}
