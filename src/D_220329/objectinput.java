package D_220329;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Person implements Serializable
{
	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}

public class objectinput 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fout = new FileInputStream("object.dat");
		ObjectInputStream oos = new ObjectInputStream(fout);
		Person person = (Person) oos.readObject();
		
		System.out.println(person.name);
		System.out.println(person.age);
	}

}
