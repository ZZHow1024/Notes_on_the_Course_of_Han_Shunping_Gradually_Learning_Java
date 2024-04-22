# Chapter14
第十四章_集合  
Chapter14_Aggregation  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0498_集合介绍

- 数组的不足之处：
    1. 长度开始时必须指定，而且一旦指定，不能更改。
    2. 保存的必须为同一类型的元素。
    3. 使用数组进行增加 / 删除元素的示意代码－麻烦。
- 集合的好处：
    1. 可以动态保存任意多个对象，使用比较方便。
    2. 提供了一系列方便的操作对象的方法：add、remove、set、get等。
    3. 使用集合添加，删除新元素的示意代码 - 简洁。

# 0499_集合体系图

![Collection接口实现子类](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/5a272425-dac3-4a75-b34c-24f183d948dd/Collection%E6%8E%A5%E5%8F%A3%E5%AE%9E%E7%8E%B0%E5%AD%90%E7%B1%BB.png)

Collection接口实现子类

![Map接口实现子类](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/65f4a6d0-7aa1-4ea1-bbd6-75bd41ee4fb2/Map%E6%8E%A5%E5%8F%A3%E5%AE%9E%E7%8E%B0%E5%AD%90%E7%B1%BB.png)

Map接口实现子类

- 集合主要分为两组：单列集合 和 双列集合。
- Collention 接口又两个重要的子接口 List 和 Set，他们的实现子类都是单列集合。
- Map 接口的实现子类是双列集合，存放的 key - value。

# 0500_Collection方法

- Collection 接口**实现类**的特点：
    - `public interface Collection<E> extends Iterable<E>`
    1. Collection 实现子类可以存放多个元素，每个元素可以是Object。
    2. 有些 Collection 的实现类，可以存放重复的元素，有些不可以。
    3. 有些 Collection 的实现类，有些是有序的(List)，有些不是有序(Set)。
    4. Collection 接口没有直接的实现子类，是通过它的子接口 Set 和 List 来实现的。
- Collection 接口的**常用方法**：
    1. add：添加单个元素。
    2. remove：删除指定元素。
    3. contains：查找元素是否存在。
    4. size：获取元素个数。
    5. isEmpty：判断是否为空。
    6. clear：清空。
    7. addAll：添加多个元素。
    8. containsAll：查找多个元素是否都存在。
    9. removeAll：删除多个元素。
- 案例：以 ArrayList 实现类来演示

案例演示：[**com.zzhow.collection_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_) 中的 **[CollectionMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_/CollectionMethod.java)**

# 0501_迭代器遍历

- Collection 接口遍历元素方式1 - 使用 lterator(选代器)：
    - 基本介绍
        
        ![Iterator](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/831cbf05-e56a-4409-a11e-821bc19f4223/Iterator.png)
        
        Iterator
        
    1. Iterator 对象称为迭代器，主要用于遍历 Collection 集合中的元素。
    2. 所有实现了 Collection 接口的集合类都有一个 iterator() 方法，用以返回一个实现了 lterator 接口的对象，即可以返回一个迭代器。
    3. Iterator 仅用于遍历集合，Iterator 本身并不存放对象。
- 迭代器的执行原理：
    
    ```java
    //1. 得到 list 对应的迭代器
    Iterator iterator = list.iterator();
    
    //2. 使用 while 循环遍历
    while (iterator.hasNext()) {//判断是否还有数据
        //返回下一个元素，类型为 Object
        Object next = iterator.next();
        System.out.println("next = " + next);
    }
    ```
    
- 迭代器模板快捷键 ---> itit
- 显示所有快捷键 ---> Ctrl + J

案例演示：**[com.zzhow.collection_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_)** 中的 **[CollectionIterator.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_/CollectionIterator.java)**

# 0502_集合增强for

