//ZZHow写于2024年1月16日
public class VarDetail{
	public static void main(String[] args){
		//变量必须先声明，后使用，即有顺序。
		int a = 50;
		System.out.println(a);//50
		//该区域的 数据/值 可以在同一类型范围内不断变化。
	  //a = "Jack";  //×
		a = 88;		 //√
		System.out.println(a);//88

		//变量在同一个作用域内不能重名。
	  //int a = 77;  //×
	}
}

class Dog{
	public static void main(String[] args){
		int a = 55;  //√
		System.out.println(a);//55
	}
}