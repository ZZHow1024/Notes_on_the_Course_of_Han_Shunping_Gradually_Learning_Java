//DNX写于2024年1月18日
public class StringToBasic{
	public static void main(String[] args){

		//基本数据类型 -> String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println("\n基本数据类型 -> String测试：");
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		//String -> 对应的基本数据类型
		String s5 = "123";
		//在OOP 讲对象和方法的时候细说
		//解读 使用 基本数据类型对应的包装类 的 相应方法，得到基本数据类型。
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		short num6 = Short.parseShort(s5);
		boolean b = Boolean.parseBoolean("true");

		System.out.println("\nString -> 对应的基本数据类型测试：");
		System.out.println(num1);// 123
		System.out.println(num2);// 123.0
		System.out.println(num3);// 123.0
		System.out.println(num4);// 123
		System.out.println(num5);// 123
		System.out.println(num6);// 123
		System.out.println(b);// true

		//怎么把字符串转成字符：把字符串的第一个字符取出。
		//解读： s5.charAt(0) 将字符串s5 的 第一个字符 '1' 取出。
		System.out.println("\nString -> char测试：");
		System.out.println(s5.charAt(0));
	}
}