- Collection 接口遍历对象方式2 - 增强 for 循环：
    - 基本介绍
        
        增强 for 循环，可以代替 iterator 迭代器，特点：增强 for 就是简化版的 iterator，本质一样。只能用于遍历集合或数组。
        
    - 基本语法
        
        ```java
        for(元素类型 元素名 : 集合名或数组名) {
        	访问元素
        }
        ```
        

案例演示：**[com.zzhow.collection_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_)** 中的 **[CollectionFor.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_/CollectionFor.java)**

# 0503_测试题

- 案例：
    1. 创建3个Dog{name，age}对象，放入到 ArrayList 中，赋给 List 引用。
    2. 用选代器和增强 for 循环两种方式来遍历。
    3. 重写 Dog 的toString方法，输出 name 和 age。

案例演示：**[com.zzhow.collection_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_)** 中的 **[CollectionExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collection_/CollectionExercise.java)**

# 0504_List接口方法

- List 接口基本介绍：
    
    List接口是 Collection 接口的子接口
    
    1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复。
    2. List 集合中的每个元素都有其对应的顺序索引，即支持索引。
        
        索引从 0 开始
        
    3. List 容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素。
    4. JDK API 中 List 接口的实现类有：
        
        ![List 接口](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/ea861ccf-5504-4ba0-8446-2f405488ada5/List%E6%8E%A5%E5%8F%A3.png)
        
        List 接口
        
        常用的有: ArrayList、LinkedList 和 Vector。
        

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[List_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/List_.java)**

- List 接口的常用方法
    
    List 集合里添加了一些根据索引来操作集合元素的方法
    
    1. `void add(int index, Object ele)`：在 index 位置插入 ele 元素。(索引不能是还没有的位置)
    2. `boolean addAll(int index, Collection eles)`：从 index 位置开始将 eles 中的所有元素添加进来。(索引不能是还没有的位置)
    3. `Object get(int index)`：获取指定 index 位置的元素。(索引不能是还没有的位置)
    4. `int indexOf(Object obj)`：返回 obj 在集合中首次出现的位置。
    5. `int lastlndexOf(Object obj)`：返回 obj 在当前集合中末次出现的位置。
    6. `Object remove(int index)`：移除指定 index 位置的元素，并返回此元素。(索引不能是还没有的位置)
    7. `Object set(int index，Object ele)`：设置指定 index 位置的元素为 ele 相当于是替换。(索引不能是还没有的位置)
    8. `List subList(int fromlndex, int tolndex)`：返回从 fromlndex 到 tolndex 位置的子集合。(返回的范围是前闭后开的区间)

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[ListMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/ListMethod.java)**

# 0505_List接口练习

- 案例：添加 10 个以上的元素(比如 String "hello")，在 2 号位插入一个元素 "DNX"，获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，最后使用送代器遍历集合，要求：使用 List 的实现类 ArrayList 完成。

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[ListExercise01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/ListExercise01.java)**

# 0506_List三种遍历方式

1. 使用迭代器(iterator)
2. 使用增强 for
3. 使用普通 for
- 说明：使用 LinkedList 的遍历方式和 ArrayList 一样

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[ListFor.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/ListFor.java)**

# 0507_List排序练习

- 案例：使用List的实现类添加三本图书，并遍历。
- 要求：
    1. 按价格排序，从低到高(使用冒泡法)
    2. 要求使用 ArrayList、LinkedList 和 Vector 三种集合实现

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[ListExercise02.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/ListExercise02.java)**

# 0508_ArrayList注意事项

1. permits all elements, includingnull, ArrayList 可以加入 null，并且多个
2. ArrayList 是由数组来实现数据存储的
3. ArrayList 基本等同于 Vector，除了 ArrayList 是线程不安全(执行效率高)，在**多线程**情况下**不建议**使用ArrayList

# 0509_ArrayList扩容机制

1. ArrayList 中维护了一个 Object 类型的数组 elementData。
    
    **`transient** Object[] elementData;` //transient 表示瞬间，短暂的，表示该属性不会被序列化
    
