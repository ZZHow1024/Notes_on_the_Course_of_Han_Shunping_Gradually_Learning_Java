# Chapter13
第十三章_常用类  
Chapter13_CommonClasses  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow

参考课程:

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0459_八大Wrapper类

- 包装类：
    1. 针对八种基本数据类型相应的引用类型—包装类。
    2. 有了类的特点，就可以调用类中的方法。
    
    ![包装类](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F406aadff-4ea3-4870-beb9-50e34aa07ccd%2F%25E5%258C%2585%25E8%25A3%2585%25E7%25B1%25BB.png?table=block&id=12b79b2d-cbf4-4042-9bd9-acc84a7e0b6c&t=12b79b2d-cbf4-4042-9bd9-acc84a7e0b6c&width=1161&cache=v2)
    
    包装类
    
- 父类：Number

# 0460_装箱和拆箱

- 包装类和基本数据的转换。
- 演示 包装类 和 基本数据类型的相互转换，这里以int 和 Integer演示：
    1. JDK5 前的手动装箱和拆箱方式。
        
        装箱：基本类型 → 包装类型，拆箱：包装类型 → 基本类型。
        
    2. JDK5 以后(含JDK5)的自动装箱和拆箱方式。
    3. 自动装箱底层调用的是value0f方法，比如Integer.valueOf()。
    
    ```java
    //演示int <-> Integer 的装箱和拆箱
            //JDK5之前是手动装箱和拆箱
            int n1 = 100;
            //手动装箱 int -> Integer
            Integer integer1 = new Integer(n1);
            Integer integer2 = Integer.valueOf(n1);
    
            //手动拆箱 Integer -> int
            int i1 = integer1.intValue();
    
            //JDK5之后(含JDK5)，可以自动装箱和自动拆箱
            int n2 = 200;
            //自动装箱 int -> Integer
            Integer integer3 = n2; //底层使用的是Integer.valueOf(n2);
    
            //自动拆箱 Integer -> int
            int i2 = integer3; //底层使用的是integer3.intValue();
    ```
    

案例演示：[**com.zzhow.wrapper**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper) 中的 **[Integer.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper/Integer_.java)**

# 0462_包装类方法

- 案例：Integer 与 String 相互转换
    
    ```java
    //包装类(Integer) -> String
            Integer i1 = 100; //自动装箱
            //方式1
            String str1 = i1 + "";
            //方式2
            String str2 = i1.toString();
            //方式3
            String str3 = String.valueOf(i1);
    
            //String -> 包装类(Integer)
            String str4 = "123";
            //方式1
            Integer i2 = Integer.parseInt(str4); //使用到自动装箱
            //方式2
            Integer i3 = new Integer(str4); //构造器
    ```
    

案例演示：[**com.zzhow.wrapper**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper) 中的 [**WrapperVSString.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper/WrapperVSString.java)

- 案例：Integer类和Character类的常用方法
    
    ```java
    System.out.println(Integer.MIN_VALUE); //返回最小值
    System.out.println(Integer.MAX_VALUE);//返回最大值
    
    System.out.println(Character.isDigit('a'));//判断是不是数字
    System.out.println(Character.isLetter('a'));//判断是不是字母
    System.out.println(Character.isUpperCase('a'));//判断是不是大写
    System.out.println(Character.isLowerCase('a'));//判断是不是小写
    
    System.out.println(Character.isWhitespace('a'));//判断是不是空格
    System.out.println(Character.toUpperCase('a'));//转成大写
    System.out.println(Character.toLowerCase('A'));//转成小写
    ```
    

案例演示：[**com.zzhow.wrapper**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper) 中的 [**WrapperMethod.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/wrapper/WrapperMethod.java)

# 0465_String结构剖析

- String类的理解和创建对象：
    1. String 对象用于保存字符串，也就是一组字符序列。
    2. 字符串常量对象是用双引号括起的字符序列。
        
        例如："你好”、"12.97"、"boy"等
        
    3. 字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节。
    4. String 类较常用构造方法(其它看手册)：
        
        ```java
        String s1 = new String();
        String s2 = new String(String original);
        String s3 = new String(char[] a);
        String s4 = new String(char[] a, int startIndex, int count);
        ```
        

