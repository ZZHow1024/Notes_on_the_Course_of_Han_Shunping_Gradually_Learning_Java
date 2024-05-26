# Chapter21
第二十一章_网络编程  
Chapter21_Network programming  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0661_网络相关概念

- 网络通信
    1. 概念：两台设备之间通过网络实现数据传输
    2. 网络通信：将数据通过网络从一台设备传输到另一台设备
    3. java.net 包下提供了一系列的类或接口，供程序员使用，完成网络通信
- 网络
    1. 概念：两台或多台设备通过一定物理设备连接起来构成了网络
    2. 根据网络的覆盖范围不同，对网络进行分类：
        1. 局域网：覆盖范围最小，仅仅覆盖一个教室或一个机房
        2. 城域网：覆盖范围较大，可以覆盖一个城市
        3. 广域网：覆盖范围最大，可以覆盖全国，甚至全球，万维网是广域网的代表

# 0662_IP地址

- IP 地址
    1. 概念：用于唯一标识网络中的每台计算机
    2. 查看 IP 地址：ipconfig
    3. IP 地址的表示形式：点分十进制 xx.xx.xx.xx
        
        IPv4：4 个字节（32 位）表示
        
    4. 每一个十进制数的范围：0 ~ 255
    5. IP 地址的组成 = 网络地址 + 主机地址，比如：192.168.16.69
    6. IPv6 是互联网工程任务组设计的用于替代 IPv4 的下一代 IP 协议，其地址数量号称可以为全世界的每一粒沙子编上一个地址
        
        IPv6：16 个字节（128 位）表示
        
    7. 于IPv4最大的问题在于网络地址资源有限，严重制约了互联网的应用和发展。IPv6的使用，不仅能解决网络地址资源数量的问题，而且也解决了多种接入设备连入互联韩的障碍
- IPv4 地址分类：
    
    ![IPv4地址分类](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fce2cfd99-0339-4caa-a23a-7e1a8abba09f%2FIPv4%25E5%259C%25B0%25E5%259D%2580%25E5%2588%2586%25E7%25B1%25BB.png?table=block&id=c48f42eb-3dda-44ba-9e8b-db5cebf772ed&t=c48f42eb-3dda-44ba-9e8b-db5cebf772ed&width=670&cache=v2)
    
    IPv4地址分类
    

# 0663_域名和端口

- 域名：
    1. 概念：将 IP 地址映射成域名
    2. 好处：为了方便记忆，解决记 IP 的困难
- 端口号：
    1. 概念：用于标识计算机上某个特定的网络程序
    2. 表示形式：以整数形式，范围 0~65535 [2 个字节表示端口 0~2^16 - 1]
    3. 0~1024 已经被占用，比如 ssh 22, ftp 21, smtp 25, http 80
    4. 常见的网络程序端口号：
        - tomcat: 8080
        - mysql: 3306
        - oracle: 1521
        - sqlserver: 1433
- 在网络开发中不要使用 0-1024 的端口

# 0664_网络协议

- 网络通信协议
    - 协议(TCP/IP)
    - TCP/IP (Transmission Control Protocol/lnternet Protocol)的简写，中文译名为传输控制协议/因特网互联协议，又叫网络通讯协议，这个协议是 Internet 最基本的协议、Internet 国际互联网络的基础，简单地说，就是由网络层的 IP 协议和传输层的 TCP 协议组成的。
    
    ![网络通信协议](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fdc019860-d5ef-4794-99f0-16fb1859639a%2F%25E7%25BD%2591%25E7%25BB%259C%25E9%2580%259A%25E4%25BF%25A1%25E5%258D%258F%25E8%25AE%25AE.png?table=block&id=9737cf08-1701-4326-9417-3308df60bfb8&t=9737cf08-1701-4326-9417-3308df60bfb8&width=624&cache=v2)
    
    网络通信协议
    

# 0665_TCP和UDP

- TCP 和 UDP
    1. 用 TCP 协议前，须先建立 TCP 连接，形成传输数据通道
    2. 传输前，采用 “三次握手” 方式，是可靠的
    3. TCP 协议进行通信的两个应用进程：客户端、服务端
    4. 在连接中可进行大数据量的传输
    5. 传输完毕，需释放已建立的连接，效率低
    6. 类似打电话
- UDP协议：
    1. 将数据、源、目的封装成数据包，不需要建立连接
    2. 每个数据报的大小限制在 64K 内，不适合传输大量数据
    3. 因无需连接，故是不可靠的
    4. 发送数据结束时无需释放资源（因为不是面向连接的），速度快
    5. 类似发短信

# 0666_InetAddress类

- 相关方法
    1. 获取本机 InetAddress 对象 getLocalHost
    2. 根据指定主机名/域名获取 IP 地址对象 getByName
    3. 获取 lnetAddress 对象的主机名 getHostName
    4. 获取 lnetAddress 对象的地址 getHostAddress
- 案例演示：InetAddress 类的使用

案例演示：[**com.zzhow.api**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/api) 中的 [**API_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/api/API_.java)

# 0667_Socket

- 基本介绍
    1. 套接字(Socket)开发网络应用程序被广泛采用，以至于成为事实上的标准
    2. 通信的两端都要有 Socket，是两台机器间通信的端点
    3. 网络通信其实就是 Socket 间的通信
    4. Socket 允许程序把网络连接当成一个流，数据在两个 Socket 间通过 IO 传输
    5. 一般主动发起通信的应用程序属客户端，等待通信请求的为服务端
- TCP 网络通信编程
    - 基本介绍
        1. 基于客户端一服务端的网络通信
        2. 底层使用的是 TCP/IP 协议
        3. 应用场景举例：客户端发送数据，服务端接受并显示控制台
        4. 基于 Socket 的 TCP 编程

