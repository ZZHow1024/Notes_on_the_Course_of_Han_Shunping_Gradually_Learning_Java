# Chapter12
第十二章_异常  
Chapter12_Exception  
@[zzhow1024  ](https://github.com/zzhow1024)的笔记  
@ZZHow1024

参考课程:  

【***韩顺平* 循序渐进学Java】**

[https://www.bilibili.com/video/BV1fh411y7R8]

## 异常：Exception

# 0443_异常处理入门

- 引出异常和异常处理机制
    
    ```java
    int num1 = 10;
    int num2 = 0;
    int res = num1 / num2;
    System.out.println("程序继续执行。");
    ```
    
- 当抛出异常后，程序就退出，不应该出现一个不算致命的问题就导致整个系统崩溃。
- 可以使用try-catch异常处理机制来解决，保证程序的健壮性。
- 将代码块选中，按快捷键 Ctrl + Alt + t -> 选中try-catch。
    
    ```java
    try {
    	int res = num1 / num2;
    } catch (Exception e) {
      //throw new RuntimeException(e);
      System.out.println("出现异常的原因：" + e.getMessage());
    }
    ```
    

案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**Exception_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/Exception_.java)

# 0444_异常基本介绍

- 基本介绍：
    
    Java语言中，将程序执行中发生的不正常情况称为“异常”。（开发过程中的语法错误和逻辑错误不是异常）
    
- 执行过程中所发生的异常事件可分为两类
    1. Error(错误)：Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源耗尽等严重情况。比如：StackOverflowError[栈溢出]和OOM(out of memory)，Error 是严重错误，程序会崩溃。
    2. Exception：其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
        
        例如空指针访问，试图读取不存在的文件，网络连接中断等等，Exception 分为两大类：运行时异常[程序运行时发生的异常] 和 编译时异常[编程时编译器检查出的异常]。
        

# 0445_异常体系图

- 异常体系图
    
    ![异常体系图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2F03bddf71-aa05-4f9d-8ca7-1574eedf704e%2F%25E5%25BC%2582%25E5%25B8%25B8%25E4%25BD%2593%25E7%25B3%25BB%25E5%259B%25BE.png?table=block&id=59ce2574-f736-483e-80ed-9dcc4400a13a&t=59ce2574-f736-483e-80ed-9dcc4400a13a)
    
    异常体系图
    
- 异常体系图的小结：
    1. 异常分为两大类，运行时异常和编译时异常。
    2. 运行时异常，编译器检查不出来，编译器不要求强制处置的异常。一般是指编程时的逻辑错误，是程序员应该避免其出现的异常。java.lang.RuntimeException类及它的子类都是运行时异常。
    3. 对于运行时异常，可以不作处理，因为这类异常很普遍，若全处理可能会对程序的可读性和运行效率产生影响。
    4. 编译时异常，是编译器要求必须处置的异常。

# 0446_五大运行时异常

- 常见的运行时异常包括：
    1. NullPointerException空指针异常
        - 当应用程序试图在需要对象的地方使用 nul 时，抛出该异常。
        
        案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**NullPointerException_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/NullPointerException_.java)
        
    2. ArithmeticException数学运算异常
        - 当出现异常的运算条件时，抛出此异常。例如：一个整数“除以零”时，抛出此类的一个实例。
        
        案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**Exception_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/Exception_.java)
        
    3. ArrayIndexOutOfBoundsException数组下标越界异常
        - 用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
        
        案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**ArrayIndexOutOfBoundsException_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/ArrayIndexOutOfBoundsException_.java)
        
    4. ClassCastException类型转换异常
        - 当试图将对象强制转换为不是实例的子类时，抛出该异常。
        
        案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**ClassCastException_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/ClassCastException_.java)
        
    5. NumberFormatException数字格式不正确异常
        - 当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常 —> 使用异常我们可以确保输入是满足条件数字。
        
        案例演示：[**com.zzhow.exception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_) 中的 [**NumberFormatException_.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/exception_/NumberFormatException_.java)
        

# 0447_异常课堂练习

- 介绍：
    
    编译异常是指在编译期间，就必须处理的异常，否则代码不能通过编译。
    
- 常见的编译异常：
    - SQLException //操作数据库时，查询表可能发生异常
    - IOException //操作文件时，发生的异常
    - FileNotFoundException //当操作一个不存在的文件时，发生异常
    - ClassNotFoundException //加载类，而该类不存在时，发生异常
    - EOFException // 操作文件，到文件末尾，发生异常
    - IllegalArguementException //参数异常

# 0448_异常处理机制

- 基本介绍：
    
    异常处理就是当异常发生时，对异常处理的方式。
    
- 异常处理的方式：
    1. try-catch-finally
        
        程序员在代码中捕获发生的异常，自行处理。
        
        ```java
        try {
        	可能有异常的代码
        } catch(Exception e) {
        	//捕获到异常
        	//1. 当异常发生时
        	//2. 系统将异常封装成Exception对象e，传递给catch
        	//3. 得到异常对象后，程序员自己处理
        	//4. 如果没有发生异常，catch代码块不执行
        } finally {
        	//1. 不管try代码块是否有异常发生，始终要执行finally
        	//2. 通常将释放资源的代码放在finally里
        }
        ```
        
    2. throws
        
        将发生的异常抛出，交给调用者(方法)来处理，最顶级的处理者就是JVM。
        
