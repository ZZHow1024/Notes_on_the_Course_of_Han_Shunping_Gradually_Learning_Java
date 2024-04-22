# Chapter08
第八章_面向对象编程[中级部分]  
Chapter08_Object Oriented Programming [Intermediate]  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0265-0267_IDEA使用

- IDEA使用技巧和经验
    - 设置字体
    - 设置字符编码
- 案例1：使用IDEA开发一个Java项目，输出”Hello, IntelliJ IDEA!“

案例演示：**[HelloIDEA.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/HelloIDEA.java)**

- 案例2：使用IDEA开发一个Java项目，创建一个类MyTools，编写一个方法，可以完成对int
数组冒泡排序的功能。

案例演示：**[BubbleSort.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/BubbleSort.java)**

# 0268-0270_IDEA快捷键

- 删除当前行：Ctrl + Y
- 复制当前行：Ctrl + D
- 补全代码：Alt + /
- 添加注释和取消注释：Ctrl + /
- 智能辅助：Alt + Enter
- 快速格式化代码：Ctrl + Alt + L
- 快速运行程序：Ctrl + F5
- 生成构造器(构造方法)等：Alt + Insert
- 查看一个类的层级关系：Ctrl + H
- 将光标放在一个方法上：Ctrl + B
- 自动分配变量名：在后面.var

# 0271_IDEA模板

- main + 回车
    - `public static void main(String[] args) {    }`
- sout + 回车
    - `System.*out*.println();`
- souf + 回车
    - `System.*out*.printf("");`
- fori + 回车
    - `for (int i = 0; i < 1; i++) {    }`
- 还可以自定义模板

案例演示：**[TestTemplate.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/TestTemplate.java)**

# 0273_包原理

- 包的本质
    
    实际上就是创建不同的文件夹来保存类文件。
    
    ![包的本质](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fb475bdfe-859a-4d5f-a9a9-fd0d1fd4430b%2F%25E5%258C%2585%25E7%259A%2584%25E6%259C%25AC%25E8%25B4%25A8.jpg?table=block&id=ccda60a8-3360-4be1-a8ec-a1245b568c58&t=ccda60a8-3360-4be1-a8ec-a1245b568c58)
    
    包的本质
    

# 0275_包命名

- 命名规则：
    
    只能包含数字、字母、下划线、小圆点. ，但不能用数字开头，不能是关键字或保留字。
    
- 命名规范：
    
    一般是小写字母 + 小圆点一般是 com.公司名.项目名.业务模块名
    
    例如：com.sina.crm.user // 用户模块
    

# 0276_常用的包

一个包下，包含很多的类，Java中常用的包有：

- java.lang.* // lang包是基本包，默认引入，不需要再引入。
- java.util.* // util包，系统提供的工具包，工具类，例如使用 Scanner。
- java.net.* // 网络包，网络开发。
- java.awt.* // 做java的界面开发，GUI。

# 0277_包的使用细节

- 如何引入包的语法：
    
    import 包;
    
- 我们引入一个包的主要目的是要使用该包下的类。
    
    例如：import java.util.Scanner;
    
- 将一个包下的所有类都引入。（不建议使用）
    
    例如：import java.util.*;
    
- 案例：用系统提供的Arrays完成数组排序。

案例演示：**[ImportDetail.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/ImportDetail.java)**

- 注意事项和使用细节：
    1. package 的作用是声明当前类所在的包，需要放在class的最上面，一个类中最多只有一句package。
    2. import 要放在package的下面，在类定义前面，可以有多句且没有顺序要求。

# 0278_访问修饰符规则

- Java提供四种访问控制修饰符号，用于控制方法和属性（成员变量）的访问权限（范围）：
    1. 公开级别：用 public 修饰，对外公开。
    2. 受保护级别：用 protected 修饰，对子类和同一个包中的类公开。
    3. 默认级别：没有修饰符号，向同一个包的类公开。
    4. 私有级别：用 private 修饰，只有类本身可以访问,不对外公开。