2. 当创建 ArrayList 对象时，如果使用的是无参构造器，则初始 elementData 容量为 0，第 1 次添加，则扩容 elementData 为 10，如需要再次扩容，则扩容 elementData 为 1.5 倍。
3. 如果使用的是指定大小的构造器，则初始 elementData 容量为指定大小，如果需要扩容，则直接扩容 elementData 为 1.5 倍。

# 0512_Vector注意事项

1. Vector 类的定义说明 public class Vector<E>
    
    ![Vector](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/502c92a0-3800-4bdd-8335-266acec1e776/Vector.png)
    
    Vector
    
2. Vector 底层也是一个对象数组，protected Object[] elementData;
3. Vector 是线程同步的，即线程安全，Vector 类的操作方法带有 synchronized
    
    `public synchronized E get(int index) {`
    
    `if (index >= elementCount)`
    
    `throw new ArraylndexOutofBoundsException(index);`
    
    `return elementData(index);`
    
    `}`
    
4. 在开发中，需要线程同步安全时，考虑使用 Vector

# 0513_Vector源码解读

- Vector 和 ArrayList 的比较
    
    
    |  | 底层结构 | 版本 | 线程安全(同步)效率 | 扩容倍数 |
    | --- | --- | --- | --- | --- |
    | ArrayList | 可变数组(Object[]) | JDK 1.2 | 不安全，效率高 | 如果无参构造
    1. 第一次 10
    2. 满后1.5 倍扩容
    如果有参构造(指定大小)，则每次满后直接按 1.5 倍扩容 |
    | Vector | 可变数组(Object[]) | JDK 1.0 | 安全，效率低 | 如果无参构造默认 10，满后按 2 倍扩容
    如果有参构造(指定大小)，则每次满后直接按2倍扩容 |

# 0514_双向链表模拟

