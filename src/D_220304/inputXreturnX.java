package D_220304;//input = 인수 , return = 반환값

class Student
{
	void welcome()
	{
		System.out.println("환영합니다");
		System.out.println("메소드 끝");
	}
}

public class inputXreturnX 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.welcome();//괄호 있으면 메소드
		s2.welcome();
	}
}
