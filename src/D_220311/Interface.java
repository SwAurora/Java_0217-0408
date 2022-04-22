package D_220311;

interface Pokemon2
{
	/*final*/ String name = "포켓몬";
	/*abstract*/void attack();
	/*abstract*/void sound();
}

interface TEST
{
	
}

class P
{
	
}

class Pikachu2 extends P implements Pokemon2, TEST
{
	@Override
	public void attack()
	{
		System.out.println("100만 볼트~!!");
	}
	@Override
	public void sound() 
	{
		System.out.println("피카피카@@");
	}
}

public class Interface 
{

	public static void main(String[] args) 
	{
		Pikachu2 pikachu = new Pikachu2();
		System.out.println(pikachu.name);
		pikachu.attack();
		pikachu.sound();
	}

}