- LinkedList 的底层操作机制
    1. LinkedList 底层维护了一个双向链表
    2. LinkedList 中维护了两个属性 first 和 last 分别指向首节点和尾节点
    3. 每个节点(Node 对象），里面又维护了 prev、next、item 三个属性，其中通过 prev 指向前一个，通过 next 指向后一个节点。最终实现双向链表
    4. LinkedList 的元素的添加和删除，不是通过数组完成的，效率相对较高
    5. 模拟一个简单的双向链

```java
class Node {
    public Object item; //数据域
    public Node next; //指针域_指向下一个结点
    public Node pre; //指针域_指向下一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
```

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[LinkedList_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_/LinkedList_.java)**

# 0516_List集合选择

- ArrayList 和 LinkedList 的比较
- CRUD(增查改删)(**Create, Read, Update and Delete**)
    
    
    |  | 底层结构 | 增删的效率 | 改查的效率 |
    | --- | --- | --- | --- |
    | ArrayList | 可变数组 | 较低，数组扩容 | 较高 |
    | LinkedList | 双向链表 | 较高，链表追加 | 较低 |
- 如何选择 ArrayList 和 LinkedList：
    1. 如果我们改查的操作多，选择 ArrayList
    2. 如果我们增删的操作多，选择 LinkedList
    3. 一般来说，在程序中，80% - 90% 都是查询，因此大部分情况下会选择 ArrayList
    4. 在一个项目中，根据业务灵活选择，也可能这样，一个模块使用的是 ArrayList，另外一个模块是 LinkedList

# 0517_Set接口方法

- Set 接口基本介绍
    1. 无序(添加和取出的顺序不一致)，没有索引
    2. 不允许重复元素，最多包含一个 null
    3. JDK API 中 Set 接口的实现类有：
- Set 的遍历
    1. 使用迭代器遍历
    2. 使用增强 for 循环遍历
    3. **不能使用**普通 for 循环遍历，没有提供 get 方法

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[SetMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/SetMethod.java)**

# 0518_HashSet全面说明

- HashSet 的全面说明
    1. HashSet 实现了 Set 接口
    2. HashSet实际上是HashMap，看下源码
    3. 可以存放 null 值，但是只能有一个 null
    4. HashSet 不保证元素是有序的，取决于 hash 后，再确定索引的结果
    5. 不能有重复元素 / 对象，在前面 Set 接口使用已经讲过
    6. 执行 add 方法后会返回一个 boolean 值，添加成功返回 true，否则返回 false。
    7. 可以通过 remove 指定删除哪个对象
    8. 可以成功 add 两个属性一样的类的对象(都是 new 的)，但不能成功 add 两个字符串相同的字符串类的对象(都是 new 的)。

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[HashSet_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/HashSet_.java)**

# 0519_数组链表模拟

- HashSet 底层机制说明
    - 分析 HashSet 底层是 HashMap，HashMap 底层是(数组 + 链表 + 红黑树)
    - 案例：模拟简单的数组 + 链表结构

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[HashSetStructure.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/HashSetStructure.java)**

# 0520_HashSet扩容机制

- HashSet 底层机制说明
    - 分析 HashSet 的添加元素底层是如何实现(hash() + equals())
    1. HashSet 底层是 HashMap
    2. 添加一个元素时，先得到 hash 值，再传换成索引值
    3. 找到存储数据表 table，看这个索引位置是否已经存放的有元素
    4. 如果没有，直接加入
    5. 如果有，调用 equals 比较，如果相同，就放弃添加；如果不相同，则添加到最后
    6. 在 JDK 8 中，如果一条链表的元素个数达到(≥) TREEIFY_THRESHOLD(默认是8)，并且 table 的大小 ≥ MIN_TREEIFY_CAPACITY(默认 64)，就会进行树化(红黑树)

# 0525_HashSet最佳实践

- HashSet 课堂练习
    - 定义一个 Employee 类，该类包含：private 成员属性name, age。
    1. 创建 3 个 Employee 放入 HashSet 中
    2. 当 name 和 age 的值相同时，认为是相同员工，不能添加到 HashSet 集合中

案例演示：**[com.zzhow.list_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/list_)** 中的 **[HashSetExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/HashSetExercise.java)**

# 0527_LinkedHashSet介绍

- LinkedHashSet 的全面说明
    1. LinkedHashSet 是 HashSet 的子类
    2. LinkedHashSet 底层是一个 LinkedHashMap，底层维护了一个数组 + 双向链表
    3. LinkedHashSet 根据元素的 hashCode 值来决定元素的存储位置，同时使用链表维护元素的次序（图），这使得元素看起来是以插入顺序保存的。
    4. LinkedHashSet 不允许添重复元素
- 说明
    1. 在 LinkedHastSet 中维护了一个 hash 表和双向链表（LinkedHashSet 有 head 和 tail）
    2. 每一个节点有 pre 和 next 属性，这样可以形成双向链表
    3. 添加一个元素时，先求 hash 值，在求索引，确定该元素在 hashtable 的位置，然后将添加的元素加入到双向链表（如果已经存在，不添加[原则和 hashset 一样])
    4. 遍历 LinkedHashSet 也能确保插入顺序和遍历顺序一致

# 0529_LinkedHashSet课堂练习

- LinkedHashSet 课堂练习
    - Car 类(属性：name, price)， 如果 name 和 price 一样，则认为是相同元素，就不能添加。

案例演示：[**com.zzhow.set_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_) 中的 **[LinkedHashSetExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/LinkedHashSetExercise.java)**

# 0530-0531_Map接口特点