| 访问级别 | 访问控制修饰符 | 同类 | 同包 | 子类 | 不同包 |
| --- | --- | --- | --- | --- | --- |
| 公开 | public | √ | √ | √ | √ |
| 受保护 | protected | √ | √ | √ | × |
| 默认 | 没有 | √ | √ | × | × |
| 私有 | private | √ | × | × | × |

# 0279_访问修饰符细节

1. 修饰符可以用来修饰类中的属性，成员方法以及类。
2. 只有 默认的 和 public 才能修饰类，并且遵循上述访问权限的特点。
3. 因为没有学习继承，因此关于在子类中的访问权限，我们讲完子类后，在回头讲解。
4. 成员方法的访问规则和属性完全一样。

# 0280_封装介绍

- 面向对象编程有三大特征：封装、继承 和 多态。
- 封装介绍：
    
    封装(encapsulation)就是把抽象出的数据[属性]和对数据的操作[方法]封装在一起，数据被保护在内部，程序的其它部分只有通过被授权的操作[方法],才能对数据进行操作。
    
- 现实例子：对电视机的操作就是经典封装。
- 封装的好处：
    1. 隐藏实现细节：方法(连接数据库) ← 调用(传入参数…)。
    2. 可以对数据进行验证，保证安全合理。

# 0281_封装步骤

1. 将属性进行私有化 private [不能直接修改属性]。
2. 提供一个公共的(public)set方法，用于对属性判断并赋值。
    
    public void setXxx(类型 参数名){ // Xxx 表示某个属性
    
    // 加入数据验证的业务逻辑
    
    属性 = 参数名;
    
    }
    
3. 提供一个公共的(public)get方法，用于获取属性的值。
    
    public 数据类型 getXxx(){ // 权限判断，Xxx 表示某个属性
    
    return xx;
    
    }
    

# 0282_封装快速入门

- 案例：不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理性的验证。年龄合理就设置，否则给默认年龄，年龄必须在 1 - 120，工资不能直接查看，name的长度在 2-6字符之间。

案例演示：**[Encapsulation.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/Encapsulation.java)**

# 0283_封装与构造器

- 案例：接上个案例 → 不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理性的验证。年龄合理就设置，否则给默认年龄，年龄必须在 1 - 120，工资不能直接查看，name的长度在 2-6字符之间。要防止通过构造器绕过了设定了限制。
- 我们可以将set方法写在构造器中，这样仍然可以对数据进行校验。

案例演示：**[Encapsulation.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/Encapsulation.java)**

# 0286_继承原理图

- 基本介绍：
    
    继承可以解决代码复用，让我们的编程更加靠近人类思维。当多个类存在相同的属性(变量)和方法时，可以从这些类中抽象出父类，在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过 extends 来声明继承父类即可。
    
- 继承的基本语法：
    
    class 子类 extends 父类{
    
    }
    
    1. 子类自动拥有父类定义的属性和方法。
    2. 父类又叫超类，基类。
    3. 子类又叫派生类。

![继承原理图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fed1ce360-3138-4b8e-ad2f-e4bb7b90daa4%2F%25E7%25BB%25A7%25E6%2589%25BF%25E5%258E%259F%25E7%2590%2586%25E5%259B%25BE.jpg?table=block&id=7d60dc18-f5c9-4d81-ad93-d6f369a4764e&t=7d60dc18-f5c9-4d81-ad93-d6f369a4764e)

继承原理图

# 0287_继承快速入门

- 案例：小学生和大学生考试成绩演示。

案例演示：[**com.zzhow.extend_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/extend_)

# 0288-0292_继承使用细节

- 继承给编程带来的便利：
    1. 代码的复用性提高了。
    2. 代码的拓展性和维护性提高了。
