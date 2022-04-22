package D_220217;

public class class5
{

	public static void main(String[] args) 
	{
		int num1 = 150;
		int num2 = 240;
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		double divide =  (double)num1 / num2;
		
		System.out.println(num1 + " + " + num2 + " = " + plus);
		System.out.println(num1 + " - " + num2 + " = " + minus);
		System.out.println(num1 + " * " + num2 + " = " + multiple);
		System.out.println(num1 + " / " + num2 + " = " + divide);
		
		boolean result = ((num2 * num2 * num2) / num1) >= 10;
		System.out.println("결과: " +result);
		
		int fx = 2;
		int result2 = 7*fx*fx*fx - 9*fx -2;
		System.out.println("f(" + fx + ") = " + result2);
	}

}
