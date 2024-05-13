# Chapter17
第十七章_多线程基础  
Chapter17_Fundamentals of multithreading  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0579_程序进程线程

- 程序(Program)
    
    是为完成特定任务、用某种语言编写的一组指令的集合。简单的说：就是我们写的代码。
    
- 进程(Process)
    1. 指运行中的程序。比如：使用QQ，就启动了一个进程，操作系统就会为该进程分配内存空间；使用迅雷，又启动了一个进程，操作系统将为迅雷分配新的内存空间。
    2. 指程序的一次执行过程，或是正在运行的一个程序。是动态过程：有它自身的产生、存在和消亡的过程。
- 线程(Thread)
    1. 线程由进程创建的，是进程的一个实体
    2. 一个进程可以拥有多个线程

# 0580_并发并行

- 相关概念：
    1. 单线程：同一个时刻，只允许执行一个线程
    2. 多线程：同一个时刻，可以执行多个线程。比如：一个 QQ 进程，可以同时打开多个聊天窗口；一个迅雷进程，可以同时下载多个文件
    3. 并发：同一个时刻，多个任务交替执行，造成一种“貌似同时“的错觉，简单的说，单核 CPU 实现的多任务就是并发
    4. 并行：同一个时刻，多个任务同时执行。多核 CPU 可以实现并行
- 案例：使用 Java 查看当前电脑的 CPU 核心数

案例演示：**[com.zzhow.cpunum](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/cpunum)** 中的 **[CPUNum.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/cpunum)**

# 0581_继承Thread创建线程

- 创建线程的两种方式
    1. 继承 Thread 类，重写 run 方法
    2. 实现 Runnable 接口，重写 run 方法
- 案例：继承 Thread 类
    1. 请编写程序，开启一个线程，该线程每隔 1 秒。在控制台输出“Hello”
    2. 对上题改进：当输出 80 次“Hello”，结束该线程
    3. 使用 JConsole 监控线程执行情况，并画出程序示意图！

案例演示：**[com.zzhow.threaduse](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)** 中的 **[Thread01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)**

# 0582_多线程机制

- 可在终端中输入 Jconsole 调出 Java 监视和管理控制台，监控线程的运行的情况

# 0583_为什么是start

- `start()` 方法中会调用 `start0()` 方法
- `start0()` 方法是本地方法，由 JVM 调用，底层是C/C++实现的
- 真正实现多线程效果的 `start0()` 而不是 `run()`

# 0584_Runnable创建线程

- 说明：
    1. Java 是单继承的，在某些情况下一个类可能已经继承了某个父类，这时在用继承 Thread 类方法来创建线程显然不可能了
    2. Java 设计者们提供了另外一个方式创建线程，就是通过实现 Runnable 接口来创建线程
- 案例：
    
    编写程序，该程序可以每隔 1 秒。在控制台输出 “hi!” ，当输出 10 次后，自动退出。请使用实现 Runnable 接口的方式实现
    
    Thread 这里底层使用了 [代理模式] 的设计模式
    

案例演示：**[com.zzhow.threaduse](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)** 中的 **[Thread02.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)**

# 0585_多个子线程案例

- 继承 Threadvs 实现 Runnable 的区别
    1. 从 Java 的设计来看，通过继承 Thread 或者实现 Runnable 接口来创建线程本质上没有区别，从 JDK 帮助文档我们可以看到 Thread 类本身就实现了 Runnable 接口 `start()` → `start0()`
    2. . 实现 Runnable 接口方式更加适合多个线程共享一个资源的情况，并且避免了单继承的限制 **[建议使用 Runnable 接口]**
- 案例：
    
    编写一个程序，创建两个线程，一个线程每隔 1 秒输出 “hello, world”，输出 10 次，退出，一个线程每隔 1 秒输出出 “hi”，输出 5 次退出
    

案例演示：**[com.zzhow.threaduse](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)** 中的 **[Thread03.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/threaduse)**

# 0586_多线程售票问题

- 案例：程模拟三个售票窗口售票，分别使用继承 Thread 类和实现 Runnable 接口的方式
    - 会出现超售的问题

案例演示：**[com.zzhow.ticket](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/ticket)** 中的 **[SellTicket.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/ticket/SellTicket.java)**

# 0587_通知线程退出

- 基本说明
    1. 线程完成任务后，会自动退出
    2. 可以通过使用变量来控制 run 方法退出的方式停止线程，即通知方式
- 案例：启动一个线程 T，要求在 main 线程中停止线程 T。

案例演示：**[com.zzhow.exit_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/exit_)** 中的 **[ThreadExit.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/exit_/ThreadExit.java)**

# 0588_线程中断

- 常用方法第一组：
    1. `setName()` //设置线程名称，使之与参数 name 相同
    2. `getName()` //返回该线程的名称
    3. `start()` //使该线程开始执行；Java 虚拟机底层调用该线程的 `start0()` 方法
    4. `run()` //调用线程对象 `run()` 方法
    5. `setPriority()` //更改线程的优先级
    6. `getPriority()` //获取线程的优先级
        
        ![ThreadPriorities](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fb6539f33-f0a1-4808-8d8a-c2592f120179%2FThreadPriorities.png?table=block&id=bc24051b-b6cd-426c-8930-f62f02275bf9&t=bc24051b-b6cd-426c-8930-f62f02275bf9&width=652&cache=v2)
        
        ThreadPriorities
        
    7. `sleep()` //在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
    8. `interrupt()` //中断线程
- 注意事项和细节：
    1. `start()` 底层会创建新的线程，调用 `run()`，`run()` 就是一个简单的方法调用，不会启动新线程
    2. 线程优先级的范围
    3. `interrupt()` 中断线程，但并没有真正的结束线程。所以一般用于中断正在休眠线程
    4. `sleep()` 线程的静态方法，使当前线程休眠