- Map接口实现类的特点（JDK 8）：
    1. Map 与 Collection 并列存在。用于保存具有映射关系的数据：Key-Value
    2. Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
    3. Map 中的 key 不允许重复，原因和 HashSet 一样。
    4. Map 中的 value 可以重复
    5. Map 的 key 可以为 null, value 也可以为 null，注意 key 为 null, 只能有一个，value 为 null，可以多个
    6. 常用 String 类作为 Map 的 key
    7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
    8. Map 存放数据的 key-value 示意图,一对 k-v 是放在一个 Node 中的，又因为 Node  实现了 Entry 接口，有些书上也说一对 k-v 就是一个 Entry
        - 补充说明：
        1. k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)
        2. k-v 为了方便程序员的遍历，还会 创建 EntrySet 集合，该集合存放的元素的类型 Entry，而一个 Entry 对象就有 k,v `EntrySet<Entry<K, V>>` 即：`transient Set<Map.Entry<K, V>> entrySet;`
        3. EntrySet 中，定义的类型是 Map.Entry，但是实际上存放的还是 HashMap$Node这时因为 `static class Node<K, V> implements Map.Entry<K, V>`
        4. 把 HashMap$Node 对象 存放到entrySet 就方便我们的遍历，因为 Map.Entry 提供了重要方法 K  `getKey();` V `getValue();`
    
    ![HashMap$Node](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/8592f58d-a183-451e-822c-56a193def9b7/HashMap.png)
    
    HashMap$Node
    
    ![KeySet-Values](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/541851b8-7fc4-4c24-bd85-dbbe82231dce/KeySet-Values.png)
    
    KeySet-Values
    

# 0532_Map接口方法

- Map接口常用方法：
    1. put：添加
    2. remove：根据键删除映射关系
    3. get：根据键获取值
    4. size：获取元素个数
    5. isEmpty：判断个数是否为 0
    6. clear：清除
    7. containsKey：查找键是否存在

案例演示：**[com.zzhow.map_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_)** 中的 **[MapMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_/MapMethod.java)**

# 0533_Map六大遍历方式

1. containsKey：查找键是否存在
2. keySet：获取所有的键
3. entrySet：获取所有关系 k-v
4. values：获取所有的值

案例演示：**[com.zzhow.map_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_)** 中的 [**MapFor.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_/MapFor.java)

# 0534_Map课堂练习

- 案例：使用HashMap添加3个员工对象
    - 要求：
        - 键：员工 id
        - 值：员工对象
        - 遍历显示工资 >18000 的员工（遍历方式最少两种）员工类：姓名、工资、员工 id

案例演示：**[com.zzhow.map_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_)** 中的 [**MapExercise.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_/MapExercise.java)

# 0535_HashMap阶段小结

- HashMap小结：
    1. Map 接口的常用实现类：HashMap、Hashtable 和 Properties
    2. HashMap 是 Map 接口使用频率最高的实现类
    3. HashMap 是 以 k-v 对的方式来存储数据(HashMap$Node类型)
    4. key 不能重复，但是是值可以重复，允许使用 null 键和 null 值
    5. 如果添加相同的 key，则会覆盖原来的 k-v，等同于修改(key 不会替换，value 会被替换)
    6. 与 HashSet 一样，不保证映射的顺序，因为底层是以哈希表的方式来存储的(JDK 8 的 HashMap 底层是 数组 + 链表 + 红黑树)
    7. HashMap 没有实现同步，因此是线程不安全的(方法没有做同步互斥操作，没有 synchronized)

# 0536_HashMap底层机制

