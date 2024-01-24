//DNX写于2024年1月22日
public class Recursion
{
	public static void main(String[] args)
	{
		D t1 = new D();

		System.out.println("==案例1. 打印问题==");
		t1.test(4);

		int n = 3;

		System.out.println("\n==案例2. 计算阶乘==");
		System.out.println(n + "! = " + t1.factorial(n));
	}
}

class D
{
	public void test(int n)
	{
		if(n > 2)
		{
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	public int factorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return factorial(n - 1) * n;
		}
	}
}