案例演示：**[com.zzhow.method](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method)** 中的 **[ThreadMethod01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method/ThreadMethod01.java)**

# 0589_线程插队

- 常用方法第二组
    1. `yield()`线程的礼让。让出 CPU，让其他线程执行，但礼让的时间不确定，所以也不一定礼让成功
    2. `join()`线程的插队。插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务
- 案例：创建一个子线程，每隔 1s 输出 hello，输出 20 次，主线程每隔 1 秒，输出 “hi”，输出 20 次。要求：两个线程同时执行，当主线程输出5次后，就让子线程运行完毕，主线程再继续执行

案例演示：**[com.zzhow.method](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method)** 中的 **[ThreadMethod02.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method/ThreadMethodExercise.java)**

# 0590_线程插队练习

- 案例：
    1. 主线程每隔 0.5s，输出 hi，一共 10 次
    2. 当输出到 hi 5 时，启动一个子线程（要求实现 Runnable），每隔 0.5s 输出 hello，等该线程输出 10 次 hello 后，退出
    3. 主线程继续输出 hi，直到主线程退出

案例演示：**[com.zzhow.method](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method)** 中的 **[ThreadMethodExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method/ThreadMethodExercise.java)**

# 0591_守护线程

- 用户线程和守护线程
    1. 用户线程：也叫工作线程，当线程的任务执行完或通知方式结束
    2. 守护线程：一般是为工作线程服务的，当所有的用户线程结束，守护线程自动结束
    3. 常见的守护线程：垃圾回收机制
- 如何设置为守护线程
    
    `deamonThread.setDaemon(true);`
    

案例演示：**[com.zzhow.method](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method)** 中的 **[ThreadMethod03.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/method/ThreadMethod03.java)**

# 0592_线程7大状态

- JDK 中用 Thread.State 枚举表示了线程的几种状态
    
    ![ThreadState](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fd509569f-e817-4288-bd0b-9b27f34de544%2FThreadState.png?table=block&id=0d0193b6-6e46-44b2-bdce-572ac20f8b1b&t=0d0193b6-6e46-44b2-bdce-572ac20f8b1b&width=708&cache=v2)
    
    ThreadState
    
    - 其中 Runnable 状态又可以细分为 Ready 和 Running 状态
- 线程转换图

# 0593_线程同步机制

Synchronized：adj.同步的

- 线程同步机制
    1. 在多线程编程，一些敏感数据不允许被多个线程同时访问，此时就使用同步访问技术，保证数据在任何时刻，最多有一个线程访问，以保证数据的完整性
    2. 理解：当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作，其他线程才能对该内存地址进行操作
- 同步具体方法 - Synchronized
    1. 同步代码块
        
        ```java
        synchronized (对象) {//得到对象的锁，才能操作同步代码
        	//需要被同步代码;
        }
        ```
        
    2. synchronized 还可以放在方法声明中，表示整个方法 - 为同步方法
        
        ```java
        public synchronized void method (String name){
        	//需要被同步的代码
        }
        ```
        
- 案例：解决 0586_多线程售票问题

案例演示：**[com.zzhow.synchronized_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/synchronized_)** 中的 **[SellTicketSynchronized.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/synchronized_/SellTicketSynchronized.java)**

# 0594_互斥锁

- 基本介绍
    1. Java 语言中，引入了对象互斥锁的概念，来保证共享数据操作的完整性
    2. 每个对象都对应于一个可称为“互斥锁”的标记，这个标记用来保证在任一时刻，只能有一个线程访问该对象
    3. 关键字 synchronized 来与对象的互斥锁联系。当某个对象用 synchronized 修饰时，表明该对象在任一时刻只能由一个线程访问
    4. 同步的局限性：导致程序的执行效率要降低
    5. 同步方法（非静态的）的锁可以是 this，也可以是其他对象（要求是同一个对象）
    6. 同步方法（静态的）的锁为当前类本身
- 注意事项和细节
    1. 同步方法如果没有使用 static 修饰：默认锁对象为 this
    2. 如果方法使用 static 修饰，默认锁对象：当前类.class
    3. 实现的落地步骤：
        - 需要先分析上锁的代码
        - 选择同步代码块或同步方法
        - 要求多个线程的锁对象为同一个即可

# 0595_线程死锁

- 基本介绍
    
    多个线程都占用了对方的锁资源，但不肯相让，导致了死锁，在编程是一定要避免死锁的发生
    
- 生活案例
    - 妈妈：你先完成作业，才让你玩手机
    - 小明：你先让我玩手机，我才完成作业

案例演示：**[com.zzhow.synchronized_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/synchronized_)** 中的 [**DeadLock.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter17_%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%9F%BA%E7%A1%80/src/com/zzhow/synchronized_/DeadLock.java)

# 0596_释放锁

- **会释放**锁的操作
    1. 当前线程的同步方法、同步代码块执行结束
    2. 当前线程在同步代码块、同步方法中遇到 break、return
    3. 当前线程在同步代码块、同步方法中出现了未处理的 Error 或 Exception，导致异常结束
    4. 当前线程在同步代码块、同步方法中执行了线程对象的 wait() 方法，当前线程暂停，并释放锁
- **不会释放**锁的操作
    1. 线程执行同步代码块或同步方法时，程序调用 Thread.sleep()、Thread.yield()方法暂停当前线程的执行，不会释放锁
    2. 线程执行同步代码块时，其他线程调用了该线程的 suspend() 方法将该线程挂起，该线程不会释放锁
- 应尽量避免使用 suspend() 和 resume() 来控制线程，这两个方法不再推荐使用
