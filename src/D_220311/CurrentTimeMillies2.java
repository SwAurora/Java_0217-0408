package D_220311;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentTimeMillies2
{
	public static void main(String[] args) 
	{
		LocalDate dDate = LocalDate.of(2001, 7, 10);
		LocalTime dTime = LocalTime.now();
		String result = dDate.getDayOfWeek().toString();

		System.out.println(result);
		System.out.println(dTime);
	}
}