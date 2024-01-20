# 0137_break需求

- 循环，但是循环的次数不知道 → break，当某个条件满足时，终止循环通过该需求可以说明其它流程控制的必要性，比如break。
- 案例：随机生成1-100的一个数，直到生成了97这个数，看看你一共用了几次？
- 提示使用 (int)(Math.random() * 100) + 1;

![运行结果.jpg]([https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/b8edc9cb-21eb-4547-a683-27c76e4ad619/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.jpg](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0137_break%E9%9C%80%E6%B1%82/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.jpg)https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0137_break%E9%9C%80%E6%B1%82/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.jpg)

案例演示：**[Break.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0137_break%E9%9C%80%E6%B1%82/Break.java)**

运行结果：  
76  
5  
60  
62  
52  
16  
29  
54  
1  
55  
84  
76  
72  
78  
28  
18  
50  
4  
67  
79  
83  
17  
82  
92  
18  
26  
78  
16  
21  
47  
40  
97  
生成了97这个数，一共用了32次  
