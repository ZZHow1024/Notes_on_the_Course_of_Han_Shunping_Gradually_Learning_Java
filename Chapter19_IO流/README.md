# Chapter19
第十九章_IO流  
Chapter19_IO Stream  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0610_文件基础知识

- 什么是文件
    
    文件是保存数据的地方。它既可以保存一张图片，也可以保持视频、声音……
    
- 文件流
    
    文件在程序中是以流的形式来操作的
    
    ![文件流](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/51156b3f-22c2-41d5-804b-38ea64b9bd25/%E6%96%87%E4%BB%B6%E6%B5%81.png)
    
    文件流
    
    - 流：数据在数据源（文件）和程序（内存）之间经历的路径
    - 输入流：数据从数据源（文件）到程序（内存）的路径
    - 输出流：数据从程序（内存）到数据源（文件）的路径

# 0611_创建文件

- 创建文件对象相关构造器和方法
    - 方法：`createNewFile()`
        - `new File(String pathname)` //根据路径构建一个 File 对象
        - `new File(File parent, String child)` //根据父目录文件 + 子路径构建
        - `new File(String parent, String child)` //根据父目录 + 子路径构建

![File类实现的接口](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/01c031ea-878a-4378-ae2d-00a2edcff9bd/File%E7%B1%BB%E5%AE%9E%E7%8E%B0%E7%9A%84%E6%8E%A5%E5%8F%A3.png)

File类实现的接口

![File类构造器](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/c35fcbe6-707d-43d1-adb1-0dbfe0693624/File%E7%B1%BB%E6%9E%84%E9%80%A0%E5%99%A8.png)

File类构造器

- 案例：在 D 盘下，创建文件 news1.txt、news2.txt、news3.txt，用三种不同方式创建

案例演示：**[com.zzhow.file](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file)** 中的 **[FileCreate.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file/FileCreate.java)**

# 0612_获取文件信息

- 获取文件的相关信息
    - `getName()` //获取文件名
    - `getAbsolutePath()`//获取文件绝对路径
    - `getParent()` //获取文件父级目录
    - `length()` //获取文件大小(字节 byte)
    - `exists()` //判断文件是否存在
    - `isFile()` //判断是否是一个文件
    - `isDirectory()` //判断是否是一个目录

案例演示：**[com.zzhow.file](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file)** 中的 [**FileInformation.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file/FileInformation.java)

# 0613_目录操作

- 目录的操作和文件删除
    
    `mkdir()` 创建一级目录、`mkdirs()` 创建多级目录、`delete()` 删除空目录或文件
    
- 案例：
    1. 判断 D:\new.txt 文件是否存在，如果存在就删除
    2. 判断 D:\demo ，目录是否存在，存在就删除，否则提示不存在
    3. 判断 D:\demo\a\b\c 目录是否存在，如果存在就提示已经存在，否则就创建

案例演示：**[com.zzhow.file](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file)** 中的 **[Directory_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/file/Directory_.java)**

# 0614_IO流原理和分类

- Java IO 流原理
    1. IO 是 Input/Output 的缩写，I/O 技术是非常实用的技术，用于处理数据传输。如读/写文件，网络通讯等
    2. Java 程序中，对于数据的输入/输出操作以 ”流(stream)" 的方式进行
    3. java.io 包下提供了各种 “流” 类和接口，用以获取不同种类的数据，并通过方法输入或输出数据
    4. 输入 input：读取外部数据（磁盘、光盘等存储设备的数据）到程序（内存）中
    5. 输出 output：将程序（内存）数据输出到磁盘、光盘等存储设备中
- 流的分类
    - 按操作数据单位不同分为：字节流(8bit)，字符流(按字符)
    - 按数据流的流向不同分为：输入流，输出流
    - 按流的角色的不同分为：节点流，处理流/包装流
    
    ![IO流的分类](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/582d4923-b1ce-4782-81db-a8f63a50917c/IO%E6%B5%81%E7%9A%84%E5%88%86%E7%B1%BB.png)
    
    IO流的分类
    
    1. Java 的 lO 流共涉及 40 多个类，实际上非常规则，都是从如上 4 个抽象基类派生的
    2. 由这四个类派生出来的子类名称都是以其父类名作为子类名后缀

