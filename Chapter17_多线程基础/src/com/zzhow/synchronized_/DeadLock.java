package com.zzhow.synchronized_;

/**
 * 2024年5月2日
 *
 * @author ZZHow
 * 模拟线程死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        DeadLockThread threadA = new DeadLockThread(true);
        DeadLockThread threadB = new DeadLockThread(false);

        threadA.setName("threadA");
        threadB.setName("threadB");

        threadA.start();
        threadB.start();
    }
}

class DeadLockThread extends Thread {
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    private boolean flag;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入 1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入 2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入 3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入 4");
                }
            }
        }
    }
}
