package D_220311;

class AgeException extends Exception
{
	public AgeException(String message) 
	{
		super(message);//부모 클래스의 생성자 호출
	}
}

public class Exception4
{
	public static void main(String[] args)
	{
		try 
		{
			AgeException ageExcep = new AgeException("이건 메세지");
			throw ageExcep;
		} 
		catch (Exception e) 
		{
			System.out.println("age Exception 발생");
			System.out.println(e);
		}
	}
}


