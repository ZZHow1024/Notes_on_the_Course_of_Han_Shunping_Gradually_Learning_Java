package com.dnx.list_;

/**
 * 2024年4月4日
 *
 * @author DNX
 */
public class LinkedList_ {
    public static void main(String[] args) {
        //案例：模拟简单的双向链表
        Node aaa = new Node("aaa");
        Node bbb = new Node("bbb");
        Node ccc = new Node("ccc");

        //连接三个结点，形成双链表
        // aaa -> bbb -> ccc
        aaa.next = bbb;
        bbb.next = ccc;
        // ccc -> bbb -> aaa
        ccc.pre = bbb;
        bbb.pre = aaa;

        //让 first 引用指向 aaa，是双向链表的头结点
        Node first = aaa;
        //让 last 引用指向 ccc，是双向链表的尾结点
        Node last = ccc;

        //从头到尾遍历双链表
        System.out.println("从头到尾遍历双链表：");
        while (first != null) {
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
        System.out.println();
        //从尾到头遍历双链表
        System.out.println("从尾到头遍历双链表：");
        while (last != null) {
            //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }
        System.out.println();

        //链表插入数据
        //在 bbb 和 ccc 之间插入 sss
        //1. 创建一个 Node 结点，name 是 sss
        Node sss = new Node("sss");

        //2. 把 sss 加入到双链表中
        sss.next = ccc;
        sss.pre = bbb;
        bbb.next = sss;
        ccc.pre = sss;

        //3. 重置 first 和 last
        first = aaa; //让 first 重新指向 aaa
        last = ccc; // 让 last 重新指向 ccc

        //从头到尾遍历双链表
        System.out.println("插入 sss 后从头到尾遍历双链表：");
        while (first != null) {
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
        System.out.println();
        //从尾到头遍历双链表
        System.out.println("插入 sss 后从尾到头遍历双链表：");
        while (last != null) {
            //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

/**
 * 定义一个 Node 类，Node对象
 * 表示双向链表的一个结点
 *
 * @author DNX
 */
class Node {
    public Object item; //数据域
    public Node next; //指针域_指向下一个结点
    public Node pre; //指针域_指向下一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
