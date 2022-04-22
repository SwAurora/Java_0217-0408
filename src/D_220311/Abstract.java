package D_220311;

abstract class Pokemon
{
	String name;
	abstract void attack();
	abstract void sound();
}

class Pikachu extends Pokemon
{
	public Pikachu(String name) 
	{
		this.name = name;
	}
	@Override
	void attack() 
	{
		System.out.println("100만 볼트~!!");
	}
	@Override
	void sound() 
	{
		System.out.println("피카피카@@");
	}
}

public class Abstract 
{

	public static void main(String[] args) 
	{
		Pikachu pikachu = new Pikachu("피카피");
		System.out.println(pikachu.name);
		pikachu.attack();
	}

}
