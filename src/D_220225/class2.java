package D_220225;

import java.util.Scanner;

public class class2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] student = new int[] {5,10,15};
		System.out.println(student);
		int[] test = student;//test에 student의 주소값이 들어감
		test[0] = 100;
		System.out.println(student[0]);
	}
}