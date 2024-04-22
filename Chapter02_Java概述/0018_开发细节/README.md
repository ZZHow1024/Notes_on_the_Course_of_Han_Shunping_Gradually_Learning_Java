# 0018\_开发细节

1. Java 源文件以 .java 为扩展名。源文件的基本组成部分是类 (class) ，如本类中的 Hello 类。
2. Java 应用程序的执行入口是 main0 方法。它有固定的书写格式:public static void main(String[] args) {…}
3. Java 语言严格区分大小写。
4. Java 方法由一条条语句构成，每个语句以“;”结束。
5. 大括号都是成对出现的，缺一不可。[习惯，先写{ }再写代码]
6. 一个源文件中最多只能有一个 public 类。其它类的个数不限。
7. 如果源文件包含一个 public 类，则文件名必须按该类名命名!
8. 一个源文件中最多只能有一个 public 类。其它类的个数不限，也可以将 main 方法写在非 public 类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法

案例演示：**[Hello.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter02_Java%E6%A6%82%E8%BF%B0/0018_%E5%BC%80%E5%8F%91%E7%BB%86%E8%8A%82/Hello.java)**
