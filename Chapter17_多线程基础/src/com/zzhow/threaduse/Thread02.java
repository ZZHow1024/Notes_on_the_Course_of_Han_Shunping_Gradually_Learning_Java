package com.zzhow.threaduse;

/**
 * 2024年4月29日
 *
 * @author ZZHow
 * 演示通过实现 Thread 类创建线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Person person = new Person();

        //person.start(); 这里不能调用 start 方法
        //创建了 Thread 对象，把 Person 对象(实现 Runnable)，放入 Thread
        Thread thread = new Thread(person);
        thread.start();
    }
}

class Person implements Runnable {
    private int count = 0;

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
