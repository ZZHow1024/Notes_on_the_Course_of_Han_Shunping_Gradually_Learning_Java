package com.zzhow.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 游戏绘图区域
 */
public class MyPanel extends JPanel implements KeyListener {

    //定义我方坦克
    MyTank myTank = null;

    public MyPanel() {
        //初始化我方坦克
        this.myTank = new MyTank(100, 100, Tank.UPWARD, 1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //画出游戏区域：灰色填充矩形
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 1000, 750);

        //画出坦克：调用 drawTank() 方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), MyTank.TYPE);
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
