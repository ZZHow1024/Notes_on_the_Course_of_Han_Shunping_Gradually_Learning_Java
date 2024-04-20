# Chapter10
第十章_面向对象编程[高级部分]  
Chapter10_Object Oriented Programming [Advanced]  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow1024

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0374_类变量快速入门

- 案例：有一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在共有多少人在玩？编写程序解决。
- 提示：类变量可以通过类名来访问。

案例演示：[com.dnx.static_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/static_) 中的 [ChildGame.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/static_/ChildGame.java)

# 0375_类变量内存剖析

- 在JDK8之前的版本，类变量(静态变量)放在方法区的静态域里。
- 在JDK8以及之后的版本，类变量(静态变量)放在堆里。
- 共识：
    1. static变量是同一个类所有对象共享。
    2. static变量，在类加载的时候就生成了。

# 0376_类变量定义访问

- 什么是类变量
    
    类变量也叫静态变量/静态属性，是该类的所有对象共享的变量，任何一个该类的对象去访问它时，取到的都是相同的值，同样任何一个该类的对象去修改它时，修改的也是同一个变量。这个从前面的图也可看出来。
    
- 如何定义类变量
    
    ```java
    访问修饰符 static 数据类型 变量名;[推荐]
    static 访问修饰符 数据类型 变量名;
    ```
    
- 如何访问类变量
    
    ```java
    类名.类变量名[推荐]
    对象名.类变量名
    ```
    

# 0377_类变量使用细节

1. 什么时候需要用类变量
    
    当我们需要让某个类的所有对象都共享一个变量时，就可以考虑使用类变量(静态变量)
    
    比如：定义学生类，统计所有学生共交多少钱。
    
2. 类变量与实例变量(普通属性)区别
    
    类变量是该类的所有对象共享的，而实例变量是每个对象独享的。
    
3. 加上static称为类变量或静态变量，否则称为实例变量/普通变量/非静态变量。
4. 类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，但Java设计者推荐我们使用 类名.类变量名方式访问。【前提是 满足访问修饰符的访问权限和范围】
5. 实例变量不能通过 类名.类变量名 方式访问。
6. 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了就可以使用类变量了。
7. 类变量的生命周期是随类的加载开始，随着类消亡而销毁。

# 0378_类方法快速入门

- 类方法也叫静态方法
- 如何定义类方法
    
    ```java
    访问修饰符 static 数据返回类型 方法名(){[推荐]
    
    }
    static 访问修饰符 数据返回类型 方法名(){
    
    }
    ```
    
- 如何访问类方法
    
    ```java
    类名.类方法名
    对象名.类方法名
    [前提是 满足访问修饰符的访问权限和范围]
    ```
    
- 案例：统计学费总和

案例演示：[com.dnx.static_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/static_) 中的 [StaticMethod.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/static_/StaticMethod.java)

# 0379_类方法最佳实践

- 类方法经典的使用场景
    
    当方法中不涉及到任何和对象相关的成员，则可以将方法设计成静态方法,提高开发效率。
    
    比如：工具类中的方法 utils
    
    Math类、Array类、Collections集合类
    
- 在程序员实际开发，往往会将一些通用的方法，设计成静态方法，这样我们不需要创建对象就可以使用了，比如打印一维数组，冒泡排序,完成某个计算任务 等。

# 0380_类方法注意事项

1. 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区：
    - 类方法中无this的参数
    - 普通方法中隐含着this的参数
2. 类方法可以通过类名调用，也可以通过对象名调用。
3. 普通方法和对象有关，需要通过对象名调用，比如对象名.方法名(参数)，不能通过类名调用。
4. 类方法中不允许使用和对象有关的关键字，比如this和super。普通方法(成员方法)可以。
5. 类方法(静态方法)中 只能访问 静态变量 或静态方法 。
6. 普通成员方法，既可以访问 非静态成员，也可以访问静态成员。
- 静态方法，只能访问静态的成员，非静态的方法，可以访问静态成员和非静态成员(必须遵守访问权限)。

# 0382_main语法说明

