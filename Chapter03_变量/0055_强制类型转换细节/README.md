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

运行结果：  
44  
d
