# Chapter04
第四章_运算符  
Chapter04_Operator
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow1024

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

- 运算符介绍
    
    运算符是一种特殊的符号，用以表示数据的运算、赋值和比较等。
    
1. 算术运算符
2. 赋值运算符
3. 关系运算符 [比较运算符]
4. 逻辑运算符
5. 位运算符[需要二进制基础]
6. 三元运算符

# 0062_算数运算符介绍

算术运算符是对数值类型的变量进行运算的，在Java程序中使用的非常多。

- 算术运算符一览

![算术运算符.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fce0a4915-7c8b-4219-a41f-6d1158ce6834%2F%25E7%25AE%2597%25E6%259C%25AF%25E8%25BF%2590%25E7%25AE%2597%25E7%25AC%25A6.jpg?table=block&id=90353fa4-98ef-4c7b-b3dd-2ea2b9febad4&t=90353fa4-98ef-4c7b-b3dd-2ea2b9febad4)

# 0063_算数运算符使用

1. +，-，*，/，%，++，--，重点：/、%、++
2. 自增：++
    
    作为独立的语句使用：前++ 和 后++都完全等价于 i = i + 1;
    
    作为表达式使用：
    
    前++：++i先自增，后赋值。
    
    后++：i++先赋值，后自增。
    
3. --、+、-、* 是一个道理，完全可以类推。

案例演示：**[ArithmeticOperator.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0063_%E7%AE%97%E6%9C%AF%E8%BF%90%E7%AE%97%E7%AC%A6%E4%BD%BF%E7%94%A8/ArithmeticOperator.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0063_算术运算符使用)

# 0064_算数运算符练习01

- 面试题1

```java
int i = 1; // i -> 1
i = i++; //过程：(1)temp = i;(2)i = i + 1;(3)i = temp;
System.out.println(i); // 1
```

- 面试题2

```java
int i = 1; // i -> 1
i = ++i; //过程：(1)i = i + 1;(2)temp = i;(3)i = temp;
System.out.println(i); // 2
```

# 0065_算数运算符练习02

```java
int i1 = 10;
int i2 = 20;
int i = i1++;
System.out.print("i = " + i); // 10
System.out.println("i2 = " + i2); //20
i = --i2;
System.out.print("i = " + i); // 19
System.out.println("i2 = " + i2); // 19
```

# 0068_关系运算符介绍

- 关系运算符(比较运算符)一览

![关系运算符.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F92c0a0e6-9653-452a-a11a-d94b231e1b48%2F%25E5%2585%25B3%25E7%25B3%25BB%25E8%25BF%2590%25E7%25AE%2597%25E7%25AC%25A6.jpg?table=block&id=0c5fdf2c-f49e-4c1b-bea0-ea071b8760c2&t=0c5fdf2c-f49e-4c1b-bea0-ea071b8760c2)

# 0069_关系运算符使用

- 细节说明
1. 关系运算符的结果都是boolean型，也就是要么是true，要么是false。
2. 关系运算符组成的表达式，我们称为关系表达式。 a > b。
3. 比较运算符 "==" 不能误写成 ”=”

案例演示：**[RelationalOperator.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0069_%E5%85%B3%E7%B3%BB%E8%BF%90%E7%AE%97%E7%AC%A6%E4%BD%BF%E7%94%A8/RelationalOperator.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0069_关系运算符使用)

# 0070_逻辑运算符介绍

- 逻辑运算符一览
1. 短路与 &&，短路或 ||，取反 !
2. 逻辑与 &，逻辑或 |， 逻辑异或 ^

![逻辑运算符.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fcc0a19de-12af-4055-a955-1cf7e042b4da%2F%25E9%2580%25BB%25E8%25BE%2591%25E8%25BF%2590%25E7%25AE%2597%25E7%25AC%25A6.jpg?table=block&id=fe40ef39-b87f-4c17-84f1-309671f580b8&t=fe40ef39-b87f-4c17-84f1-309671f580b8)

# 0071_短路与逻辑与

