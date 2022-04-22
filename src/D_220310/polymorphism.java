package D_220310;

class Animal4
{
	void breath()
	{
		System.out.println("숨쉬기");
	}
}

class Lion4 extends Animal4
{
	@Override
	public String toString()//toString() 메소드는 object클래스에서 오버라이딩
	{
		return "사자";
	}
}

class Rabbit extends Animal4
{
	public String toString()
	{
		return "토끼";
	}
}

class Monkey extends Animal4
{
	public String toString()
	{
		return "원숭이";
	}
}

class ZooKeeper
{
	void feed(Animal4 animal)
	{
		System.out.println(animal/*.toString()*/ + "에게 고기 주기");
	}
}
public class polymorphism
{

	public static void main(String[] args) 
	{
		ZooKeeper james = new ZooKeeper();
		Lion4 lion = new Lion4();
		Rabbit rabbit = new Rabbit();
		Monkey monkey = new Monkey();
		System.out.println(lion);
		james.feed(lion);
		james.feed(rabbit);
		james.feed(monkey);
	}

}
