//DNX写于2024年1月21日
import java.util.Scanner;

public class ArrayReduce
{
	public static void main(String[] args)
	{
		//案例：有一个数组int[] arr = {1,2,3,4,5}; 可以将该数组进行缩减，
		//	提示用户是否继续缩减，每次缩减最后那个元素。
		//	当只剩下最后一个元素时，提示不能再缩减。

		Scanner myScanner = new Scanner(System.in);

		int[] arr = {1, 2, 3, 4, 5};
		
		while(true)
		{
			for(int i = 0; i < arr.length; i++)
			{
				System.out.print("arr[" + i + "] = " + arr[i] + '\t');
			}

			System.out.print("\n是否缩减数组(y/n)：");
			char key = myScanner.next().charAt(0);

			if(key == 'y' || key == 'Y')
			{
				int[] newArr = new int[arr.length - 1];

				for(int i = (newArr.length - 1); i >= 0; i--)
				{
					newArr[i] = arr[i];
				}

				arr = newArr;

				if(arr.length == 1)
				{
					System.out.println("arr[0] = " + arr[0]);
					System.out.println("只剩下最后一个元素，不能再缩减");
					break;
				}
			}
			else if(key == 'n' || key == 'N')
			{
				System.out.print("您已退出缩减");
				break;
			}
		}
	}
}