案例演示：[**com.zzhow.string_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/string_)** 中的 **[String_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/string_/String_.java)**

# 0466_String创建剖析

- 两种创建String对象的区别
    - 方式一：直接赋值 `String s1 = "zzhow";`
    - 方式二：调用构造器 `String s2 = new String("zzhow");`
    1. 方式一：先从常量池查看是否有"zzhow”数据空间，如果有，直接指向；如果没有则重新创建，然后指向。
        
        s1 最终指向的是常量池的空间地址。
        
    2. 方式二：先在堆中创建空间，里面维护了value属性，指向常量池的zzhow空间。如果常量池没有"zzhow"，重新创建，如果有，直接通过value指向。
        
        s2 最终指向的是堆中的空间地址。
        

# 0469-0470_String对象特性

- 特性一
    1. String 是一个final类，代表不可变的字符序列。
    2. 字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的。
- 特性二
    1. 编译器不傻，做一个优化，判断创建的常量池对象，是否有引用指向。
    2. `String a = "hello" + "abc";` → `String a = "helloabc";`
- 特性三
    1. 两个 String 的对象用“+”连接，底层是
        
        `StringBuilder sb = new StringBuilder();`
        
        `sb.append(a);`
        
        `sb.append(b);`
        
        sb是在堆中，并且append是在原来字符串的基础上追加的。
        
    2. 重要规则：
        1. `String c1 = "ab" + "cd";` 常量相加，看的是池。
        2. `String c1 = a + b;` 变量相加，是在堆中。

# 0471-0473_String常用方法

- 说明：
    
    String类是保存字符串常量的。每次更新都需要重新开辟空间，效率较低，因此Java设计者还提供了 StringBuilder 和 StringBuffer 来增强String的功能并提高效率。
    
- String类的常见方法一览：
    - equals //区分大小写，判断内容是否相等
    - equalsIgnoreCase //忽略大小写的判断内容是否相等
    - length //获取字符的个数，字符串的长度
    - indexOf //获取字符在字符串中第1次出现的索引，索引从0开始，如果找不到，返回-1
    - lastIndexOf //获取字符在字符串中最后1次出现的索引，索引l从0开始，如找不到，返回-1
    - substring //截取指定范围的子串
    - trim //去前后空格
    - charAt //获取某索引处的字符
    - toUpperCase //转换成大写
    - toLowerCase //转换成小写
    - concat //拼接字符串
    - replace //替换字符串中的字符
    - split //分割字符串，对于某些分割字符，我们需要转义比如 \\等
    - compareTo //比较两个字符串的大小，如果前者大，则返回正数，后者大，则返回负数，如果相等，返回 0。
        - 逻辑：先逐个比较，若出现不一样的字符，返回前边的Unicode码 - 后边的Unicode码，比到其中一个字符串没了，返回前边的字符串长度 - 后边的字符串长度。
    - toCharArray //转换成字符数组
    - format //格式字符串
        - 注意：这里的%.2f会自动进行四舍五入

案例演示：[**com.zzhow.string_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/string_) 中的 [**StringMethod.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/string_/StringMethod.java)

### String类总结：它继承了Object类，实现了Serializable接口(可以串行化)、Comparable(String对象可以比较) 和 CharSequence接口。

# 0474_StringBuffer结构剖析

- 基本介绍
    - java.lang.StringBuffer 代表可变的字符序列，可以对字符串内容进行增删。
    - 很多方法与 String 相同，但 StringBuffer 是可变长度的。
    - StringBuffer是一个容器。
    - 在父类中 AbstractStringBuilder 有属性 char[] value，不是 final。该 value 数组存放字符串内容，所以 StringBuffer 中的字符串内容存放在堆中。
    - StringBuffer 是一个 final 类，不能被继承。
- String VS StringBuffer
    1. String 保存的是字符串常量，里面的值不能更改，每次 String 类的更新实际上就是更改地址，效率较低
        
        //`private final char value[];` //存放在方法区中的常量池中
        
    2. StringBuffer 保存的是字符串变量，里面的值可以更改，每次 StringBuffer 的更新实际上可以更新内容，不用每次更新地址，效率较高。
        
        //`char[]value;` //存放在堆中
        

