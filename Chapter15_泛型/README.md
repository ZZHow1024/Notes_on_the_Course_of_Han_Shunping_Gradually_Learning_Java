# Chapter15
第十五章_泛型  
Chapter15_Generics  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0553_泛型引入

- 案例：
    1. 编写程序，在 ArrayList 中，添加 3 个 Dog 对象
    2. Dog 对象含有 name 和 age，并输出 name 和 age（要求使用 getXxx()）
- 使用传统方法的问题
    1. 不能对加入到集合 ArrayList 中的数据类型进行约束（不安全）
    2. 遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响

# 0554_泛型引入

- 泛型的好处
    1. 编译时，检查添加元素的类型，提高了安全性
    2. 减少了类型转换的次数，提高效率
        1. 不适用泛型
            1. Dog -加入-> Object -取出-> Dog //放入到 ArrayList 会先转成 Object，在取出时，还需要转换成 Dog
        2. 使用泛型
            1. Dog -加入-> Dog -取出-> Dog //放入和取出时，不需要类型转换，效率较高
    3. 不再提示编译警告

案例演示：[**com.zzhow.generic**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic) 中的 **[Generic.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/Generic.java)**

# 0555_泛型说明

泛（广泛）型（类型）=> Integer, String, Dog

1. 泛型又称参数化类型，是 JDK 5 出现的新特性，解决数据类型的安全性问题
2. 在类声明或实例化时只要指定好需要的具体的类型即可
3. Java 泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常；同时代码更加简洁、健壮
4. 泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，或者是某个方法的返回值的类型，或者是参数类型。

# 0556_泛型应用实例

- 泛型的声明
    
    interface 接口<T> 和 Class 类<K,V>
    
    说明：
    
    1. 其中 T, K, V 不代表值，而是表示类型
    2. 任意字母都可以，常用 T 表示，是 Type 的缩写
- 泛型的实例化：
    - 要在类名后面指定类型参数的值（类型）。如：
        1. `List<String> strList = new ArrayList<String>();`
        2. `Iterator<Customer> iterator = customers.iterator();`
- 练习：
    1. 创建 3 个学生对象
    2. 放入到 HashSet 中学生对象使用
    3. 放入到 HashMap 中，要求 Key 是 String name, Value 就是学生对象
    4. 使用两种方式遍历

案例演示：**[com.zzhow.generic](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic)** 中的 **[GenericExercise1.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/GenericExercise1.java)**

# 0557-0558_泛型使用细节

- 泛型使用的注意事项和细节：
    1. interface List<T>{}, public class HashSet<E> 等等
        1. 说明：T, E 只能是引用类型
        2. 判断正误：
            1. `List<Integer> list1 = new ArrayList<Integer>();` //**√**
            2. `List<int> list2 = new ArrayList<int>();` //×
    2. 在给泛型指定具体类型后，可以传入该类型或其子类类型
    3. 泛型使用形式
        1. `List<lnteger> list1 = new ArrayList<>();` //**推荐**
        2. `List<Integer> list2 = new ArrayList<Integer>();` //不推荐
    4. 如果我们这样写 `List list3 = new ArrayList();` 默认给它的泛型是[<E> E 就是 Object]

# 0559_泛型课堂练习

- 案例：
    - 定义 Employee 类
    1. 该类包含：private 成员变量 name, sal, birthday，其中 birthday 为 MyDate 类的对象
    2. 为每一个属性定义 getter, setter 方法
    3. 重写 toString 方法输出 name, sal, birthday
    4. MyDate 类包含：private 成员变量 month, day, year；并为每一个属性定义 getter, setter 方法
    5. 创建该类的3个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），对集合中的元素进行排序，并遍历输出
- 排序方式：调用 ArrayList 的 sort 方法，传入 Comparator 对象[使用泛型]，先按照 name 排序，如果 name 相同，则按生日日期的先后排序[定制排序]。

案例演示：**[com.zzhow.generic](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic)** 中的 **[GenericExercise2.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/GenericExercise2.java)**

