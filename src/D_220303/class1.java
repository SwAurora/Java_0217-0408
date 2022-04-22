package D_220303;

class Student
{
	String name;
	int age;
}


public class class1 
{
	public static void main(String[] args) 
	{
		Student james = new Student();
		Student tom = new Student();

		james.name = "james";
		james.age = 15;
		
		System.out.println(james.name);
		System.out.println(james.age);
		
		System.out.println(tom.name);
		System.out.println(tom.age);
	}
}
