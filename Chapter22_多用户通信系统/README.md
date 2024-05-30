# Chapter22
第二十二章_多用户通信系统（推消息、私聊和发文件）  
Chapter22_Multi-user communication system (push messages, private chat and send files)  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0685_项目开发流程

- 项目开发流程：
    
    需求分析 → 设计阶段 → 编码实现 → 测试阶段 → 实施阶段
    
- 具体流程：
    1. 需求分析
        1. 需求分析师：懂技术 + 懂行业
        2. 出需求分析报告（白皮书），该项目功能，客户具体要求
    2. 设计阶段
        1. 架构师/项目经理
        2. 设计工作（UML 类图，流程图，模块设计，数据库，架构）
        3. 原型开发
        4. 组建团队
    3. 实现阶段
        1. 程序员/码农
        2. 完成架构师的模块功能
        3. 测试自己模块
    4. 测试阶段
        1. 测试工程师
        2. 单元测试，测试用例，白盒测试，黑盒测试，集成测试
    5. 实施阶段
        1. 实施工程师（开发能力/环境配置部署能力）
        2. 项目正确的部署到客户的平台，并保证运行正常
        3. 身体好
    6. 维护阶段
        1. 发现 bug 解决/项目升级

# 0686_多用户通信需求

- 需求分析
    1. 用户登录
    2. 拉取在线用户列表
    3. 无异常退出
    4. 私聊
    5. 群聊
    6. 发文件
    7. 服务器推送新闻

# 0687_通信系统整体分析

- 功能实现 - 用户登录
    - 功能说明
        
        人为规定 userID = admin，password = 000 登录，后面使用 HashMap 模拟数据库，可以多个用户登录
        

# 0688-0694_QQ用户登录

1. 完成通讯的类和对象：`User` 类、`Message` 类 和 `MessageType`接口
2. 完成登录界面：`QQView`类
3. 完成客户端连接服务器端：`UserClientService`类 和 与服务器端保持通信的线程`ClientConnectServerThread`类
4. 客户端登陆成功后启动`ClientConnectServerThread`线程，完成管理客户端连接服务器端的线程的类：`ManageClientConnectServerThread`类
5. 服务器端验证登录 `QQServer`类，与客户端保持通信的线程 `ServerConnectClientThread` 类
6. 服务器端完成管理服务器端连接客户端的线程的类 `ManageServerConnectClientThread` 类
7. 测试登录功能，使用 `ConcurrentHashMap` 模拟数据库存储合法用户的 userID 和 password

# 0695-0697_拉取在线用户

1. 客户端和服务器端扩充 `MessageType` 接口中的消息类型
    
    客户端 `UserClientService` 类中新增 `onlineFriend()` 方法用于向服务器端请求在线用户列表，`ClientConnectServerThread` 类中增加对 `*MESSAGE_RES_FRIEND*` 类型消息的响应
    
2. 服务器端 `ServerConnectClientThread` 类中新增对 `*MESSAGE_GET_FRIEND`* 类型消息的响应，`ManageServerConnectClientThread` 类中新增 `getOnlineUsersList()` 方法用于获取在线用户列表

# 0698-0699_无异常退出系统

1. 客户端 `UserClientService` 类中新增 `logout()` 方法用于向服务器端发送登出消息并退出客户端程序
2. 服务器端 `ManageServerConnectClientThread` 类中新增 `removeServerConnectClientThread` 方法从集合中移除已登出的用户线程对象，`ServerConnectClientThread` 类中新增对 `*MESSAGE_CLIENT_LOGOUT*` 类型消息的响应并优化客户端发生异常时的处理

# 0701-0702_私聊代码实现

1. 客户端新增 `MessageClientService` 类提供与消息相关的服务，`ClientConnectServerThread` 类中新增对 `*MESSAGE_COMMON`* 类型消息的响应
2. 服务器端 `ServerConnectClientThread` 类新增对 `*MESSAGE_COMMON`* 类型消息的响应
3. 服务器端增加对接收方在线状态的判断，客户端增加对服务器端提醒消息的响应

# 0703_群发分析实现

1. 服务器端和客户端 `MessageType` 接口扩充 `*MESSAGE_TO_ALL`* 类型消息
2. 客户端 `MessageClientService` 类新增 `sendMessageToAll` 方法用于发送群发消息到服务器端，`ClientConnectServerThread` 类新增对 `*MESSAGE_TO_ALL`* 类型消息的响应
3. 服务器端 `ManageServerConnectClientThread` 类新增 `getHashMap()` 方法，`ServerConnectClientThread` 类新增对 `*MESSAGE_TO_ALL`* 类型消息的响应

# 0705-0706_发文件实现

1. 客户端新增 `FileClientServer` 类并提供 `sendFileToOne` 方法用于发送文件信息包
2. 服务器端和客户端 `MessageType` 接口扩充 `*MESSAGE_FILE`* 类型消息，`Message` 类新增文件消息相关属性
3. 服务器端 `ServerConnectClientThread` 类新增对 `*MESSAGE_FILE`* 类型消息的响应，客户端 `ClientConnectServerThread` 类新增对`*MESSAGE_FILE`* 类型消息的响应

# 0707_服务端推送新闻

1. 服务器端新增 `SendNewsToAll` 线程用于服务器推送新闻，在 `QQServer` 的构造方法中启动该线程
2. 客户端 `ClientConnectServerThread` 类中优化收到服务器端消息的提示

# 0708_离线留言和发文件

- 扩展功能
    1. 实现离线留言，如果某个用户没有在线，当登录后，可以接收离线的消息
    2. 实现离线发文件，如果某个用户没有在线，当登录后，可以接收离线的文件
- 思路
    1. 服务器端创建集合(ConcurrentHashMap, key → receiver, value → ArrayList)，存放离线消息
    2. 当有用户登录后取出该用户的离线消息并发送