# 0668_TCP字节流编程1

- 案例：应用案例 1
    - 编写一个服务器端，一个客户端
    - 服务器端在 9999 端口监听
    - 客户端连接到服务器端，发送 “Hello, server!”，然后退出
    - 服务器端接收客户端发送的信息并输出，然后退出

案例演示：[**com.zzhow.socket**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket) 中的 [**SocketTCP01Server.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP01Server.java) 与 [**SocketTCP01Client.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP01Client.java)

# 0669_TCP字节流编程2

- 案例：应用案例 2
    - 在应用案例 1 的基础上补充，服务器端收到客户端发来的消息后向客户端发送 “Hello, client!”，然后退出
    - 客户端接收服务器端发送的信息并输出，然后退出

案例演示：[**com.zzhow.socket**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket) 中的 [**SocketTCP02Server.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP02Server.java) 与 [**SocketTCP02Client.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP02Client.java)

# 0670_TCP字符流编程

- 案例：应用案例 3
    - 使用字符流
    - 编写一个服务器端，一个客户端
    - 服务器端在 9999 端口监听
    - 客户端连接到服务器端，发送 “Hello, server!”，并接收服务器端回发的 “Hello, client!”，再退出
    - 服务器端接收到客户端发送的信息并输出，并发送 “Hello, client!”，再退出

案例演示：[**com.zzhow.socket**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket) 中的 [**SocketTCP03Server.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP03Server.java) 与 [**SocketTCP03Client.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/socket/SocketTCP03Client.java)

# 0671-0673_网络上传文件

- 案例：应用案例 4
    - 编写一个服务器端，一个客户端
    - 服务器端在 9999 端口监听
    - 客户端连接到服务端，发送一张图片 D:\hello.png
    - 服务器端接收到客户端发送的图片，保存到 src 下，发送 “收到图片” 再退出
    - 客户端接收到服务端发送的 “收到图片"，再退出
    - 该程序要求使用 StreamUtils.java

案例演示：[**com.zzhow.upload**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/upload)** 中的 [**TCPFileUploadServer.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/upload/TCPFileUploadServer.java) 与 [**TCPFileUploadClient.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/upload/TCPFileUploadClient.java)

# 0674_netstat

- netstat 指令
    1. netstat -an 可以查看当前主机网络情况，包括端口监听情况和网络连接情况
    2. netstat -an | more 可以分页显示1.
    3. netstat -anb 可以查看当前主机网络情况，包括端口监听情况、网络连接情况和使用网络的程序
    4. netstat -anb | more 可以分页显示3.
    5. 要求在 DOS 控制台下执行
    - 说明：
        - LISTENING 表示某个端口正在被监听
        - 如果有一个外部程序（客户端）连接到该端口，就会显示为 ESTABLISHED

# 0675_TCP连接秘密

- TCP网络通讯不为人知的秘密
    - 当客户端连接到服务端后，实际上客户端也是通过一个端口和服务端进行通讯的，这个端口是 TCP/IP 来分配的，是随机的不确定的

# 0676_UDP原理

- 基本介绍
    1. 类 DatagramSocket 和 DatagramPacket[数据包/数据报] 实现了基于 UDP 协议网络程序
    2. UDP 数据报通过数据报套接字 DatagramSocket 发送和接收，系统不保证 UDP 数据报一定能够安全送到目的地，也不能确定什么时候可以抵达
    3. DatagramPacket 对象封装了 UDP 数据报，在数据报中包含了发送端的 IP 地址和端口号以及接收端的 IP 地址和端口号
    4. UDP 协议中每个数据报都给出了完整的地址信息，因此无须建立发送方和接收方的连接
- UDP说明
    1. 没有明确的服务端和客户端，演变成数据的发送端和接收端
    2. 接收数据和发送数据是通过 DatagramSocket 对象完成
    3. 将数据封装到 DatagramPacket 对象/装包
    4. 当接收到 DatagramPacket 对象，需要进行拆包，取出数据
    5. DatagramSocket 可以指定在哪个端口接收数据
- 基本流程
    1. 核心的两个类/对象 DatagramSocket 与 DatagramPacket
    2. 建立发送端，接收端（没有服务端和客户端概念）
    3. 发送数据前，建立数据包/报 DatagramPacket 对象
    4. 调用 DatagramSocket 的发送、接收方法
    5. 关闭 DatagramSocket

# 0677-0678_UDP网络编程

- 案例：
    - 编写一个接收端 A，一个发送端 B
    - 接收端 A 在 9999 端口等待接收数据(receive)
    - 发送端 A 向接收端 B 发送数据 “Hello“
    - 接收端 B 接收到发送端 A 发送的数据，回复 “World”，再退出
    - 发送端接收回复的数据，再退出

案例演示：[**com.zzhow.udp**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/udp) 中的 [**UDPReceiverA.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/udp/UDPReceiverA.java) 与 [**UDPSenderB.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/udp/UDPSenderB.java)

# 0681-0682_TCP文件下载

- 案例：
    - 编写一个服务器端，一个客户端
    - 客户端可以输入一个文件名，服务端收到文件名后，如果 D 盘中有此文件，给客户端返回 “找到文件，开始传输” 然后开始传输文件；如果 D 盘中没有这个文件，给客户端返回 “服务器无此文件”
    - 客户端收到文件后，保存到本地 src\ 中
    - 本质：下载指定文件的应用

案例演示：[**com.zzhow.homework**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/homework) 中的 [**Homework03Server.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/homework/Homework03Server.java) 与 [**Homework03Client.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter21_%E7%BD%91%E7%BB%9C%E7%BC%96%E7%A8%8B/src/com/zzhow/homework/Homework03Client.java)
