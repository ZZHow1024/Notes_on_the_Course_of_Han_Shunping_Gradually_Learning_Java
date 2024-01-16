//DNX写于2024年1月16日
//演示转义字符的使用
public class ChangeChar{

	public static void main(String[] args){

//1. \t   一个制表位，实现对齐的功能
		System.out.println("\n\\t演示");
		System.out.println("abc\tABC\tabc");

//2. \n   换行符
		System.out.println("\n\\n演示");
		System.out.println("abc\nABC\nabc");

//3. \\   一个\
		System.out.println("\n\\\\演示");
		System.out.println("abc\\ABC\\abc");

//4. \"   一个"
		System.out.println("\n\\\"演示");
		System.out.println("abc\"ABC\"abc");

//4. \'   一个'
		System.out.println("\n\\\'演示");
		System.out.println("abc\'ABC\'abc");

//5. \r   一个回车
	//解读：
	//1.输出 Java
	//2.\r表示回车，将光标定位在当前行的最前方
	//3.继续输出后面的字符 DNX
		System.out.println("\n\\r演示");
		System.out.println("Java\rDnx");
	}
}