package com.dnx.static_;
//DNX写于2024年2月3日

public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量count，统计有多少小孩加入了游戏。
        int count = 0;

        Child child1 = new Child("小明");
        child1.join();
        //count++;
        child1.count++;

        Child child2 = new Child("小李");
        child2.join();
        //count++;
        child2.count++;

        Child child3 = new Child("小张");
        child3.join();
        //count++;
        child3.count++;

        //类变量可以通过类名来访问。
        System.out.println("共有" + Child.count + "个小孩加入了游戏。");

        System.out.println("child1.count = " + child1.count); // 3
        System.out.println("child2.count = " + child2.count); // 3
        System.out.println("child3.count = " + child3.count); // 3
    }
}

class Child {
    private String name;
    //定义一个类变量(静态变量) count
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏。");
    }
}
