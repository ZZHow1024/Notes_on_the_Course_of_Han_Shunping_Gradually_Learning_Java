//DNX写于2024年1月23日
import java.util.Scanner;

public class MonkeysEatPeaches
{
	public static void main(String[] args)
	{
		/*
		案例：猴子吃桃子问题，有一堆桃子，每天猴子都吃其中的一半，然后再多吃一个。
		当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。
		问题：第n（1 ≤ n ≤ 10）天共有多少个桃子?
		分析（逆推）：
		1. day = 10 时，有 1 个桃子。
		2. day = 9 时，有 (day10 + 1) * 2 = 4 个桃子。
		3. day = 8 时， 有 (day9 + 1) * 2 = 10 个桃子。
		规律： 前一天的桃子数 = (后一天的桃子数 + 1) * 2。
		这里就是一个递归的思路。
		*/

		D t = new D();
		Scanner myScanner = new Scanner(System.in);
		int n;
		int res;

		System.out.println("猴子吃桃子问题，有一堆桃子，每天猴子都吃其中的一半，然后再多吃一个。");
		System.out.println("当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。");
		System.out.print("请输入天数n（1 ≤ n ≤ 10）：");

		n = myScanner.nextInt();
		res = t.peach(n);

		if(res != -1)
		{
			System.out.println("第" + n + "天有" + res + "个桃子。");
		}
		else
		{
			System.out.println("您输入的n不在规定范围内。");
		}
	}
}

class D
{
	public int peach(int day)
	{
		if(day == 10)
		{
			return 1;
		}
		else if(1 <= day && day <= 9)
		{
			return (peach(day + 1) + 1) * 2;
		}
		else
		{
			return -1;
		}
	}
}