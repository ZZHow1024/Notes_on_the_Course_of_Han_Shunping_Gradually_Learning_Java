# 0170_数组缩减

- 案例：有一个数组int[] arr = {1,2,3,4,5}; 可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩下最后一个元素时，提示不能再缩减。

案例演示：**[ArrayReduce.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0170_%E6%95%B0%E7%BB%84%E7%BC%A9%E5%87%8F/ArrayReduce.java)**

运行结果1：  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 4      arr[4] = 5  
是否缩减数组(y/n)：y  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 4  
是否缩减数组(y/n)：y  
arr[0] = 1      arr[1] = 2      arr[2] = 3  
是否缩减数组(y/n)：n  
您已退出缩减  

运行结果2：  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 4      arr[4] = 5  
是否缩减数组(y/n)：y  
arr[0] = 1      arr[1] = 2      arr[2] = 3      arr[3] = 4  
是否缩减数组(y/n)：y  
arr[0] = 1      arr[1] = 2      arr[2] = 3  
是否缩减数组(y/n)：y  
arr[0] = 1      arr[1] = 2  
是否缩减数组(y/n)：y  
arr[0] = 1  
只剩下最后一个元素，不能再缩减  
