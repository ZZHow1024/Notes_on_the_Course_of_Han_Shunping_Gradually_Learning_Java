# 0041_整型细节

1. Java各整数类型有固定的范围和字段长度，不受具体OS[操作系统]的影响，以保证Java程序的可移植性。
2. Java的整型常量 (具体值) 默认为 int 型，声明long型常量须后加 ’l’ 或 ’L’。
3. Java程序中变量常声明为int型，除非不足以表示大数，才使用long。
4. bit: 计算机中的最小存储单位。byte:计算机中基本存储单元,1 byte = 8 bit。
    1. [二进制再详细说，简单举例一个 byte 3 和 short 3]
5. 思考题: long 类型，有几个 bit [8 个字节 * 8 bit= 64 bit]

```java
public class IntDetail{
	public static void main(String[] args){

		//Java的整型常量 (具体值) 默认为 int 型，声明long型常量须后加 ’l’ 或 ’L’。
		int n1 = 1;  //4个字节。
	  //int n2 = 1L; //×
		long n3 = 1L;//√

		System.out.println("n1 = " + n1);
		System.out.println("n3 = " + n3);
	}
}
```

案例演示：**[IntDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0041_%E6%95%B4%E5%9E%8B%E7%BB%86%E8%8A%82/IntDetail.java)**
