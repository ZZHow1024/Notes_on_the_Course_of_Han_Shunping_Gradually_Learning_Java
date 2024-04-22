//ZZHow写于2024年1月18日
public class StringToBasicDetail{
	public static void main(String[] args){

		//正常 String -> int
		String str1 = "123";
		int n1 = Integer.parseInt(str1);
		System.out.println(n1);

		//会出异常的 String -> int
		String str2 = "hello";
		int n2 = Integer.parseInt(str2);
		System.out.println(n2);
	}
}