# Chapter07
第七章_面向对象编程[基础部分]  
Chapter07_Object Oriented Programming [Fundamentals]  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow1024

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

# 0193_面向对象快速入门

```java
//定义一个猫类 Cat -> 自定义的数据类型
class Cat
{
	//属性：
	String name;
	int age;
	String color;
}
```

- 案例：面向对象的方式解决养猫问题。

案例演示：**[Object.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0193_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Object.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0193_面向对象快速入门)

# 0194_对象内存布局

```java
//实例化一只猫[创建一只猫对象]。
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 12;
		cat1.color = "白色";
```

![对象内存布局](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F4dbb719d-9fb6-47a6-a76d-5037c0d86d88%2F%25E5%25AF%25B9%25E8%25B1%25A1%25E5%2586%2585%25E5%25AD%2598%25E5%25B8%2583%25E5%25B1%2580.jpg?table=block&id=cf6454a1-d58d-45c2-af16-96d7af0ec52b&t=cf6454a1-d58d-45c2-af16-96d7af0ec52b)

对象内存布局

# 0195_属性概念

- 属性 / 成员变量 介绍
1. 从概念或叫法上看：成员变量 = 属性 = field（字段）。
2. 属性是类的一个组成部分，一般是基本数据类型，也可是引用类型（对象，数组）。

# 0196_属性注意细节

1. 属性的定义语法同变量。
    
    访问修饰符 属性类型 属性名;
    
    访问修饰符：控制属性的访问范围。
    
    public、protected、默认、private.
    
2. 属性的定义类型可以为任意类型，包含基本类型或引用类型。
3. 属性如果不赋值，有默认值，规则和数组一致。

# 0197_创建对象访问属性

1. 方法1：先声明再创建。

```java
Cat cat;
cat = new Cat();
```

1. 方法2：直接创建。

```java
Cat cat = new Cat();
```

# 0198_对象分配机制

```java
Person p1 = new Person();
p1.age = 10;
p1.name = "小明";
Person p2 = p1; // 把p1赋给p2，让p2指向p1。
System.out.println(p2.age);
```

![对象分配机制.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F53806479-8c0f-4d32-999f-4b830f2b939e%2F%25E5%25AF%25B9%25E8%25B1%25A1%25E5%2588%2586%25E9%2585%258D%25E6%259C%25BA%25E5%2588%25B6.jpg?table=block&id=f3607c9a-a766-494d-8d0c-a77cfb46fe5f&t=f3607c9a-a766-494d-8d0c-a77cfb46fe5f)

# 0199_对象创建过程

- Java内存的结构分析：
    1. 栈：一般存放基本数据类型（局部变量）。
    2. 堆：存放对象（Cat cat，数组等）。
    3. 方法区：常量池（常量，比如字符串），类加载信息。
- Java创建对象的流程简单分析：
    1. 先加载类信息（属性 和 方法信息，只会加载一次）。
    2. 在堆中分配空间，进行默认初始化（看规则）。
    3. 把地址赋给p，p就指向对象。
    4. 进行指定初始化。

# 0201-0202_方法快速入门

- 案例：
    1. 添加speak 成员方法，输出“我是一个好人”。
    2. 添加cal01 成员方法，可以计算从 1 + … + 1000的结果。
    3. 添加cal02 成员方法,该方法可以接收一个数n，计算从 1 + … + n 的结果。
    4. 添加getSum成员方法，可以计算两个数的和。

案例演示：**[Method.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0201-0202_%E6%96%B9%E6%B3%95%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Method.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0201-0202_方法快速入门)

# 0203_方法调用机制

```java
Person p1 = new Person();
int returnRes = p1.getSum(10, 20);
System.out.println("getSum方法返回的值 = " + returnRes);
```

```java
public int getSum(int n1, int n2)
{
	int res = n1 + n2;
	return res;
}
```

![方法调用机制](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Ff4114991-e2c4-4e0f-83e4-107de152f93c%2F%25E6%2596%25B9%25E6%25B3%2595%25E8%25B0%2583%25E7%2594%25A8%25E6%259C%25BA%25E5%2588%25B6.jpg?table=block&id=ddb79f09-cc9b-4d03-8203-82a2c6aa3d45&t=ddb79f09-cc9b-4d03-8203-82a2c6aa3d45)

方法调用机制

