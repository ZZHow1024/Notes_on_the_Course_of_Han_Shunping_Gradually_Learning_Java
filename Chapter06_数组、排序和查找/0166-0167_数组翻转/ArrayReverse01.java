//DNX写于2024年1月21日
public class ArrayReverse01
{
	public static void main(String[] args)
	{
		//案例：int[] arr = {11,22,33,44,55,66}; → {66,55,44,33,22,11}。
		int[] arr = {11, 22, 33, 44, 55, 66};

		System.out.println("==翻转前的数组==");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("arr[" + i + "] = " + arr[i] + '\t');
		}	

		//规律：
		// 1. 把arr[0] 和 arr[5] 交换。
		// 2. 把arr[1] 和 arr[4] 交换。
		// 3. 把arr[2] 和 arr[3] 交换。
		// 4. 一共交换3次 = (arr.length / 2)。
		// 5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - i - 1]。

		int temp;
		int len = arr.length; // 计算数组长度

		for(int i = 0; i < (len / 2); i++)
		{
			temp = arr[len - i - 1];
			arr[len - i - 1] = arr[i];
			arr[i] = temp;
		}

		System.out.println("\n==翻转后的数组==");
		for(int i = 0; i < len; i++)
		{
			System.out.print("arr[" + i + "] = " + arr[i] + '\t');
		}		
	}
}