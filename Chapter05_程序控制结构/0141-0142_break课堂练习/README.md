# 0141-0142_break课堂练习

- 案例：实现登录验证，有3次机会，如果用户名为”admin”，密码为”password"提示登录成功，否则提示还有几次机会，请使用 for + break 完成。
- 补充：字符串的比较使用 equals 方法。

```java
String name ="abc";
System.out.println(name.equals("abc"));//true
System.out.println("abc".equals(name));//true
[推荐下面的写法，可以避免空指针。]
```

案例演示：**[BreakExer.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0141-0142_break%E8%AF%BE%E5%A0%82%E7%BB%83%E4%B9%A0/BreakExer.java)**

运行结果：  
请输入用户名：  
abc  
请输入密码：  
123  
用户名或密码错误，你还有2次机会！  
请输入用户名：  
123  
请输入密码：  
abc  
用户名或密码错误，你还有1次机会！  
请输入用户名：  
admin  
请输入密码：    
password  
登录成功！  
