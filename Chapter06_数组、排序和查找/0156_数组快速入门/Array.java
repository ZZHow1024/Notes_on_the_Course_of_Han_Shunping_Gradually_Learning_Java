//DNX写于2024年1月20日
public class Array
{
	public static void main(String[] args)
	{
		//案例：一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。
		//请问这六只鸡的总体重是多少？平均体重是多少？请你编一个程序。
		//解读：
		//1. double[] 表示是 double 类型的数组，数组名是 hens。
		//2. {3, 5, 1, 3.4, 2, 50} 表示数组的 值/元素，
		//	依次表示数组的第几个元素。
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		double totalWeight = 0;

		//遍历数组得到数组的所有元素的和，使用for。
		//提示：可以通过 数组名.length 得到数组的 大小/长度。
		System.out.println("数组的长度 = " + hens.length);

		for(int i = 0; i < hens.length; i++)
		{
			System.out.println("第" + (i+1) + "个元素的值 = " + hens[i]);
			totalWeight = totalWeight + hens[i];
		}

		System.out.println("总体重 = " + totalWeight + "，平均体重 = " + (totalWeight / hens.length));
	}
}