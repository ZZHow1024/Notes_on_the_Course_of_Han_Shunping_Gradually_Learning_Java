# Chapter09
第九章_项目-房屋出租系统  
Chapter09_Project - Housing Rental System  
@[dnx00  ](https://github.com/dnx00)的笔记  
@DNX

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0361_房屋出租需求

- 项目需求
    - 实现基于文本界面的《房屋出租软件》。
    - 能够实现对房屋信息的添加、修改和删除 (用数组实现)，并能够打印房屋明细表。
- 项目界面
    - 主菜单
    - 新增房源
    - 查找房源
    - 删除房源
    - 修改房源
    - 房屋列表
    - 退出系统

# 0362_房屋出租设计

- 项目设计-程序框架图(分层模式)
    - 系统有哪些类[文件]
    - 明确类与类的调用关系

![房屋出租设计](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F24074e5e-10a7-4de1-af7d-f52912b7ec55%2F%25E6%2588%25BF%25E5%25B1%258B%25E5%2587%25BA%25E7%25A7%259F%25E8%25AE%25BE%25E8%25AE%25A1.jpg?table=block&id=3d395203-aa0f-4dfd-9a9a-104b1fe3af48&t=3d395203-aa0f-4dfd-9a9a-104b1fe3af48)

房屋出租设计

# 0363_房屋出租工具类

- 准备工具类Utility，提高开发效率：
    
    在实际开发中，公司都会提供相应的工具类和开发库，可以提高开发效率，程序员也需要能够看懂别人写的代码，并能够正确的调用。
    
- 解释一个问题：
    
    直接使用类.方法() → 因为当一个方法是static时，就是一个静态方法，静态方法可以直接通过类名调用。
    

# 0364_房屋House类

- 项目功能实现-完成House类
    
    编号  房主  电话  地址  月租  状态（未出租 / 已出租）
    

# 0365_房屋主菜单

- 项目功能实现-显示主菜单和完成退出软件功能
- 功能说明：
    
    用户打开软件，可以看到主菜单，可以退出软件。
    
    ![主菜单](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F242abace-6422-4ce6-b49e-2cb5d388d7fa%2F%25E4%25B8%25BB%25E8%258F%259C%25E5%258D%2595.jpg?table=block&id=b6bb79f2-702e-440d-b99f-d0eaf58e2f2d&t=b6bb79f2-702e-440d-b99f-d0eaf58e2f2d)
    
    主菜单
    
- 思路分析：
    
    在HouseView.java中，编写一个方法mainMenu，显示菜单。
    

# 0366_房屋出租列表

- 项目功能实现-完成显示房屋列表的功能
- 功能说明：
    
    绘制列表，显示编号  房主  电话  地址  月租  状态（未出租 / 已出租）。
    
    ![房屋列表](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F49b0db6e-e237-49d0-9056-188246c68a86%2F%25E6%2588%25BF%25E5%25B1%258B%25E5%2588%2597%25E8%25A1%25A8.jpg?table=block&id=1e1be846-328b-4e9d-bb4f-4ce067452c89&t=1e1be846-328b-4e9d-bb4f-4ce067452c89)
    
    房屋列表
    
- 思路分析：
    
    编写HouseView 和 HouseService
    

# 0367_房屋出租添加

- 项目功能实现-添加房屋信息的功能
- 功能说明：
    
    ![添加房屋](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Ffc6538d2-f839-4986-9497-0413da34bfc1%2F%25E6%25B7%25BB%25E5%258A%25A0%25E6%2588%25BF%25E5%25B1%258B.png?table=block&id=9652129d-9239-40a5-93b8-59ecee759d57&t=9652129d-9239-40a5-93b8-59ecee759d57)
    
    添加房屋
    
- 思路分析：
    
    编写HouseView 和 HouseService
    
    规定：新添加的房屋的id按照自增长来。
    

# 0368_房屋出租删除

- 项目功能实现-完成删除房屋信息的功能
- 功能说明：
    
    ![删除房屋](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F9a32e8f0-4af7-4c3b-ab3c-c46ed1a07f5e%2F%25E5%2588%25A0%25E9%2599%25A4%25E6%2588%25BF%25E5%25B1%258B.jpg?table=block&id=3dfbd3cd-d07a-4b74-87cb-92af44c72348&t=3dfbd3cd-d07a-4b74-87cb-92af44c72348)
    
    删除房屋
    
- 思路分析：
    
    编写HouseView 和 HouseService
    

# 0369_房屋出租退出

- 项目功能实现-完善退出确认功能
- 功能说明：
    
    要求在退出时提示“确认是否退出(Y/N)：”，必须输入Y/N，否则循环提示。
    
    ![退出确认功能](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F20efd68c-9914-4ee0-8fd2-66ebd98fbf59%2F%25E9%2580%2580%25E5%2587%25BA%25E7%25A1%25AE%25E8%25AE%25A4%25E5%258A%259F%25E8%2583%25BD.jpg?table=block&id=eba97670-df99-46fe-ad2e-2f1ecb12c1cd&t=eba97670-df99-46fe-ad2e-2f1ecb12c1cd)
    
    退出确认功能
    
- 思路分析：
    
    编写HouseVIew
    

# 0370_房屋出租查找

- 项目功能实现-完成根据id查找房屋信息的功能
- 功能说明：
    
    ![查找房屋](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fb20feb36-8850-4b52-ab40-062a9f37d9d4%2F%25E6%259F%25A5%25E6%2589%25BE%25E6%2588%25BF%25E5%25B1%258B.jpg?table=block&id=4297cc34-6565-497b-a0a7-72b13bfe00b6&t=4297cc34-6565-497b-a0a7-72b13bfe00b6)
    
    查找房屋
    
- 思路分析：
    
    编写HouseView 和 HouseService
    

# 0371_房屋出租修改

- 项目功能实现-完成修改房屋信息的功能
- 功能说明：
    
    ![修改房屋](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fda1e5e11-9624-4e90-9766-7f5cc49492fa%2F%25E4%25BF%25AE%25E6%2594%25B9%25E6%2588%25BF%25E5%25B1%258B.jpg?table=block&id=b8b3801e-f63d-484f-a896-c769280f565b&t=b8b3801e-f63d-484f-a896-c769280f565b)
    
    修改房屋
    
- 思路分析：
    
    编写HouseView
