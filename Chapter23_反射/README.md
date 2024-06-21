# Chapter23
第二十三章_反射  
Chapter23_Reflection  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0711_反射快速入门

- 案例：
    - 据配置文件 re.properties 指定信息，创建 `Cat` 对象并调用方法 `hi()`
        - classFullPath=com.zzhow.Cat
        - methodName=hi
    - 这样的需求在学习框架时特别多，即通过外部文件配置，在不修改源码情况下，来控制程序，也符合设计模式的 OCP 原则（开闭原则）

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**ReflectionQuestion.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/ReflectionQuestion.java)

# 0712_反射原理图

- Java Reflection
    1. 反射机制允许程序在执行期借助于 Reflection API 取得任何类的内部信息（比如成员变量，构造器，成员方法等等），并能操作对象的属性及方法。反射在设计模式和框架底层都会用到
    2. 加载完类之后，在堆中就产生了一个 Class 类型的对象（一个类只有一个 Class 对象），这个对象包含了类的完整结构信息。通过这个对象得到类的结构。这个对象就像一面镜子，透过这个镜子看到类的结构，所以，形象的称之为：反射
    
    ![Java反射原理图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fd45c0c45-7ef5-4d41-8860-30b403461de3%2FJava%25E5%258F%258D%25E5%25B0%2584%25E5%258E%259F%25E7%2590%2586%25E5%259B%25BE.png?table=block&id=e14b6b4e-d00f-42b0-a206-45dc56463cc0&t=e14b6b4e-d00f-42b0-a206-45dc56463cc0&width=570&cache=v2)
    
    Java反射原理图
    

# 0713_反射相关类

- Java 反射机制可以完成
    1. 在运行时判断任意一个对象所属的类
    2. 在运行时构造任意一个类的对象
    3. 在运行时得到任意一个类所具有的成员变量和方法
    4. 在运行时调用任意一个对象的成员变量和方法
    5. 生成动态代理
- 反射相关的主要类
    1. java.lang.Class：代表一个类，Class 对象表示某个类加载后在堆中的对象
    2. java.lang.reflect.Method：代表类的方法，Method 对象表示某个类的方法
    3. java.lang.reflect.Field：代表类的成员变量，Field 对象表示某个类的成员变量
    4. java.lang.reflect.Constructor：代表类的构造方法，Constructor 对象表示构造器
    - 这些类在 java.lang.reflect 包中

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**Reflection01.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/Reflection01.java)

# 0714_反射调用优化

- 反射优点和缺点
    - 优点：可以动态的创建和使用对象（也是框架底层核心），使用灵活，没有反射机制，框架技术就失去底层支撑
    - 缺点：使用反射基本是解释执行，对执行速度有影响
- 反射调用优化-关闭访问检查
    1. Method 和 Field、Constructor 对象都有 setAccessible() 方法
    2. setAccessible 作用是启动和禁止访问安全检查的开关
    3. 参数值为 true 表示反射的对象在使用时取消访问检查，提高反射的效率。参数为 false 则表示反射的对象执行访问检查

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**Reflection02.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/Reflection02.java)

# 0715_Class类分析

