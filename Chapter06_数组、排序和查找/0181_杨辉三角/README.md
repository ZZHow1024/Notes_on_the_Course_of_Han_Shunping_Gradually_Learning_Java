# 0181_杨辉三角

- 案例：使用二维数组打印一个10行杨辉三角。、
    
    1  
    1 1  
    1 2 1  
    1 3 3 1  
    1 4 6 4 1  
    ……
    
- 规律：
    1. 第一行有1个元素，第 n 行有 n 个元素。
    2. 每一行的第一个元素和最后一个元素都是 1。
    3. 从第三行开始，对于非第一个元素和最后一个元素的元素的值arr[i]lj]。
        
        arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
        

案例演示：**[YangHui.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter06_%E6%95%B0%E7%BB%84%E3%80%81%E6%8E%92%E5%BA%8F%E5%92%8C%E6%9F%A5%E6%89%BE/0181_%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92/YangHui.java)**

运行结果：  
1  
1       1  
1       2       1  
1       3       3       1  
1       4       6       4       1  
1       5       10      10      5       1  
1       6       15      20      15      6       1  
1       7       21      35      35      21      7       1  
1       8       28      56      70      56      28      8       1  
1       9       36      84      126     126     84      36      9       1  
