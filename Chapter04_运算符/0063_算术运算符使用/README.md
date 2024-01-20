# 0063_算数运算符使用

1. +，-，*，/，%，++，--，重点：/、%、++
2. 自增：++
    
    作为独立的语句使用：前++ 和 后++都完全等价于 i = i + 1;
    
    作为表达式使用：
    
    前++：++i先自增，后赋值。
    
    后++：i++先赋值，后自增。
    
3. --、+、-、* 是一个道理，完全可以类推。

案例演示：**[ArithmeticOperator.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0063_%E7%AE%97%E6%9C%AF%E8%BF%90%E7%AE%97%E7%AC%A6%E4%BD%BF%E7%94%A8/ArithmeticOperator.java)**

运行结果：  
除法测试：  
10 / 4 = 2  
10.0 / 4 = 2.5  
10.0 / 4 = 2.0  
  
取模测试：  
10 % 3 = 1  
-10 % 3 = -1  
10 % -3 = 1  
-10 % -3 = -1  
  
自增测试：  
i = 12  
k = 8，j = 9  
