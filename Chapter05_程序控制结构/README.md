# Chapter05
第五章_程序控制结构  
Chapter05_ProgramControlStructure  
@[dnx00  ](https://github.com/dnx00)的笔记  
@DNX

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

- 在程序中，程序运行的流程控制决定程序是如何执行的，是我们必须掌握的，主要有三大流程控制语句。
1. 顺序控制
2. 分支控制
3. 循环控制

# 0103_顺序控制

- 介绍
    
    程序从上到下逐行地执行，中间没有任何判断和跳转。
    

# 0104_单分支使用

- 基本语法：
    
    if(条件表达式){
    
    执行代码块;   (可以有多条语句;)
    
    }
    
- 说明：当条件表达式为ture 时，就会执行代码块中的代码；如果为false,就不执行。
- 特别说明：如果执行代码块中只有一条语句，则可以不用{ }，建议写上{ }。
- 案例：编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，就输出“年龄大于18岁！”。

案例演示：**[If01.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0104_%E5%8D%95%E5%88%86%E6%94%AF%E4%BD%BF%E7%94%A8/If01.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0104_单分支使用)

# 0106_双分支使用

- 基本语法：
    
    if(条件表达式){
    
    执行代码块 1;   (可以有多条语句;)
    
    }else{
    
    执行代码块 2;   (可以有多条语句;)
    
    }
    
- 说明：当条件表达式为ture 时，就会执行代码块1；如果为false，就执行代码块2。
- 特别说明：如果执行代码块中只有一条语句，则可以不用{ }，建议写上{ }。
- 案例：编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，就输出“年龄大于18岁！”，否则输出“年龄小于或等于18岁！”。

案例演示：**[If02.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0106_%E5%8F%8C%E5%88%86%E6%94%AF%E4%BD%BF%E7%94%A8/If02.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0106_双分支使用)

# 0109_多分支使用

- 基本语法：
    
    if(条件表达式 1){
    
    执行代码块 1;   (可以有多条语句;)
    
    }else if(条件表达式 2){
    
    执行代码块 2;   (可以有多条语句;)
    
    }else if(条件表达式 …){
    
    执行代码块 …;   (可以有多条语句;)
    
    }
    
    else{
    
    执行代码块 n;   (可以有多条语句;)
    
    }
    

特别说明：

1. 多分支 可以没有 else，如果所有的条件表达式都不成立，则一个执行入口都没有。
2. 如果有 else，如果所有的条件表达式都不成立，则默认执行 else 代码块。
3. 条件表达式 1 不成立，才去判断条件表达式 2 。

# 0112_嵌套分支

- 基本语法：

if(){

if(){

//if-else

}else{

//if-else

}

}

- 介绍：
    
    在一个分支结构中又完整的嵌套了另一个完整的分支结构里面的分支的结构称为内层分支外面的分支结构称为外层分支。
    
- 规范：
    
    不要超过3层（可读性不好）。
    

案例演示：**[NestedIf.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0112_%E5%B5%8C%E5%A5%97%E5%88%86%E6%94%AF/NestedIf.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0112_嵌套分支)

# 0114_switch基本语法

- 基本语法：

switch(表法式){

case 常量1:

语句块1;

break;

case 常量n:

语句块n;

break;

default:

语句块;

break;

}

# 0114_switch快速入门

- 案例：编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g，a表示星期一，b表示星期二…

案例演示：**[Switch.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0114_switch%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Switch.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0114_switch快速入门)

# 0117_switch细节

1. 表达式数据类型，应和 case 后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是 int 。
2. switch(表达式)中表达式的返回值必须是:(byte，short，int，char，enum[枚举]，String)。
3. case 子句中的值必须是常量，而不能是变量。
4. default子句是可选的，当没有匹配的 case 时，执行 default 。
5. break; 语句用来在执行完一个 case 分支后使程序跳出 switch 语句块; 如果没有写 break，程序会顺序执行到 switch 结尾，除非遇到 break;

# 0120_ switch 和 if 选择

1. 如果判断的具体数值不多，而且符合 [byte、 short 、int、 char、enum、String] 这6种类型。虽然两个语句都可以使用，建议使用swtich语句。
2. 其他情况：对区间判断，对结果为boolean类型判断，使用if，if的使用范围更广。

# 0121_for循环控制

- 基本语法：

for(循环变量初始化; 循环条件; 循环变量迭代){

循环操作;（可以多条语句;）

}

# 0123_for细节

1. 循环条件是返回一个布尔值的表达式。
2. for(;循环判断条件;)中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
3. 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。

# 0126_while循环控制

- 基本语法：

while(循环条件){

循环操作;（可以多条语句;）

循环变量迭代;

}

# 0128_while课堂练习

- while细节
1. 循环条件是返回一个布尔值的表达式。
2. while循环是先判断再执行语句。

# 0129_do…while语法

- 基本语法：

do{

循环操作;（可以多条语句;）

循环变量迭代;

}while(循环条件);

# 0133_多重循环执行流程

1. 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for、while、do...while 均可以作为外层循环和内层循环。[建议一般使用两层，最多不要超过3层，否则，代码的可读性很差]
2. 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环。
3. 设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n次。

```java
//例：DNX写于2024年1月20日
for(int i = 0; i < 7; i++)
{
	for(int j = 0; j < 2; j++)
	{
		System.out.println("ok"); // 执行 7 * 2 = 14次
	}
}
```

# 0134-0135_多重循环练习

- 案例：打印 9 * 9 乘法表。

![运行结果](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F617a821d-7ae2-442d-b20d-3353799d007d%2F%25E8%25BF%2590%25E8%25A1%258C%25E7%25BB%2593%25E6%259E%259C.jpg?table=block&id=3024817b-b115-431f-a6be-ad7d1a542b16&t=3024817b-b115-431f-a6be-ad7d1a542b16)

运行结果

案例演示：**[MultiplicationTable.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0134-0135_%E5%A4%9A%E9%87%8D%E5%BE%AA%E7%8E%AF%E7%BB%83%E4%B9%A0/MultiplicationTable.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0134-0135_多重循环练习)

# 0136_空心金字塔

- 案例：打印空心金字塔。

![运行结果](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F95ccc172-7310-411b-af9f-16de6a260055%2F%25E8%25BF%2590%25E8%25A1%258C%25E7%25BB%2593%25E6%259E%259C.jpg?table=block&id=adf09da8-6ac8-496d-8336-016e4a69666b&t=adf09da8-6ac8-496d-8336-016e4a69666b)

运行结果

案例演示：**[Star.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0136_%E7%A9%BA%E5%BF%83%E9%87%91%E5%AD%97%E5%A1%94/Star.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0136_空心金字塔)

# 0137_break需求

- 循环，但是循环的次数不知道 → break，当某个条件满足时，终止循环通过该需求可以说明其它流程控制的必要性，比如break。
- 案例：随机生成1-100的一个数，直到生成了97这个数，看看你一共用了几次？
- 提示使用 (int)(Math.random() * 100) + 1;

![运行结果.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fb8edc9cb-21eb-4547-a683-27c76e4ad619%2F%25E8%25BF%2590%25E8%25A1%258C%25E7%25BB%2593%25E6%259E%259C.jpg?table=block&id=d62d09ae-a322-434c-9a39-d1053c6a0498&t=d62d09ae-a322-434c-9a39-d1053c6a0498)

案例演示：**[Break.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0137_break%E9%9C%80%E6%B1%82/Break.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0137_break需求)

# 0138_break执行流程

- 基本语法

{

break;

……

}

# 0140_break细节

1. break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块。
2. 标签的基本使用。
    
    label1:{   ……
    
    label2:      {   ……
    
    label3:            {   ……
    
                               break; 
    
                               ……
    
                           }
    
                     }
    
               }
    
    - 老韩解读：
    1. break 语句可以指定退出哪层。
    2. label1 是标签，名字由程序员指定。
    3. break 后指定到哪个label 就退出到哪里。
    4. 在实际的开发中，老韩尽量不要使用标签。
    5. 如果没有指定 break，默认退出最近的循环体。

# 0141-0142_break课堂练习

- 案例：实现登录验证，有3次机会，如果用户名为”admin”，密码为”password"提示登录成功，否则提示还有几次机会，请使用 for + break 完成。
- 补充：字符串的比较使用 equals 方法。

```java
String name ="abc";
System.out.println(name.equals("abc"));//true
System.out.println("abc".equals(name));//true
[推荐下面的写法，可以避免空指针。]
```

案例演示：**[BreakExer.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0141-0142_break%E8%AF%BE%E5%A0%82%E7%BB%83%E4%B9%A0/BreakExer.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter05_程序控制结构/0141-0142_break课堂练习)

# 0143_continue执行流程

- 介绍
1. continue语句用于结束本次循环，继续执行下一次循环。
2. continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环，这个和前面的标签的使用的规则一样。
- 基本语法

{   ……

    continue;

    ……

}

# 0143_return使用说明

- 介绍

return使用在方法，表示跳出所在的方法，在讲解方法的时候，会详细的介绍。

注意：如果 return 写在 main方法，退出程序。