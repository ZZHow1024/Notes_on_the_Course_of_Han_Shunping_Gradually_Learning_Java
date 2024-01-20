//DNX写于2024年1月20日
public class Break
{
	public static void main(String[] args)
	{
		//案例：随机生成1-100的一个数，直到生成了97这个数，看看你一共用了几次？
		int randomInt;
		int count = 0;

		for(;;)
		{
			randomInt = (int)(Math.random() * 100) + 1;
			System.out.println(randomInt);
			++count;

			if(randomInt == 97)
			{
				System.out.println("生成了97这个数，一共用了" + count + "次");
				break;
			}
		}
	}
}