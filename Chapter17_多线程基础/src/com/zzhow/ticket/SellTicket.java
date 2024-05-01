package com.zzhow.ticket;

/**
 * 2024年4月30日
 *
 * @author ZZHow
 * 使用多线程，模拟三个窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {
        //使用继承 Thread 类的方式
        SellTicket01 sellTicket01a = new SellTicket01("窗口1");
        SellTicket01 sellTicket01b = new SellTicket01("窗口2");
        SellTicket01 sellTicket01c = new SellTicket01("窗口3");

        sellTicket01a.start(); //第一个线程
        sellTicket01b.start(); //第二个线程
        sellTicket01c.start(); //第三个线程

        //实现 Runnable 接口的方式
        SellTicket02 sellTicket02 = new SellTicket02();

        new Thread(sellTicket02).start(); //第一个线程
        new Thread(sellTicket02).start(); //第二个线程
        new Thread(sellTicket02).start(); //第三个线程
    }
}

class SellTicket01 extends Thread {
    private String name;
    private static int ticketNum = 50;

    public SellTicket01(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束！");
                break;
            }
            System.out.println(name + "售出一张票，剩余 " + (--ticketNum) + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SellTicket02 implements Runnable {
    private static int ticketNum = 50;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束！");
                break;
            }
            System.out.println("窗口售出一张票，剩余 " + (--ticketNum) + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
