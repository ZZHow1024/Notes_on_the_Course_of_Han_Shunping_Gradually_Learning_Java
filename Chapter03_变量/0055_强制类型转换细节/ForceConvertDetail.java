//DNX写于2024年1月18日
public class ForceConvertDetail{
	public static void main(String[] args){

		//演示强制类型转换
	  //int x = (int)10 * 3.5 + 6 * 1.5;//编译错误 double -> int
		int x = (int)(10 * 3.5 + 6 * 1.5);// (int)44.0 -> 44
		System.out.println(x);//44

		char c1 = 100;// √
		int m = 100;// √
	  //char c2 = m;// ×
		char c3 = (char)m;// √
		System.out.println(c3);//100对应的字符，d
	}
}