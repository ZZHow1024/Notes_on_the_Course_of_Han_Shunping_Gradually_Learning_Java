package com.dnx.map_;

import java.util.*;

/**
 * 2024年4月17日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("0", null);
        map.put(null, null);
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        //第一组：先取出所有 key，再通过 key 取出对应的 value
        System.out.println("第一组：先取出所有 key，再通过 key 取出对应的 value");
        Set set = map.keySet();
        //  (1) 增强 for
        System.out.println("(1) 增强 for 遍历");
        for (Object key : set) {
            System.out.println(key + " - " + map.get(key));
        }
        // (2) 迭代器遍历
        System.out.println("(2) 迭代器遍历");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next + " - " + map.get(next));
        }
        System.out.println();

        //第二组：把所有的 values 取出
        System.out.println("第二组：把所有的 values 取出");
        Collection values = map.values();
        //  (1) 增强 for
        System.out.println("(1) 增强 for 遍历");
        for (Object value : values) {
            System.out.println("value:" + value);
        }
        // (2) 迭代器遍历
        System.out.println("(2) 迭代器遍历");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println("value:" + next);
        }
        System.out.println();

        //第三组：通过 EntrySet 来获取 k-v
        System.out.println("第三组：通过 EntrySet 来获取 k-v");
        Set entrySet = map.entrySet(); //EntrySet<Map.Entry<K,V>>
        //  (1) 增强 for
        System.out.println("(1) 增强 for 遍历");
        for (Object entry : entrySet) {
            // 将 entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
        // (2) 迭代器遍历
        System.out.println("(2) 迭代器遍历");
        Iterator iterator3 = entrySet.iterator();
        while(iterator3.hasNext()){
            Object next = iterator3.next();
            // HashMap$Node --实现了--> Map.Entry接口 (有 getKey 与 getValue 方法)
            // 向下转型 Map.Entry
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
