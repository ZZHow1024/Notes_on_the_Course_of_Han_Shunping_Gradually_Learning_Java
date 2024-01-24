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

案例演示：**[VarParameter.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0233_%E5%8F%AF%E5%8F%98%E5%8F%82%E6%95%B0%E4%BD%BF%E7%94%A8/VarParameter.java)**

运行结果：  
1 + 1 + 1 + 1 + 1 = 5  
