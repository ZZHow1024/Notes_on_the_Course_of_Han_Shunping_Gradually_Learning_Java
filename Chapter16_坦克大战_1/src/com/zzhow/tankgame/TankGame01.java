package com.zzhow.tankgame;

import javax.swing.*;
import java.util.Objects;

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
        //启动游戏
        new TankGame01();
    }

    public TankGame01() {
        myPanel = new MyPanel();
        ImageIcon imageIcon;
        try {
            imageIcon = new ImageIcon(Objects.requireNonNull(MyPanel.class.getResource("/logo64.png")));
            this.setIconImage(imageIcon.getImage());
        } catch (Exception e) {
            System.out.println("未找到 logo64.png");
        }

        this.add(myPanel);
        this.addKeyListener(myPanel);
        this.setTitle("Tank Game 1.0");
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