- 继承的深入讨论/细节问题：
    1. 子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问。
    2. 子类必须调用父类的构造器，完成父类的初始化。
    3. 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过。
    4. 如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表);
    5. super在使用时，需要放在构造器第一行(super只能在构造器中使用)。
    6. super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器。
    7. java所有类都是Object类的子类，Object 是所有类的基类。
    8. 父类构造器的调用不限于直接父类，将一直往上追溯直到Object类(顶级父类)。
    9. 子类最多只能继承一个父类(指直接继承)，即Java中是单继承机制。
        - 思考：如何让A类继承B类和C类？
            - A 继承 B，B 再继承 C。
    10. 不能滥用继承，子类和父类之间必须满足 is-a  的逻辑关系。

# 0293_继承本质详解

```java
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); // 内存的布局
    }
}

class GrandPa { // Father 的父类
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa { // Son 的父类
    String name = "小头爸爸";
    int age = 30;
}

class Son extends Father { // Father 的子类
    String name = "大头儿子";
}
```

![继承本质详解](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F3d18edd2-33ea-4bac-afa1-06956df8f940%2F%25E7%25BB%25A7%25E6%2589%25BF%25E6%259C%25AC%25E8%25B4%25A8%25E8%25AF%25A6%25E8%25A7%25A3.jpg?table=block&id=721c900b-9401-473f-af9a-d424c014f1de&t=721c900b-9401-473f-af9a-d424c014f1de)

继承本质详解

- 按照查找关系来返回信息：
    1. 首先看子类是否有该属性。
    2. 如果子类有这个属性，并且可以访问，则返回信息。
    3. 如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息…）。
    4. 如果父类没有就按照(3)的规则，继续找上级父类，直到0bject…。

# 0297_super基本语法

- 基本介绍：
    
    super代表父类的引用，用于访问父类的属性、方法、构造器。
    
- 基本语法：
    1. 访问父类的属性，但不能访问父类的private属性。
        
        `super.属性名;`
        
    2. 访问父类的方法，不能访问父类的private方法。
        
        `super.方法名(参数列表);`
        
    3. 访问父类的构造器(这点前面用过)。
        
        `super(参数列表);` // 只能放在构造器的第一句，只能出现一句。
        

# 0298-0300_super使用细节

1. 调用父类的构造器的好处（分工明确，父类属性由父类初始化，子类的属性由子类始化）。
2. 当子类中有和父类中的成员（属性和方法）重名时，为了访问父类的成员，必须通过super。如果没有重名，使用super、this、直接访问是一样的效果。
3. super的访问不限于直接父类，如果父类的父类和本类中有同名的成员，也可以使用super去访问父类的父类的成员：如果多个基类中都有同名的成员，使用super访问遵循就近原则。A → B → C。
- super和this的比较：
    
    ![super和this的比较](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fd3e57ac5-07ed-49e4-8302-34f909724d83%2Fsuper%25E5%2592%258Cthis%25E7%259A%2584%25E6%25AF%2594%25E8%25BE%2583.png?table=block&id=6085d008-4078-4592-b461-47f7a45b4d88&t=6085d008-4078-4592-b461-47f7a45b4d88)
    
    super和this的比较
    

# 0301_方法重写介绍

- 方法重写/覆盖(override)
    
    子类有一个方法，和父类的某个方法的名称、返回类型、参数一样，那么我们就说子类的这个方法覆盖了父类的那个方法。
    

# 0302_方法重写细节

- 方法重写也叫方法覆盖，需要满足下面的条件：
1. 子类的方法的形参列表、方法名称，要和父类方法的形参列表、方法名称完全一样。
2. 子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类。
    
    比如：父类 返回类型是 Object，子类方法返回类型是String。
    
3. 子类方法不能缩小父类方法的访问权限。
    
    public > protected > 默认 > private
    

# 0303-0304_重写课堂练习

- 方法重载对比方法重写：

