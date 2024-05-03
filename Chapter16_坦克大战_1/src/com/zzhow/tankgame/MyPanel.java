package com.zzhow.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 游戏绘图区域
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我方坦克
    private MyTank myTank = null;

    //图片资源
    private Image image = null;
    private Image image64 = null;

    //定义敌方坦克
    int enemyTankQuantity = 3;
    Vector<EnemyTank> enemyTanks = new Vector<>();

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
    }

    public MyPanel() {
        //初始化我方坦克
        this.myTank = new MyTank(450, 300, Tank.UPWARD, 3);

        //初始化敌方坦克
        for (int i = 0; i < enemyTankQuantity; i++) {
            enemyTanks.add(new EnemyTank((i + 1) * 100 + 250, 100, Tank.DOWNWARD, 1));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //画出游戏区域：灰色填充矩形
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 1000, 750);

        g.drawImage(image, 320, 210, 300, 300, this);
        g.setColor(Color.BLACK);
        g.setFont(new Font("MiSans", Font.BOLD, 30));
        g.drawString("Tank Game 1.0", 5, 30);
        g.setFont(new Font("MiSans", Font.BOLD, 50));
        g.drawString("@author ZZHow", 260, 700);

        //画出坦克：调用 drawTank() 方法
        //①画出我方坦克
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), MyTank.TYPE);
        //②画出敌方坦克
        for (EnemyTank enemyTank : enemyTanks)
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), EnemyTank.TYPE);
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
            case Tank.UPWARD:
            case Tank.DOWNWARD:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                if (type == MyTank.TYPE)
                    g.drawImage(image64, x + 10, y + 20, 20, 20, this);
                if (direction == Tank.UPWARD)
                    g.drawLine(x + 20, y + 30, x + 20, y);
                else
                    g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case Tank.LEFT:
            case Tank.RIGHT:
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                if (type == MyTank.TYPE)
                    g.drawImage(image64, x + 20, y + 10, 20, 20, this);
                if (direction == Tank.LEFT)
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

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
