# 0168-0169_数组扩容

- 案例：实现动态的给数组添加元素效果，实现对数组扩容。
- int[] arr = {1,2,3};补一个4到数组最后，且用户可以选择是否继续扩容(y / n)。

案例演示：**[ArrayAdd.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0168-0169_%E6%95%B0%E7%BB%84%E6%89%A9%E5%AE%B9/ArrayAdd.java)**

运行结果：  
==扩容前的数组==  
arr[0] = 1      arr[1] = 2      arr[2] = 3  
请输入你要添加的元素：10  

==扩容后的数组==  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 10  
是否继续添加(y/n)：y  

请输入你要添加的元素：20  

==扩容后的数组==  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 10     arr[4] = 20  
是否继续添加(y/n)：y  

请输入你要添加的元素：30  

==扩容后的数组==  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 10     arr[4] = 20     arr[5] = 30  
是否继续添加(y/n)：n  
已退出添加！  
