//DNX写于2024年1月23日
import java.util.Scanner;

public class HanoiTower
{
	public static void main(String[] args)
	{
		//案例：汉诺塔
		Scanner myScanner = new Scanner(System.in);
		Hanoi myHanoi = new Hanoi();
		
		System.out.println("==汉诺塔演示==");
		System.out.print("请输入要计算的盘数：");
		int num = myScanner.nextInt();

		myHanoi.move(num, 'A', 'B', 'C');
	}
}

class Hanoi
{
	public static void move(int num, char a, char b, char c)
	{
		if(num == 1)
		{
			System.out.println(a + " -> " + c);
		}
		else
		{
			move(num - 1, a, c, b);
			System.out.println(a + " -> " + c);
			move(num - 1, b, a, c);
		}
	}
}