package com.zzhow.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 学习 Java 事件控制机制
 * 案例：小球移动
 */
public class BallMove extends JFrame {
    private MyPanel myPanel = null;

    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove() {
        myPanel = new MyPanel();

        this.add(myPanel);
        this.addKeyListener(myPanel);
        this.setTitle("Ball Move");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//画板
class MyPanel extends JPanel implements KeyListener {
    private int x = 250;
    private int y = 250;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.BOLD, 30));
        g.drawString("Ball Move", 180, 400);
        g.drawString("@author ZZHow", 130, 430);
        g.fillOval(x, y, 20, 20);
    }

    //监听字符输出
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //监听按键按下
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char) e.getKeyCode() + "按键被按下了！");
        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            x++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            x--;
        }

        //面板重绘
        this.repaint();
    }

    //监听按键释放
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
