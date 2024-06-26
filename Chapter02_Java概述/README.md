# Chapter02

第二章\_Java 概述  
Chapter02_Java Overview  
@[ZZHow1024 ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平*  循序渐进学 Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

# 0007_Java 故事

1. 1990 sun 公司 启动 绿色计划
2. 1992 创建 oak(橡树)语言 ->java
3. 1994 gosling 参加 硅谷大会 演示 java 功能,震惊世界。
4. 1995 sun 正式发布 java 第 1 个版本。
5. 2009 年，甲骨文公司宣布收购 Sun 。2011，发布 java7。
6. Java 之父：**詹姆斯·高斯林**

![James Gosling](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F095fcf95-cdf5-48e8-b9eb-b3c1b8961363%2FJames_Gosling_2008.jpg?table=block&id=c11a5210-d061-424e-a368-16b34db557d4&t=c11a5210-d061-424e-a368-16b34db557d4)

James Gosling

# 0016\_快速入门

案例演示：**[Hello.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0016_%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Hello.java)** 和 **[HelloExer01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0016_%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/HelloExer01.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter02_Java概述/0016_快速入门)

# 0018\_开发细节

1. Java 源文件以 .java 为扩展名。源文件的基本组成部分是类 (class) ，如本类中的 Hello 类。
2. Java 应用程序的执行入口是 main0 方法。它有固定的书写格式:public static void main(String[] args) {…}
3. Java 语言严格区分大小写。
4. Java 方法由一条条语句构成，每个语句以“;”结束。
5. 大括号都是成对出现的，缺一不可。[习惯，先写{ }再写代码]
6. 一个源文件中最多只能有一个 public 类。其它类的个数不限。
7. 如果源文件包含一个 public 类，则文件名必须按该类名命名!
8. 一个源文件中最多只能有一个 public 类。其它类的个数不限，也可以将 main 方法写在非 public 类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法

案例演示：**[Hello.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0018_%E5%BC%80%E5%8F%91%E7%BB%86%E8%8A%82/Hello.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter02_Java概述/0018_开发细节)

# 0020\_转义字符

1. \t 一个制表位，实现对齐的功能
2. \n 换行符
3. \\ 一个\
4. \” 一个”
5. \’ 一个’
6. \r 一个回车 System.out.println(”DNX\rJava”);

案例演示：**[ChangeChar.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0020_%E8%BD%AC%E4%B9%89%E5%AD%97%E7%AC%A6/ChangeChar.java)** 和 **[ChangeCharExer01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0020_%E8%BD%AC%E4%B9%89%E5%AD%97%E7%AC%A6/ChangeCharExer01.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter02_Java概述/0020_转义字符)

# 0023\_注释

1. 单行注释 //注释文字
2. 多行注释 /_注释文字_/
3. 文档注释：内容可以被 JDK 提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档，一般写在类前边。

   ```java
   /**
    *@author ZZHow
    *@version 1.0
    */
   ```

   `javadoc -d d:\\temp -author -version Comment02.java`

案例演示：**[Comment.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0023_%E6%B3%A8%E9%87%8A/Comment.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter02_Java概述/0023_注释)

# 0025\_代码规范

1. 类、方法的注释，要以 iavadoc 的方式来写。
2. 非 Java Doc 的注释，往往是给代码的维护者看的，着重告述读者为什么这样写如何修改，注意什么问题等。
3. 使用 tab 操作，实现缩进,默认整体向右边移动，时候用 shift+tab 整体向左移。
4. 运算符和 = 两边习惯性各加一个空格。比如: 2 + 4\* 5 + 345 - 89
5. 源文件使用 utf-8 编码。
6. 行宽度不要超过 80 字符。
7. 代码编写次行风格和行尾风格。

# 0026-0030_DOS 指令(了解)

DOS 介绍：Disk Operating System 磁盘操作系统

需了解：相对路径，绝对路径

常用的 dos 命全：

1. 查看当前目录是有什么
   1. dir
   2. dir d:\abc2\test200
2. 切换到其他盘下:盘符号 cd
   1. 案例演示:切换到 C 盘 cd /D c:
3. 切换到当前盘的其他目录下（使用相对路径和绝对路径演示）
   1. 案例演示: cd d:\abc2\test200
   2. 案例演示: cd ..\..\abc2\test200
4. 切换到上一级:
   1. 案例演示:cd ..
5. 切换到根目录: cd \
   1. 案例演示: cd \
6. 查看指定的目录下所有的子级目录：tree
7. 清屏：cls
8. 退出 DOS：exit
9. md[创建目录]
10. rd[删除目录]
11. copy[拷贝文件]
12. del[删除文件]
13. echo[输入内容到文件]
14. type nul[输入空内容到文件]
15. move[移动文件])

仅作了解
