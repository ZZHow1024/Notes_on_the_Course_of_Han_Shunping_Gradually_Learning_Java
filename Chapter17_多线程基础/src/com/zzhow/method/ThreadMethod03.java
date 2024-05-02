package com.zzhow.method;

/**
 * 2024年5月2日
 *
 * @author ZZHow
 * 守护线程演示
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        DeamonThread deamonThread = new DeamonThread();
        //希望当主线程结束时，子线程可以自动退出
        //只需要将子线程设为守护线程即可
        deamonThread.setDaemon(true);
        deamonThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在运行 " + (i + 1));
            Thread.sleep(1000);
        }
    }
}

class DeamonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("守护线程正在运行");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
