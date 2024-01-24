//DNX写于2024年1月22日
import java.util.Scanner;

public class FibonacciNumber
{
	public static void main(String[] args)
	{
		/*
		案例：请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...
		给你一个整数n，求出它的值是多少。
		分析：
		1. 当n = 1时，斐波那契数是 1。
		2. 当n = 2时，斐波那契数是 2。
		3. 当n >= 3时，斐波那契数是 前两个数的和。
		这里就是一个递归的思路。
		*/

		D t = new D();
		Scanner myScanner = new Scanner(System.in);
		int n;
		int res;

		System.out.println("求斐波那契数1,1,2,3,5,8,13...");
		System.out.print("请输入项数n（n ≥ 1）：");

		n = myScanner.nextInt();
		res = t.fibonacci(n);

		if(res != -1)
		{
			System.out.println("第" + n + "项的数为" + res);
		}
		else
		{
			System.out.println("您输入的n不在规定范围内。");
		}
	}
}

class D
{
	public int fibonacci(int n)
	{
		if(n >= 1)
		{
			if(n == 1 || n == 2)
			{
				return 1;
			}
			else
			{
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}
		else
		{
			return -1;
		}
	}
}