package zzhow.tankgame;

/**
 * 2024/5/5
 *
 * @author ZZHow
 */
public class Bomb {
    private int x; //炸弹横坐标
    private int y; //炸弹纵坐标
    private int life = 18; //炸弹生命周期
    private boolean isLive = true; //炸弹是否存活

    public Bomb() {
    }

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Bomb(int x, int y, int life, boolean isLive) {
        this.x = x;
        this.y = y;
        this.life = life;
        this.isLive = isLive;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public void lifeDown() {
        if (life > 0)
            --life;
        else
            isLive = false;
    }
}
