package com.zzhow.ticket;

/**
 * 2024年4月30日
 *
 * @author ZZHow
 * 使用多线程，模拟三个窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01a = new SellTicket01("窗口1");
        SellTicket01 sellTicket01b = new SellTicket01("窗口1");
        SellTicket01 sellTicket01c = new SellTicket01("窗口1");

        sellTicket01a.start();
        sellTicket01b.start();
        sellTicket01c.start();
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
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