# 0615_FileInputStream

- InputStream：字节输入流
    - InputStream 抽象类是所有类字节输入流的超类
    - InputStream 常用的子类
        1. FilelnputStream：文件输入流
        2. BufferedlnputStream：缓冲字节输入流
        3. ObjectlnputStream：对象字节输入流
    
    ![InputStream实现子类](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/6744ba2e-8b3a-471a-b4b6-bc9bcb1e155c/InputStream%E5%AE%9E%E7%8E%B0%E5%AD%90%E7%B1%BB.png)
    
    InputStream实现子类
    
- FileInputStream 介绍
    - 构造方法摘要：
        - `FileInputStream(File file)`
        - `FileInputStream(FileDescriptor fdObj)`
        - `FileInputStream(String name)`
    - 方法摘要：
        - `available()` //返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
        - `close()` //关闭此文件输入流并释放与此流有关的所有系统资源
        - `finalize()` //确保在不再引用文件输入流时调用其 close 方法
        - `getChanel()` //返回与此文件输入流有关的唯一 FileChannel 对象
        - `getFD()` //返回表示到文件系统中实际文件的连接的 FileDescriptor 对象，该文件系统正被此 FileInputStream 使用
        - `read()` //从此输入流中读取一个数据字节
        - `read(byte[] b)` //从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
        - `read(byte[] b, int off, int len)` //从此输入流中将最多 len 个字节的数据读入一个 byte 数组中
        - `skip(long n)` //从输入流中跳过并丢弃 n 个字节的数据
- 案例：使用 FilelnputStream 读取 hello.txt 文件，并将文件内容显示到控制台
    - 使用 `read()` 按字节读入缺点：效率较低，中文乱码

案例演示：**[com.zzhow.inputstream_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/inputstream_)** 中的 **[FilelnputStream_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/inputstream_/FileInputStream_.java)**

# 0616_FileOutputStream

- OutputStream：字节输出流
    - OutputStream 抽象类是所有类字节输出流的超类
    - OutputStream 常用的子类
        1. FileOutputStream：文件输出流
        2. BufferedOutputStream：缓冲字节输出流
        3. ObjectOutputStream：对象字节输出流
        
        ![OutputStream实现子类](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/e25005c3-f942-45bd-ae0b-22b319e4cdcf/OutputStream%E5%AE%9E%E7%8E%B0%E5%AD%90%E7%B1%BB.png)
        
        OutputStream实现子类
        
- FileOutputStream 介绍
    - 构造方法摘要：
        - `FileOutputStream(File file)`
        - `FileOutputStream(File file, boolean append)`
        - `FileOutputStream(FileDescriptor fdObj)`
        - `FileOutputStream(String name)`
        - `FileOutputStream(String name, boolean append)`
    - 方法摘要：
        - `close()` //关闭此文件输出流并释放与此流有关的所有系统资源
        - `finalize()` //清理到文件的连接，并确保在不再引用此文件输出流时调用此流的 close 方法
        - `getChanel()` //返回与此文件输出流有关的唯一 FileCharnel 对象
        - `getFD()` //返回与此流有关的文件描述符
        - `write(byte[] b)` //将 b.length 个字节从指定 byte 数组写入此文件输出流中
        - `write(byte[] b, int off, int len)` //将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
        - `write(int b)` //将指定字节入此文件输出流
- 案例：使用 FileOutputStream 在 hello.txt 文件中写入 “Hello World”，如果文件不存在，会创建文件（注意：前提是目录已经存在）

案例演示：**[com.zzhow.outputstream_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_)** 中的 [**FileOutputStream_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_/FileOutputStream_.java)

# 0617_文件拷贝

- 案例：*将 D:\hello.txt 拷贝到 D:\hello1.txt*

案例演示：**[com.zzhow.outputstream_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_)** 中的 **[FileCopy.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_/FileCopy.java)**

# 0618_文件字符流说明

