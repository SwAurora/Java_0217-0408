package D_220308;

class Calculator
{
	int plus(int num1, int num2)//갯수나 자료형 둘중하나는 달라야함
	{
		return num1+num2;
	}
	int plus(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	double plus(double num1, double num2)
	{
		return num1+num2;
	}
}

public class Overloading
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		System.out.println(calc.plus(1, 5));
		System.out.println(calc.plus(1, 5, 100));
		System.out.println(calc.plus(110.5, 4.5));
	}
	
}