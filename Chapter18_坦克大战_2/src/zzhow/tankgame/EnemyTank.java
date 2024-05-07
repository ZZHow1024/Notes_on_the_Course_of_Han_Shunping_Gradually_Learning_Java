package zzhow.tankgame;

import java.util.Random;
import java.util.Vector;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    public static final int TYPE = 1;
    private final Vector<Bullet> bullets = new Vector<>();
    private boolean isLive = true;

    public EnemyTank() {
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public EnemyTank(int x, int y, int direction, int speed) {
        super(x, y, direction, speed);
    }

    public Vector<Bullet> getBullets() {
        return bullets;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void run() {
        while (isLive) {
            //随机改变坦克方向 0、1、2、3
            Random random = new Random();
            setDirection(random.nextInt(4));

            //根据坦克的方向继续移动 30 步
            for (int i = 0; i < 30; i++) {
                switch (getDirection()) {
                    case MyPanel.UPWARD -> moveUp();
                    case MyPanel.DOWNWARD -> moveDown();
                    case MyPanel.LEFT -> moveLeft();
                    case MyPanel.RIGHT -> moveRight();
                }
                try {
                    Thread.sleep(32);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
