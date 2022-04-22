package D_220310;

class Animal
{
	void run()
	{
		System.out.println("달리기");
	}
}

class Lion extends Animal
{
	void jump()
	{
		System.out.println("점프");
	}
}

public class Inheritance 
{
	public static void main(String[] args)
	{
		Lion l1 = new Lion();
		l1.jump();
		l1.run();
	}
}
