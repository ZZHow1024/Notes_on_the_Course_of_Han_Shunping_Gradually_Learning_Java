//DNX写于2024年1月22日
public class Object
{
	public static void main(String[] args)
	{
		//案例：面向对象（OOP）的方式解决养猫问题。
		//实例化一只猫[创建一只猫对象]。

		// 1. new Cat() 创建一只猫。
		// 2. Cat cat1 = new Cat(); 把创建的猫赋给cat1。

		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 5;
		cat2.color = "花色";

		//访问对象的属性：
		System.out.println("第1只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第2只猫的信息：" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

//定义一个猫类 Cat -> 自定义的数据类型
class Cat
{
	//属性：
	String name;
	int age;
	String color;
}