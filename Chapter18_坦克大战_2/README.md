# Chapter18
第十八章_坦克大战[2]  
Chapter18_TankGame[2]  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0599_坦克发子弹思路

1. 当发射一颗子弹后，相当于启动一个线程
2. MyTank 有子弹的对象，当按下 “空格” 时，我们就启动一个发射行为（线程），让子弹不停的移动，形成一个射击的效果
3. 我们 MyPanel 需要不停的重绘子弹，才能出现该效果
4. 当子弹移动到面板的边界时，就应该销毁（把把启动的子弹的线程销毁）

# 0600-0601_我方发射子弹

- 子弹类：Bullet.java
- 启动线程：Bullet 和 MyPanel
- MyTank 增加 `shootBullet()` 方法
- MyPanel 类：增加对空格键的判断，调用 MyTank 中的 `shootBullet()` 方法

# 0602_敌方发射子弹

- 计划增加的功能
    1. 让敌人的坦克也能够发射子弹（可以有多颗子弹）
    2. 当我方坦克击中敌人坦克时，敌人的坦克就消失，并做出爆炸效果
    3. 让敌人的坦克也可以自由随机的上下左右移动
    4. 控制我方的坦克和敌人的坦克在规定的范围移动
    
    ![download.gif](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/5c2f965f-a068-4ba9-8934-4db15a9a9677/download.gif)
    
- 初始化敌方坦克时给敌方坦克增加一颗子弹

# 0603_敌方坦克消失

- EnemyTank 增加属性：isLive
- MyTank 增加静态方法：`hitTank(Bullet bullet, EnemyTank enemyTank)`
- 在 MyPanel 的 `run()` 方法中的 while 循环中调用 `hitTank()` 静态方法判断是否击中敌方坦克
- 画出敌方坦克前加入是否存活判断
- 画出我方子弹前加入是否为 null 判断，否则会抛出 NullPointerException

# 0604_坦克爆炸

- 添加炸弹类：Bomb
- 通过绘制爆炸效果动图，实现坦克爆炸效果

# 0605_敌方坦克自由移动

- 解决击中敌方坦克后，敌方坦克并未真正消失的问题
    - 在判断敌方坦克被击中后将其从 Vector 中移除：
        
        `enemyTanks.removeIf(enemyTank -> hitTank(myTank.bullet, enemyTank));`
        
    - 敌方坦克自由移动：
        - 使用 Random 随机生成 0 - 3 的数字，随机改变方向
        - 使用 for 循环使敌方坦克沿着当前方向移动 30 步
        - EnemyTank 类实现 Runnable 接口，在 MyPanel 类的构造方法中创建敌方坦克的代码后启动该线程

# 0606_控制坦克移动范围

- 在 Tank 类的 `moveUp()` 、`moveDown()` 、`moveLeft()` 和 `moveRight()` 方法中加入限制条件

# 0607_坦克发多颗子弹

- MyTank 类中创建 `CopyOnWriteArrayList` 集合放入多个 Bullet
- MyTank 类定义静态变量 *`currentBulletNumber`* 记录当前发射的子弹数量
- MyTank 类定义静态常量 *`BULLET_NUMBER_MAX`* 记录允许发射的最大子弹数量

# 0608_敌方移动发射

- EnemyTank 类的 `run()` 方法中利用 for 循环使敌方坦克沿当前方向持续前进，利用 Random 中的方法产生随机数，使敌方坦克以十分之一的概率发射子弹，每走 30 步后随机改变方向

# 0609_我方被击中爆炸

- 将 `hitTank()` 方法的第二个参数修改为 Tank类(MyTank和EnemyTank类的父类)，通过该方法判断是否击中某个坦克
- 在 MyPanel 类的 `run()` 方法中通过循环遍历敌方坦克及其子弹，调用 `hitTank()` 判断是否击中我方坦克
- 若击中我方坦克，则将我方坦克的 isLive 属性设为 false