- 基本介绍
    1. Class 也是类，因此也继承 Object 类
    2. Class 类对象不是 new 出来的，而是系统创建的
    3. 对于某个类的 Class 类对象，在内存中只有一份，因为类只加载一次
    4. 每个类的实例都会记得自己是由哪个 Class 实例所生
    5. 通过 Class 对象可以完整地得到一个类的完整结构，通过一系列 AP
    6. Class 对象是存放在堆
    7. 类的字节码二进制数据，是放在方法区的，有的地方称为类的元数据（包括方法代码、变量名、方法名 和 访问权限 等等）[**https://www.zhihu.com/question/38496907**](https://www.zhihu.com/question/38496907)

![Class类图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F339ae7db-2928-43ee-9b4c-979e81b5cadf%2FClass%25E7%25B1%25BB%25E5%259B%25BE.png?table=block&id=e141f433-d9d0-4ea3-8aca-5feffe50cf48&t=e141f433-d9d0-4ea3-8aca-5feffe50cf48&width=1910&cache=v2)

Class类图

# 0716_Class常用方法

- Class 类的常用方法
    
    
    | 方法名 | 功能说明 |
    | --- | --- |
    | static Class forName (String name) | 返回指定类名 name 的 Class 对象 |
    | Object newInstance() | 调用缺省构造函数，返回该 Class 对象的一个实例 |
    | getName() | 返回此 Class 对象所表示的实体（类、接口、数组类、基本类型等）名称 |
    | Class[] getInterfaces() | 获取当前 Class 对象的接口 |
    | ClassLoader getClassLoader() | 返回该类的类加载器 |
    | Class getSuperclass | 返回表示此 Class 所表示的实体的超类的 Class |
    | Constructor[] getConstructors() | 返回一个包含某些 Constructor 对象的数组 |
    | Field[] getDeclaredFields() | 返回 Field 对象的一个数组 |
    | Method getMethod(String name, Class ... paramTypes) | 返回一个 Method 对象，此对象的形参类型为 paramType |

案例演示：[**com.zzhow.class_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_) 中的 [**ClassMethod.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_/ClassMethod.java)

# 0717_获取Class对象六种方法

1. 前提：已知一个类的全类名，且该类在类路径下，可通过 Class 类的静态方法 `forName()` 获取，可能拋出 ClassNotFoundException，实例：Class class1 =
Class.forName("java.lang.Cat");
应用场景：多用于配置文件，读取类全路径，加载类
2. 前提：若已知具体的类，通过类的 class 获取，该方式最为安全可靠，程序性能
最高实例：Class class2 = Cat.class;
应用场景：多用于参数传递，比如通过反射得到对应构造器对象
3. 前提：已知某个类的实例，调用该实例的 `getClass()` 方法获取 Class 对象，实例：Class class3 = 对象名.getClass();
应用场景：通过创建好的对象，获取 Class 对象
4. 其他方式
ClassLoader classLoader = 对象.getClass().getClassLoader();
Class class4 = classLoader.loadClass(”类的全类名);
5. 基本数据(int, char, boolean, float, double, byte, long, short)按如下方式得到 Class 类
对象
    
    `Class cls = 基本数据类型.class` 
    
6. 基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
    
    `Class cls = 包装类.TYPE` 
    

案例演示：[**com.zzhow.class_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_) 中的 [**GetClass.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_/GetClass.java)

# 0718_哪些类型有Class对象

- 如下类型有 Class 对象
    1. 外部类，成员内部类，静态内部类，局部内部类，匿名内部类
    2. interface：接口
    3. 数组
    4. enum：枚举
    5. annotation：注解
    6. 基本数据类型
    7. void

案例演示：[**com.zzhow.class_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_) 中的 [**AllTypeClass.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/class_/AllTypeClass.java)

# 0719_动态和静态加载

- 基本说明
反射机制是 Java 实现动态语言的关键，也就是通过反射实现类动态加载。
    1. 静态加载：编译时加载相关的类，如果没有则报错，依赖性太强
    2. 动态加载：运行时加载需要的类，如果运行时不用该类，则不报错，降低了依赖性
- 类加载时机
    1. 当创建对象时 (new) //静态加载
    2. 当子类被加载时，父类也加载 //静态加载
    3. 调用类中的静态成员时 //静态加载
    4. 通过反射 //动态加载

# 0721-0722_类加载流程图

- 类加载流程图
    
    ![类加载流程图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fdc2fd0a0-b0d2-4fca-94ba-0783628a5221%2F%25E7%25B1%25BB%25E5%258A%25A0%25E8%25BD%25BD%25E6%25B5%2581%25E7%25A8%258B%25E5%259B%25BE.png?table=block&id=e47e8efb-7330-4445-9f34-ed2c95f3afc6&t=e47e8efb-7330-4445-9f34-ed2c95f3afc6&width=2525&cache=v2)
    
    类加载流程图
    
- 类加载各阶段完成任务
    
    ![类加载各阶段完成任务](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F43acbb21-9ab4-4849-b7eb-6cb7825a23c2%2F%25E7%25B1%25BB%25E5%258A%25A0%25E8%25BD%25BD%25E5%2590%2584%25E9%2598%25B6%25E6%25AE%25B5%25E5%25AE%258C%25E6%2588%2590%25E4%25BB%25BB%25E5%258A%25A1.png?table=block&id=0457f953-37c8-4214-abe8-c7a29bccd744&t=0457f953-37c8-4214-abe8-c7a29bccd744&width=1629&cache=v2)
    
    类加载各阶段完成任务
    
    - 加载阶段
        
        JVM 在该阶段的主要目的是将字节码从不同的数据源（可能是 class 文件、也可能是
        jar 包，甚至网络）转化为二进制字节流加载到内存中，并生成一个代表该类的
        java.lang.Class 对象
        
    - 连接阶段-验证
        - 目的是为了确保 Class 文件的字节流中包含的信息符合当前虚拟机的要求，并且不
        会危害虚拟机自身的安全
        - 包括：文件格式验证（是否以魔数 oxcafebabe 开头）、元数据验证、字节码验证和
        符号引用验证
        - 可以考虑使用 -Xverify:none 参数来关闭大部分的类验证措施，缩短虚拟机类加载
        的时间
    - 连接阶段-准备
        - JVM 会在该阶段对静态变量，分配内存并初始化（对应数据类型的默认初始值，
        如 0.0L、null、false 等），这些变量所使用的内存都将在方法区中进行分配
    - 连接阶段-解析
        - 虚拟机将常量池内的符号引用替换为直接引用的过程
    - Initialization（初始化）
        - 到初始化阶段，才真正开始执行类中定义的 Java 程序代码，此阶段是执行
        <clinit>() 方法的过程
        - <clinit>() 方法是由编译器按语句在源文件中出现的顺序，依次自动收集类中的所有
        静态变量的赋值动作和静态代码块中的语句，并进行合并
        - 虚拟机会保证一个类的 <clinit>() 方法在多线程环境中被正确地加锁、同步，如果
        多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的 <clinit>() 方
        法，其他线程都需要阻塞等待，直到活动线程执行 <clinit> 方法完毕

# 0723_0724获取类结构信息

- 第一组：java.lang.Class 类
    1. getName：获取全类名
    2. getSimpleName：获取简单类名
    3. getFields：获取所有 public 修饰的属性，包含本类以及父类的
    4. getDeclaredFields：获取本类中所有属性
    5. getMethods：获取所有 public 修饰的方法，包含本类以及父类的
    6. getDeclaredMethods：获取本类中所有方法
    7. getConstructors：获取所有 public 修饰的构造器，包含本类以及父类的
    8. getDeclaredConstructors：获取本类中所有构造器
    9. getPackage：以 Package 形式返回 包信息
    10. getSuperClass：以 Class 形式返回父类信息
    11. getlnterfaces：以 Class[] 形式返回接口信息
    12. getAnnotations：以 Annotation[] 形式返回注解信息
- 第二组：java.lang.reflect.Field 类
    1. getModifiers：以 int 形式返回修饰符
        
        [说明：默认修饰符是 0，public 是 1，private 是 2，protected 是 4，static 是 8，final 是 16，public(1) + static(8) = 9]
        
    2. getType：以 Class 形式返回类型
    3. getName：返回属性名
- 第三组：java.lang.reflect.Method 类
    1. getMlodifiers：以 int 形式返回修饰符
    [说明：默认修饰符是 0，public 是 1，private 是 2，protected 是 4，static 是 8，final 是 16]
    2. getReturnType：以 Class 返回方法返回值类型
    3. getName：返回方法名
    4. getParameterTypes：以 Class 返回参数类型数组
- 第四组：java.lang.reflect.Constructor 类
    1. getModifiers：以 int 形式返回修饰符
    2. getName：返回构造器名（全类名）
    3. getParameterTypes：以 Class[] 返回参数类型数组

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**ReflectionUtils.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/ReflectionUtils.java)

