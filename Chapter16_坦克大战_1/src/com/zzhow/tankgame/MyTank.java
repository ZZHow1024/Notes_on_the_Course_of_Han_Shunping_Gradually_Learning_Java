package com.zzhow.tankgame;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 我方坦克
 */
public class MyTank extends Tank {
    public static final int TYPE = 0;

    public MyTank() {
    }

    public MyTank(int x, int y) {
        super(x, y);
    }

    public MyTank(int x, int y, int direction, int speed) {
        super(x, y, direction, speed);
    }
}
