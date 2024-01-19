# 0058_String转基本类型细节

- 注意事项
1. 在将 String 类型转成 基本数据类型时，要确保String类型能够转成有效的数据，比如 我们可以把“123”，转成一个整数，但是不能把“hello”转成一个整数。
2. 如果格式不正确，就会抛出异常，程序就会终止， 这个问题在异常处理章节中，会处理。

现象：编译能通过，但运行时会抛出异常，终止运行。

案例演示: **[StringToBasicDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0058_String%E8%BD%AC%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E7%BB%86%E8%8A%82/StringToBasicDetail.java)**

运行结果：  
123  
Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"  
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)  
        at java.base/java.lang.Integer.parseInt(Integer.java:661)  
        at java.base/java.lang.Integer.parseInt(Integer.java:777)  
        at StringToBasicDetail.main(StringToBasicDetail.java:12)  
  
