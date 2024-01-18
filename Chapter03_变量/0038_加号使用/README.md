# 0038_加号使用

1. 当左右两边都是数值型时，则做加法运算。
2. 当左右两边有一方为字符串，则做拼接运算。

例：	System.out.println(100 + 98);
		System.out.println("100" + 98);

		System.out.println(100 + 3 + "Hello");
		System.out.println("Hello" + 100 + 3);

```java
public class Plus{
	public static void main(String[] args){
		System.out.println(100 + 98);//198
		System.out.println("100" + 98);//10098

		System.out.println(100 + 3 + "Hello");//103Hello
		System.out.println("Hello" + 100 + 3);//Hello1003
	}
}
```

案例演示：**[Plus.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0038_%E5%8A%A0%E5%8F%B7%E4%BD%BF%E7%94%A8/Plus.java)**
