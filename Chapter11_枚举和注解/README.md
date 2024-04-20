# Chapter11
第十一章_枚举和注解  
Chapter11_Enumeration and Annotation  
@[ZZHow1024  ](https://github.com/ZZHow1024)的笔记  
@ZZHow1024

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

# 0424_枚举类引出

- 案例：要求创建季节(Season)对象
- 创建Season对象有如下特点：
    1. 季节的值是有限的几个值(spring, summer, autumn, winter)
    2. 只读，不需要修改。

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**Enumeration01.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/Enumeration01.java)

# 0425_自定义枚举类

- 枚举：
    1. 枚举对应英文(enumeration, 简写 enum)。
    2. 枚举是一组常量的集合。
    3. 可以这里理解：枚举属于一种特殊的类，里面只包含一组有限的特定的对象。
- 自定义类实现枚举：
    1. 不需要提供setXxx方法，因为枚举对象值通常为只读。
    2. 对枚举对象/属性使用 final + static 共同修饰，实现底层优化。
    3. 枚举对象名通常使用全部大写，常量的命名规范。
    4. 枚举对象根据需要，也可以有多个属性。
- 进行自定义类实现枚举，有如下特点：
    1. 构造器私有化。
    2. 本类内部创建一组对象[四季：春夏秋冬]。
    3. 对外暴露对象(通过为对象添加public final static修饰符)。
    4. 可以提供 getXxx方法，但是不要提供 setXxx。

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**Enumeration02.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/Enumeration02.java)

# 0426-0428_enum枚举类

- 案例：使用enum 来实现前面的枚举案例。
- 步骤：
    1. 使用enum关键字替代class。
    2. public static final Season03 SPRING = new Season03("春天","温暖"); 直接使用SPRING("春天","温暖");
    3. 如果有多个常量(对象)，使用逗号间隔即可。

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**Enumeration03.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/Enumeration03.java)

- enum关键字实现枚举注意事项：
    1. 当我们使用enum关键字开发一个枚举类时，默认会继承Enum类，且是一个final类[使用javap来证明]。
    2. 传统的 public static final Season03 SPRING = new Season2("春天”"温暖"); 简化成 SPRING("春天", "温暖")，这里必须知道，它调用的是哪个构造器。
    3. 如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略。
    4. 当有多个枚举对象时，使用逗号间隔，最后有一个分号结尾。
    5. 枚举对象必须放在枚举类的行首。

# 0429_Enum成员方法

- 说明：使用关键字enum时，会隐式继承Enum类,这样我们就可以使用Enum类相关的方法。
1. toString：Enum类已经重写过了，返回的是当前对象名，子类可以重写该方法，用于返回对象的属性信息。
2. name：返回当前对象名(常量名)，子类中不能重写。
3. ordinal：返回当前对象的位置号，默认从0开始。
4. values：返回当前枚举类中所有的常量。
5. valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常。
6. compareTo：比较两个枚举常量，比较的就是编号，返回前边的编号减后边的编号。

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**EnumMethod.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/EnumMethod.java)

# 0430_Enum课堂练习

- 案例：
    1. 声明Week枚举类，其中包含星期一至星期日的定义：MONDAY，TUESDAY，WEDNESDAY，THURSDAY，FRIDAY，SATURDAY，SUNDAY。
    2. 使用values返回所有的枚举数组并遍历输出星期一、星期二、星期三……
    
    ![Enum课堂练习](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F8035cb52-7d4a-4b85-a171-25d38ea255cd%2FEnum%25E8%25AF%25BE%25E5%25A0%2582%25E7%25BB%2583%25E4%25B9%25A0.jpg?table=block&id=ed9f0275-e8a9-40ef-96e6-baf26c60a604&t=ed9f0275-e8a9-40ef-96e6-baf26c60a604)
    
    Enum课堂练习
    

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**EnumExercise.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/EnumExercise.java)

# 0431_Enum使用细节

- enum实现接口
    1. 使用enum关键字后,就不能再继承其它类了，因为enum会隐式继承Enum，而Java是单继承机制。
    2. 枚举类和普通类一样，可以实现接口，如下形式：
        
        `enum 类名 implements 接囗1, 接口2{` 
        
        `}` 
        

案例演示：[**com.zzhow.enum_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_) 中的 [**EnumDetail.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/enum_/EnumDetail.java)

# 0432_Override注解

- 注解的理解
    1. 注解(Annotation)也被称为元数据(Metadata)，用于修饰解释包、类、方法、属性、构造器、局部变量等数据信息。
    2. 和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，相当于嵌入在代码中的补充信息。
    3. 在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在JavaEE中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替Java EE旧版中所遗留的繁冗代码和XML配置等。
- 基本的Annotation介绍：
    - 使用 Annotation 时要在其前面增加 @ 符号，并把该 Annotation 当成一个修饰符使用。用于修饰它支持的程序元素。
    - 三个基本的 Annotation：
    1. @Override：限定某个方法，是重写父类方法，该注解只能用于方法。
    2. @Deprecated：用于表示某个程序元素(类，方法等)已过时。
    3. @SuppressWarnings：抑制编译器警告。