- 方法调用小结：
1. 当程序执行到方法时，就会开辟一个独立的空间（栈空间）。
2. 当方法执行完毕，或者执行到 return 语句时，就会返回。
3. 返回到调用方法的地方。
4. 返回后，继续执行调用方法后面的代码。
5. 当main方法(栈) 执行完毕，整个程序退出。

# 0205_方法的定义

```java
访问修饰符 返回值数据类型 方法名(形参列表)
{
	//方法体
	语句;
	return 返回值;
}
```

1. 形参列表：表示成员方法输入。
2. 返回数据类型：表示成员方法输出，void 表示没有返回值。
3. 方法主体：表示为了实现某一功能的代码块。
4. return 语句不是必须的。

# 0206-0208_方法使用细节

- 访问修饰符：
    - 作用是 控制 方法使用的范围。
    - 如果不写就是默认访问。
    - [有四种：public、protected、默认、private]。
- 返回数据类型：
    1. 一个方法最多有一个返回值 [要想返回多个结果可以返回数组 ]。
    2. 返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）。
    3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 而且要求返回值类型必须和return的值类型一致或兼容。
    4. 如果方法是void，则方法体中可以没有return语句，或者 只写 return;
- 方法名：
    - 遵循驼峰命名法，最好见名知义，表达出该功能的意思即可。
- 形参列表：
    1. 一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开。
    2. 参数类型可以为任意类型，包含基本类型或引用类型。
    3. 调用带参数的方法时，一定对应着参数列表传入 相同类型 或 兼容类型 的参数！
    4. 方法定义时的参数称为形式参数，简称形参。方法调用时的参数称为实际参数，简称实参。
    5. 参和形参的类型要一致或兼容、个数、顺序必须一致！
- 方法体：
    - 里面写完成功能的具体的语句，可以为输入、输出、变量、运算、分支、循环、方法调用，但里面不能再定义方法！
    - 即：方法不能嵌套定义。
- 方法调用：
    1. 同一个类中的方法调用：直接调用即可。
    2. 跨类中的方法 A类 调用 B类 方法：需要通过对象名调用。
    3. 跨类的方法调用和方法的访问修饰符相关。

# 0210-0212_方法传参机制

- 基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参！
- 引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参！

# 0213_克隆对象

- 案例：编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同。

案例演示：**[CloneObject.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0213_%E5%85%8B%E9%9A%86%E5%AF%B9%E8%B1%A1/CloneObject.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0213_克隆对象)

# 0214_递归解决什么问题

1. 各种数学问题如：8皇后问题，汉诺塔，阶乘问题，迷宫问题，球和篮子的问题（google编程大赛）。
2. 各种算法中也会使用到递归，比如快排，归并排序，二分查找，分治算法等。
3. 将用栈解决的问题 → 递归代码比较简洁。

# 0215-0218_递归执行机制

```java
//省略调用部分，n = 4。
public void test(int n)
{
	if(n > 2)
	{
		test(n - 1);
	}
	System.out.println("n = " + n);
}
```

![递归执行机制01.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F0d8e42a8-4001-4a1b-af62-76edfb0d604c%2F%25E9%2580%2592%25E5%25BD%2592%25E6%2589%25A7%25E8%25A1%258C%25E6%259C%25BA%25E5%2588%25B601.jpg?table=block&id=d097c0ee-e725-4a9c-9b5d-36b652e72ad8&t=d097c0ee-e725-4a9c-9b5d-36b652e72ad8)

- 运行结果：
    
    n = 2
    
    n = 3
    
    n = 4
    
- 案例1：打印问题。
- 案例2：计算阶乘。

案例演示：**[Recursion.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0215-0218_%E9%80%92%E5%BD%92%E6%89%A7%E8%A1%8C%E6%9C%BA%E5%88%B6/Recursion.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0215-0218_递归执行机制)

- 递归重要规则
1. 执行一个方法时，就创建一个新的受保护的独立空间（栈空间）。
2. 方法的局部变量是独立的，不会相互影响，比如n变量。
3. 如果方法中使用的是引用类型变量（比如数组、对象），就会共享该引用类型的数据.。
4. 递归必须向退出递归的条件逼近，否则就是无限递归，出现StackOverflowError。
5. 当一个方法执行完毕，或者遇到return时，就会返回，遵守谁调用就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕。

# 0219_递归斐波那契数

- 案例：请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少。

