# Chapter14
第十四章_集合  
Chapter14_Aggregation  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0568_坦克大战介绍

- 项目：坦克大战1.0

# 0569_Java坐标体系

- 坐标体系-介绍
    
    坐标原点位于左上角，以像素为单位。在 Java 坐标系中，第一个是 x 坐标，表示当前位置为水平方向，距离坐标原点 x 个像素；第二个是 y 坐标，表示当前位置为垂直方向，距离坐标原点 y 个像素。
    
- 坐标体系-像素
    1. 重要的概念 ——— 像素
    2. 计算机在屏幕上显示的内容都是由屏幕上的每一个像素组成的。例如，计算机显示器的分辨率是 800 × 600，表示计算机屏幕上的每一行由 800 个点组成，共有 600 行，整个计算机屏幕共有 480000 个像素。像素是一个密度单位，而厘米是长度单位，两者无法比较

# 0570_绘图入门和机制

- 案例：绘制一个圆
    
    ```java
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
    
    //定义 MyPanel 类，继承 JPanel 类，画图形，就在画板上
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
    
    ```
    
- 绘图原理：
    - Component 类提供了两个和绘图相关最重要的方法：
        1. `paint(Graphics g)` 绘制组件的外观
        2. `repaint()` 刷新组件的外观
    - 当组件第一次在屏幕显示的时候，程序会自动的调用 paint() 方法来绘制组件
    - 在以下情况 paint() 将会被调用：
        1. 窗口最小化，再最大化
        2. 口的大小发生变化
        3. repaint 方法被调用

案例演示：[**com.zzhow.draw**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/draw) 中的 **[DrawCircle.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/draw/DrawCircle.java)**

# 0571_绘图方法

- Graphics 类
    
    Graphics 类可以理解成画笔，为我们提供了各种绘制图形的方法。
    
    1. 画直线 `drawLine(int x1, int y1, int x2, int y2);`
    2. 画矩形边框 `drawRect(int x, int y, int width, int height);`
    3. 画椭圆边框 `drawOval(int x, int y, int width, int height);`
    4. 填充矩形 `fillRect(int x, int y, int width, int height);`
    5. 填充椭圆 `fillOval(int x, int y, int width, int height);`
    6. 画图片 `drawlmage(Image img, int x, int y, ...);`
    7. 画字符串 `drawString(String str, int x, int y);`
    8. 设置画笔的字体 `setFont(Font font);`
    9. 设置画笔的颜色 `setColor(Color c);`

案例演示：[**com.zzhow.draw**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/draw) 中的 **[GraphicsMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/draw/GraphicsMethod.java)**

# 0572_绘制坦克游戏区域

- 坦克部分：
    - 父类：Tank.java
    - 我方坦克：MyTank.java
- 游戏绘图区域：
    - MyPanel.java
    - 绘制灰色矩形
- 入口程序：
    - TankGame01.java

# 0573_绘制坦克

- 绘制坦克封装到 drawTank 方法中

# 0574_小球移动案例

- 案例：让小球受到键盘控制，上下左右移动

案例演示：**[com.zzhow.event](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/event)** 中的 **[BallMove.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter16_%E5%9D%A6%E5%85%8B%E5%A4%A7%E6%88%98_1/src/com/zzhow/event/BallMove.java)**

# 0575_事件处理机制

- 基本说明
    
    Java 事件处理是采取 “委派事件模型”。当事件发生时，产生事件的对象，会把此 “信息” 传递给 “事件的监听者” 处理，这里所说的 “信息” 实际上就是 java.awt.event 事件类库里某个类所创建的对象，把它称为 “事件的对象”。
    
- 示意图
    
    ![Java 事件监听机制示意图](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/ccb12063-822b-451e-a2e0-dc8611180546/Java%E4%BA%8B%E4%BB%B6%E7%9B%91%E5%90%AC%E6%9C%BA%E5%88%B6%E7%A4%BA%E6%84%8F%E5%9B%BE.png)
    
    Java 事件监听机制示意图
    
- 事件处理机制深入理解
    1. 几个重要的概念：事件源、事件 和 事件监听器
    2. 事件源：一个产生事件的对象，比如按钮，窗口等
    3. 事件：承载事件源状态改变时的对象，比如当键盘事件、鼠标事件、窗口事件等等，会生成一个事件对象，该对象保存着当前事件很多信息，比如 KeyEvent 对象有被按下键的 Code 值。java.awt.event 包和 javax.swing.event 包中定义了各种事件类型
    4. 事件类型：
        
        ![事件类型](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/a726ee4e-4f75-43b3-aab5-7d61ee220497/%E4%BA%8B%E4%BB%B6%E7%B1%BB%E5%9E%8B.png)
        
        事件类型
        
    5. 事件监听器接口：
        1. 当事件源产生一个事件，可以传送给事件监听者处理
        2. 事件监听者实际上就是一个类，该类实现了某个事件监听器接口，比如案例中的 MyPanel 就是一个类，它实现了 KeyListener 接口，它就可以作为一个事件监听者，对接受到的事件进行处理
        3. 事件监听器接口有多种，不同的事件监听器接口可以监听不同的事件，一个类可以实现多个监听接口
        4. 这些接口在 java.awt.event 包和 javax.swing.event 包中定义。
        
        ![事件监听器接口](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/a3c59ae1-252e-4807-a053-fea2852f2d7f/%E4%BA%8B%E4%BB%B6%E7%9B%91%E5%90%AC%E5%99%A8%E6%8E%A5%E5%8F%A3.png)
        
        事件监听器接口
        

# 0576_绘制坦克上下左右

- 绘制坦克朝向上下左右时的情形

# 0577_坦克动起来

- Tank 类添加 direction 和 speed 属性
- Tank 类添加 moveUp()、moveDown()、moveLeft() 和 moveRight() 方法

# 0578_绘制敌人坦克

- 分析：
    1. 代码在 MyPanel.java
    2. 以单开一个 EnemyTank 类
    3. 敌人坦克数量多且需要考虑多线程问题，可以放入到集合 Vector 中