![方法重载对比方法重写](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F3c3acf8b-6aa9-4300-94dc-3fd337fdfe7c%2F%25E6%2596%25B9%25E6%25B3%2595%25E9%2587%258D%25E8%25BD%25BD%25E5%25AF%25B9%25E6%25AF%2594%25E6%2596%25B9%25E6%25B3%2595%25E9%2587%258D%25E5%2586%2599.jpg?table=block&id=64e8d870-6927-40d4-a7b6-5c5f641a89a0&t=64e8d870-6927-40d4-a7b6-5c5f641a89a0)

方法重载对比方法重写

# 0306_方法的多态

- 多[多种]态[状态]基本介绍：
    
    方法或对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的。
    
- 多态的具体体现1：
    
    方法的多态，重写和重载就体现多态。
    

# 0307_对象的多态

1. 一个对象的编译类型和运行类型可以不一致。
2. 编译类型在定义对象时，就确定了，不能改变。
3. 运行类型是可以变化的。
4. 编译类型看定义时 = 号 的左边，运行类型看 = 号的 右边。

# 0308_多态快速入门

- 案例：使用多态的机制来解决主人喂食物的问题。

案例演示：[**com.zzhow.polymorphic_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/polymorphic_) 中的 [**Poly.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/polymorphic_/Poly.java)

# 0309_向上转型

- 多态注意事项 和 细节讨论：
    - 多态的前提：两个对象(类)存在继承关系。
- 多态的向上转型：
    1. 本质：父类的引用指向了子类的对象。
    2. 语法：父类类型 引用名 = new 子类类型();
    3. 特点：编译类型看左边，运行类型看右边。
        
        可以调用父类中的所有成员(需要遵循访问权限)。
        
        不能调用子类中的特有成员。
        
        原因：在编译阶段，能调用哪些成员由编译类型来决定。
        
        最终运行效果看子类(运行类型)的具体实现。
        
        即：调用方法时，按照从子类(运行类型)开始查找方法，然后调用，规则和方法调用规则一致。
        

# 0310_向下转型

- 多态的向下转型：
    1. 语法：子类类型 引用名 = (子类类型) 父类引用;
    2. 只能强转父类的引用，不能强转父类的对象。
    3. 要求父类的引用必须指向的是当前目标类型的对象。
    4. 可以调用子类类型中所有的成员。

# 0311_属性重写问题

- 属性没有重写之说！！！
    
    属性的值看编译类型。
    
- instanceOf比较操作符，用于判断对象的运行类型是否为XX类型或XX类型的子类型。

# 0314_动态绑定机制

- Java的动态绑定机制：
    1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定。
    2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用。

案例演示：[DynamicBinding.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/DynamicBinding.java)

# 0315-0316_多态数组

- 数组的定义类型为父类类型，里面保存的实际元素类型为子类类型。
- 案例：现有一个继承结构如下，要求创建1个Person对象、2个Student 对象和2个Teacher对象，统一放在数组中，并调用每个对象say方法。
- 案例升级：调用子类特有的方法，比如Teacher 有一个 teach 方法，Student 有一个 study 方法。

案例演示：[**com.zzhow.polyarr_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/polyarr_)

# 0317_多态参数

- 方法定义的形参类型为父类类型，实参类型允许为子类类型。
- 案例：定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，普通员工和经理类要求分别重写getAnnual方法。
- 案例升级：测试类中添加一个方法showEmpAnnal(Employee e)，实现获取任何员工对象的年工资,并在main方法中调用该方法 [e.getAnnual0]。
- 案例再升级：测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法。

案例演示：[**com.zzhow.polyparameter_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/polyparameter_)

# 0318_==运算符

- == 和 equals 的对比[面试题]
- ==是一个比较运算符：
    1. ==：既可以判断基本类型，又可以判断引用类型。
    2. ==：如果判断基本类型，判断的是值是否相等。示例: int i=10; double d=10.0;
    3. ==：如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象。