# 0560_自定义泛型类

- 基本语法：
    
    `class 类名<T, R...> {` 
    
    `成员`
    
    `}`
    
- 细节：
    1. 普通成员可以使用泛型（属性、方法）
    2. 使用泛型的数组，不能初始化
    3. 静态方法中不能使用类的泛型
    4. 泛型类的类型，是在创建对象时确定的（因为创建对象时，需要指定确定类型）
    5. 如果在创建对象时，没有指定类型，默认为 Object

# 0561_自定义泛型接口

- 基本语法：
    
    `interface 类名<T, R...> {` 
    
    `成员`
    
    `}`
    
- 细节：
    1. 接口中，静态成员也不能使用泛型（这个和泛型类规定一样）
    2. 泛型接口的类型，在继承接口或者实现接口时确定
    3. 没有指定类型，默认为 Object

# 0562_自定义泛型方法

- 基本语法：
    
    `修饰符 <T, R...> 返回类型 方法名()参数列表 {` 
    
    `方法体` 
    
    `}` 
    
- 细节：
    1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
    2. 当泛型方法被调用时，类型会确定
    3. `**public void eat(E e) {}`，修饰符后没有 <T, R…> eat 方法不是泛型方法，而是使用了泛型**

# 0563_泛型方法练习

```java
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //T -> String，R -> Integer，M -> Double
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10); //10 会自动装箱 Integer 10，输出 Integer
        apple.fly(new Bird()); //Bird
    }
}

class Apple<T, R, M> {//自定义泛型类

    public <E> void fly(E e) {//泛型方法
        System.out.println(e.getClass().getSimpleName());
    }

//  public void eat(U u) {} //错误，因为U没有声明

    public void run(M m) {} //ok
}

class Bird {}
```

案例演示：**[com.zzhow.generic](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic)** 中的 **[CustomMethodGenericExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/CustomMethodGenericExercise.java)**

# 0564_泛型继承和通配

1. 泛型不具备继承性
2. <?>：支持任意泛型类型
3. <? extends A>：支持A类以及A类的子类，规定了泛型的上限
4. <? super A>：支持A类以及A类的父类，不限于直接父类，规定了泛型的下限

案例演示：**[com.zzhow.generic](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic)** 中的 **[GenericExtends.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/GenericExtends.java)**

# 0565_JUnit使用

- 介绍
    - **JUnit** 是一个 Java 语言的单元测试框架。它由肯特·贝克和埃里希·伽玛（Erich Gamma）建立，逐渐成为源于 Kent Beck 的 sUnit 的 xUnit 家族中为最成功的一个。 JUnit 有它自己的 JUnit 扩展生态圈。
- 使用
    - 再待测试的方法前加上 @Test
    - 加入 JUnit5 到类路径

案例演示：[**com.zzhow.junit_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/junit_)** 中的 **[JUnit_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/junit_/JUnit_.java)**

# 0566_泛型家庭作业

- 案例：
    - 定义个泛型类 DAO<T>，在其中定义一个 Map 成员变量，Map 的键为 String 类型，值为 T 类型。
    - 创建一下方法：
        1. public void save(String id, T entity)：保存 T 类型的对象到 Map 成员变量中
        2. public T get(String id)：从 map 中获取 id 对应的对象
        3. public void update(String id, T entity)：替换 map 中 key为 id 的内容,改为 entity 对象
        4. public List<T> list()：返回 map 中存放的所有 T 对象
        5. public void delete(String id)：删除指定 id 对象
    - 定义一个 User 类：
        - 包含：private 成员变量（int 类型）id, age（String 类型）name。
    - 创建 DAO 类的对象，分别调用其 save、get、update、list、delete 方法来操作 User 对象，使用 Junit 单元测试类进行测试。

案例演示：**[com.zzhow.generic](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic)** 中的 [**GenericHomework.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter15_%E6%B3%9B%E5%9E%8B/src/com/zzhow/generic/GenericHomework.java)
