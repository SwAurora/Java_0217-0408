package D_220308;

class Person
{
	static int count = 0;
	public Person(String name) 
	{
		System.out.println(name + " is born.");
		Person.count++;
	}

	static int get_population()
	{
		return Person.count;
	}
}


public class StaticTest 
{

	public static void main(String[] args) 
	{
		Person man = new Person("james");
		Person woman = new Person("emily");
		
		System.out.println("전체 인구 수: " + Person.get_population() + "명");
	}

}