- 短路与&&   条件1&&条件2   两个条件都为true，结果为true，否则false。
- 逻辑与&   条件1&条件2   两个条件都为true，结果true，否则false。
- 区别：
1. && 短路与: 如果第一个条件为false，则第二个条件不会判断(如果有自增也不会执行)，最终结果为false，效率更高。
2. & 逻辑与: 不管第一个条件是否为false，第二个条件都要判断，效率更低。
3. 开发中，基本是使用短路与&&，效率更高。

案例演示：**[And.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0071_%E7%9F%AD%E8%B7%AF%E4%B8%8E%E9%80%BB%E8%BE%91%E4%B8%8E/And.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0071_短路与逻辑与)

# 0072_短路或逻辑或

- 短路或||   条件1||条件2   两个条件中只要有一个为true，结果为true，否则false。
- 逻辑或|   条件1|条件2   两个条件中只要有一个为true，结果为true，否则false。
- 区别：
1. || 短路或: 如果第一个条件为true，则第二个条件不会判断(如果有自增也不会执行)，最终结果为true，效率更高。
2. | 逻辑或: 不管第一个条件是否为true，第二个条件都要判断，效率更低。
3. 开发中，基本是使用短路或||，效率更高。

案例演示：**[Or.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0072_%E7%9F%AD%E8%B7%AF%E6%88%96%E9%80%BB%E8%BE%91%E6%88%96/Or.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0072_短路或逻辑或)

# 0073_短路非逻辑异或

- ! 非(取反)   !条件   如果条件本身成立，结果为false，否则为true。
- a ^ b：逻辑异或，当 a 和 b 不想同时，则结果为true，否则为false。

# 0075_赋值运算符介绍

- 介绍
    
    赋值运算符就是将某个运算后的值，赋给指定的变量。
    
- 分类
    1. 基本赋值运算符
        
        =
        
    2. 复合赋值运算符
        
        +=、-+、*=、/=、%= 等
        
        例：a += b; [等价于：a = a + b;]
        
        a -= b; [等价于：a = a - b;]
        

# 0076_赋值运算符细节

1. 运算顺序从右往左。
    
    int num = a + b + c;
    
2. 赋值运算符的左边 只能是变量,右边 可以是变量、表达式、常量值。
    
    int num = 20; int num2= 78 * 34 - 10; int num3 = a;
    
3. 复合赋值运算符等价于下面的效果
    
    比如: a+=3; [等价于a=a+3;]
    
4. 复合赋值运算符会进行类型转换。
    
    byte b = 2;
    
    b+=3; [等价于b = (byte)(b + 3);]
    
    b++; [等价于b = (byte)(b + 1;)]
    

# 0077_三元运算符介绍

- 基本语法
    
    条件表达式 ? 表达式1 : 表达式2;
    
1. 如果条件表达式为true，运算后的结果是表达式1;
2. 如果条件表达式为false，运算后的结果是表达式2;

补充提示：如果条件表达式是true，表达式2根本不会执行。

# 0078_三元运算符介绍

1. 表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换，或手动强制转换)。
2. 三元运算符可以转成 if--else 语句。

# 0079_三元运算符练习

- 实现求三个数的最大值。

案例演示：**[TernaryOperatorExer01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0079_%E4%B8%89%E5%85%83%E8%BF%90%E7%AE%97%E7%AC%A6%E7%BB%83%E4%B9%A0/TernaryOperatorExer01.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0079_三元运算符练习)

# 0080_运算符优先级

1. 运算符有不同的优先级，所谓优先级就是表达式运算中的运算顺序。如右表，上一行运算符总优先于下一行。
2. 只有单目运算符、赋值运算符是从右向左运算的。

![优先级.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F56fd5435-7556-4093-99f9-835c8945e86e%2F%25E4%25BC%2598%25E5%2585%2588%25E7%25BA%25A7.jpg?table=block&id=b3829578-03cf-42b1-92b1-a77f11e1eb96&t=b3829578-03cf-42b1-92b1-a77f11e1eb96)

# 0081_标识符规则

