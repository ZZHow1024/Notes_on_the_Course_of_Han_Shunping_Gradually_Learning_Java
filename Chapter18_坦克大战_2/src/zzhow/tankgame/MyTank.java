package zzhow.tankgame;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 我方坦克
 */
public class MyTank extends Tank {
    public static final int TYPE = 0;
    Bullet bullet = null;

    public MyTank() {
    }

    public MyTank(int x, int y) {
        super(x, y);
    }

    public MyTank(int x, int y, int direction, int speed) {
        super(x, y, direction, speed);
    }

    public void shootBullet() {
        //创建 Bullet 对象
        switch (this.getDirection()) {
            case MyPanel.UPWARD:
                bullet = new Bullet(this.getX() + 17, this.getY() - 3, this.getDirection());
                break;
            case MyPanel.DOWNWARD:
                bullet = new Bullet(this.getX() + 17, this.getY() + 57, this.getDirection());
                break;
            case MyPanel.LEFT:
                bullet = new Bullet(this.getX() - 3, this.getY() + 17, this.getDirection());
                break;
            case MyPanel.RIGHT:
                bullet = new Bullet(this.getX() + 57, this.getY() + 17, this.getDirection());
                break;
        }

        //启动 Bullet 线程
        new Thread(bullet).start();
    }

    //判断我方子弹是否击中敌方坦克
    public static void hitTank(Bullet bullet, EnemyTank enemyTank) {
        switch (enemyTank.getDirection()) {
            case MyPanel.UPWARD:
            case MyPanel.DOWNWARD:
                if (enemyTank.getX() < bullet.getX() && bullet.getX() < enemyTank.getX() + 40
                        && enemyTank.getY() < bullet.getY() && bullet.getY() < enemyTank.getY() + 60) {
                    bullet.setLive(false);
                    enemyTank.setLive(false);
                }
                break;
            case MyPanel.LEFT:
            case MyPanel.RIGHT:
                if (enemyTank.getX() < bullet.getX() && bullet.getX() < enemyTank.getX() + 60
                        && enemyTank.getY() < bullet.getY() && bullet.getY() < enemyTank.getY() + 40) {
                    bullet.setLive(false);
                    enemyTank.setLive(false);
                }
                break;
        }
    }
}