![HashMap底层机制](https://prod-files-secure.s3.us-west-2.amazonaws.com/4b165318-6383-451c-8845-110b786c9f0a/d5c577e0-af49-45ff-913c-c1a6fad679f0/HashMap%E5%BA%95%E5%B1%82%E6%9C%BA%E5%88%B6.png)

HashMap底层机制

1. (k, v) 是一个 Node 实现了 Map.Entry<K, V>
2. JDK 7的 HashMap 底层实现[数组+链表]，JDK 8 底层[数组 + 链表 + 红黑树]
- 扩容机制**[和HashSet相同]**
    1. HashMap 底层维护了 Node 类型的数组 table，默认为 null
    2. 当创建对象时，将加载因子(loadfactor)初始化为 0.75
    3. 当添加 k-v 时，通过 key 的哈希值得到在 table 的索引。然后判断该索引处是否有元素，如果没有元素直接添加。如果该索引处有元素，继续判断该元素的 key 和准备加入的 key 是否等，如果相等，则直接替换 value；如果不相等需要判断是树结构还是链表结构，做出相应处理。如果添加时发现容量不够，则需要扩容。
    4. 第 1 次添加，则需要扩容 table 容量为 16， 临界值(threshold)为12(16*0.75)
    5. 以后再扩容，则需要扩容 table 容量为原来的 2 倍(32)，临界值为原来的 2 倍，即 24，以此类推
    6. 在 Java 8 中，如果一条链表的元素个数 > TREEIFY_THRESHOLD(默认是 8 )，并且 table 的大小 ≥ MIN_TREEIFY_CAPACITY(默认是 64)，就会进行树化(红黑树)

# 0539_Hashtable使用

- Hashtable的基本介绍：
    1. 存放的元素是键值对：即 K-V
    2. Hashtable 的键和值都不能为 null，否则会抛出 NullPointerException
    3. Hashtable 使用方法基本上和 HashMap 一样
    4. Hashtable 是线程安全的(synchronized)，HashMap是线程不安全的

# 0540_Hashtable扩容

- Hashtable的底层：
    1. 底层是 Hashtable$Entry[] 数组初始化大小为 11
    2. 执行 方法 `addEntry(hash, key, value, index);` 添加 K-V 封装到 Entry
    3. 临界值 threshold = 8 = 11 * 0.75
    4. 当 if(count >= threshold) 满足时，就进行扩容
    5. 扩容：按照 `int newCapacity = (oldCapacity << 1) + 1;` 的大小扩容
- HashMap 与 Hashtable 对比
    
    
    |  | 版本 | 线程安全(同步) | 效率 | 允许null键null值 |
    | --- | --- | --- | --- | --- |
    | HashMap | 1.2 | 不安全 | 较高 | 允许 |
    | Hashtable | 1.0 | 安全 | 较低 | 不允许 |

# 0541_Properties

- 基本介绍：
    1. Properties 类继承自 Hashtable 类并且实现了 Map 接口，也是使用一种键值对的形式来保存数据
    2. Properties 的使用特点和 Hashtable 类似
    3. Poperties 还可以用于从 xxx.properties 文件中加载数据到 Properties 类对象，并进行读取和修改
    4. 工作后 xxx.properties 文件通常作为配置文件
- 常用方法：
    1. 增：put 方法
    2. 删：remove 方法
    3. 改：put 方法
    4. 查：
        1. get 方法(传入 Object 类型数据，返回 Object 类型数据)
        2. getProperty 方法(传入 String 类型数据，返回 String 类型数据)

案例演示：**[com.zzhow.map_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_)** 中的 [**Properties_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_/Properties_.java)

# 0542_集合选型规则

- 总结-开发中如何选择集合实现类（记住）

在开发中，选择什么集合实现类，主要取决于业务操作特点，然后根据集合实现类特性进行选择：

1. 先判断存储的类型(**一组对象 [单列]** 或 **一组键值对 [双列]**)
2. 一组对象[单列]：**Collection 接口的某一个实现子类**
    1. 允许重复：**List 接口的某一个实现子类**
        1. 增删多：**LinkedList [底层维护了一个双向链表]**
        2. 改查多：**ArrayList [底层维护 Object 类型的可变数组]**
    2. 不允许重复：Set 接口的某一个实现子类
        1. 无序：**HashSet [底层是 HashMap，维护了一个哈希表即(数组 + 链表 + 红黑树)]**
        2. 排序：**TreeSet [底层是 TreeMap[红黑树]]**
        3. 插入和取出顺序一致：**LinkedHashSet [维护数组+双向链表]**
3. 一组键值对[双列]：**Map 接口的某一个实现子类**
    1. 键无序：**HashMap [底层是：哈希表 jdk7：数组+链表，jdk8:数组+链表+红黑树]**
    2. 键排序：**TreeMap [底层是红黑树]**
    3. 键插入和取出顺序一致：**LinkedHashMap [数组 + 单向链表 + 双向链表]**
    4. 读取文件：Properties **[Hashtable 的子类]**

# 0543_TreeSet源码解读

TreeSet 实现了 Set 接口，底层是 TreeMap

- 案例：按字符串字典序(正序)排序 和 按字符串长度(从短到长)排序
    
    ```java
    //treeSet1 按字符串字典序(正序)排序
    System.out.println("treeSet1 按字符串字典序(正序)排序");
    TreeSet treeSet1 = new TreeSet(new Comparator<Object>() {
        public int compare(Object o1, Object o2) {
            return ((String) o1).compareTo((String) o2);
        }
    });
    
    //treeSet2 按字符串长度(从短到长)排序
    TreeSet treeSet2 = new TreeSet(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String) o1).length() - ((String) o2).length();
        }
    });
    ```
    

案例演示：**[com.zzhow.set_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_)** 中的 **[TreeSet_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/set_/TreeSet_.java)**

# 0544_TreeMap源码解读

TreeMap 实现了 Map 接口

- 案例：按字符串字典序(倒序)排序 和 按字符串长度(从长到短)排序
    
    ```java
    //treeMap1 按字符串字典序(倒序)排序
    TreeMap treeMap1 = new TreeMap(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String) o2).compareTo((String) o1);
        }
    });
    
    //treeMap2 按字符串长度(从长到短)排序
    TreeMap treeMap2 = new TreeMap(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String) o2).length() - ((String) o1).length();
        }
    });
    ```
    

案例演示：**[com.zzhow.map_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_)** 中的 **[TreeMap_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/map_/TreeMap_.java)**

# 0545-0546_Collections工具类

- Collections工具类介绍：
    1. Collections 是一个操作 Set、List 和 Map 等集合的工具类
    2. Collections 中提供了一系列静态的方法对集合元素进行排序、查询和修改等操作
    3. 所有方法全是静态方法
- 排序操作：
    1. `void reverse(List)`：反转 List 中元素的顺序
    2. `void shuffle(List)`：对 List 集合元素进行随机排序
    3. `void sort(List)`：根据元素的自然顺序对指定 List 集合元素按升序排序
    4. `void sort(List, Comparator)`：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
    5. `void swap(List, int, int)`：将指定 list 集合中的 i 处元素和 j 处元素进行交换
- 查找、替换操作
    1. `Object max(Collection)`：根据元素的自然顺序，返回给定集合中的最大元素
    2. `Object max(Collection, Comparator)`：根据 Comparator 指定的顺序返回给定集合中的最大元素
    3. `Object min(Collection)`：根据元素的自然顺序，返回给定集合中的最小元素
    4. `Object min(Collection, Comparator)`：根据 Comparator 指定的顺序返回给定集合中的最小元素
    5. `int frequency(Collection, Object)`：返回指定集合中指定元素的出现次数
    6. `void copy(List dest, List src)`：将 src 中的内容复制到 dest 中
        1. 注意：dest 的 size 要 ≥ src 的 size 才能用本方法，否则抛出`IndexOutOfBoundsException`
    7. `boolean replaceAll(List list, Object oldVal, Object newVal)`：使用新值替换 List 对象的所有旧值

案例演示：**[com.zzhow.collections_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collections_)** 中的 **[Collections_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter14_%E9%9B%86%E5%90%88/src/com/zzhow/collections_/Collections_.java)**
