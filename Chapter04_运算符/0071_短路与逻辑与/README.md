# 0071_短路与逻辑与

- 短路与&&   条件1&&条件2   两个条件都为true，结果为true，否则false。
- 逻辑与&   条件1&条件2   两个条件都为true，结果true，否则false。
- 区别：
1. && 短路与: 如果第一个条件为false，则第二个条件不会判断(如果有自增也不会执行)，最终结果为false，效率更高。
2. & 逻辑与: 不管第一个条件是否为false，第二个条件都要判断，效率更低。
3. 开发中，基本是使用短路与&&，效率更高。

案例演示：**[And.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0071_%E7%9F%AD%E8%B7%AF%E4%B8%8E%E9%80%BB%E8%BE%91%E4%B8%8E/And.java)**

运行结果：  
短路与测试：  
ok短路与  
  
逻辑与测试：  
ok逻辑与  
  
短路与 逻辑与 区别测试：  
短路与：a = 3，b = 9  
逻辑与：a = 3，b = 10  