### StringBuffer类总结：它继承了AbstractStringBuilder类。AbstractStringBuilder类继承了Object类，实现了Appendable接口 和 CharSequence接口。StringBuffer类实现了Serializable接口(可以串行化)。

# 0475_StringBuffer转换

- StringBuffer的构造器
    
    ```java
    //构造一个其中不带字符的字符串缓冲区，其初始容量为16个字符。
    StringBuffer()
    
    //public java.lang.StringBuilder(CharSequence seq)构造一个字符串缓冲区，它包含与指定的CharSequence相同的字符。
    StringBuffer(CharSequence seq)
    
    //构造一个不带字符，但具有指定初始容量的字符串缓冲区。即对charll大小进行指定。
    StringBuffer(int capacity) //capacity（容量）
    
    //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
    StringBuffer(String str)
    ```
    

案例演示：**[com.zzhow.stringbuffer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_)** 中的 **[StringBuffer_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_/StringBuffer_.java)**

- String ---> StringBuffer
    
    ```java
    //方式1 使用构造器
    //注意： 返回的才是StringBuffer对象，对str本身没有影响。
    StringBuffer stringBuffer1 = new StringBuffer(str);
    
    //方式2 使用append方法
    StringBuffer stringBuffer2 = new StringBuffer();
    stringBuffer2 = stringBuffer2.append(str);
    ```
    
- StringBuffer ---> String
    
    ```java
    //方式1 使用StringBuffer提供的 toString方法
    String str1 = stringBuffer.toString();
    System.out.println("str1 = " + str1);
    
    //方式2 使用构造器
    String str2 = new String(stringBuffer);
    ```
    

案例演示：**[com.zzhow.stringbuffer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_)** 中的 **[StringAndStringBuffer.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_/StringAndStringBuffer.java)**

# 0476_StringBuffer方法

- StringBuffer类常见方法：
    1. 增 append()
    2. 删 delete(start, end)
    3. 改 replace(start, end, string) //将start----end间的内容替换掉，不含end。
    4. 查 indexOf //查找子串在字符串第1次出现的索引，如果找不到返回-1。
    5. 插 insert()
    6. 获取长度 length()

案例演示：**[com.zzhow.stringbuffer_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_)** 中的 **[StringBufferMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuffer_/StringBufferMethod.java)**

# 0478_StringBuilder结构剖析

- 基本介绍：
    1. 一个可变的字符序列。此类提供一个与 StringBuffer 兼容的 APl，但不保证同步。该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候。如果可能，建议优先采用该类，因为在大多数实现中，它比 StringBuffer 要快。
    2. 在 StringBuilder 上的主要操作是 append 和 insert 方法，可重载这些方法，以接受任意类型的数据。
    3. SringBuilder 继承 AbstractStringBuilder 类。
    4. 实现了 SeriaLizable，说明StringBuilder对象是可以串行化（对象可以网络传输，可以保存到文件）。
    5. StringBuilder 是final类，不能被继承。
    6. StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的 char[] value; 因此，字符序列在堆中。
    7. StringBuilder的方法，没有做互斥的处理，即没有synchronized关键字，因此在单线程的情况下使用StringBuilder。

### StringBuilder类总结：它继承了AbstractStringBuilder类。AbstractStringBuilder类继承了Object类，实现了Appendable接口 和 CharSequence接口。StringBuilder实现了Serializable接口 和 CharSequence接口。

### StringBuffer VS StringBuilder：StringBuilder多用于单线程，StringBuffer 多用于多线程。

# 0479_StringBuilder应用

