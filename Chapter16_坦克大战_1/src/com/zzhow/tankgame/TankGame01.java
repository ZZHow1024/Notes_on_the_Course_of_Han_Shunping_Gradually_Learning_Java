package com.zzhow.tankgame;

import javax.swing.*;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 * @version 1.0
 * 游戏入口
 */
public class TankGame01 extends JFrame {
    MyPanel myPanel = null;

    public static void main(String[] args) {
        new TankGame01();
    }

    public TankGame01() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setTitle("Tank Game 1.0");
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
