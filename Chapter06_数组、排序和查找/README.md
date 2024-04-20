# Chapter06
第六章_数组、排序和查找  
Chapter06_Arrays, Sorting, and Searching  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow1024

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8/?p=1]

# 0156_数组快速入门

- 介绍
    
    数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型，即：数组就是一组数据。
    

```java
double[] hens = {3, 5, 1, 3.4, 2, 50};
//1. double[] 表示是 double 类型的数组，数组名是 hens。
//2. {3, 5, 1, 3.4, 2, 50} 表示数组的 值/元素，依次表示数组的第几个元素。
```

- 案例：一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。请问这六只鸡的总体重是多少？平均体重是多少？请你编一个程序。

案例演示：**[Array.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0156_%E6%95%B0%E7%BB%84%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/Array.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0156_数组快速入门)

# 0157-0159_数组使用

- 使用方式1-动态初始化
    
    数组的定义
    
    ```java
    //数据类型 数组名 = new 数据类型[大小];
    int a[] = new int[5];
    //创建了一个数组，名字a，存放5个int。
    //或者
    int a[] = new int[]{1,2,3,4,5};
    ```
    
- 案例：编写程序录入5位同学的成绩，录入完成后输出。

案例演示：**[ArrayMethod01.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0157-0159_%E6%95%B0%E7%BB%84%E4%BD%BF%E7%94%A8/ArrayMethod01.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0157-0159_数组使用)

- 使用方式2-动态初始化
    
    先声明数组
    
    ```java
    //数据类型 数组名;
    //也可以 数据类型[] 数组名;
    int a[];
    //或者
    int[] a;
    ```
    
    创建数组
    
    ```java
    //数组名 = new 数据类型[大小];
    a = new int[10];
    ```
    
- 使用方式3-静态初始化
    
    初始化数组
    
    ```java
    //数据类型 数组名 = {元素值,元素值...};
    int a[] = {2, 5, 6, 7. 8, 89, 90, 34, 56];
    ```
    

# 0160_数组注意事项

1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理。
2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
3. 数组创建后，如果没有赋值，有默认值：
    1. int、short、byte、long默认是0。
    2. float、double默认是0.0。
    3. char默认是\u0000。
    4. boolean默认是false。
    5. String默认是null。
4. 使用数组的步骤：
    1. 1. 声明数组并开辟空间。
    2. 2. 给数组各个元素赋值。
    3. 3. 使用数组。
5. 数组的下标是从0开始的。
6. 数组下标必须在指定范围内使用，否则报下标越界异常。
7. 数组属引用类型，数组型数据是对象(object)。

# 0163-0164_数组赋值机制

1. 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
2. 数组在默认情况下是引用传递，赋的值是地址。

![数组赋值机制.jpg](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F91c0e447-a6fb-42ff-959a-633e2560fcd4%2F%25E6%2595%25B0%25E7%25BB%2584%25E8%25B5%258B%25E5%2580%25BC%25E6%259C%25BA%25E5%2588%25B6.jpg?table=block&id=1827bf38-d8bc-4df7-992f-3461da81f0b4&t=1827bf38-d8bc-4df7-992f-3461da81f0b4)

# 0165_数组拷贝

- 案例：将int[] arr1 = {10, 20, 30};拷贝到 arr2数组，要求数据空间是独立的。

案例演示：**[ArrayCopy.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0165_%E6%95%B0%E7%BB%84%E6%8B%B7%E8%B4%9D/ArrayCopy.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0165_数组拷贝)

# 0166-0167_数组翻转

- 案例：int[] arr = {11,22,33,44,55,66}; → {66,55,44,33,22,11}。
- 方法1：找规律反转。
- 方法2：使用逆序赋值方式。

案例演示：**[ArrayReverse01.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0166-0167_%E6%95%B0%E7%BB%84%E7%BF%BB%E8%BD%AC/ArrayReverse01.java)** 和 **[ArrayReverse02.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0166-0167_%E6%95%B0%E7%BB%84%E7%BF%BB%E8%BD%AC/ArrayReverse02.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0166-0167_数组翻转)

# 0168-0169_数组扩容

- 案例：实现动态的给数组添加元素效果，实现对数组扩容。
- int[] arr = {1,2,3};补一个4到数组最后，且用户可以选择是否继续扩容(y / n)。

案例演示：**[ArrayAdd.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0168-0169_%E6%95%B0%E7%BB%84%E6%89%A9%E5%AE%B9/ArrayAdd.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0168-0169_数组扩容)

# 0170_数组缩减

- 案例：有一个数组int[] arr = {1,2,3,4,5}; 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩下最后一个元素时，提示不能再缩减。

案例演示：**[ArrayReduce.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0170_%E6%95%B0%E7%BB%84%E7%BC%A9%E5%87%8F/ArrayReduce.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0170_数组缩减)

# 0171_排序介绍

- 排序是将多个数据，依指定的顺序进行排列的过程。
- 分类：
1. 内部排序：
    
    将需要处理的所有数据都加载到内部存储器中进行排序。包括（交换式排序法、选择式排序法 和 插入式排序法）。
    
