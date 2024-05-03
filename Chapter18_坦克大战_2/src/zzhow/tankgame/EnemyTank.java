package zzhow.tankgame;

import java.util.Vector;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 敌方坦克
 */
public class EnemyTank extends Tank {
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
}
