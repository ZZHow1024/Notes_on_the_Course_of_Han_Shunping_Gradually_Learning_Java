# 0057_String和基本类型转换

- 介绍
    
    在程序开发中，我们经常需要将基本数据类型转成String 类型。或者将String类型转成基本数据类型。
    
- 基本类型转String类型
    
    语法：将基本类型的值 + "” 即可。
    
    例：`int n1 = 100;`
    
     `String s1 = n1 + "";`
    
- String类型转基本数据类型
    
    语法：通过基本类型的包装类调用parseXX方法即可。
    
    例：`String s5 = "123";`
    
        `int num1 = Integer.parseInt(s5);`
    
- 把字符串转成字符：把字符串的第一个字符取出。
    
    例：`System.out.println(s5.charAt(0));`
    

案例演示: **[StringToBasic.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0057_String%E5%92%8C%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2/StringToBasic.java)**