案例演示：**[FibonacciNumber.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0219_%E9%80%92%E5%BD%92%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0/FibonacciNumber.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0219_递归斐波那契数)

# 0220_猴子吃桃

- 案例：猴子吃桃子问题，有一堆桃子，猴子第一天吃了其中的一半，每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。问题：第n（1 ≤ n ≤ 10）天共有多少个桃子?

案例演示：**[MonkeysEatPeaches.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0220_%E7%8C%B4%E5%AD%90%E5%90%83%E6%A1%83/MonkeysEatPeaches.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0220_猴子吃桃)

# 0221-0224_老鼠出迷宫

1. 小球得到的路径，和程序员设置的找路策略有关即：找路的上下左右的顺序相关。
2. 再得到小球路径时，可以先使用（下右上左）再改成（上右下左），看看路径是不是有变化。
3. 测试回溯现象。

![老鼠出迷宫](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fd15973f1-355c-4790-a739-5d47cf4b999e%2F%25E8%2580%2581%25E9%25BC%25A0%25E5%2587%25BA%25E8%25BF%25B7%25E5%25AE%25AB.jpg?table=block&id=6230a1c6-76d2-47c3-9a4e-ef1932c1a8fd&t=6230a1c6-76d2-47c3-9a4e-ef1932c1a8fd)

老鼠出迷宫

案例演示：**[Labyrinth.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0221-0224_%E8%80%81%E9%BC%A0%E5%87%BA%E8%BF%B7%E5%AE%AB/Labyrinth.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0221-0224_老鼠出迷宫)

# 0225_汉诺塔

- 规则：每次只能移动一个盘子，并且在移动过程中三根杆上都始终保持大盘在下，小盘在上，操作过程中盘子可以置于A、B、C任一杆上。

![汉诺塔](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F1812d4af-47a7-44d8-8fa9-315feba99e54%2F%25E6%25B1%2589%25E8%25AF%25BA%25E5%25A1%2594.jpg?table=block&id=3280446c-8fe4-45e1-8800-3f8d1db0fb13&t=3280446c-8fe4-45e1-8800-3f8d1db0fb13)

汉诺塔

案例演示：**[HanoiTower.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0225_%E6%B1%89%E8%AF%BA%E5%A1%94/HanoiTower.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0225_汉诺塔)

# 0226_八皇后

- 问题表述：在8×8格的国际象棋上摆放8个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。

![八皇后](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fb7bbce88-73f6-4ffe-b7ca-23c7c14fd2ad%2F%25E5%2585%25AB%25E7%259A%2587%25E5%2590%258E.png?table=block&id=f45c63d5-fcea-444e-9a1c-1e1fddab5cce&t=f45c63d5-fcea-444e-9a1c-1e1fddab5cce)

八皇后

案例演示：**[EightEmpresses.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0226_%E5%85%AB%E7%9A%87%E5%90%8E/EightEmpresses.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0226_八皇后)

# 0227_重载介绍

重载（OverLoad）

- 基本介绍：
    
    java中允许同一个类中，多个同名方法的存在，但要求形参列表不一致。
    
    比如：System.out.println0; out是PrintStream类型。
    
- 重载的好处：
    1. 减轻了起名的麻烦。
    2. 减轻了记名的麻烦。

# 0228_重载快速入门

- 案例：
    
    类：MyCalculator   |   方法：calculate
    
    calculate(int n1, int n2) // 两个int
    
    calculate(int n1, double n2) // 一个int，一个double
    
    calculate(double n1, int n2) // 一个double，一个int
    
    calculate(int n1, int n2, int n3) // 三个int
    

案例演示：**[OverLoad.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0228_%E9%87%8D%E8%BD%BD%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/OverLoad.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0228_重载快速入门)

# 0229_重载使用细节

1. 方法名：必须相同。
2. 形参列表：必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求）。
3. 返回类型：无要求。

# 0233_可变参数使用

- 基本概念：
    
    Java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法就可以通过可变参数实现。
    
- 基本语法：

```java
访问修饰符 返回类型 方法名(数据类型... 形参名)
{

}
```

使用可变参数时，可以当作数组来使用。

- 案例：DnxMethod类，sum方法。要求可以计算2个数的和，3个数的和，4个数的和，5个数的和…

案例演示：**[VarParameter.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0233_%E5%8F%AF%E5%8F%98%E5%8F%82%E6%95%B0%E4%BD%BF%E7%94%A8/VarParameter.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0233_可变参数使用)

