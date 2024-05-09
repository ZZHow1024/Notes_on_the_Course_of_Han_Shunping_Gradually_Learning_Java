package zzhow.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 游戏绘图区域
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //游戏区域的高和宽
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 750;

    //方向常量
    public static final int UPWARD = 0;
    public static final int DOWNWARD = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    //定义我方坦克
    private MyTank myTank = null;

    //图片资源
    private Image image = null;
    private Image image64 = null;
    private Image bomb0 = null;

    //定义敌方坦克
    public static int enemyTankTotalNumber = 3;
    int enemyTankQuantity = 3; //敌方坦克数量
    final Vector<EnemyTank> enemyTanks = new Vector<>();

    //定义炸弹集合
    Vector<Bomb> bombs = new Vector<>();

    {
        //加载图片
        try {
            image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/logo.png"));
        } catch (Exception e) {
            System.out.println("未找到 logo.png");
        }
        try {
            image64 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/logo64.png"));
        } catch (Exception e) {
            System.out.println("未找到 logo64.png");
        }
        try {
            bomb0 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb.gif"));
        } catch (Exception e) {
            System.out.println("未找到 bomb.gif");
        }
    }

    public MyPanel() {
        //初始化我方坦克
        this.myTank = new MyTank(450, 300, MyPanel.UPWARD, 3);

        //初始化敌方坦克
        for (int i = 0; i < enemyTankQuantity; i++) {
            //创建一个敌方坦克
            EnemyTank enemyTank = new EnemyTank((i + 1) * 100 + 250, 100, MyPanel.DOWNWARD, 3);
            //启动敌方坦克线程，让敌方坦克运动
            new Thread(enemyTank).start();
//            //设置敌方坦克的子弹方向
//            Bullet bullet = switch (enemyTank.getDirection()) {
//                case MyPanel.UPWARD ->
//                        new Bullet(enemyTank.getX() + 17, enemyTank.getY() - 3, enemyTank.getDirection());
//                case MyPanel.DOWNWARD ->
//                        new Bullet(enemyTank.getX() + 17, enemyTank.getY() + 57, enemyTank.getDirection());
//                case MyPanel.LEFT -> new Bullet(enemyTank.getX() - 3, enemyTank.getY() + 17, enemyTank.getDirection());
//                case MyPanel.RIGHT ->
//                        new Bullet(enemyTank.getX() + 57, enemyTank.getY() + 17, enemyTank.getDirection());
//                default -> null;
//            };
//
//            //给敌方坦克加入一颗子弹
//            enemyTank.getBullets().add(bullet);
//            new Thread(bullet).start();
            //以上功能改到 EnemyTank 类中的 shootBullet() 方法

            //添加敌方坦克
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //画出游戏区域：灰色填充矩形
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, MyPanel.WIDTH, MyPanel.HEIGHT);

        g.drawImage(image, 320, 210, 300, 300, this);
        g.setColor(Color.BLACK);
        g.setFont(new Font("MiSans", Font.BOLD, 30));
        g.drawString("Tank Game 2.0", 5, 30);
        g.setFont(new Font("MiSans", Font.BOLD, 20));
        g.drawString("Bullet Number：" + MyTank.currentBulletNumber + " / " + MyTank.BULLET_NUMBER_MAX, 5, 60);
        g.drawString("Enemy Tank Number：" + this.enemyTanks.size() + " / " + MyPanel.enemyTankTotalNumber, 5, 85);
        g.setFont(new Font("MiSans", Font.BOLD, 50));
        g.drawString("@author ZZHow", 260, 700);

        //画出坦克：调用 drawTank() 方法
        //①画出我方坦克（补充判断是否存活）
        if(myTank.isLive())
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), MyTank.TYPE);
        //②画出敌方坦克和子弹
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive()) {
                //画出坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), EnemyTank.TYPE);

                //画出所有子弹
                g.setColor(Color.RED);
                for (int j = 0; j < enemyTank.getBullets().size(); j++) {
                    Bullet bullet = enemyTank.getBullets().get(j);

                    if (bullet.isLive()) {
                        g.fillOval(bullet.getX(), bullet.getY(), 6, 6);
                    } else {
                        enemyTank.getBullets().remove(bullet);
                        ++EnemyTank.currentBulletNumber;
                    }
                }
            }
        }

        //画出我方所有子弹：
        g.setColor(Color.RED);
        for (Bullet bullet : myTank.getBullets()) {
            if (bullet.isLive()) {
                g.fillOval(bullet.getX(), bullet.getY(), 6, 6);
            } else {
                ++MyTank.currentBulletNumber;
                myTank.getBullets().remove(bullet);
            }
        }
