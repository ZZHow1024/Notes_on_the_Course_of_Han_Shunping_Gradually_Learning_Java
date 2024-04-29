package com.zzhow.threaduse;

/**
 * 2024年4月29日
 *
 * @author ZZHow
 * 演示通过继承 Thread 类创建线程
 */
public class Thread01 {
    public static void main(String[] args) {
        Human human = new Human();
        human.start();

        int count = 0;
        while (true) {
            System.out.println("main Hello " + (++count) + " " + Thread.currentThread().getName());
            if (count == 20)
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Human extends Thread {
    private int count = 0;

    public Human() {
    }

    //1. 当一个类继承了 Thread 类，该类就可以当作线程使用
    //2. 我们会重写 run 方法，写上自己的业务代码
    //3. run Thread 类 实现了 Runnable 接口的 run 方法
    @Override
    public void run() {
        while (true) {
            System.out.println("Human Hello " + (++count) + " " + Thread.currentThread().getName());
            if (count == 30)
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