# 0234_可变参数细节

1. 可变参数的实参可以为 0 个或任意多个。
2. 可变参数的实参可以为数组。
3. 可变参数的本质就是数组。
4. 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后。
5. 一个形参列表中只能出现一个可变参数。

# 0236_作用域基本使用

1. 在Java编程中，主要的变量就是属性(成员变量)和局部变量。
2. 我们说的局部变量一般是指在成员方法中定义的变量。
3. Java中作用域的分类：
    1. 全局变量：也就是属性，作用域为整个类体 Cat类: cry eat 等方法使用属性。
    2. 局部变量：也就是除了属性之外的其他变量，作用域为定义它的代码块中。
4. 全局变量（属性）可以不赋值，直接使用，因为有默认值。
    
    局部变量必须赋值后，才能使用，因为没有默认值。
    

# 0237-0238_作用域使用细节

1. 属性和局部变量可以重名，访问时遵循就近原则。
2. 在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。
3. 属性生命周期较长伴随着对象的创建而创建，伴随着对象的销毁而销毁。
    
    局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁，即在一次方法调用过程中。
    
4. 作用域不同：
    1. 全局变量 / 属性：可以被本类使用，或其他类使用（通过对象调用)。
    2. 局部变量：只能在本类中对应的方法中使用。
5. 修饰符不同：
    1. 全局变量 / 属性可以加修饰符。
    2. 局部变量不可以加修饰符。

# 0239_构造器基本介绍

- 构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。它有几个特点：
    1. 方法名和类名相同。
    2. 没有返回值。
    3. 在创建对象时，系统会自动的调用该类的构造器完成对对象的初始化。
- 基本语法

```java
[修饰符] 方法名(形参列表)
{
	方法体;
}
```

# 0240_构造器快速入门

- 案例：在创建人类的对象时，就直接指定这个对象的年龄和姓名。[用构造方法来实现]

案例演示：**[Constructor.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0240_%E6%9E%84%E9%80%A0%E5%99%A8%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Constructor.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0240_构造器快速入门)

# 0241-0242_构造器使用细节

1. 一个类可以定义多个不同的构造器，即构造器重载。
2. 构造器名和类名要相同。
3. 构造器没有返回值。
4. 构造器是完成对象的初始化，并不是创建对象。
5. 在创建对象时，系统自动的调用该类的构造方法。
6. 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造方法（也叫默认构造方法）。
7. 一旦定义了自己的构造器，默认的构造器就被覆盖了就不能再使用默认的无参构造器，除非显式的定义一下。
    
    Person()
    
    {
    
    }
    

# 0244_对象创建流程详解

1. 加载Person类信息(Person.class)，只会加载一次。
2. 在堆中分配空间(地址)。
3. 完成对象初始化：
    1. 默认初始化 age=0 name=null
    2. 显式初始化 age=90,name=null
    3. 构造器的初始化 age =20,name=小明
4. 在对象在堆中的地址，返回给 p（p是对象名也可以理解成是对象的引用）。

# 0246_this入门

- 案例：使用this解决变量命名问题（构造器中的形参不能与类的属性一样的问题）。

案例演示：**[This.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0246_this%E5%85%A5%E9%97%A8/This.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0246_this入门)

# 0247_this本质

```java
Dog dog1 = new Dog("大壮", 3);
Dog dog2 = new Dog("大黄", 2);
```

![this本质](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F63e18d53-1da9-4aa2-a7fa-eb8f034cce9a%2Fthis%25E6%259C%25AC%25E8%25B4%25A8.jpg?table=block&id=b66da457-1960-416e-b529-9a730a0125fe&t=b66da457-1960-416e-b529-9a730a0125fe)

this本质

# 0248_this小结

- 小结：哪个对象调用，this就代表哪个对象。

# 0249_this使用细节

1. this关键字可以用来访问本类的属性、方法、构造器。
2. this用于区分当前类的属性和局部变量。
3. 访问成员方法的语法：this.方法名(参数列表);
4. 访问构造器语法：this(参数列表); 注意只能在构造器中使用（只能在构造器中访问另外一个构造器），且必须是第一条语句。
5. this不能在类定义的外部使用，只能在类定义的方法中使用。

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter07_面向对象编程[基础部分]/0221-0224_老鼠出迷宫)
