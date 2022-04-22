package D_220310;

class Animal3
{
	void run()
	{
		System.out.println("달리기");
	}
}

class Lion3 extends Animal3
{
	void jump()
	{
		System.out.println("점프");
	}
	@Override
	void run()
	{
		super.run();
		System.out.println("마구달리기");
	}
}

public class overRiding
{
	public static void main(String[] args)
	{
		Lion3 l1 = new Lion3();
		
		l1.jump();
		l1.run();
	}
}
