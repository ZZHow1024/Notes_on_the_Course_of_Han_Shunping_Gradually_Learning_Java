//DNX写于2024年1月23日
public class VarParameter
{
	public static void main(String[] args)
	{
		//案例：DnxMethod类，sum方法。
		//要求可以计算2个数的和，3个数的和，4个数的和，5个数的和…
		DnxMethod myMethod = new DnxMethod();

		System.out.println("1 + 1 + 1 + 1 + 1 = " + myMethod.sum(1, 1, 1, 1, 1));
	}
}

class DnxMethod
{
	// public int sum(int n1, int n2) // 计算2个数的和
	// {
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) // 计算3个数的和
	// {
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3, int n4) // 计算4个数的和
	// {
	// 	return n1 + n2 + n3 + n4;
	// }

	//上面三个方法构成方法重载，名称相同，功能相同，参数个数不同。
	//使用可变参数优化。

	//1. int... 表示接收的是可变参数，类型是int，即可以接收多个int(0 - 多)
	//2. 使用可变参数时，可以当作数组来使用 即 nums 可以当作数组。
	public int sum(int... nums)
	{
		int res = 0;

		for(int i = 0; i < nums.length; i++)
		{
			res += nums[i];
		}

		return res;
	}
}