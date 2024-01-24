//DNX写于2024年1月22日
public class CloneObject
{
	public static void main(String[] args)
	{
		//案例：编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。
		//要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同。

		Person p = new Person();
		p.name = "Jack";
		p.age = 10;

		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);

		System.out.println("p的属性： name = " + p.name + "，age = " + p.age);
		System.out.println("p2的属性： name = " + p2.name + "，age = " + p2.age);
		System.out.println("p和p2是同一个对象吗？" + (p == p2));
	}
}

class Person
{
	String name;
	int age;
}

class MyTools
{
	public Person copyPerson(Person p)
	{
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;

		return p2;
	}
}