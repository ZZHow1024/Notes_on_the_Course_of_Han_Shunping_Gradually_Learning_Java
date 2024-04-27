package com.zzhow.draw;

import javax.swing.*;
import java.awt.*;

/**
 * 2024年4月26日
 *
 * @author ZZHow
 */
//JFrame 对应窗口，可以理解成是一个画框
public class DrawCircle extends JFrame {
    //定义一个画板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();

        //把面板放入窗口(画框)
        this.add(mp);

        //设置窗口的大小
        this.setSize(400, 300);

        //设置为可视
        this.setVisible(true);

        //设置为点击 “×” 号就退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//定义 MyPanel 类，继承 JPanel 类，画图形，在画板上
class MyPanel extends JPanel {
    //绘图方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 200, 200);
    }
    //说明：
    //1. MyPanel 的对象就是一个画板
    //2. Graphics g 把 g 理解成一支画笔
    //3. Graphics 提供了很多绘图方法
    //Graphics g
}
