//DNX写于2024年月22日
public class Method
{
	public static void main(String[] args)
	{
		Person p = new 	Person();

		p.speak();
		p.cal01();
		p.cal02(5);
		int returnRes = p.getSum(10, 20);
		System.out.println("getSum方法的返回值 = " + returnRes);
	}
}

class Person
{
	/*
	解读：
	1. public 表示方法是公开的。
	2. void 表示方法没有返回值。
	3. speak() speak是方法名，()是形参列表。
	4. {}是方法体，可以写要执行的代码。
	5. System.out.println("我是一个好人"); 表示这个方法就是输出一句话。
	*/
	public void speak()
	{
		System.out.println("我是一个好人");
	}

	public void cal01()
	{
		int res = 0;
		for(int i = 1; i <= 1000; i++)
		{
			res += i;
		}
		System.out.println("1 + … + 1000 = " + res);
	}

	public void cal02(int n)
	{
		int res = 0;
		for(int i = 1; i <= n; i++)
		{
			res += i;
		}
		System.out.println("1 + … + " + n + " = " + res);
	}

	public int getSum(int n1, int n2)
	{
		int res = n1 + n2;
		return res;
	}
}