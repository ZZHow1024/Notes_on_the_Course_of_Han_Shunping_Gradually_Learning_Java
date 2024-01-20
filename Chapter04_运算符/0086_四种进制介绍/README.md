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

案例演示：**[BinaryTest.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0086_%E5%9B%9B%E7%A7%8D%E8%BF%9B%E5%88%B6%E4%BB%8B%E7%BB%8D/BinaryTest.java)**

运行结果：  
0B1010 = 10  
1010 = 1010  
01010 = 520  
0X1010 = 4112  
