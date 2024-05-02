package com.zzhow.synchronized_;

/**
 * 2024年5月2日
 *
 * @author ZZHow
 * 使用线程同步机制解决门票超售问题
 */
public class SellTicketSynchronized {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();

        new Thread(sellTicket03).start(); //第一个线程
        new Thread(sellTicket03).start(); //第二个线程
        new Thread(sellTicket03).start(); //第三个线程
    }
}

class SellTicket03 implements Runnable {
    private boolean loop = true;
    private static int ticketNum = 50;

    public synchronized void sellTicket() {
        if (ticketNum <= 0) {
            System.out.println("售票结束！");
            loop = false;
            return;
        }

        System.out.println(Thread.currentThread().getName() + "售出一张票，剩余 " + (--ticketNum) + "张票");
    }

    @Override
    public void run() {
        while (loop) {
            sellTicket();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
