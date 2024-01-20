public class RelationalOperator{
	public static void main(String[] args){

		//演示 关系运算符 使用
		System.out.println("关系运算符测试：");

		int a = 9;
		int b = 8;
		System.out.println(a > b); // true
		System.out.println(a >= b);// true
		System.out.println(a <= b);// false
		System.out.println(a < b); // false
		System.out.println(a == b);// false
		System.out.println(a != b);// true

		boolean flag = a > b; // true
		System.out.println("flag = " + flag);
	}
}