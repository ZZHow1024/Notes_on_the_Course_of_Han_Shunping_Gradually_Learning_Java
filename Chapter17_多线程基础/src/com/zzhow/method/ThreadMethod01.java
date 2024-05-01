package com.zzhow.method;

/**
 * 2024年5月1日
 *
 * @author ZZHow
 * Thread 常用方法第一组
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        T t = new T();
        t.setName("ZZhow"); //setName() 设置线程名称，使之与参数 name 相同
        System.out.println("线程的名字是 " + t.getName()); //getName() 返回该线程的名称
        t.setPriority(Thread.MIN_PRIORITY); //setPriority() 更改线程的优先级
        System.out.println(t.getName() + " 线程的优先级是 " + t.getPriority()); //getPriority() 获取线程的优先级
        t.start(); //start() 使该线程开始执行；Java 虚拟机底层调用该线程的 start0() 方法

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++)
            System.out.println("hi" + (i + 1));

        t.interrupt(); //interrupt() 中断线程
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "线程 " + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "线程休眠中");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
            }
        }
    }
}
