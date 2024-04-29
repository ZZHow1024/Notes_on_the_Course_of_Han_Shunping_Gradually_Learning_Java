package com.zzhow.threaduse;

/**
 * 2024年4月29日
 *
 * @author ZZHow
 * 演示 main 线程启动两个子线程
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        //启动两个线程
        thread1.start();
        thread2.start();
    }
}

class T1 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello, world " + (++count) + " " + Thread.currentThread().getName());
            if (count == 10)
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T2 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi " + (++count) + " " + Thread.currentThread().getName());
            if (count == 5)
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
