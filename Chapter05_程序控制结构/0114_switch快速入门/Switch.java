//DNX写于2024年1月20日
import java.util.Scanner;

public class Switch{
	public static void main(String[] args){

		/*
		请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
		a表示星期一，b表示星期二 ...
		根据用户的输入显示相应的信息。要求使用 switch 语句完成。

		思路分析：
		1. 接收一个字符 ，创建Scanner对象。
		2. 使用switch 来完成匹配,并输出对应信息。
		*/
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入一个字符(a~g)：");
		char c1 = myScanner.next().charAt(0);

		switch(c1){
			case 'a':
				System.out.println("星期一。");
				break;
			case 'b':
				System.out.println("星期二。");
				break;
			case 'c':
				System.out.println("星期三。");
				break;
			case 'd':
				System.out.println("星期四。");
				break;
			case 'e':
				System.out.println("星期五。");
				break;
			case 'f':
				System.out.println("星期六。");
				break;
			case 'g':
				System.out.println("星期日。");
				break;
			default:
				System.out.println("输入错误，没有匹配的字符。");
		}

		System.out.println("退出了switch语句。");
	}
}