- String、StringBuffer 和 StringBuilder的比较：
    1. StringBuilder和StringBuffer非常类似，均代表可变的字符序列，而且方法也一样。
    2. String：不可变字符序列，效率低，但是复用率高。
    3. StringBuffer：可变字符序列、效率较高（增删）、线程安全。
    4. StringBuilder：可变字符序列、效率最高、线程不安全。
    5. String使用注意说明：
        
        ```java
        String s = "a"; //创建了一个字符串
        s += "b"; //实际上原来的"a"字符串对象已经丢弃了，现在又产生了一个字符串s + "b"（也就是"ab"）。
        // 如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。
        // 如果这样的操作放到循环中，会极大影响程序的性能。
        // ---> 结论：如果我们对String做大量修改，不要使用String。
        ```
        
- String、StringBuffer 和 StringBuilder 的选择
    1. 如果字符串存在大量的修改操作，一般使用 StringBuffer 或 StringBuilder。
    2. 如果字符串存在大量的修改操作，并在单线程的情况，使用 StringBuilder。
    3. 如果字符串存在大量的修改操作，并在多线程的情况，使用 StringBuffer。
    4. 如果我们字符串很少修改，被多个对象引用，使用 String，比如配置信息等。
- StringBuilder 的方法使用和 StringBuffer 一样。

案例演示：[**com.zzhow.stringbuilder_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuilder_) 中的 **[StringVsStringBufferVsStringBuilder.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/stringbuilder_/StringVsStringBufferVsStringBuilder.java)**

# 0480_Math方法

- 基本介绍：
    
    Math类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
    

```java
//Math常用方法(静态方法)演示
//1. abs 绝对值(返回值类型：int)

//2. pow 求幂(返回值类型：double)

//3. ceil 向上取整，返回 >= 该参数的最小整数(返回值类型：double)

//4. floor 向下取整，返回 <= 该参数的最大整数(返回值类型：double)

//5. round 四舍五入 Math.floor(返回值类型：long)

//6. sqrt 求开方(返回值类型：double)

//7. random 求随机数(返回值类型：double)
// 返回的是 0 <= x < 1 之间的一个随机小数。
//案例：求一个 a-b 之间的随机整数。
System.out.println("7. random演示");
Scanner scanner = new Scanner(System.in);

System.out.println("请输入a：");
int a = scanner.nextInt();
System.out.println("请输入b：");
int b = scanner.nextInt();
for(int i = 0; i < 5; i++)
{
    int randomInt = (int) (a + Math.random() * (b - a + 1));
    System.out.println(a + "-" + b + "之间的随机数为：" + randomInt);
}
System.out.println();

//8. max 返回最大值，min 返回最小值(返回值类型：)
```

方法演示：**[com.zzhow.math_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/math_)** 中的 **[MathMethod.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/math_/MathMethod.java)**

# 0481_Arrays排序源码解读

- Arrays里面包含了一系列静态方法，用于管理或操作数组（比如排序和搜索）。
1. toString返回数组的字符串形式
    - Arrays.toString(arr)
2. sort排序（自然排序和定制排序）
    - Integer arr[] = {1, -1, 7, 0, 89};
3. inarySearch
    - 通过二分搜索法进行查找，要求必须排好序。
    - int index = Arrays.binarySearch(arr, 3);

案例演示：**[com.zzhow.array_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_)** 中的 **[ArrayMethod1.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_/ArrayMethod01.java)**

# 0482_Arrays模拟排序

```java
//main方法中调用
bubbleSortCus(arr1, new Comparator() {
    @Override
    public int compare(Object o1, Object o2) {
        int i1 = (Integer)o1;
        int i2 = (Integer)o2;

        //改变这里 return 的值可以实现不同的排序法则
        //return i1 - i2; //从小到大排序
        return i2 - i1; //从大到小排序
    }
});

//定制冒泡排序方法
public static void bubbleSortCus(int[] arr, Comparator c){
    int tmp = 0;
    for (int i = 0; i < arr.length; i++)
        for (int j = 0; j < arr.length - i - 1; j++) {
            //数组的排序方法由 c.compare(arr[j], arr[j + 1])返回的值决定
            if (c.compare(arr[j], arr[j + 1]) > 0) {
                tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
}
```

- 案例：模拟排序

案例演示：[**com.zzhow.array_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_) 中的 **[ArraySortCustom.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_/ArraySortCustom.java)**

# 0483_Arrays其他方法

1. copyOf 数组元素的复制
    
    Integer[] newArr = Arrays.copyOf(arr, arr.length);
    