- 标识符概念
1. Java 对各种变量、方法和类等命名时使用的字符序列称为标识符。
2. 2.凡是自己可以起名字的地方都叫标识符 int num1 = 90;
- 标识符的命名规则(必须遵守)
1. 由26个英文字母大小写，0-9 ， 或 $组成。
2. 数字不可以开头。int 3ab = 1: // ×
3. 不可以使用关键字和保留字，但能包含关键字和保留字。
4. Java中严格区分大小写，长度无限制。
    
    int totalNum = 10;  int n = 90;
    
5. 标识符不能包含空格。int a b = 90; // ×

# 0083_标识符规范

- 标识符命名规范 [更加专业]
1. 包名:多单词组成时所有字母都小写: aaa.bbb.ccc //比如 com.hsp.crm
    
    比如com.dnx.asd
    
2. 类名、接口名: 多单词组成时，所有单词的首字母大写: XxxYyyZzz [大驼峰]
    
    比如:TankShotGame
    
3. 变量名、方法名:多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写: xxxYyyZzz [小驼峰，简称 驼峰法]
    
    比如: tankShotGame
    
4. 常量名: 所有字母都大写。多单词时每个单词用下划线连接: XXX_YYY_ZZZ
    
    比如:定义一个所得税率 TAX_RATE
    
5. 后面我们学习到 类，包，接口，等时，我们的命名规范要这样遵守,更加详细的看文档。

# 0084_关键字保留字(不用背)

- 关键字
1. 定义：被Java语言赋予了特殊含义，用做专门用途的字符串（单词）。
2. 特点：关键字中所有字母都为小写。

![关键字1.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fcf0256bb-3df2-48f2-9cdf-fca36aee3ccf%2F%25E5%2585%25B3%25E9%2594%25AE%25E5%25AD%25971.jpg?table=block&id=4cf3b355-3808-45e5-aff1-5823ee976ca2&t=4cf3b355-3808-45e5-aff1-5823ee976ca2)

![关键字2.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F7210dcd7-779f-44bd-95ef-68495e67bae6%2F%25E5%2585%25B3%25E9%2594%25AE%25E5%25AD%25972.jpg?table=block&id=329ae636-ba42-4f3c-a0a4-4059e8951786&t=329ae636-ba42-4f3c-a0a4-4059e8951786)

- 保留字
1. 定义：现有Java版本尚未使用，但以后版本可能会作为关键字使用。自己命名标识符时要避免使用这些保留字。
2. 有哪些：byValue、cast、future、generic、inner、operator、outer、rest、var、goto、const

# 0085_键盘输入

- 步骤 :
1. 导入该类的所在包，java.util.*   。
2. 创建该类对象(声明变量)。
3. 调用里面的功能。
- 实现可以从控制台接收用户信息[姓名，年龄，成绩]。

案例演示：**[Input.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0085_%E9%94%AE%E7%9B%98%E8%BE%93%E5%85%A5/Input.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0085_键盘输入)

# 0086_四种进制介绍

- 对于整数，有四种表示方式：
1. 二进制：0，1。满 2 进 1 ，以0b或0B开头。
2. 十进制：0 - 9 。满 10 进 1 。
3. 八进制：0 - 7。满 8 进 1 ，以数字0开头表示。
4. 十六进制：0 - 9 及 A(10) - F(15)。满 16 进 1 ，以0x或0X开头表示。此处的A-F不区分大小写。

```java
int n1 = 0b1010; // 二进制
int n2 = 1010;   // 十进制
int n3 = 01010;  // 八进制
int n4 = 0x10101;// 十六进制
```

案例演示：**[BinaryTest.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0086_%E5%9B%9B%E7%A7%8D%E8%BF%9B%E5%88%B6%E4%BB%8B%E7%BB%8D/BinaryTest.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0086_四种进制介绍)

# 0087_2进制转10进制

- 规则：从最低位(右边)开始，将每个位上的数提取出来，乘以**2**的(位数-1)次方，然后求和。
- 案例：将 0b1011 转成十进制的数。
- 过程：

