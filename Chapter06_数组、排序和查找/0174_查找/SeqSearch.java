//DNX写于2024年1月21日
import java.util.Scanner;

public class SeqSearch
{
	public static void main(String[] args)
	{
		//案例：有一个数列，James、Robert、John、Michael、William，
		//从键盘中任意输入一个名称，判断数列中是否包含此名称，
		//如果找到了就提示找到了，并给出下标值。[顺序查找案例]

		Scanner myScanner = new Scanner(System.in);

		String[] names = {"James","Robert","John","Michael","William"};
		String findName;
		int index = -1;

		System.out.println("==当前数组中的内容==");
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + "      ");
		}

		System.out.print("\n请输入名字：");
		findName = myScanner.next();

		for(int i = 0; i < names.length; i++)
		{
			if(findName.equals(names[i]))
			{
				index = i;
				System.out.println("找到" + findName + "，下标为" + i + "。");
				break;
			}
		}

		if(index == -1)
		{
			System.out.println("没有找到" + findName + "。");
		}
	}
}