//DNX写于2024年1月17日
public class CharDetail{
	public static void main(String[] args){

		//在Java中，char的本质是一个整数，在输出时，是Unicode码对应的字符。
		char c1 = 97;
		System.out.println("c1 = " + c1);// a

		char c2 = 'a';
		System.out.println("'a'对应的Unicode码 = " + (int)c2);// a
		char c3 = '人';
		System.out.println("'人'对应的Unicode码 = " + (int)c3);// 20154
		char c4 = 20154;
		System.out.println("Unicode码20154对应的字符 = " + c4);// 人

		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。
		System.out.println("'a' + 10 = " + ('a' + 10));// 107

		//课堂小测试
		System.out.println("\n课堂小测试");
		char c5 = 'b' + 1;//98 + 1 = 99
		System.out.println((int)c5);// 99
		System.out.println(c5);// 99 --> 对应的字符 --> 编码表ASCII(规定好的) --> c
	}
}