package zzhow.tankgame;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 子弹
 */
public class Bullet implements Runnable {
    private int x; //子弹横坐标
    private int y; //子弹纵坐标
    private int direction = MyPanel.UPWARD; //子弹方向
    private int speed = 8; //子弹速度
    private boolean isLive = true;

    public Bullet() {
    }

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void run() {
        //射击行为
        while (isLive) {
            System.out.println("Bullet " + x + ", " + y + ", " + direction);
            switch (direction) {
                case MyPanel.UPWARD:
                    y -= speed;
                    break;
                case MyPanel.DOWNWARD:
                    y += speed;
                    break;
                case MyPanel.LEFT:
                    x -= speed;
                    break;
                case MyPanel.RIGHT:
                    x += speed;
                    break;
            }

            if (!(0 <= x && x <= 1000 && 0 <= y && y <= 750)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