2. fill 数组元素的填充
    
    Integer[] num =new Integer[](9,3,2};
    
    Arrays.fill(num, 99);
    
3. equals 比较两个数组元素内容是否完全一致
    
    boolean equals = Arrays.equals(arr, arr2);
    
4. asList 将一组值，转换成list
    
    List<Integer> asList =Arrays.asList(2,3,4,5,6,1);
    
    System.out.println("asList = " + asList);
    

案例演示：**[com.zzhow.array_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_)** 中的 **[ArrayMethod2.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_/ArrayMethod02.java)**

# 0484_Arrays课堂练习

- 案例：自定义 Book 类，里面包含 name 和 price，使用定制排序实现。（1）按 price 从大到小排序。（2）按 price 从小到大排序。（3）按 name 长度从大到小排序。
- Book[] books = new Book[4];
- books[0] = new Book("这就是ChatGPT", 29.90);
- books[1] = new Book("大话数据结构", 59.50);
- books[2] = new Book("计算机底层的秘密", 64.90);
- books[3] = new Book("信息学奥赛一本通关", 64.00);

案例演示：**[com.zzhow.array_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_)** 中的 **[ArrayExercise.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/array_/ArrayExercise.java)**

# 0485_System方法

- System 类常见方法和案例
    1. exit：退出当前程序。
        1. exit(0) 表示程序退出。
        2. 0 表示一个状态，表示正常退出。
    2. arrayCopy：复制数组元素，比较适合底层调用，一般使用Arrays.copyOf完成复制数组。
        
        int[] src={1,2,3};
        
        int[] dest = new int[3];
        
        System.arraycopy(src, 0, dest, 0, 3);
        
        > //参数解读：
        // src：源数组
        // srcPos：从源数组的哪个索引位置开始拷贝
        // dest：目标数组
        // destPos：把源数组的数据拷贝到目标数组的哪个索引
        // length：从源数组拷贝多少个数据到目标数组
        > 
    3. currentTimeMillis：返回当前时间距离1970-1-1的毫秒数。
    4. gc：运行垃圾回收机制System.gc0;

案例演示：**[com.zzhow.system_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/system_)** 中的 **[System_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/system_/System_.java)**

# 0486_大数处理方案

- Biglnteger和BigDecimal介绍
    - 应用场景：
        1. Biglnteger 适合保存比较大的整型
        2. BigDecimal 适合保存精度更高的浮点型(小数)
    - 四则运算：
        1. 加法：add 方法
        2. 减法：subtract 方法
        3. 乘法：multiply 方法
        4. 除法：divide 方法
            1. BigDecimal 做除法运算时需要注意：
            
            > // 可能抛出 ArithmeticException 异常(在除不尽的时候出现)
            > 
            
            > // 需要指定精度
            > 
            
            > // 保持和被除数精度一样：BigDecimal.ROUND_CEILING(已过时)
            > 
            
            > // 可以使用 bigDecimal1.scale() 配合四舍五入模式：RoundingMode.HALF_UP、RoundingMode.CEILING、RoundingMode.FLOOR
            > 
            
            ```java
            System.out.println("bigDecimal1.divide(bigDecimal2) = " + bigDecimal1.divide(bigDecimal2, bigDecimal1.scale(), RoundingMode.HALF_UP));
            ```
            

案例演示：**[com.zzhow.bignum](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/bignum)** 中的 **[BigInteger_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/bignum/BigInteger_.java)** 和 **[BigDecimal_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/bignum/BigDecimal_.java)**

# 0487_Date介绍

- 第一代日期类：
    1. Date：精确到毫秒，代表特定的瞬间。
    2. SimpleDateFormat：格式和解析日期的类 SimpleDateFormat 格式化和解析日期的具体类。它允许进行格式化（日期－>文本）、解析（文本->日期）和规范化。

# 0488_Date应用实例

![SimpleDateFormat 格式](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F2196fa7f-7b51-41cf-af87-a719af88e63e%2FSimpleDateFormat.jpg?table=block&id=7e1f5003-0ac4-4d97-b644-e63e9717c2dc&t=7e1f5003-0ac4-4d97-b644-e63e9717c2dc&width=598&cache=v2)

