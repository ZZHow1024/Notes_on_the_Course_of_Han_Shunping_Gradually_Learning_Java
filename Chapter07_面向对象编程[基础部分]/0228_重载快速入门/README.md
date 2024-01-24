# 0228_重载快速入门

- 案例：
    
    类：MyCalculator   |   方法：calculate
    
    calculate(int n1, int n2) // 两个int
    
    calculate(int n1, double n2) // 一个int，一个double
    
    calculate(double n1, int n2) // 一个double，一个int
    
    calculate(int n1, int n2, int n3) // 三个int
    

案例演示：**[OverLoad.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter07_%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%5B%E5%9F%BA%E7%A1%80%E9%83%A8%E5%88%86%5D/0228_%E9%87%8D%E8%BD%BD%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8/OverLoad.java)**

运行结果：  
1 + 1 = 2  
1 + 1.8 = 2.8  
1.8 + 1 = 2.8  
1 + 1 + 1 = 3  
