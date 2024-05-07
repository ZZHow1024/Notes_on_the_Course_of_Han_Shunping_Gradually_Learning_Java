package zzhow.tankgame;

import javax.swing.*;
import java.util.Objects;

/**
 * 2024/5/3
 *
 * @author ZZHow
 * @version 2.0
 * 游戏入口
 */
public class TankGame02 extends JFrame {
    MyPanel myPanel = null;

    public static void main(String[] args) {
        //启动游戏
        new TankGame02();
    }

    public TankGame02() {
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
        new Thread(myPanel).start();
        this.setTitle("Tank Game 2.0");
        this.setSize(MyPanel.WIDTH + 14, MyPanel.HEIGHT + 37);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
