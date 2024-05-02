package com.zzhow.method;

/**
 * 2024年5月2日
 *
 * @author ZZHow
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new T3());

        for (int i = 0; i < 10; i++) {
            System.out.println("hi " + (i + 1));
            Thread.sleep(500);
            if (i + 1 == 5) {
                t3.start();
                t3.join();
            }
        }
    }
}

class T3 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello " + (++count));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}
