//DNX写于2024年1月20日
import java.util.Scanner;

public class Star
{
	public static void main(String[] args)
	{
		//案例：打印空心金字塔
		/*
		思路分析：
		 化繁为简。
			1. 先打印一个矩形。
			2. 打印半个金字塔。
			3. 打印整个金字塔。
		 打印出空心金字塔。
		*/
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入金字塔的层数：");
		int totalLevel = myScanner.nextInt();

		for(int i = 0; i < totalLevel; i++) // i 表示层数。
		{
			//在输出*之前，还要输出对应的空格   空格数 = 总层数 - 当前层。
			for(int k = 0; k < (totalLevel-i); k++)
			{
				System.out.print(" ");
			}

			//控制打印每层的*的个数。
			for(int j = 0; j < (2*i - 1); j++)
			{
				//当前行的第一个位置是*，最后一个位置也是*，最后一层全部*。
				if(j == 0 || j == (2*i - 2) || i == (totalLevel-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			//每打印完一层的*后，就换行。
			System.out.println(""); // println本身就会换行。
		}

	}
}