package zzhow.tankgame;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    public static final int BULLET_NUMBER_MAX = 5;
    public static final int TYPE = 1;
    public static int currentBulletNumber = BULLET_NUMBER_MAX;
    //  private final Vector<Bullet> bullets = new Vector<>(); //弃用 Vector
    private final CopyOnWriteArrayList<Bullet> bullets = new CopyOnWriteArrayList<>();
    private boolean isLive = true;

    public EnemyTank() {
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public EnemyTank(int x, int y, int direction, int speed) {
        super(x, y, direction, speed);
    }

    public CopyOnWriteArrayList<Bullet> getBullets() {
        return bullets;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public void shootBullet() {
        if (EnemyTank.currentBulletNumber > 0) {
            //当前子弹数减 1
            --EnemyTank.currentBulletNumber;

            //创建 Bullet 对象
            Bullet bullet = switch (this.getDirection()) {
                case MyPanel.UPWARD -> new Bullet(this.getX() + 17, this.getY() - 3, this.getDirection());
                case MyPanel.DOWNWARD -> new Bullet(this.getX() + 17, this.getY() + 57, this.getDirection());
                case MyPanel.LEFT -> new Bullet(this.getX() - 3, this.getY() + 17, this.getDirection());
                case MyPanel.RIGHT -> new Bullet(this.getX() + 57, this.getY() + 17, this.getDirection());
                default -> null;
            };

            //启动子弹线程
            new Thread(bullet).start();
            //放入 CopyOnWriteArrayList 集合
            bullets.add(bullet);
        }
    }

    @Override
    public void run() {
        while (isLive) {
            //随机改变坦克方向 0、1、2、3
            Random random = new Random();
            setDirection(random.nextInt(4));

            //根据坦克的方向继续移动 30 步
            for (int i = 0; i < 30; i++) {
                //十分之一的概率随机射击
                if (random.nextInt(10) == 0)
                    this.shootBullet();

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
