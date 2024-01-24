//DNX写于2024年1月23日
public class OverLoad
{
	public static void main(String[] args)
	{
		MyCalculator calculator = new MyCalculator();

		System.out.println("1 + 1 = " + calculator.calculate(1, 1));
		System.out.println("1 + 1.8 = " + calculator.calculate(1, 1.8));
		System.out.println("1.8 + 1 = " + calculator.calculate(1.8, 1));
		System.out.println("1 + 1 + 1 = " + calculator.calculate(1, 1, 1));
	}
}

class MyCalculator
{
	public int calculate(int n1, int n2)
	{
		return n1 + n2;
	}
	public double calculate(int n1, double n2)
	{
		return n1 + n2;
	}
	public double calculate(double n1, int n2)
	{
		return n1 + n2;
	}
	public int calculate(int n1, int n2, int n3)
	{
		return n1 + n2 + n3;
	}
}