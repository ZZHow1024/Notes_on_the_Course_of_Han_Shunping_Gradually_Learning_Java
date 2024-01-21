//DNX写于2024年1月21日
public class ArrayReverse02
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

		//逆序赋值方法：
		// 1. 先创建一个新的数组 arr2，大小arr.length。
		// 2. 逆序遍历 arr，将 每个元素拷贝到 arr2的元素中（顺序拷贝）。
		// 3. 可以增加一个循环变量 j -- 0 -> 5。
		// 4. for循环结束后，arr2就是一个逆序的数组{66,55,44,33,22,11}。
		// 5. 让arr指向arr2数据空间，此时arr原来的数据空间就没有变量引用，
		//	会被垃圾回收机制销毁。
		// 6. 输出arr。

		int[] arr2 = new int[arr.length];

		for(int i = (arr.length - 1),j = 0; i >= 0; i--,j++)
		{
			arr2[j] = arr[i];
		}

		arr = arr2;

		System.out.println("\n==翻转后的数组==");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("arr[" + i + "] = " + arr[i] + '\t');
		}		
	}
}