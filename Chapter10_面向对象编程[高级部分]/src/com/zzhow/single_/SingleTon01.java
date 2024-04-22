package com.zzhow.single_;

/**
 * 演示饿汉式单例模式
 * 2024年2月5日
 * @author ZZHow
 */

public class SingleTon01 {
    public static void main(String[] args) {
        //BoyFriend a = new BoyFriend("a");
        //BoyFriend b = new BoyFriend("b");

        System.out.println(BoyFriend.n1);
        //此时bf对象就已经被创建了

        //通过方法可以获取对象
        BoyFriend instance1 = BoyFriend.getInstance();
        System.out.println(instance1);
        BoyFriend instance2 = BoyFriend.getInstance();
        System.out.println(instance2);
        //instance1和instance2这两个对象是一样的
    }
}

//有一个类，GirlFriend
//只能有一个GirlFriend
class BoyFriend {
    private String name;
    //为了能够在静态方法中返回bf对象，需要将其修饰为static
    private static BoyFriend bf = new BoyFriend("c");
    public static int n1 = 100;

    /*
    如何保证只能创建一个BoyFriend
    单例模式-饿汉式
    1. 将构造器私有化
    2. 在类的内部直接创建
    3. 提供一个公共的static方法，返回对象
     */
    private BoyFriend(String name) {
        this.name = name;
    }

    public static BoyFriend getInstance() {
        return bf;
    }
}
