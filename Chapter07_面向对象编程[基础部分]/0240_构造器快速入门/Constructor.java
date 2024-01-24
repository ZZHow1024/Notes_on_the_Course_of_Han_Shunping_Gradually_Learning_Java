//DNX写于2024年1月23日
public class Constructor
{
	public static void main(String[] args)
	{
		//案例：
		Person p1 = new Person("Jack", 18);

		System.out.println("p1的信息：");
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
	}
}

class Person
{
	String name;
	int age;

	public Person(String pName, int pAge)
	{
		name = pName;
		age = pAge;
		System.out.println("构造器被调用，已完成对象的属性初始化。");
	}
}