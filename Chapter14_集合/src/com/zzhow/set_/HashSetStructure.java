package com.zzhow.set_;

import java.util.Arrays;

/**
 * 2024年4月9日
 *
 * @author DNX
 */
public class HashSetStructure {
    public static void main(String[] args) {
        //案例：模拟一个 HashSet 的底层(HashMap 的底层结构)

        //1. 创建一个数组，数组的类型是 Node[]
        // Node[]数组 成为表 table(表)
        Node[] table = new Node[16];
        System.out.println("table = " + Arrays.toString(table));

        //2. 创建结点
        Node aaa = new Node("aaa", null);
        table[0] = aaa;

        Node bbb = new Node("bbb", null);
        aaa.next = bbb; //将 bbb 结点挂在到 aaa 结点

        Node ccc = new Node("ccc", null);
        bbb.next = ccc; //将 ccc 结点挂载到 bbb 结点

        Node ddd = new Node("ddd", null);
        table[3] = ddd; //把 ddd 放到 table 表的索引为 3 的位置

        System.out.println("table = " + Arrays.toString(table));
    }
}

class Node { //结点：存储数据，可以指向下一个结点，从而形成链表
    Object item; //存放数据
    Node next; //指向下一个结点

    public Node() {
    }

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
