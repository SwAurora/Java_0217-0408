package D_220304;

//class 안에서는 변수를 만들거나 메소드만 만들 수 있음*
class Student4
{
	int welcome(int number/*매개변수*/, int number2)
	{
		return number + number2;
	}
}

public class inputOreturnO                   
{
	public static void main(String[] args) 
	{
		Student4 s1 = new Student4();
		
		int result = s1.welcome(15,20);
		int result2 = s1.welcome(100, 500);
		System.out.println(result);
		System.out.println(result2);
	}
}
