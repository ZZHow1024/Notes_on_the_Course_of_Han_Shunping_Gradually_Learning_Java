package com.zzhow.exit_;

/**
 * 2024年5月1日
 *
 * @author ZZHow
 */
public class ThreadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();

        //3 秒后停止线程 T
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //通过修改 loop 使线程 T 终止
        t.setLoop(false);
    }
}

class T extends Thread {
    private int count = 0;
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println("T 线程运行中" + (++count));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
