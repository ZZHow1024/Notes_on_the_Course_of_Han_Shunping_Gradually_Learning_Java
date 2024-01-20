//DNX写于2024年1月20日
import java.util.Scanner;

public class BreakExer
{
	public static void main(String[] args)
	{
		//案例：实现登录验证，有3次机会，如果用户名为”admin”，
		//密码为”password"提示登录成功，否则提示还有几次机会，
		//请使用 for + break 完成。
		String username;
		String password;
		int chance = 3;

		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < chance; i++)
		{
			System.out.println("请输入用户名：");
			username = myScanner.next();
			System.out.println("请输入密码：");
			password = myScanner.next();
			//比较输入的名字和密码是否正确。
			//补充：字符串的内容比较 应使用 equals 方法。
			if("admin".equals(username) && "password".equals(password))
			{
				System.out.println("登录成功！");
				break;
			}

			//登录的机会就减少一次。
			System.out.println("用户名或密码错误，你还有" + (chance-i-1) + "次机会！");
		}
	}
}