- @Override：限定某个方法是重写父类的方法，该注解只能用于方法。
    
    ```java
    class Father { //父类
        public void fly() {
            System.out.println("Father fly.");
        }
    }
    
    class Son extends Father { //子类
        //提示：
        //1. @Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly方法
        //2. 这里如果没有写 @Override 还是重写了父类的fly方法
        //3. 如果写了Override注解，编译器就会去检查该方法是否真的重写了父类的方法，
        // 如果的确重写了则编译通过，如果没有构成重写则编译错误
        @Override
        public void fly() {
            System.out.println("Son fly.");
        }
    }
    ```
    
- 补充说明：
    
    @interface 不是 interface，而是注解类，是JDK5.0之后加入的。
    

案例演示：[**com.zzhow.annotation_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_) 中的 [**Override_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_/Override_.java)

# 0433_Deprecated注解

- Override注解使用说明：
    1. @Override 表示指定重写父类的方法(从编译层面验证)，如果父类没有对应的方法，则会报错。
    2. 如果不写@Override 注解，而父类仍有 public void fly(){}仍然构成重写。
    3. @Override 只能修饰方法，不能修饰其它类，包，属性等等。
    4. 査看@Override注解源码为@Target(ElementType.METHOD)，说明只能修饰方法。
    5. @Target 是修饰注解的注解， 称为元注解，记住这个概念。
- @Deprecated：
    1. 用于表示某个程序元素(类,方法等)已过时。
    2. 可以修饰方法，类，字段，包，参数 等等。
    3. @Target(value={CONSTRUCTOR, FIELD, LOCAL_ VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})。
    4. @Deprecated 的作用可以做到新旧版本的兼容和过渡。

案例演示：[**com.zzhow.annotation_](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_)** 中的 [**Deprecated_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_/Deprecated_.java)

# 0434_SuppressWarnings注解

- @SuppressWarnings
- 说明各种值：
    1. unchecked 是忽略没有检查的警告。
    2. rawtypes 是忽略没有指定泛型的警告(传参时没有指定泛型的警告错误)。
    3. unused 是忽略没有使用某个变量的警告错误。
    4. @SuppressWarnings 可以修饰的程序元素写在了源码中的@Target位置。
    5. 生成@SupperssWarnings 时，不用背，直接点击左侧的黄色提示，就可以选择(注意可以指定生成的位置)。

案例演示：[**com.zzhow.annotation_**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_) 中的 [**SuppressWarnings_.java**](https://github.com/ZZHow1024/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter11_%E6%9E%9A%E4%B8%BE%E5%92%8C%E6%B3%A8%E8%A7%A3/src/com/dnx/annotation_/SuppressWarnings_.java)

# 0435_四种元注解

- 元注解的基本介绍：
    
    JDK 的元 Annotation 用于修饰其他 Annotation。
    
- 元注解的种类(使用不多，了解,不用深入研究)：
    1. Retention //指定注解的作用范围，三种 SOURCE, CLASS, RUNTIME、
    2. Target // 指定注解可以在哪些地方使用
    3. Documented //指定该注解是否会在javadoc体现
    4. Inherited //子类会继承父类注解
- @Retention 注解：
    - 说明：
        
        只能用于修饰一个 Annotation 定义，用于指定该 Annotation 可以保留多长时间@Rentention 包含一个 RetentionPolicy 类型的成员变量，使用 @Rentention时必须为该 value 成员变量指定值。
        
    - @Retention的三种值：
        1. RetentionPolicy.SOURCE：编译器使用后，直接丢弃这种策略的注解。
        2. RetentionPolicy.CLASS：编译器将把注解记录在 class 文件中，当运行 Java 程序时，JVM 不会保留注解，这是默认值。
        3. RetentionPolicy.RUNTIME：编译器将把注解记录在 class 文件中，当运行Java程序时，JVM会保留注解，程序可以通过反射获取该注解。
    - 案例：@Override 的作用域在 SOURCE，当编译器编译时生效，不会写入到.class 文件，也不会再runtime(运行时)生效。
    
    ```java
    //@Override的源码
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE) //这个就是@retention的取值
    public @interface Override {
    	......
    }
    ```
    
- @Target 注解：
    - 说明：
        
        用于修饰 Annotation 定义，用于指定被修饰的 Annotation 能用于修饰哪些程序元素。@Tanget 也包含一个名为 value 的成员变量。
        
    - 案例：
        
        ```java
        //Deprecated.class
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
        public @interface Deprecated {
        }
        ```
        
- @Documented 注解：
    - 说明：
        - 用于指定被该元 Annotation 修饰的 Annotation 类将被 javadoc 工具提取成文档，即在生成文档时，可以看到该注解。
        - 定义为Documented的注解必须设置Retention值为RUNTIME。
    - 案例：
        
        ```java
        //Deprecated.class
        @Documented
        @Retention(RetentionPolicy.RUNTIME)
        @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
        public @interface Deprecated {
        }
        ```
        
- @Inherited 注解：
    - 说明：
        - 被它修饰的 Annotation 将具有继承性，如果某个类使用了被 @Inherited 修饰的 Annotation，则其子类将自动具有该注解。
        - 实际应用中，使用较少，了解即可。
