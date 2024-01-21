//DNX写于2024年1月21日
import java.util.Scanner;

public class ArrayMethod01
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);

		double score[] = new double[5];

		for(int i = 0; i < (score.length); i++)
		{
			System.out.println("请输入第" + (i+1) + "名同学的成绩：");
			score[i] = myScanner.nextDouble();
		}

		System.out.println("==现在开始输出成绩==");
		for(int i = 0; i < (score.length); i++)
		{
			System.out.println("请输入第" + (i+1) + "名同学的成绩：" + score[i]);
		}
	}
}