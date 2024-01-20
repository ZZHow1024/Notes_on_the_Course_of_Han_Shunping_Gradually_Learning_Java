//DNX写于2024年1月18日
public class ArithmeticOperator{
	public static void main(String[] args){

		//算数运算符使用
		System.out.println("除法测试：");
		System.out.println("10 / 4 = " + (10 / 4));// 2
		System.out.println("10.0 / 4 = " + (10.0 / 4));// 2.5

		double d = 10 / 4;// Java中 10 / 4 = 2, 2 -> 2.0
		System.out.println("10.0 / 4 = " + d);// 2.0

		// % 取模（取余数）运算符使用
		// % 的本质： a % b = a - a / b * b
		//-10 % 3 = -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println("\n取模测试：");
		System.out.println("10 % 3 = " + (10 % 3));    // 1
		System.out.println("-10 % 3 = " + (-10 % 3));  //-1
		System.out.println("10 % -3 = " + (10 % -3));  // 1
		System.out.println("-10 % -3 = " + (-10 % -3));//-1

		// 自增运算符使用
		System.out.println("\n自增测试：");
		int i = 10;
		i++;// 自增 等价于 i = i + 1; -> i = 11
		++i;// 自增 等价于 i = i + 1; -> 1 = 12
		System.out.println("i = " + i);//12
		/*
		当作为表达式使用时
		前++：++i先自增，后赋值。
		后++：i++先赋值，后自增。
		*/
		int j = 8;
	  //int k = ++j; // 等价于 j = j + 1; k = j;
		int k = j++; // 等价于 k = j; j = j + 1;
		System.out.println("k = " + k + "，j = " + j);// k = 8，j = 9
	}
}