0b1011 = 1 * 2的(1-1)次方 + 1 * 2的(2-1)次方 + 0 * 2的(3-1)次方 + 1 * 2的(4-1)次方 = 1 + 2 + 0 + 8 = 11

# 0088_8进制转10进制

- 规则：从最低位(右边)开始，将每个位上的数提取出来，乘以**8**的(位数-1)次方，然后求和。
- 案例：将 0234 转成十进制的数。
- 过程：

0234 = 4 * 8的(1-1)次方 + 3 * 8的(2-1)次方 + 2 * 8的(3-1)次方 = 4 + 24 + 128 = 156

# 0089_16进制转10进制

- 规则：从最低位(右边)开始，将每个位上的数提取出来，乘以**16**的(位数-1)次方，然后求和。
- 案例：将 0x23A 转成十进制的数。
- 过程：

0x23A = 10 * 16的(1-1)次方 + 3 * 16的(2-1)次方 + 2 * 16的(3-1)次方 = 10 + 48 + 512 = 570

# 0090_10进制转2进制

- 规则：将该数不断除以**2**，直到商为0为止，然后将每步得到的余数倒过来，就是对应的二进制。
- 案例：将 34 转成二进制的数。
- 结果：0B00100010（1字节是8位，前面补0）

# 0091_10进制转8进制

- 规则：将该数不断除以**8**，直到商为0为止，然后将每步得到的余数倒过来，就是对应的八进制。
- 案例：将 131 转成八进制的数。
- 结果：0203

# 0092_10进制转16进制

- 规则：将该数不断除以**16**，直到商为0为止，然后将每步得到的余数倒过来，就是对应的十六进制。
- 案例：将 237 转成十六进制的数。
- 结果：0xED

# 0093_2进制转8进制

- 规则：从低位开始，将二进制数**每三位一组**，转成对应的八进制数即可。
- 案例：将 0b11010101 转成八进制的数。
- 过程：

0b11010101 = 011(3)010(2)101(5) = 0325

# 0094_2进制转16进制

- 规则：从低位开始，将二进制数**每四位一组**，转成对应的十六进制数即可。
- 案例：将 0b11010101 转成十六进制的数。
- 过程：

0b11010101 = 1101(D)0101(5) = 0xD5

# 0095_8进制转2进制

- 规则：将八进制数每1位，转成对应的**一个3位的二进制数**即可。
- 案例：将 0237 转成二进制的数。
- 过程：

0237 = 2(010)3(011)7(111) = 0b010011111 = 0b10011111(拿掉多的0)

# 0096_16进制转2进制

- 规则：将十六进制数每1位，转成对应的**一个4位的二进制数**即可。
- 案例：将 0x23B 转成二进制的数。
- 过程：

0x23B = 2(0010)3(0011)B(1011) = 0b001000111011

# 0098_原码 反码 补码（重要）

- 对于有符号数而言
1. 二进制的最高位是符号位：
    1. 0表示正数,1表示负数(老韩口诀: 0 → 0，1 → -)
2. 正数的原码，反码，补码都一样(三码合一)。
3. 负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)。
4. 负数的补码=它的反码+1，负数的反码 = 负数的补码 - 1。
5. 0的反码，补码都是0。
6. java没有无符号数，换言之，Java中的数都是有符号的。
7. 在计算机运算的时候，都是以补码的方式来运算的。
8. 当我们看运算结果的时候，要看他的原码。

# 0099-0100_位运算符详解

- java中有7个位运算
    - &、|、^、~、>>、<<、>>>
- 运算法则：
    - 按位与 &：两位全为1，结果为1，否则为0。
    - 按位或 |：两位有一个为1，结果为1，否则为0。
    - 按位异或 ^：两位一个为0，一个为1，结果为1，否则为0。
    - 按位取反 ~：0 → 1，1 → 0。
    - 算数右移 >>：低位溢出，符号位不变，并用符号位补溢出的高位。
    - 算数左移 <<：符号位不变，低位补0。
    - 逻辑右移 >>>：也叫无符号右移，低位溢出，高位补 0 。
    - 特别说明：没有 <<< 符号！
