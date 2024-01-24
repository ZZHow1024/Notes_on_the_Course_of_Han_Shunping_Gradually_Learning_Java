# 0176-0179_二维数组内存布局+使用

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
    

TwoDimensionalArrayMethod03.java运行结果：  
==arr中的元素==  
1  
2 2  
3 3 3  
