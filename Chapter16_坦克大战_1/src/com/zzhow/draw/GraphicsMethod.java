package com.zzhow.draw;

import javax.swing.*;
import java.awt.*;

/**
 * 2024年4月27日
 *
 * @author ZZHow
 */
public class GraphicsMethod extends JFrame {
    private Panel mp = null;

    public static void main(String[] args) {
        new GraphicsMethod();
    }

    public GraphicsMethod() {
        this.mp = new Panel();
        this.add(mp);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //1. 画直线 drawLine(int x1, int y1, int x2, int y2);
        g.drawLine(10, 10, 30, 30);

        //2. 画矩形边框 drawRect(int x, int y, int width, int height);
        g.drawRect(10, 50, 50, 50);

        //3. 画椭圆边框 drawOval(int x, int y, int width, int height);
        g.drawOval(10, 130, 50, 50);

        //4. 填充矩形 fillRect( int x, int y, int width, int height);
        g.setColor(Color.BLUE);
        g.fillRect(80, 50, 50, 50);

        //5. 填充椭圆 fillOval( int x, int y, int width, int height);
        g.setColor(Color.ORANGE);
        g.fillOval(80, 130, 50, 50);

        //6. 画图片 drawlmage(Image img, int x, int y, ...);
        //获取图片资源
        String path = "/ZZHow.jpg";
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource(path));
        g.drawImage(image, 150, 10, 164, 164, this);

        //7. 画字符串 drawString(String str, int x, int y);
        //8. 设置画笔的字体 setFont(Font font);
        //9. 设置画笔的颜色 setColor(Color c);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        g.drawString("Hello World", 35, 230);

        g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        g.drawString("@author ZZHow", 50, 260);
    }
}