- FileReader 和 FileWriter 介绍
    
    ![FileReader类的关系图](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/b77fae73-68fa-4a72-a5c4-ace19f86282c/FileReader%E7%B1%BB%E7%9A%84%E5%85%B3%E7%B3%BB%E5%9B%BE.png)
    
    FileReader类的关系图
    
    ![FileWriter类的关系图](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/3222d1d0-6fa5-4c91-a0af-eab91442da89/FileWriter%E7%B1%BB%E7%9A%84%E5%85%B3%E7%B3%BB%E5%9B%BE.png)
    
    FileWriter类的关系图
    
    FileReader 和 FileWriter 是字符流，即按照字符来操作 IO
    
- FileReader 相关方法：
    1. `new FileReader(File/String)`
    2. `read()`：每次读取单个字符，返回该字符，如果到文件末尾返回 -1
    3. `read(char[1])`：批量读取多个字符到数组，返回读取到的字符数，如果到文件末尾返回 -1
    - 相关API：
        1. new String(char[])：将 char[] 转换成 String
        2. new String(char[], off, len)：将 char[] 的指定部分转换成 String
- FileWrite 常用方法：
    1. `new FileWriter(File/String)`：覆盖模式，相当于流的指针在首端
    2. `new FileWriter(File/String, true)`：追加模式，相当于流的指针在尾端
    3. `write(int)`：写入单个字符
    4. `write(char[])`：写入指定数组
    5. `write(char[], off, len)`：写入指定数组的指定部分
    6. `write(string)`：写入整个字符串
    7. `write(string, off, len)`：写入字符串的指定部分
    - 相关 API：String 类：
        - `toCharArray()`：将 String 转换成 char[]
    - 注意：使用 FileWriter 后，必须关闭(close)或刷新(flush)，否则写入不到指定的文件

# 0619_FileReader

- 案例：使用 FileReader 从 hello.txt 读取内容并显示

案例演示：**[com.zzhow.reader_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/reader_)** 中的 **[FileReader_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/reader_/FileReader_.java)**

# 0620_FileWriter

- 案例：使用 FileWriter 在 D:\hello.txt 文件中用 5 种方式写入数据

案例演示：**[com.zzhow.writer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_)** 中的 **[FileWriter_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_/FileWriter_.java)**

# 0621_节点流处理流

- 基本介绍
    1. 节点流可以从一个特定的数据源读写数据，如：`FileReader`、`FileWriter`
    2. 处理流（包装流）是 “连接” 在已存在的流（节点流或处理流）之上，为程序提供更为强大的读写功能，如 BufferedReader、BufferedWriter
    
    ![节点流和处理流一览图](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/d92d64c6-604c-47b7-86e5-f7c724eb49e2/%E8%8A%82%E7%82%B9%E6%B5%81%E5%92%8C%E5%A4%84%E7%90%86%E6%B5%81%E4%B8%80%E8%A7%88%E5%9B%BE.png)
    
    节点流和处理流一览图
    

# 0622_处理流设计模式

- 节点流和处理流的区别和联系
    1. 节点流是底层流/低级流，直接跟数据源相接
    2. 处理流包装节点流，既可以消除不同节点流的实现差异，也可以提供更方便的方法来完成输入输出
    3. 处理流（包装流）对节点流进行包装，使用了修饰器设计模式，不会直接与数据源相连
- 处理流的功能主要体现在以下两个方面
    1. 性能的提高：主要以增加缓冲的方式来提高输入输出的效率
    2. 操作的便捷：处理流可能提供了一系列便捷的方法来一次输入输出大批量的数据，使用更加灵活方便

# 0623_BufferedReader

- 案例：使用 BufferedReader 读取文本文件，并显示在控制台

案例演示：**[com.zzhow.reader_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/reader_)** 中的 **[BufferedReader_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/reader_/BufferedReader_.java)**

# 0624_BufferedWriter

- 案例：使用 BufferedWriter 写入文本文件

案例演示：**[com.zzhow.writer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_)** 中的 **[BufferedWriter_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_/BufferedWriter_.java)**

# 0625_Buffered拷贝

- 案例：综合使用 BufferedReader 与 BufferedWriter 进行文件拷贝

案例演示：**[com.zzhow.writer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_)** 中的 **[BufferedCopy01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_/BufferedCopy01.java)**

# 0626_Buffered字节处理流

