# 0057_String 和基本类型转换

- 介绍
  在程序开发中，我们经常需要将基本数据类型转成 String 类型。或者将 String 类型转成基本数据类型。
- 基本类型转 String 类型
  语法：将基本类型的值 + "” 即可。
  例：`int n1 = 100;`
  `String s1 = n1 + "";`
- String 类型转基本数据类型
  语法：通过基本类型的包装类调用 parseXX 方法即可。
  例：`String s5 = "123";`
        `int num1 = Integer.parseInt(s5);`
- 把字符串转成字符：把字符串的第一个字符取出。
  例：`System.out.println(s5.charAt(0));`

案例演示: **[StringToBasic.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0057_String%E5%92%8C%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2/StringToBasic.java)**

运行结果：

基本数据类型 -> String 测试：  
100 1.1 4.5 true

String -> 对应的基本数据类型测试：  
123  
123.0  
123.0  
123  
123  
123  
true

String -> char 测试：  
1
