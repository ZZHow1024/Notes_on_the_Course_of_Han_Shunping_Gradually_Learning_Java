//DNX写于2024年1月19日
import java.util.Scanner; // 表示把java.util下的Scanner类导入。

public class Input{
	public static void main(String[] args){

		//实现可以从控制台接收用户信息[姓名，年龄，成绩]。
		//步骤：
		//1. 引入/导入 Scanner 类所在的包。
		//2. 创建 Scanner 对象，new 创建一个对象。
		Scanner myScanner = new Scanner(System.in);
		//myScanner就是Scanner类的对象

		//3. 接收用户的输入。
		//注意：当程序执行到next方法时，会等待用户输入。
		System.out.println("请输入姓名："); // 接收输入的字符串
		String name = myScanner.next();
		System.out.println("请输入年龄："); // 接收输入的整数
		int age = myScanner.nextInt();
		System.out.println("请输入成绩：");
		double score = myScanner.nextDouble(); // 接收输入的小数

		System.out.println("\n用户的信息如下");
		System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
	}
}