- 处理流-BufferedlnputStream 和 BufferedOutputStream
    - 介绍 BufferedlnputStream
        
        BufferedlnputStream 是字节流，在创建 BufferedlnputStream 时，会创建一个内部缓冲区数组
        
        - 构造方法摘要：
            1. `BufferedInputStream(InputStream in)`
            2. `BufferedInputStream(InputStream in, int size)`
        - 方法摘要：
            1. `available()` //返回可以从此输入流读取（或跳过）、且不受此输入流接下来的方法调用阻塞的估计字节数
            2. `close()` //关闭此输入流并释放与该流关联的所有系统资源
            3. `mark(int readlimit)` //参见 InputStream 的 mark 方法的常规协定
            4. `markSupported()` //测试此输入流是否支持mark和reset方法
            5. `read()` //参见 InputStream 的 read 方法的常规协定
            6. `read(byte[] b, int off, int len)` //从此字节输入流中给定偏移量处开始将各字节读取到指定的 byte 数组中
            7. `reset()` //参见 InputStream 的 reset 方法的常规协定
            8. `skip(long n)` //参见 InputStream 的 skip 方法的常规协定
    - 介绍 BufferedOutputStream
        
        BufferedOutputStream 是字节流，实现缓冲的输出流，可以将多个字节写入底层输出流中，而不必对每次字节写入调用底层系统
        
        - 构造方法摘要：
            1. `BufferedOutputStream(OutputStream out)`
            2. `BufferedOutputStream(OutputStream out, int size)`
        - 方法摘要：
            1. `flush()` //刷新此缓冲的输出流
            2. `write(byte[] b, int off, int len)` //将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此缓冲的输出流
            3. `write(int b)` //将指定的字节写入此缓冲的输出流

# 0627_字节处理流拷贝文件

- 案例：编程完成图片/音乐的拷贝（要求使用 Buffered 流）

案例演示：**[com.zzhow.writer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_)** 中的 **[BufferedCopy02.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/writer_/BufferedCopy02.java)**

# 0628_对象处理流

