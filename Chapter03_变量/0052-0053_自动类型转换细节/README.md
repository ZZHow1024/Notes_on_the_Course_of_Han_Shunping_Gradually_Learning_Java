# 0052-0053\_自动类型转换细节

1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
2. 当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错，反之就会进行自动类型转换。
3. (byte, short)和 char 之间不会相互自动转换。
4. byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型。
5. boolean 不参与转换。
6. 自动提升原则: 表达式结果的类型自动提升为 操作数中最大的类型。

案例演示：**[AutoConvertDetail.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0052-0053_%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2%E7%BB%86%E8%8A%82/AutoConvertDetail.java)**

无运行结果。
