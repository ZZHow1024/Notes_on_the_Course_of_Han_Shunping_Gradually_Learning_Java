//ZZHow写于2024年1月17日
public class Char{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '人';
		char c4 = 98; //说明：字符类型可以直接存放一个数字

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);//当输出c4时，会输出97表示的字符 --> 编码的概念
	}
}