- 对象流-ObjectlnputStream 和 ObjectOutputStream
- 需求：能够将基本数据类型或者对象进行序列化和反序列化操作
    1. 将 int num = 100 这个 int 数据保存到文件中，不是 100 数字，而是 int 100，并且能够从文件中直接恢复 int 100
    2. 将 Dog dog = new Dog("小黄”, 3)这个 Dog 的对象保存到文件中，并且能够从文件恢复
- 序列化和反序列化
    1. 序列化就是在保存数据时，保存数据的值和数据类型
    2. 反序列化就是在恢复数据时，恢复数据的值和数据类型
    3. 需要让某个对象支持序列化机制，则必须让其类是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接口之一：
        - `Serializable` //[**推荐**]这是一个标记接口
        - `Externalizable` //该接口有方法需要实现，因此我们一般实现上面的 Serializable 接口
- 基本介绍
    1. 功能：提供了对基本类型或对象类型的序列化和反序列化的方法
    2. ObjectOutputStream 提供序列化功能
    3. ObjectlnputStream 提供反序列化功能

# 0629_ObjectOutputStream

- 案例：使用 ObjectOutputStream 序列化基本数据类型和一个 Dog 对象(name, age)，并保存到 data.dat 文件中

案例演示：**[com.zzhow.outputstream_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_)** 中的 **[ObjectOutputStream_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/outputstream_/ObjectOutputStream_.java)**

# 0630_ObjectInputStream

- 案例：使用 ObjectInputStream 读取 data.dat 并反序列化恢复数据

案例演示：**[com.zzhow.inputstream_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/inputstream_)** 中的 **[ObjectInputStream_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/inputstream_/ObjectInputStream_.java)**

# 0631_对象处理流使用细节

- 注意事项和细节说明
    1. 读写顺序要一致
    2. 要求序列化或反序列化对象，需要实现 Serializable
    3. 序列化的类中建议添加 SerialVersionUID，为了提高版本的兼容性
        
        ```java
        private static final long serialVersionUID = 1L;
        ```
        
    4. 序列化对象时，默认将里面所有属性都进行序列化，但除了 `static` 或 `transient` 修饰的成员
    5. 序列化对象时，要求里面属性的类型也需要实现序列化接口
    6. 序列化具备可继承性，也就是如果某类已经实现了序列化，则它的所有子类也已经默认实现了序列化

# 0632_标准输入输出流

- 介绍
    
    
    | 代码 | 名称 | 类型 | 默认设备 |
    | --- | --- | --- | --- |
    | System.in | 标准输入 | InputStream | 键盘 |
    | System.out | 标准输出 | PrintStream | 显示器 |
- 应用案例1：
    - 传统方法 System.out.println(””); 是使用 out 对象将数据输出到显示器
- 应用案例2：
    - 传统方法 Scanner 是从标准输入键盘接收数据

案例演示：**[com.zzhow.standard](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/standard)** 中的 **[InputAndOutput.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/standard/InputAndOutput.java)**

# 0633_乱码引出转换流

- 案例：一个中文乱码问题

案例演示：**[com.zzhow.transformation](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation)** 中的 **[CodeQuestion.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation/CodeQuestion.java)**

# 0634_InputStreamReader

- 转换流-InputStreamReader 和 OutputStreamWriter
- 介绍
    1. InputStreamReader：Reader 的子类，可以将 lnputStream（字节流）包装成 Reader（字符流）
    2. OutputStreamWriter：Writer 的子类，实现将 OutputStream（字节流）包装成 Writer（字符流）
    3. 当处理纯文本数据时，如果使用字符流效率更高，并且可以有效解决中文问题，所以建议将字节流转换成字符流
    4. 可以在使用时指定编码格式（比如 UTF-8，GBK，GB2312，ISO8859-1 等）
- 案例：节流 FilelnputStream 包装成字符流 InputStreamReader，对文件进行读取（按照 UTF-8 格式），进而在包装成 BufferedReader

案例演示：**[com.zzhow.transformation](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation)** 中的 **[InputStreamReader_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation/InputStreamReader_.java)**

# 0635_OutputStreamWriter

- 案例：将字节流 FileOutputStream 包装成字符流 OutputStreamWriter，对文件进行写入（按照 GBK 格式，可以指定其他，比如 UTF-8）

案例演示：**[com.zzhow.transformation](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation)** 中的 **[OutputStreamWriter_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/transformation/OutputStreamWriter_.java)**

# 0636_PrintStream

- 打印流-PrintStream 和 PrintWriter
    
    打印流只有输出流，没有输入流
    
- 默认情况下，PrintStream 输出的位置是标准输出，即显示器

案例演示：**[com.zzhow.printstream](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/printstream)** 中的 **[PrintStream_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/printstream/PrintStream_.java)**

# 0637_PrintWriter

案例演示：**[com.zzhow.printstream](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/printstream)** 中的 **[PrintWriter_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/printstream/PrintWriter_.java)**

# 0638_配置文件引出Properties

- 需求：
    - 如下一个配置文件 mysql.properties
        
        ip=192.168.0.13
        
        user=root
        
        pwd=12345
        
    - 请编程读取 ip、user 和 pwd 的值是多少

# 0639_Properties读文件

- 基本介绍
    
    Properties
    
    1. 专门用于读写配置文件的集合类
        
        配置文件的格式：
        
        键=值
        
        键=值
        
    2. 注意：键值对不需要有空格，值不需要用引号一起来，默认类型是 String
    3. Properties 的常见方法
        - load：加载配置文件的键值对到 Properties 对象
        - list：将数据显示到指定设备/流对象
        - getProperty(key)：根据键获取值
        - setProperty(key, value)：设置键值对到 Properties 对象
        - store：将 Properties 中的键值对存储到配置文件，在 IDEA 中，保存信息到配置文件，如果含有中文，会存储为 unicode 码
- 案例：
    1. 使用 Properties 类完成对 mysql.properties 的读取

案例演示：**[com.zzhow.properties_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/properties_)** 中的 **[Properties01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/properties_/Properties01.java)**

# 0640_Properties修改文件

- 案例：
    1. 使用 Properties 类添加 key-val 到新文件 mysql2.properties 中
    2. 使用 Properties 类完成对 mysql.properties 的读取，并修改某个 key-val

案例演示：**[com.zzhow.properties_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter19_IO%E6%B5%81/src/com/zzhow/properties_)** 中的 **[Properties02.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter19_IO%E6%B5%81/src/com/zzhow/properties_/Properties02.java)**
