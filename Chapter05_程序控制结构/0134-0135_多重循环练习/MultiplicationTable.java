//DNX写于2024年1月20日
public class MultiplicationTable
{
	public static void main(String[] agrs)
	{

		//案例：打印 9 * 9 乘法表。
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " * " + i + " = " + (j * i) + '\t');
			}
			System.out.print('\n');
		}
	}
}