SimpleDateFormat 格式

1. 获取当前系统时间
`Date date = new Date();`
2. 通过毫秒数得到时间
`Date d1 = new Date(123456789);`
3. 把一个格式化的 String 转成对应的 Date
    
    `String str = "2024年1月1日 00:00:00 星期一";`
    
    `Date d2 = null;`
    
    `try {`
    
        `d2 = simpleDateFormat.parse(str);`
    
    `} catch (ParseException e) {`
    
        `System.*out*.println("日期格式不正确");`
    
    `}`
    
    注意异常处理！
    

案例演示：[**com.zzhow.date_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_) 中的 **[Date01.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_/Date01.java)**

# 0489_Calendar介绍

- 第二代日期类
    1. 第二代日期类，主要就是Calendar类（日历)。
        
        ```java
        public abstract class Calendar extends Object implements Serializable,
        Cloneable,Comparable<Calendar>
        ```
        
    2. Calendar类是一个抽象类，它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。

# 0490_Calendar应用实例

案例演示：**[com.zzhow.date_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_)** 中的 **[Calendar_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_/Calendar_.java)**

# 0491_第三代日期使用

- 第三代日期类
    
    前面两代日期类的不足分析
    
    JDK1.0中包含了一个 java.util.Date 类，但是它的大多数方法已经在JDK1.1引入Calendar类之后被弃用了。而Calendar也存在问题是：
    
    1. 可变性：像日期和时间这样的类应该是不可变的。
    2. 偏移性：Date中的年份是从1900开始的，而月份都从0开始。
    3. 格式化：格式化只对Date有用，Calendar则不行。
    4. 此外，它们也不是线程安全的；不能处理闰秒等（每隔2天，多出1s）。
- 第三代日期类常见方法
    - LocalDate(日期/年月日)、LocalTime(时间/时分秒)、LocalDateTime(日期时间/年月日时分秒）[JDK8加入]

案例演示：**[com.zzhow.date_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_)** 中的 **[LocalDate_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_/LocalDate_.java)**

# 0492_第三代日期方法

![DateTimeFormatter 格式](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F86ee6d73-acba-450a-9861-3b09376c02c5%2FDateTimeFormatter_%25E6%25A0%25BC%25E5%25BC%258F.jpg?table=block&id=56f5908d-deab-488b-b7b7-f91b5f2b87de&t=56f5908d-deab-488b-b7b7-f91b5f2b87de&width=708&cache=v2)

DateTimeFormatter 格式

- 第三代日期使用 DateTimeFormatter 进行格式化
    - 类似于SimpleDateFormat
    
    ```java
    DateTimeFormat dtf = DateTimeFormatter.ofPattern(格式);
    String str = dtf.format(日期对象);
    ```
    

案例演示：**[com.zzhow.date_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_)** 中的 **[DateTimeFormatter_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_/DateTimeFormatter_.java)**

- Instant 时间戳
    - 类似于Date
    - 提供了一系列和Date类转换的方式
        1. 通过静态方法 now() 获取当前时间戳的对象
            
            `Instant now = Instant.*now*();`
            
        2. Instant → Date:
            - `Date date = Date.from(instant);`
        3. Date → Instant:
            - `Instant instant = date.toInstant();`

案例演示：**[com.zzhow.date_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_)** 中的 **[Instant_.java](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter13_%E5%B8%B8%E7%94%A8%E7%B1%BB/src/com/zzhow/date_/Instant_.java)**

- 第三代日期类更多方法
    - LocalDateTime类
    - MonthDay类：检查重复事件
    - 是否是闺年
    - 增加日期的某个部分
    - 使用 plus 方法测试增加时间的某个部分
    - 使用 minus 方法测试查看一年前和一年后的日期

```java
// 123天后是什么时候
LocalDateTime localDateTime1 = ldt.plusDays(123);

// 789分钟前时什么时候
LocalDateTime localDateTime2 = ldt.minusMinutes(789);

```

## 在开发中要尽量使用第三代日期！
