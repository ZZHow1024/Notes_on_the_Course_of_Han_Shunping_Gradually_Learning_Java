//DNX写于2024年1月19日
public class TernaryOperatorExer01{
	public static void main(String[] args){

		//案例：实现求三个数的最大值。
		int n1 = 11;
		int n2 = 22;
		int n3 = 33;
		//思路：
		//1.先得到 n1 和 n2 中最大的数，保存到 max1 中。
		//2.然后再求出 max1 和 n3 中的最大数，保存到 max2 中。

		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数为：" + max2);

		//使用一条语句实现以上功能，但更推荐上面的方法。
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数为：" + max);
	}
}