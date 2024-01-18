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
