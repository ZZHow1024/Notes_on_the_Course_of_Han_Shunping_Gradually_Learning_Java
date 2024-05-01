package com.zzhow.method;

/**
 * 2024年5月1日
 *
 * @author ZZHow
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main 线程 " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i == 5) {
                System.out.println("现在让 " + t2.getName() + " 线程插队");
                //Thread.yield(); //yield() 线程的礼让。让出 CPU，让其他线程执行，但礼让的时间不确定，所以也不一定礼让成功
                t2.join(); //join()线程的插队。插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务
                System.out.println(t2.getName() + " 线程执行完毕 " + Thread.currentThread().getName() + " 线程继续执行");
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
