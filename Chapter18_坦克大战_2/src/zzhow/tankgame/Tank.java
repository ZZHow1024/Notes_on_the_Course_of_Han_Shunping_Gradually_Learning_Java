package zzhow.tankgame;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 坦克父类
 */
public class Tank {
    private int x = 0; //坦克横坐标
    private int y = 0; //坦克纵坐标
    private int direction = MyPanel.UPWARD; //坦克方向
    private int speed = 1; //坦克速度
    private boolean isLive = true;

    public Tank() {
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y, int direction, int speed) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = speed;
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

    public void moveUp() {
        if (direction != MyPanel.UPWARD)
            this.direction = MyPanel.UPWARD;
        if (0 < y)
            this.y -= this.speed;
    }

    public void moveDown() {
        if (direction != MyPanel.DOWNWARD)
            this.direction = MyPanel.DOWNWARD;
        if (y + 60 < MyPanel.HEIGHT)
            this.y += this.speed;
    }

    public void moveLeft() {
        if (direction != MyPanel.LEFT)
            this.direction = MyPanel.LEFT;
        if (0 < x)
            this.x -= this.speed;
    }

    public void moveRight() {
        if (direction != MyPanel.RIGHT)
            this.direction = MyPanel.RIGHT;
        if (x + 60 < MyPanel.WIDTH)
            this.x += this.speed;
    }
}
