//DNX写于2024年1月19日
import java.util.Scanner;

public class If01{
	public static void main(String[] args){

		//案例：编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，就输出“年龄大于18岁！”。
		//思路分析：
		//1. 接收输入的年龄，定义一个 Scanner 对象。
		//2. 把年龄保存到一个变量 int age 。
		//3. 使用 if 判断，输出对应信息。
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();

		if(age > 18){
			System.out.println("年龄大于18岁！");
		}
		System.out.println("程序继续向下运行：）");
	}
}