# 0725_反射爆破创建实例

1. 方式一：调用类中的 public 修饰的无参构造器
2. 方式二：调用类中的指定构造器
3. Class 类相关方法
    - newlnstance()：调用类中的无参构造器，获取对应类的对象
    - getConstructor(Class…class)：根据参数列表，获取对应的 public 构造器对象
    - getDecalaredConstructor(Class...class)：根据参数列表，获取对应的所有构造器对象
4.  Constructior 类相关方法
    - setAccessible：暴破
    - newlnstance(Object…obj)：调用构造器
- 案例：
    - 测试 1：通过反射创建某类的对象，要求该类中必须有 public 的无参构造
    - 测试 2：通过调用某个特定构造器的方式，实现创建某类的对象

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**ReflectCreateInstance.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/ReflectCreateInstance.java)

# 0726_反射爆破操作属性

- 访问属性
    1. 根据属性名获取Field对象
    Field f = Class对象.getDeclaredField(属性名);
    2. 暴破：f.setAccessible(true); //f 是 Field
    3. 访问
    f.set(o, 值);
    syso(f.get(o));
    4. 如果是静态属性，则 set 和 get 中的参数 o，可以写成 null

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**ReflectAccessProperty.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/ReflectAccessProperty.java)

# 0727_反射爆破操作方法

- 访问方法
    1. 根据方法名和参数列表获取 Method 方法对象：Method m =
    Class对象.getDeclaredMethod(方法名, XX.class);
    2. 获取对象：Object o = Class对象.newlnstance();
    3. 暴破：m.setAccessible(true);
    4. 访问：Object returnValue = m.invoke(o.实参列表);
    5. 注意：如果是静态方法，则 invoke 的参数 o，可以写成 null
    6. 如果方法有返回值，统一以 Object 类型返回

案例演示：[**com.zzhow.reflection**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection) 中的 [**ReflectAccessMethod.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter23_%E5%8F%8D%E5%B0%84/src/com/zzhow/reflection/ReflectAccessMethod.java)