2. 外部排序法：
    
    数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。包括（合并排序法 和 直接合并排序法）。
    

# 0172_冒泡排序思路

1. 我们一共有5个元素。
2. 一共进行了 4轮排序，可以看成是外层循环。
3. 每1轮排序可以确定一个数的位置，比如第1轮排序确定最大数，第2轮排序，确定第2大的数位置，依次类推。
4. 当进行比较时，如果前面的数大于后面的数，就交换。
5. 每轮比较在减少4 → 3 → 2 → 1。

# 0173_冒泡代码实现

- 案例：冒泡排序，{24,69,80,57,13}。

案例演示：**[BubbleSort.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0173_%E5%86%92%E6%B3%A1%E4%BB%A3%E7%A0%81%E5%AE%9E%E7%8E%B0/BubbleSort.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0173_冒泡代码实现)

# 0174_查找

- 常用方式：
    1. 顺序查找
    2. 二分查找
- 案例：有一个数列，James、Robert、John、Michael、William，从键盘中任意输入一个名称，判断数列中是否包含此名称，如果找到了就提示找到了，并给出下标值。[顺序查找案例]

案例演示：**[SeqSearch.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0174_%E6%9F%A5%E6%89%BE/SeqSearch.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0174_查找)

# 0175_二维数组入门

- 案例：请用二维数组输出如下图形。
    
    0 0 0 0 0 0
    
    0 0 1 0 0 0
    
    0 2 0 3 0 0
    
    0 0 0 0 0 0
    

案例演示：**[TwoDimensionalArray.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0175_%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84%E5%85%A5%E9%97%A8/TwoDimensionalArray.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0175_二维数组入门)

# 0175-0179_二维数组内存布局+使用

![二维数组内存布局](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F1ba79960-5e1a-489b-85ae-f0296b2383b3%2F%25E4%25BA%258C%25E7%25BB%25B4%25E6%2595%25B0%25E7%25BB%2584%25E5%2586%2585%25E5%25AD%2598%25E5%25B8%2583%25E5%25B1%2580.jpg?table=block&id=d92373a2-634c-4db0-a253-38f4045920b9&t=d92373a2-634c-4db0-a253-38f4045920b9)

二维数组内存布局

- 使用方式1：动态初始化。
    1. 语法：类型 数组名 = new 类型[大小][大小];
    2. 比如：int a[][] = new int[2][3];
    
    ```java
    int arr[][] = new int[2][3];
    ```
    
- 使用方式2：动态初始化。
    1. 先声明：类型 数组名[][];
    2. 再定义：(开辟空间)数组名 = new 类型[大小][大小];
    3. 赋值(有默认值，比如int（类型的就是0）。
    
    ```java
    int arr[][];
    arr = new int[2][3];
    ```
    
- 使用方式3：动态初始化 - 列数不确定。
    
    ```java
    //创建二维数组，但每个一维数组还没有开数据空间。
    int arr[][] = new int[3][];
    
    //给每个一维数组开空间
    //如果没给一维数组new，那么arr[i]就是null。
    for(int i = 0; i < arr.length; i++)
    {
    	arr[i] = new int[i + 1];
    }
    ```
    
    - 案例：动态创建下面的二维数组并输出。
        
        1
        
        2 2
        
        3 3 3
        

案例演示：**[TwoDimensionalArrayMethod03.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0175-0179_%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84%E5%86%85%E5%AD%98%E5%B8%83%E5%B1%80%2B%E4%BD%BF%E7%94%A8/TwoDimensionalArrayMethod03.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0175-0179_二维数组内存布局+使用)

- 使用方式4：静态初始化。
    1. 定义 类型 数组名 = {{值1,值2,…},{值1,值2,…},{值1,值2,…}};
    2. 使用即可 [固定方式访问]。
    
    ```java
    int[][] arr = {{1,1,1},{8,8,9},{100}};
    ```
    

# 0181_杨辉三角

- 案例：使用二维数组打印一个10行杨辉三角。、
    
    1
    
    1 1
    
    1 2 1
    
    1 3 3 1
    
    1 4 6 4 1
    
    ……
    
- 规律：
    1. 第一行有1个元素，第 n 行有 n 个元素。
    2. 每一行的第一个元素和最后一个元素都是 1。
    3. 从第三行开始，对于非第一个元素和最后一个元素的元素的值arr[i]lj]。
        
        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
        

案例演示：**[YangHui.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0181_%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92/YangHui.java)**

[](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter06_数组、排序和查找/0181_杨辉三角)

# 0182_二维数组细节

1. 一维数组的声明方式有：
    
    int[] x; 或者 int x[];
    
2. 二维数组的声明方式有：
    
    int[][] y; 或者 int[] y[]; 或者 int y[][];
    
3. 二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同也可以不相同。
    
    int map[][] = {{1,2},{3,4,5}}; // map[0]是一个含有两个元素的一维数组，map[1]是一个含有三个元素的一维数组。map是一个[列数不等的二维数组]。