- throws处理机制图
    
    ![throws处理机制图](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Fd6058351-ddd2-4b95-982a-c04afa62e9e6%2Fthrows%25E5%25A4%2584%25E7%2590%2586%25E6%259C%25BA%25E5%2588%25B6%25E5%259B%25BE.png?table=block&id=092e58ac-30ac-415c-be27-9f202c9dbec3&t=092e58ac-30ac-415c-be27-9f202c9dbec3)
    
    throws处理机制图
    
    1. try-catch-finally 和 throws 二选一
    2. 如果程序员没有显式地处理异常，默认throws

# 0449_tryCatch

- try-catch方式处理异常说明：
    1. Java提供try和catch块来处理异常。try块用于包含可能出错的代码。catch块用于处理try块中发生的异常。可以根据需要在程序中有多个数量的try……catch块。
    2. 基本语法：
        
        ```java
        try {
        	//可疑代码
        	//将异常生成对应的异常对象，传递给catch块
        } catch(异常) {
        	//对异常的处理
        } finally { //finally可不写
        }
        ```
        
- 注意事项：
    1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块。
    2. 如果异常没有发生，则顺序执行try的代码块，不会进入到catch。
    3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码-finally { }
    4. 可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，要求父类异常在后，子类异常在前，比如：Exception在后NullPointerException在前，如果发生异常，只会匹配一个catch。
        
        ```java
        try {
        	//......
        } catch(NullPointerException e) {
        	e.printStackTrace();
        } catch(Exception e) {
        	e.printStackTrace();
        } finally {
        	//......
        }
        ```
        
    5. 可以进行 try-finally 配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉。应用场景，就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑。

# 0450_tryCatch练习

## 就算有return，finall也必须执行。如果finally里没有return，catch里面有return，那就等finally执行完了再去return。

- 总结：
1. **如果没有出现异常**，则执行try块中所有语句，不执行catch块中语句，如果有finally，最后还需要执行finally里面的语句。
2. **如果出现异常**，则try块中异常发生后，try块剩下的语句不再执行。将执行catch块中的语句，如果有finally，最后还需要执行finally里面的语句。

# 0451_tryCatch最佳实践

- 案例：如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止。

案例演示：[**com.zzhow.trycatch_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/trycatch_) 中的 [**TryCatchExercise.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/trycatch_/TryCatchExercise.java)

# 0452_throws入门案例

- 基本介绍：
    1. 如果一个方法(中的语句执行时)可能生成某种异常，但是并不能确定如何处理这种异常，则此方法应显示地声明抛出异常，表明该方法将不对这些异常进行处理，而由该方法的调用者负责处理。
    2. 在方法声明中用throws语句可以声明抛出异常的列表，throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类。

案例演示：[**com.zzhow.throws_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/throws_) 中的 [**Throws.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/throws_/Throws.java)

# 0453_throws使用细节

- 注意事项和使用细节：
    1. 对于编译异常，程序中必须处理，比如 try-catch 或者 throws。
    2. 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理。
    3. 子类重写父类的方法时，对抛出异常的规定：子类重写的方法所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型。
    4. 在throws 过程中，如果有方法 try-catch,就相当于处理异常，就可以不必throws。

# 0454_自定义异常

- 基本概念：
    
    当程序中出现了某些“错误”但该错误信息并没有在Throwable子类中描述处理，这个时候可以自己设计异常类，用于描述该错误信息。
    
- 自定义异常的步骤：
    1. 定义类：自定义异常类名(程序员自己写)继承Exception或RuntimeException。
    2. 如果继承Exception，属于编译异常。
    3. 如果继承RuntimeException，属于运行异常(一般来说，继承RuntimeException)。
- 案例：当我们接收Person对象年龄时，要求范围在18-120之间，否则抛出一个自定义异常(要求 继承RuntimeException)，并给出提示信息。

```java
//自定义异常：AgeException
class AgeException extends RuntimeException {
    public AgeException(String message) { //构造器
        super(message);
    }
}
```

案例演示：[**com.zzhow.customexception_**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/tree/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/customexception_) 中的 [**CustomException.java**](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter12_%E5%BC%82%E5%B8%B8/src/com/dnx/customexception_/CustomException.java)

# 0455_throwVSthrows

![throw和throws的区别](https://www.notion.so/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F4b165318-6383-451c-8845-110b786c9f0a%2Ffba1d815-612e-4165-907d-bcd89e747eec%2Fthrow%25E5%2592%258Cthrows%25E7%259A%2584%25E5%258C%25BA%25E5%2588%25AB.png?table=block&id=4b63b4f9-4694-4f09-a480-64f190af2391&t=4b63b4f9-4694-4f09-a480-64f190af2391)

throw和throws的区别

- **异常处理用throws，手动生成异常用throw。**