//        for(int i = 0; i < )
//        if (myTank.bullet != null && myTank.bullet.isLive()) {
//            g.fillOval(myTank.bullet.getX(), myTank.bullet.getY(), 6, 6);
//        }

        //如果 bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //绘制爆炸动图
            g.drawImage(bomb0, bomb.getX(), bomb.getY(), 60, 60, this);
            //炸弹生命值减少
            bomb.lifeDown();
            //如果 bomb 的 life 值为 0，就从 bombs 集合中删除
            if (bomb.getLife() == 0)
                bombs.remove(bomb);
        }
    }

    /**
     * 坐标位置以坦克最左上角的像素为标准
     *
     * @param x         坦克的横坐标
     * @param y         坦克的纵坐标
     * @param g         画笔
     * @param direction 坦克的方向
     * @param type      坦克的类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            //我方坦克
            case MyTank.TYPE:
                g.setColor(Color.PINK);
                break;

            case EnemyTank.TYPE:
                g.setColor(Color.ORANGE);
                break;
        }

        switch (direction) {
            case MyPanel.UPWARD:
            case MyPanel.DOWNWARD:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                if (type == MyTank.TYPE)
                    g.drawImage(image64, x + 10, y + 20, 20, 20, this);
                if (direction == MyPanel.UPWARD)
                    g.drawLine(x + 20, y + 30, x + 20, y);
                else
                    g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case MyPanel.LEFT:
            case MyPanel.RIGHT:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                if (type == MyTank.TYPE)
                    g.drawImage(image64, x + 20, y + 10, 20, 20, this);
                if (direction == MyPanel.LEFT)
                    g.drawLine(x + 30, y + 20, x, y + 20);
                else
                    g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W)
            myTank.moveUp();
        else if (e.getKeyCode() == KeyEvent.VK_A)
            myTank.moveLeft();
        else if (e.getKeyCode() == KeyEvent.VK_S)
            myTank.moveDown();
        else if (e.getKeyCode() == KeyEvent.VK_D)
            myTank.moveRight();
        else if (e.getKeyCode() == KeyEvent.VK_SPACE && (MyTank.currentBulletNumber > 0))
            myTank.shootBullet();

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //判断我方子弹是否击中坦克
    public boolean hitTank(Bullet bullet, Tank tank) {
        switch (tank.getDirection()) {
            case MyPanel.UPWARD:
            case MyPanel.DOWNWARD:
                if (tank.getX() < bullet.getX() && bullet.getX() < tank.getX() + 40
                        && tank.getY() < bullet.getY() && bullet.getY() < tank.getY() + 60) {
                    bullet.setLive(false);
                    tank.setLive(false);

                    //创建 Bomb 对象，加入到 bombs 集合
                    bombs.add(new Bomb(tank.getX(), tank.getY()));

                    //击中，返回 true
                    return true;
                }
                break;
            case MyPanel.LEFT:
            case MyPanel.RIGHT:
                if (tank.getX() < bullet.getX() && bullet.getX() < tank.getX() + 60
                        && tank.getY() < bullet.getY() && bullet.getY() < tank.getY() + 40) {
                    bullet.setLive(false);
                    tank.setLive(false);

                    //创建 Bomb 对象，加入到 bombs 集合
                    bombs.add(new Bomb(tank.getX(), tank.getY()));

                    //击中，返回 true
                    return true;
                }
                break;
        }

        //未击中，返回 false
        return false;
    }

    @Override
    public void run() {
        while (true) {
            //判断是否击中了敌方坦克
            for (Bullet bullet : myTank.getBullets()) {
                if (bullet != null && bullet.isLive()) {
//                Iterator<EnemyTank> iterator = enemyTanks.iterator();
//                while (iterator.hasNext()) {
//                    EnemyTank enemyTank = iterator.next();
//                    if (hitTank(myTank.bullet, enemyTank))
//                        iterator.remove();
//                }
                    enemyTanks.removeIf(enemyTank -> hitTank(bullet, enemyTank));
                }
            }

            //判断是否击中了我方坦克
            for(EnemyTank enemyTank : enemyTanks) {
                for(Bullet bullet : enemyTank.getBullets()) {
                    if (bullet != null && bullet.isLive() && myTank.isLive() && hitTank(bullet, myTank))
                        myTank.setLive(false);
                }
            }

            this.repaint();

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
