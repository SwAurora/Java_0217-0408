package D_220311;

public class Exception3
{
	public static void throwsTest() throws Exception
	{
		Exception e = new Exception();
		throw e;
	}
	public static void main(String[] args) throws Exception
	{
		throwsTest();
	}
}