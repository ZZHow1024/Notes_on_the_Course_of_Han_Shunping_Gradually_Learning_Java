//DNX写于2024年1月21日
import java.util.Scanner;

public class ArrayAdd
{
	public static void main(String[] args)
	{
		/*
		案例：实现动态的给数组添加元素效果，实现对数组扩容，
			且用户可以选择是否继续扩容(y / n)。
		  	int[] arr = {1,2,3};补一个4到数组最后。

		添加一个值的方法(以添加一个4为例)：
		1. 定义初始数组 int[] arr = {1,2,3} // 下标0-2。
		2. 定义一个新的数组 int[] arrNew = new int[arr.length + 1];
		3. 遍历 arr 数组，依次将arr的元素拷贝到arrNew数组。
		4. 将 4 赋给 arrNew 的最后一个元素。arrNew[arrNew.length - 1] = 4;
		5. 让 arr 指向arrNew; arr = arrNew;那么原来的 arr 数组被销毁。

		实现用户可以选择是否继续扩容(y / n)的方法：
		6. 创建一个 Scanner 接收用户输入。
		7. do-while控制。
		*/

		Scanner myScanner = new Scanner(System.in);

		int[] arr = {1, 2, 3};
		int addNum;
		char key;
		
		System.out.println("==扩容前的数组==");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("arr[" + i + "] = " + arr[i] + '\t');
		}

		do
		{
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++)
			{
				arrNew[i] = arr[i];
			}

			System.out.print("\n请输入你要添加的元素：");
			addNum = myScanner.nextInt();

			arrNew[arrNew.length - 1] = addNum;

			arr = arrNew;

			System.out.println("\n==扩容后的数组==");
			for(int i = 0; i < arr.length; i++)
			{
				System.out.print("arr[" + i + "] = " + arr[i] + '\t');
			}

			System.out.print("\n是否继续添加(y/n)：");
			key = myScanner.next().charAt(0);
		}while(key != 'n' && key != 'N');

		System.out.println("已退出添加！");
	}
}