- 深入理解main方法
- `public static void main(String[] args) {        }`
1. main方法是Java虚拟机调用。
2. Java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public。
3. Java虚拟机在执行main()方法时不必创建对象，所以该方法必须是static。
4. 该方法接收String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数。
    - 案例：接收参数
    
    ![接收参数](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F9a92657e-302c-4f5a-9d78-2c3462be39f9%2F%25E6%258E%25A5%25E6%2594%25B6%25E5%258F%2582%25E6%2595%25B0.jpg?table=block&id=5caadd8b-9f4a-413e-a9be-fd16393d3f8d&t=5caadd8b-9f4a-413e-a9be-fd16393d3f8d)
    
    接收参数
    
    案例演示：[Main.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/Main.java)
    
5. java 执行的程序 参数1 参数2 参数3。

# 0383_main特别说明

1. 在main()方法中，我们可以直接调用main方法所在类的静态方法或静态属性。
2. 但是，不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静态成员。

# 0384_main动态传值

- 在IDEA中传递参数
    - 在运行时填写Program arguments

![在IDEA中传递参数1](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Ffc387ba4-f33c-48ec-87d4-7289e2cebab6%2F%25E5%259C%25A8IDEA%25E4%25B8%25AD%25E4%25BC%25A0%25E9%2580%2592%25E5%258F%2582%25E6%2595%25B01.jpg?table=block&id=da441767-df35-4fa1-942e-56b9367bfd17&t=da441767-df35-4fa1-942e-56b9367bfd17)

在IDEA中传递参数1

![在IDEA中传递参数2](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fae65f5f4-a405-47f0-a1de-1f3baee1fb53%2F%25E5%259C%25A8IDEA%25E4%25B8%25AD%25E4%25BC%25A0%25E9%2580%2592%25E5%258F%2582%25E6%2595%25B02.jpg?table=block&id=3343a62d-f0b5-4212-8407-0eea53da402e&t=3343a62d-f0b5-4212-8407-0eea53da402e)

在IDEA中传递参数2

# 0385_代码块快速入门

- 代码化块又称为初始化块，属于类中的成员[即 是类的一部分]，类似于方法，将逻辑语句封装在方法体中，通过{ }包围起来。
- 但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用。
- 基本语法
    
    ```java
    [修饰符]{
    	代码;
    };
    ```
    
- 说明注意：
    1. 修饰符可选，要写的话，也只能写 static。
    2. 代码块分为两类，使用static修饰的叫静态代码块，没有static修饰的，叫普通代码块/非静态代码块。
    3. 逻辑语句可以为任何逻辑语句(输入、输出、方法调用、循环、判断等)。
    4. ; 号可以写上，也可以省略。
- 韩老师的理解：
    
    

# 0386-0389_代码块使用细节

1. static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载而执行，并且只会执行一次。如果是普通代码块，每创建一个对象，就执行。
2. 类什么时候被加载
    1. 创建对象实例时(new)
    2. 创建子类对象实例，父类也会被加载
    3. 使用类的静态成员时(静态属性，静态方法)
3. 普通的代码块，在创建对象实例时，会被隐式的调用。
    
    被创建一次，就会调用一次。
    
    如果只是使用类的静态成员时，普通代码块并不会执行。
    
