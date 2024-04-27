package com.zzhow.tankgame;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 坦克父类
 */
public class Tank {
    public static final int UPWARD = 0;
    public static final int DOWNWARD = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;
    private int x = 0; //坦克横坐标
    private int y = 0; //坦克纵坐标
    private int direction = Tank.UPWARD; //坦克方向
    private int speed = 1; //坦克速度

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

    public void moveUp(){
        if(direction != Tank.UPWARD)
            this.direction = Tank.UPWARD;
        y -= this.speed;
    }

    public void moveDown(){
        if(direction != Tank.DOWNWARD)
            this.direction = Tank.DOWNWARD;
        y += this.speed;
    }

    public void moveLeft(){
        if(direction != Tank.LEFT)
            this.direction = Tank.LEFT;
        x -= this.speed;
    }

    public void moveRight(){
        if(direction != Tank.RIGHT)
            this.direction = Tank.RIGHT;
        x += this.speed;
    }
}
