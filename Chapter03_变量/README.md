# Chapter03
第三章_变量  
Chapter03_Variable  
@[dnx00  ](https://github.com/dnx00)的笔记  
@DNX

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

# 0034_变量原理

- 变量是程序的基本组成单位
- 不论是使用哪种高级程序语言编写程序,变量都是其程序的基本组成单位
- 变量有三个基本要素(类型+名称+值)
    - int a = 1;//定义了一个变量，类型int整型,名称a,值1
    - int b = 3://定义了一个变量，类型int整型,名称b,值3
    - b = 89://把89值赋给 b变量

# 0035_变量概念

- 变量相当于内存中一个数据存储空间的表示，你可以把变量看做是一个房间的门牌号，通过门牌号我们可以找到房间，而通过变量名可以访问到变量(值)。
- 变量使用的基本步骤
    1. 声明变量
    2. 赋值
    3. 使用
    
    也可以一步到位
    

案例演示：**[Var.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0035_%E5%8F%98%E9%87%8F%E6%A6%82%E5%BF%B5/Var.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0035_变量概念)

# 0036_变量入门

案例：记录 人 的信息的代码

案例演示：**[VarHuman.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0036_%E5%8F%98%E9%87%8F%E5%85%A5%E9%97%A8/VarHuman.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0036_变量入门)

# 0037_变量细节

变量使用注意事项

1. 变量表示内存中的一个存储区域不同的变量，类型不同，占用的空间大小不同。
    1. 比如: int 4 个字节， double 就是 8个字节,先有基本印象，后面说字节。
2. 该区域有自己的名称[变量名]和类型[数据类型]。
3. 变量必须先声明，后使用，即有顺序。
4. 该区域的数据可以在同一类型范围内不断变化。
5. 变量在同一个作用域内不能重名。
6. 变量=变量名+值+数据类型，这一点请大家注意。变量三要素。

案例演示：**[VarDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0037_%E5%8F%98%E9%87%8F%E7%BB%86%E8%8A%82/VarDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0037_变量细节)

# 0038_加号使用

1. 当左右两边都是数值型时，则做加法运算。
2. 当左右两边有一方为字符串，则做拼接运算。

例：	System.out.println(100 + 98);
		System.out.println("100" + 98);

		System.out.println(100 + 3 + "Hello");
		System.out.println("Hello" + 100 + 3);

```java
public class Plus{
	public static void main(String[] args){
		System.out.println(100 + 98);//198
		System.out.println("100" + 98);//10098

		System.out.println(100 + 3 + "Hello");//103Hello
		System.out.println("Hello" + 100 + 3);//Hello1003
	}
}
```

案例演示：**[Plus.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0038_%E5%8A%A0%E5%8F%B7%E4%BD%BF%E7%94%A8/Plus.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0038_加号使用)

# 0039_数据类型

![Java数据类型.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/6f79efa9-dae7-40e8-ba2f-8b3b5bcbcbb4/Java%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B.jpg)

注意：String不是基本数据类型，它是一个类。

# 0040_整型使用

![Java整型.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/da8d5313-a2a0-457f-9baa-b4ed4783a4c0/Java%E6%95%B4%E5%9E%8B.jpg)

# 0041_整型细节

1. Java各整数类型有固定的范围和字段长度，不受具体OS[操作系统]的影响，以保证Java程序的可移植性。
2. Java的整型常量 (具体值) 默认为 int 型，声明long型常量须后加 ’l’ 或 ’L’。
3. Java程序中变量常声明为int型，除非不足以表示大数，才使用long。
4. bit: 计算机中的最小存储单位。byte:计算机中基本存储单元,1 byte = 8 bit。
    1. [二进制再详细说，简单举例一个 byte 3 和 short 3]
5. 思考题: long 类型，有几个 bit [8 个字节 * 8 bit= 64 bit]

```java
public class IntDetail{
	public static void main(String[] args){

		//Java的整型常量 (具体值) 默认为 int 型，声明long型常量须后加 ’l’ 或 ’L’。
		int n1 = 1;  //4个字节。
	  //int n2 = 1L; //×
		long n3 = 1L;//√

		System.out.println("n1 = " + n1);
		System.out.println("n3 = " + n3);
	}
}
```

案例演示：**[IntDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0041_%E6%95%B4%E5%9E%8B%E7%BB%86%E8%8A%82/IntDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0041_整型细节)

# 0042_浮点数使用

![浮点数的使用.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/968672d5-2f3c-48a1-9b98-ea9104c77818/%E6%B5%AE%E7%82%B9%E6%95%B0%E7%9A%84%E4%BD%BF%E7%94%A8.jpg)

- 说明一下
1. 关于浮点数在机器中存放形式的简单说明。
    1. 浮点数 = 符号位 + 指数位 + 尾数位。
2. 尾数部分可能丢失，造成精度损失(小数都是近似值)。

# 0043-0044_浮点数细节

1. 与整数类型类似，Java 浮点类型也有固定的范围和字段长度，不受具体OS的影响。
    1. [float 4 个字节 double 是 8个字节]
2. Java 的浮点型常量默认为double型，声明float型常量，须后加 ’f’ 或 ‘F’。
3. 浮点型常量有两种表示形式
    1. 十进制数形式，如：
        1. 5.12
        2. 512.0f
        3. .512(必须有小数点)
    2. 科学计数法形式，如：
        1. 5.12e2   [5.12*10的2次方]
        2. 5.12E-2  [5.12/10的2次方]
4. 通常情况下，应该使用double型，因为它比float型更精确。
    1. double num9 = 2.1234567851;
    2. float num10 = 2.1234567851F;
5. 浮点数使用陷阱：2.7 和 8.1/3 比较。

样例：

```java
//DNX写于2024年1月17日
public class FloatDetail{
	public static void main(String[] args){

		//Java的浮点型常量默认为double型，声明float型常量，必须后面加 'f' 或 'F'
	  //float num1 = 1.1;  //×
		float num2 = 1.1F;   //√
		double num3 = 1.1;   //√
		double num4 = 1.1F;  //√

		//十进制数形式：   5.12    512.0f       .512(必须有小数点)
		double num5 = .123;//等价 0.123
		System.out.println("num5 = " + num5);
		//科学计数法形式： 5.12e2[5.12*10的2次方]  5.12E-2[5.12/10的2次方]
		System.out.println("5.12e2 = " + 5.12e2);//512.0
	 	System.out.println("5.12E-2 = " + 5.12E-2);//0.0512

	 	//4. 通常情况下，应该使用double型，因为它比float型更精确。
    	double num9 = 2.1234567851;
    	float num10 = 2.1234567851F;
    	System.out.println("num9 = " + num9);
    	System.out.println("num10 = " + num10);

    	//浮点数使用陷阱：2.7 和 8.1/3 比较
    	double num11 = 2.7;
    	double num12 = 8.1 / 3;
    	System.out.println("num11 = " + num11);//2.7
    	System.out.println("num12 = " + num12);//接近2.7的一个小数，而不是2.7
    	//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心。
    	//应该时是以两个数的差值的绝对值，在某个精度范围内判断
    	if(Math.abs(num11 - num12) < 0.000001){
    		System.out.println("差值非常小，到我的规定精度，认为num11 = num12");
    	}
	}
}
```

案例演示：**[FloatDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0043-0044_%E6%B5%AE%E7%82%B9%E6%95%B0%E7%BB%86%E8%8A%82/FloatDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0043-0044_浮点数细节)

# 0045_Java文档

1. API(Application Programming Interface,应用程序编程接口)是 Java 提供的基本编程接口(java提供的类还有相关的方法)。中文在线文档https://www.matools.com
2. Java语言提供了大量的基础类，因此 Oracle公司也为这些基础类提供了相应的API文档，用于告诉开发者如何使用这些类，以及这些类里包含的方法。
3. Java类的组织形式。
4. 如何查找？
    1. 包 —> 类 —> 方法。
    2. 直接索引。

![Java类的组织形式](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/e2ed5d73-d5a7-4dcf-88d0-41dd128fabd5/Java%E7%B1%BB.jpg)

Java类的组织形式

# 0046_字符型使用

- 基本介绍
    
    字符类型可以表示单个字符，字符类型是char，char是两个字节(可以存放汉字)
    多个字符我们用字符串String(我们后面详细讲解String)
    

案例演示：**[Char.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0046_%E5%AD%97%E7%AC%A6%E5%9E%8B%E4%BD%BF%E7%94%A8/Char.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0046_字符型使用)

# 0047_字符型细节

1. 字符常量是用单引号(’ ’)括起来的单个字符。例如
    1. char c1 = 'a’;
    2. char c2 = ‘中’;
    3. char c3 = ‘9’;
2. Java中还允许使用转义字符 ’\’ 来将其后的字符转变为特殊字符型常量。例如
    1. char c3 = ‘\n’;    //  ‘\n’表示换行符
3. 在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。
    
    [Unicode编码转换 - 站长工具](http://tool.chinaz.com/Tools/Unicode.aspx)
    
4. 可以直接给char赋一个整数，然后输出时，会按照对应的unicode 字符输出 [97]  —>  ‘a’
5. char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。

案例演示：**[CharDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0047_%E5%AD%97%E7%AC%A6%E5%9E%8B%E7%BB%86%E8%8A%82/CharDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0047_字符型细节)

# 0048_字符型本质

- 字符类型本质探讨
1. 字符型 存储到 计算机中，需要将字符对应的码值 (整数)找出来，比如 ’a’ 。
    1. 存储：’a' ⇒ 码值97 ⇒ 二进制(110 0001) ⇒ 存储
    2. 读取：二进制(110 0001) ⇒ 码值97 ⇒ ’a' ⇒ 显示
2. 字符和码值的对应关系是通过字符编码表决定的(是规定好)
- 介绍一下字符编码表
1. ASCII(ASCI 编码表 一个字节表示，一个128 个字符,实际上一个字节可以表示256个字符,只用128个)
2. Unicode(Unicode 编码表 固定大小的编码 使用两个字节来表示字符，字母和汉字统一都是占用两个字节这样浪费空间)
3. UTF-8(编码表，大小可变的编码 字母使用1个字节，汉字使用3个字节)
4. GBK(可以表示汉字，而且范围广，字母使用1个字节，汉字2个字节)
5. GB2312(可以表示汉字，gb2312 < gbk)
6. BIG5 码(繁体中文，台湾，香港)

# 0049_常用编码（了解）

# 0050_布尔类型

- 基本介绍
1. 布尔类型也叫boolean类型，booolean类型数据只允许取值true和false，无null。
2. boolean类型占1个字节。
3. boolean 类型适于逻辑运算，一般用于程序流程控制。
    1. if条件控制语句;
    2. while循环控制语句;
    3. do-while循环控制语句;
    4. for循环控制语句;

案例演示：**[Boolean.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0050_%E5%B8%83%E5%B0%94%E7%B1%BB%E5%9E%8B/Boolean.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0050_布尔类型)

# 0051_自动类型转换基础

- 介绍
    - 当java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型这个就是自动类型转换。
- 数据类型按精度(容量)大小排序为(背，规则)

![自动类型转换.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/c5f26475-d75d-4d58-9eda-d0eb90ed08a7/%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2.jpg)

案例演示：**[AutoConvert.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0051_%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E5%9F%BA%E7%A1%80/AutoConvert.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0051_自动类型转换基础)

# 0052-0053_自动类型转换细节

1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
2. 当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错，反之就会进行自动类型转换。
3. (byte, short)和 char之间不会相互自动转换。
4. byte，short，char 他们三者可以计算，在计算时首先转换为int类型。
5. boolean 不参与转换。
6. 自动提升原则: 表达式结果的类型自动提升为 操作数中最大的类型。

案例演示：**[AutoConvertDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0052-0053_%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E7%BB%86%E8%8A%82/AutoConvertDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0052-0053_自动类型转换细节)

# 0054_强制类型转换基础

- 介绍

自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符()，但可能造成精度降低或溢出,格外要注意。

案例演示：**[ForceConvert.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0054_%E5%BC%BA%E5%88%B6%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E5%9F%BA%E7%A1%80/ForceConvert.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0054_强制类型转换基础)

# 0055_强制类型转换细节

1. 当进行数据的大小从 大 → 小，就需要使用到强制转换。
2. 强制转换符号只针对于最近的操作数有效，往往会使用小括号提升优先级。
3. char类型可以保存int的常量值，但不能保存int的变量值，需要强制转换。
4. byte、short和char类型在进行运算时，当做int类型处理。

案例演示：**[ForceConvertDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0055_%E5%BC%BA%E5%88%B6%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E7%BB%86%E8%8A%82/ForceConvertDetail.java)**

```java
//int x = (int)10 * 3.5 + 6 * 1.5;//编译错误 double -> int
		int x = (int)(10 * 3.5 + 6 * 1.5);// (int)44.0 -> 44

		char c1 = 100;// √
		int m = 100;// √
	  //char c2 = m;// ×
		char c3 = (char)m;// √
```

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0055_强制类型转换细节)

# 0056_类型转换练习

- 判断是否能够通过编译
1. short s = 12; //√
s = s-9;         //×，int  → short
2. byte b = 10; //√
    
    b = b + 11;   //×，int → byte
    
    b =(byte)(b+11); //√，使用强转
    
3. char c = 'a';         //√
    
    int i = 16;            //√
    
    float d = .314F;    //√
    
    double result = c + i + d;  //√，float → double
    
4. byte b = 16;      //√
    
    short s = 14;     //√
    
    short t = s + b; //× int → short
    

# 0057_String和基本类型转换

- 介绍
    
    在程序开发中，我们经常需要将基本数据类型转成String 类型。或者将String类型转成基本数据类型。
    
- 基本类型转String类型
    
    语法：将基本类型的值 + "” 即可。
    
    例：`int n1 = 100;`
    
     `String s1 = n1 + "";`
    
- String类型转基本数据类型
    
    语法：通过基本类型的包装类调用parseXX方法即可。
    
    例：`String s5 = "123";`
    
        `int num1 = Integer.parseInt(s5);`
    
- 把字符串转成字符：把字符串的第一个字符取出。
    
    例：`System.out.println(s5.charAt(0));`
    

案例演示: **[StringToBasic.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0057_String%E5%92%8C%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2/StringToBasic.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0057_String和基本类型转换)

# 0058_String转基本类型细节

- 注意事项
1. 在将 String 类型转成 基本数据类型时，要确保String类型能够转成有效的数据，比如 我们可以把“123”，转成一个整数，但是不能把“hello”转成一个整数。
2. 如果格式不正确，就会抛出异常，程序就会终止， 这个问题在异常处理章节中，会处理。

现象：编译能通过，但运行时会抛出异常，终止运行。

案例演示: **[StringToBasicDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0058_String%E8%BD%AC%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E7%BB%86%E8%8A%82/StringToBasicDetail.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter03_变量/0058_String转基本类型细节)
