package com.zzhow.stringbuffer_;

/**
 * 0476_StringBuffer方法
 * 2024年2月25日
 *
 * @author ZZHow
 */
public class StringBufferMethod {
    public static void main(String[] args) {

        //StringBuffer方法演示
        StringBuffer s = new StringBuffer("hello");

        //增
        System.out.println("增加前，s = " + s);
        s.append(','); //"hello,"
        s.append("aa"); //"hello,aa"
        s.append("bb").append(100).append(true).append(1.23);
        //"hello,aabb100true1.23"
        System.out.println("增加后，s = " + s);
        System.out.println();

        //删
        //删除索引 >= start && < end 处的字符
        System.out.println("删除前，s = " + s);
        s.delete(6, 10);
        System.out.println("删除后，s = " + s);
        System.out.println();

        //改
        System.out.println("替换前，s = " + s);
        s.replace(6, 9, "abcd");
        System.out.println("替换后，s = " + s);
        System.out.println();

        //插
        //在索引为6的内容插入"xyz"
        System.out.println("插入前，s = " + s);
        s.insert(6, "xyz");
        System.out.println("插入后，s = " + s);
        //helloxyz,abcdtrue1.23
    }
}
