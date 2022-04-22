package D_220311;

import java.time.LocalDate;

public class timeTest
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 24;
		
		LocalDate Date = LocalDate.of(2016, a, b);
		String result = Date.getDayOfWeek().toString();
	
		String finalresult = result.substring(0,3);
		System.out.println(finalresult);
	}
}