案例演示：[**com.zzhow.object_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_)中的**[Equals.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_/Equals.java)**

# 0319_查看JDK原码

- equals方法：
    
    equals: 是Qbject类中的方法，只能判断引用类型。
    
- 如何查看JDK原码？光标放在equals方法上，按下Ctrl + B，即可查看。

案例演示：[**com.zzhow.object_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_)中的**[Equals.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_/Equals.java)**

# 0320_子类重写equals方法

- 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。
    
    比如：Integer,String
    

案例演示：[**com.zzhow.object_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_)中的**[EqualsExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_/EqualsExercise.java)**

# 0321-0323_equals课堂练习

- 如何重写equals方法
- 案例：判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都一样，则返回true，反之false。

```java
class Person{
	private String name;
	private int age;
	private char gender;
}
```

案例演示：[**com.zzhow.object_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_)中的**[EqualsExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/object_/EqualsExercise.java)**

# 0324_hashCode

- hashCode方法：
    1. 提高具有哈希结构的容器的效率。
    2. 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的。
    3. 两个引用，如果指向的是不同对象，则哈希值是不一样的。
    4. 哈希值主要根据地址号来的，不能完全将哈希值等价于地址。
    5. 后面在集合中hashCode （如果需要的话）也会重写。

# 0325_toString

- 基本介绍：
    
    默认返回：全类名+@+哈希值的十六进制。
    
    子类往往重写toString方法，用于返回对象的属性信息。
    
- 重写toString方法：打印对象或拼接对象时，都会自动调用该对象的toString形式。
- 当直接输出一个对象时，toString 方法会被默认的调用。
    
    比如：System.out.println(monster);就会默认调用monster.toString()。
    

# 0326_finalize

1. 当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，做一些释放资源的操作。
2. 什么时候被回收:当某个对象没有任何引用时，则JVM就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用finalize方法。
3. 垃圾回收机制的调用，是由系统来决定（即有自己的GC算法）,也可以通过System.gc() 主动触发垃圾回收机制。

提示：在实际开发中，几乎不会运用 finalize，所以更多就是为了应付面试。

# 0327_断点调试介绍

- 实际需求：
    1. 在开发中，新手程序员在查找错误时，老程序员就会温馨提示，可以用断点调试，一步一步的看源码执行的过程，从而发现错误所在。
    2. 重要提示: 在断点调试 过程中，是运行状态，是以对象的 运行类型来执行的。
        
        例如：A extends B ; B b = new A0; b.xx0;
        
- 断点调试介绍：
    1. 断点调试是指在程序的某一行设置一个断点，调试时，程序运行到这一行就会停住，然后你可以一步一步往下调试，调试过程中可以看各个变量当前的值，出错的话，调试到出错的代码行即显示错误，停下。进行分析从而找到这个Bug。
    2. 断点调试是程序员必须掌握的技能。
    3. 断点调试也能帮助我们查看Java底层源代码的执行过程，提高程序员的Java水平。
- 断点调试的快捷键：
    1. F7：跳入方法内。
    2. F8：逐行执行代码。
    3. Shift + F8：跳出方法。
    4. F9：resume，执行到下一个断点。

# 0334_零钱通介绍

- 项目需求说明：
    
    使用Java 开发 零钱通项目，可以完成收益入账，消费，查看明细，退出系统等功能。
    

# 0341_零钱通OOP版

- 将面向过程的代码修改成面向对象的，编写SmallChangeSysOOP.java 类，并使用SmallChangeSysApp.java 完成测试。

项目：[**com.zzhow.smallchange**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/smallchange)中的**[SmallChangeSys.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/smallchange/SmallChangeSys.java)**为面向过程版。

[**com.zzhow.smallchange.oop**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter08_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E4%B8%AD%E7%BA%A7%E9%83%A8%E5%88%86%5D/src/com/zzhow/smallchange/oop)为面向对象版。
