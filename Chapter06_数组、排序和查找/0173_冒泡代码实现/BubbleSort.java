//DNX写于2024年1月21日
public class BubbleSort
{
	public static void main(String[] args)
	{
		//案例：冒泡排序，{24,69,80,57,13}。
		int[] arr = {24, 69, 80, 57, 13};
		int temp;

		System.out.println("==初始状态==");
		for(int j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j] + "\t");
		}

		for(int i = 0; i < (arr.length - 1); i++)
		{
			for(int j = 0; j < (arr.length - i - 1); j++)
			{
				if(arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("\n==第" + (i + 1) + "轮冒泡排序==");
			for(int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[j] + "\t");
			}
		}
	}
}