- 计算：
    - 2 & 3 = 2
    - ~(-2) = 1
    - ~2 = -3
    - 1 >> 2 = 0 [本质：1 / 2 / 2 = 0]
    - 1 << 2 = 4 [本质：1 * 2 * 2 = 4]
    - 4 << 3 = 32 [本质：4 * 2 * 2 * 2 = 32]
    - 15 >> 2 = 3 [本质：15 / 2 / 2 = 3]

案例演示：**[TernaryOperatorDetail.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0099-0100_%E4%BD%8D%E8%BF%90%E7%AE%97%E7%AC%A6%E8%AF%A6%E8%A7%A3/TernaryOperatorDetail.java)**

[](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter04_运算符/0099-0100_位运算符详解)

```java
//DNX写于2024年1月19日
public class TernaryOperatorDetail{
	public static void main(String[] args){

		//例题1：2 & 3 = 2
		//1. 2的原码 00000000 00000000 00000000 00000010
		//   2的补码 00000000 00000000 00000000 00000010 (正数三码合一)
		//2. 3的原码 00000000 00000000 00000000 00000011
		//   3的补码 00000000 00000000 00000000 00000011 (正数三码合一)
		//3. 进行按位 & 运算
		//          00000000 00000000 00000000 00000010
		//          00000000 00000000 00000000 00000011
		//          00000000 00000000 00000000 00000010   & 的结果(补码)
		//原码：     00000000 00000000 00000000 00000010 (正数三码合一) = 2
		System.out.println("2 & 3 = " + (2 & 3)); // 2

		//例题2：~(-2) = 1
		//1. (-2)的原码 10000000 00000000 00000000 00000010
		//   (-2)的反码 11111111 11111111 11111111 11111101
		//   (-2)的补码 11111111 11111111 11111111 11111110  (反码 + 1)
		//2. 进行按位 ~ 运算
		//             00000000 00000000 00000000 00000001   ~ 的结果(补码)
		//原码：        00000000 00000000 00000000 00000001 (正数三码合一) = 1
		System.out.println("~(-2) = " + ~(-2)); // 1

		//例题3：~2 = -3
		//1. 2的原码 00000000 00000000 00000000 00000010
		//   2的补码 00000000 00000000 00000000 00000010 (正数三码合一)
		//2. 进行按位 ~ 运算
		//          11111111 11111111 11111111 11111101   ~ 的结果(补码)
		//反码：     11111111 11111111 11111111 11111100 (补码 - 1)
		//原码：     10000000 00000000 00000000 00000011 = -3
		System.out.println("~2 = " + ~2); // 3

		//例题4：1 >> 2 = 0 [本质：1 / 2 / 2 = 0]
		//1. 1的原码 00000000 00000000 00000000 00000001
		//   1的补码 00000000 00000000 00000000 00000001 (正数三码合一)
		//2. 进行移位 >> (2次)运算
		//          00000000 00000000 00000000 00000000   >> 2次的结果(补码)
		//原码：     00000000 00000000 00000000 00000000 (正数三码合一) = 0
		System.out.println("1 >> 2 = " + (1 >> 2)); // 0

		//例题5：1 << 2 = 4 [本质：1 * 2 * 2 = 4]
		//1. 1的原码 00000000 00000000 00000000 00000001
		//   1的补码 00000000 00000000 00000000 00000001 (正数三码合一)
		//2. 进行移位 << (2次)运算
		//          00000000 00000000 00000000 00000100   << 2次的结果(补码)
		//原码：     00000000 00000000 00000000 00000100 (正数三码合一) = 4
		System.out.println("1 << 2 = " + (1 << 2)); // 4

		//例题6：4 << 3 = 32 [本质：4 * 2 * 2 * 2 = 32]
		System.out.println("4 << 3 = " + (4 << 3)); // 32

		//例题6：15 >> 2 = 3 [本质：15 / 2 / 2 = 3]
		System.out.println("15 >> 2 = " + (15 >> 2)); // 3
	}
}
```
