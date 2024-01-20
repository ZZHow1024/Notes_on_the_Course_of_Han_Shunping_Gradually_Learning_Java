public class Or{
	public static void main(String[] args){

		//演示 短路或 使用
		int age = 50;

		System.out.println("短路或测试：");
		if(age > 20 || age < 30){
			System.out.println("ok短路或");
		}

		//演示 逻辑或 使用
		System.out.println("\n逻辑或测试：");
		if(age > 20 | age < 30){
			System.out.println("ok逻辑或");
		}

		//演示 短路或 逻辑或 区别
		System.out.println("\n短路与 逻辑与 区别测试：");
		int a = 3;
		int b = 9;
		// ||短路与: 如果第一个条件为false，则第二个条件不会判断(如果有自增也不会执行)，最终结果为false，效率更高。
		// | 逻辑与: 不管第一个条件是否为false，第二个条件都要判断，效率更低。
		if(a > 1 || ++b < 20){
			System.out.println("ok||");
		}
		System.out.println("短路或：a = " + a + "，b = " + b);
		if(a > 1 | ++b < 20){
			System.out.println("ok|");
		}
		System.out.println("逻辑或：a = " + a + "，b = " + b);
	}
}