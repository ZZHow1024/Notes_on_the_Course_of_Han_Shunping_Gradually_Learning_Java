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

运行结果：  
请输入第1名同学的成绩：  
88  
请输入第2名同学的成绩：  
90.5  
请输入第3名同学的成绩：  
95.5  
请输入第4名同学的成绩：  
99.5  
请输入第5名同学的成绩：  
100  
==现在开始输出成绩==  
请输入第1名同学的成绩：88.0  
请输入第2名同学的成绩：90.5  
请输入第3名同学的成绩：95.5  
请输入第4名同学的成绩：99.5  
请输入第5名同学的成绩：100.0  
