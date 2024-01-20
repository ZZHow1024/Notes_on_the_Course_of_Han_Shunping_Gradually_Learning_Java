# 0072_短路或逻辑或

- 短路或||   条件1||条件2   两个条件中只要有一个为true，结果为true，否则false。
- 逻辑或|   条件1|条件2   两个条件中只要有一个为true，结果为true，否则false。
- 区别：
1. || 短路或: 如果第一个条件为true，则第二个条件不会判断(如果有自增也不会执行)，最终结果为true，效率更高。
2. | 逻辑或: 不管第一个条件是否为true，第二个条件都要判断，效率更低。
3. 开发中，基本是使用短路或||，效率更高。

案例演示：**[Or.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter04_%E8%BF%90%E7%AE%97%E7%AC%A6/0072_%E7%9F%AD%E8%B7%AF%E6%88%96%E9%80%BB%E8%BE%91%E6%88%96/Or.java)**

运行结果：  
短路或测试：  
ok短路或  
  
逻辑或测试：  
ok逻辑或  
  
短路与 逻辑与 区别测试：  
ok||  
短路或：a = 3，b = 9  
ok|  
逻辑或：a = 3，b = 10  