4. 创建一个对象时，在一个类调用顺序是：
    1. 调用**静态代码块**和**静态属性初始化**(注意：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用)
    2. 调用**普通代码块**和**普通属性的初始化**(注意：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
    3. 调用**构造方法(构造器)**。
5. 构造方法(构造器)的最前面其实隐含了 **super()** 和 **调用普通代码块。**静态相关的代码块，属性初始化，在类加载时就执行完毕，因此是优先于构造器和普通代码块执行的。
    
    ```java
    class A{
    	public A(){//构造器
    		//这里有隐藏的执行要求
    		//(1).super();
    		//(2).调用普通代码块
    		System.out.println("DNX");
    	}
    }
    ```
    
6. 我们看一下创建一个子类时(继承关系)，他们的静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下：
    1. 父类的静态代码块和静态属性(优先级一样，按定义顺序执行)
    2. 子类的静态代码块和静态属性(优先级一样，按定义顺序执行)
    3. 父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
    4. 父类的构造方法
    5. 子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
    6. 子类的构造方法
7. 静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调用任意成员。

# 0391_单例模式饿汉式

- 什么是单例模式
    
    单例(单个的实例)
    
    1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。
    2. 单例模式有两种方式：
        1. 饿汉式
        2. 懒汉式
- 案例：饿汉式的实现。
- 单例模式-**饿汉式**：
    1. 将构造器私有化 —> 防止直接new
    2. 在类的内部直接创建
    3. 提供一个公共的static方法getInstance，返回对象

饿汉式的弊端：饿汉式可能造成创建了对象但没有使用。

案例演示：[com.dnx.single_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/single_) 中的 [SingleTon01.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/single_/SingleTon01.java)

# 0392_单例模式懒汉式

- 案例：懒汉式的实现。
- 单例模式-**懒汉式**：
1. 将构造器私有化
2. 定义一个static静态属性对象
3. 提供一个public的static方法getInstance，返回对象

案例演示：[com.dnx.single_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/single_) 中的 [SingleTon02.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/single_/SingleTon02.java)

- 饿汉式VS懒汉式
    1. 二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建。
    2. 饿汉式不存在线程安全问题，懒汉式存在线程安全问题。
    3. 饿汉式存在浪费资源的可能。因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题。
    4. 在JavaSE标准类中，java.lang.Runtime就是经典的单例模式。

# 0393_final基本使用

- final 可以修饰类、属性、方法和局部变量。
- 有以下需求时，就会使用到final：
    1. 当不希望类被继承时
    2. 当不希望父类的某个方法被子类覆盖/重写(override)时
    3. 当不希望类的的某个属性的值被修改时
    4. 当不希望某个局部变量被修改时

案例演示：[com.dnx.final_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/final_) 中的 [Final01.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/final_/Final.java)

# 0394-0395_final使用细节

1. final修饰的属性又叫常量,一般 用 xx xx xx来命名
2. final修饰的属性在定义时，必须赋初值，并且以后不能再修改，初始化可以在：
    1. 定义时
    2. 在构造器中
    3. 在代码块中
3. 如果final修饰的属性是静态的，则初始化的位置只能是：
    1. 定义时
    2. 在静态代码块，不能在构造器中赋值
4. final类不能继承，但是可以实例化对象
5. 如果类不是final类但是含有final方法，则该方法虽然不能重写，但是可以被继承
6. 一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
7. final不能修饰构造方法(构造器)
8. final 和 static 往往搭配使用，不会导致类加载，效率更高，底层编译器做了优化处理
    
    ```java
    class Demo{
    	public static final int i = 1;
    	static{
    		System.out.println("DNX");
    	}
    }
    ```
    
9. 包装类(Integer、Double、Float、Boolean)等都是final，String也是final类。

# 0397_抽象类引出

- 当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类。
- 当父类的一些方法不能确定时,可以用abstract关键字来修饰该方法，这个方法就是抽象方法，用abstract 来修饰该类就是抽象类。
- 把Animal做成抽象类，可以让子类Cat类实现抽象类。
- 当一个类中存在抽象方法时，需要将该类声明为abstract类。

案例演示：[com.dnx.abstract_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/abstract_) 中的 [Abstract.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/abstract_/Abstract.java)

# 0398-0399_抽象类细节

- 介绍：
    1. 用 abstract 关键字来修饰一个类时，这个类就叫抽象类
        
        `访问修饰符 abstract 类名{`
        
        `}`
        
    2. 用 abstract 关键字来修饰一个方法时，这个方法就是抽象方法
        
        `访问修饰符 abstract 返回类型 方法名(参数列表);//没有方法体`
        
    3. 抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类
    4. 抽象类，是考官比较爱问的知识点，在框架和设计模式使用较多
- 细节：
    1. 抽象类不能被实例化
    2. 抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法
    3. 一旦类包含了abstract方法，则这个类必须声明为abstract
    4. abstract 只能修饰类和方法，不能修饰属性和其它的
    5. 抽象类可以有任意成员，因为抽象类还是类
        
        如：非抽象方法、构造器、静态属性等等
        
    6. 抽象方法不能有主体，即不能实现（不能出现{ }）
    7. 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类
    8. 抽象方法不能使用private、final 和 static来修饰，因为这些关键字都是和重写相违背的

# 0401_抽象模板模式

- 抽象类的最佳实践。
- 案例：
    1. 有多个类，完成不同的任务job
    2. 要求能够得到各自完成任务的时间
- 设计一个抽象类(Template)，能完成如下功能：
    1. 编写方法calculateTime()，可以计算某段代码的耗时时间
    2. 编写抽象方法job()
    3. 编写一个子类Sub，继承抽象类Template，并实现job方法
    4. 编写一个测试类TestTemplate，看看是否好用
    
    ```java
    public abstract class Template {
        public abstract void job();
        public void calculateTime() {
            //得到开始的时间
            long startTime = System.currentTimeMillis();
            job();
            //得到结束的时间
            long endTime = System.currentTimeMillis();
            System.out.println(jobName + "任务执行时间" + (endTime - startTime) + "毫秒");
        }
    }
    ```
    

案例演示：[com.dnx.abstract_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/abstract_) 中的 [TestTemplate.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/abstract_/TestTemplate.java)

# 0402_接口快速入门

- 案例：模拟现实生活中手机和相机插入电脑的USB接口。

案例演示：[com.dnx.interface_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_) 中的 [Interface.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_/Interface.java)

# 0403_接口基本介绍

- 接口就是给出一些没有实现的方法,封装到一起,到某个类要使用的时候,在根据具体情况把这些方法写出来。
- 语法：
    
    ```java
    interface 接口名{
    	//属性
    	//方法(1.抽象方法 2.默认实现方法 3.静态方法)
    }
    
    class 类名 implements 接囗{
    	//自己的属性
    	//自己的方法
    	//必须实现的接口的抽象方法
    }
    ```
    
- 在接口中，抽象方法可以省略abstract关键字。
- 提示：
    1. 在JDK 7 之前，接口里的所有方法都没有方法体，即都是抽象方法
    2. 在JDK 8 及之后，接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现，**但需要用default关键字修饰**

# 0405-0406_接口使用细节

1. 接口不能被实例化
2. 接口中所有的方法是 public方法，接口中抽象方法，可以不用abstract 修饰
    
    `void aaa()` 实际是 `abstract public void aaa()` 
    
3. 一个普通类实现接口，就必须将该接口的所有方法都实现
4. 抽象类实现接口，可以不用实现接口的方法
5. 一个类同时可以实现多个接口
6. 接口中的属性，只能是final的，而且是 public static final 修饰符
7. 接口中属性的访问形式：接口名.属性名
8. 一个接口不能继承其它的类，但是可以继承多个别的接口
9. 接口的修饰符只能是 public 和默认，这点和类的修饰符是一样的 

# 0408_接口VS继承

- 接口和继承解决的问题不同
    - 继承的价值主要在于：解决代码的复用性和可维护性。
    - 接口的价值主要在于：设计好各种规范(方法)，让其它类去实现这些方法。
- 接口比继承更加灵活
    - 接口比继承更加灵活，继承是满足 is - a 的关系，而接口只需满足 like - a 的关系。
- 接口在一定程度上实现代码解耦[接口规范性+动态绑定]

# 0409_接口多态特性

1. 多态参数
    
    在前面的Usb接口案例，Usb usb，既可以接收手机对象，又可以接收相机对象，就体现了接口多态(接口引用可以指向实现了接口的类的对象)
    
2. 多态数组
    
    案例：给 Usb 数组中，存放 Phone_ 和 Camera_ 对象，Phone 类还有一个特有的方法 call()。遍历Usb数组，如果是Phone对象，除了调用Usb 接口定义的方法外，还需要调用Phone 特有方法 call()
    
    案例演示：[com.dnx.interface_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_) 中的 [InterfacePolyArr.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_/InterfacePolyArr.java)
    
3. 接口存在多态传递现象

# 0410_接口多态传递

- 案例：演示多态传递现象

案例演示：[com.dnx.interface_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_) 中的 [InterfacePolyPass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/interface_/InterfacePolyPass.java)

# 0412_四种内部类

- 基本介绍：
    
    一个类的内部又完整的嵌套了另一个类结构。被嵌套的类称为内部类(inner class)，嵌套其他类的类称为外部类(outer class)。
    
    是我们类的第五大成员。
    
    内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系。
    
- 基本语法：
    
    ```java
    class Outer{ // 外部类
    	class Inner{ // 内部类
    	}
    }
    class Other{ // 外部其他类
    }
    ```
    

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [InnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/InnerClass.java)

- 内部类的分类：
    - 定义在外部类局部位置上（比如方法内）：
        1. 局部内部类（有类名）
        2. 匿名内部类（没有类名，重点）
    - 定义在外部类的成员位置上：
        1. 成员内部类（没用static修饰）
        2. 静态内部类（使用static修饰）

# 0413-0414_局部内部类

- 说明：
    - 局部内部类是定义在外部类的局部位置，比如方法中，并且有类名。
    1. 可以直接访问外部类的所有成员，包含私有的
    2. 不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符的。但是可以使用final 修饰，因为局部变量也可以使用final
    3. 作用域：仅仅在定义它的方法或代码块中
    4. 局部内部类———访问———>外部类的成员[访问方式：直接访问]
    5. 外部类———访问———>局部内部类的成员[访问方式：船舰对象，再访问，必须在作用域内]
    6. 外部其他类———不能访问———>局部内部类（因为局部内部类地位是一个局部变量）
    7. 如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用 外部类名.this.成员 去访问

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [LocalInnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/LocalInnerClass.java)

# 0415_匿名内部类本质

- 说明：
    - 匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名。
- 特点：
    - 本质是类
    - 内部类
    - 该类没有名字
    - 同时还是一个对象
- 基本语法：
    
    ```java
    new 类或接口(参数列表){
    	类体
    };
    ```
    

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [AnonymousLocalInnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/AnonymousLocalInnerClass.java)

# 0416_匿名内部类使用

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [AnonymousLocalInnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/AnonymousLocalInnerClass.java)

# 0417_匿名内部类细节

1. 匿名内部类的语法比较奇特，请大家注意，因为匿名内部类既是一个类的定义同时它本身也是一个对象，因此从语法上看，它既有定义类的特征，也有创建对象的特征，对前面代码分析可以看出这个特点，因此可以调用匿名内部类方法。
2. 可以直接访问外部类的所有成员，包含私有的。
3. 不能添加访问修饰符，因为它的地位就是一个局部变量。
4. 作用域：仅仅在定义它的方法或代码块中。
5. 匿名内部类———访问———>外部类成员[访问方式：直接访问]。
6. 外部其他类———不能访问———>匿名内部类（因为匿名内部类地位是一个局部变量）。
7. 如果外部类和内部类的成员重名时，内部类访问的话，默认遵循就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问。

# 0419-0420_成员内部类

- 说明：成员内部类是定义在外部类的成员位置，并且没有 static 修饰。
- 注意：成员内部类是定义在外部类的成员位置上
1. 可以直接访问外部类的所有成员，包含私有的。
2. 可以添加任意访问修饰符(public、protected、默认、private)因为它的地位就是一个成员。
3. 作用域和外部类的其他成员一样，为整个类体比如前面案例，在外部类的成员方法中创建成员内部类对象，再调用方法。
4. 成员内部类———访问———>外部类(比如：属性)[访问方式：直接访问]
5. 外部类———访问———>内部类[访问方式：创建对象，再访问]
6. 外部其他类———访问———>成员内部类
    1. 访问方式1：`outer03.new Inner03();`
    2. 访问方式2：在外部类中编写一个方法，可以返回 Inner03 对象。`outer03.getInner03Instance();`
    3. 访问方式3：`new Outer03().new Inner03();`
7. 如果外部类和内部类的成员重名时，内部类访问成员默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问。

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [MemberInnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/MemberInnerClass.java)

# 0421-0422_静态内部类

- 说明：静态内部类是定义在外部类的成员位置，并且有static修饰。
1. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员。
2. 可以添加任意访问修饰符(public、protected、默认、private)，因为它的地位就是一个成员。
3. 作用域：同其他的成员，为整个类体。
4. 静态内部类———访问———>外部类(比如：静态属性)[访问方式：直接访问所有静态成员]
5. 外部类———访问———>静态内部类 [访问方式：创建对象，再访问]
    1. 访问方式1：`new Outer04.Inner04();`
    2. 访问方式2：在外部类中编写一个方法，可以返回 Inner04 对象。`outer04.getInner04Instance();`
    3. 访问方式3：在外部类中编写一个静态方法，可以返回 Inner04 对象。`Outer04.*getInner04*();` 
6. 如果外部类和静态内部类的成员重名时，静态内部类访问的时，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.成员)去访问。

案例演示：[com.dnx.innerclass_](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_) 中的 [StaticInnerClass.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter10_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E9%AB%98%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/dnx/innerclass_/StaticInnerClass.java)

## 内部类总结：

1. 内部类有四种：
    1. 局部内部类
    2. 匿名内部类
    3. 成员内部类
    4. 静态内部类
2. 重点为 匿名内部类。
    
    new 类/接口(参数列表){
    
    ……
    
    };
    
3. 成员内部类、静态内部类是放在外部类的成员位置，本质就是一个成员。

# *0423_**[我亦无他，惟手熟尔](https://m.gushiwen.cn/mingju/juv_9c8c7b007c1c.aspx)***
