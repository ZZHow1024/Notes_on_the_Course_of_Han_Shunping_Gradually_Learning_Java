# 0112_嵌套分支

- 基本语法：

if(){

if(){

//if-else

}else{

//if-else

}

}

- 介绍：
    
    在一个分支结构中又完整的嵌套了另一个完整的分支结构里面的分支的结构称为内层分支外面的分支结构称为外层分支。
    
- 规范：
    
    不要超过3层（可读性不好）。
    

案例演示：**[NestedIf.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter05_%E7%A8%8B%E5%BA%8F%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84/0112_%E5%B5%8C%E5%A5%97%E5%88%86%E6%94%AF/NestedIf.java)**

运行结果1：  
请输入该歌手的成绩：  
5  
你被淘汰了  

运行结果2：  
请输入该歌手的成绩：  
10  
恭喜你进入决赛，请输入性别(male / female)：  
male  
进入男子组  

运行结果3：  
请输入该歌手的成绩：  
10  
恭喜你进入决赛，请输入性别(male / female)：  
female  
进入女子组  
