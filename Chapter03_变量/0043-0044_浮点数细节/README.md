# 0043-0044_浮点数细节

1. 与整数类型类似，Java 浮点类型也有固定的范围和字段长度，不受具体OS的影响。
    1. [float 4 个字节 double 是 8个字节]
2. Java 的浮点型常量默认为double型，声明float型常量，须后加 ’f’ 或 ‘F’。
3. 浮点型常量有两种表示形式
    1. 十进制数形式，如：
        1. 5.12
        2. 512.0f
        3. .512(必须有小数点)
    2. 科学计数法形式，如：
        1. 5.12e2   [5.12*10的2次方]
        2. 5.12E-2  [5.12/10的2次方]
4. 通常情况下，应该使用double型，因为它比float型更精确。
    1. double num9 = 2.1234567851;
    2. float num10 = 2.1234567851F;
5. 浮点数使用陷阱：2.7 和 8.1/3 比较。

样例：

```java
//DNX写于2024年1月17日
public class FloatDetail{
	public static void main(String[] args){

		//Java的浮点型常量默认为double型，声明float型常量，必须后面加 'f' 或 'F'
	  //float num1 = 1.1;  //×
		float num2 = 1.1F;   //√
		double num3 = 1.1;   //√
		double num4 = 1.1F;  //√

		//十进制数形式：   5.12    512.0f       .512(必须有小数点)
		double num5 = .123;//等价 0.123
		System.out.println("num5 = " + num5);
		//科学计数法形式： 5.12e2[5.12*10的2次方]  5.12E-2[5.12/10的2次方]
		System.out.println("5.12e2 = " + 5.12e2);//512.0
	 	System.out.println("5.12E-2 = " + 5.12E-2);//0.0512

	 	//4. 通常情况下，应该使用double型，因为它比float型更精确。
    	double num9 = 2.1234567851;
    	float num10 = 2.1234567851F;
    	System.out.println("num9 = " + num9);
    	System.out.println("num10 = " + num10);

    	//浮点数使用陷阱：2.7 和 8.1/3 比较
    	double num11 = 2.7;
    	double num12 = 8.1 / 3;
    	System.out.println("num11 = " + num11);//2.7
    	System.out.println("num12 = " + num12);//接近2.7的一个小数，而不是2.7
    	//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心。
    	//应该时是以两个数的差值的绝对值，在某个精度范围内判断
    	if(Math.abs(num11 - num12) < 0.000001){
    		System.out.println("差值非常小，到我的规定精度，认为num11 = num12");
    	}
	}
}
```

案例演示：**[FloatDetail.java](https://github.com/dnx00/Notes_on_the_Course_of_Han_Shunping_Gradually_Learning_Java/blob/main/Chapter03_%E5%8F%98%E9%87%8F/0043-0044_%E6%B5%AE%E7%82%B9%E6%95%B0%E7%BB%86%E8%8A%82/FloatDetail.java)**
