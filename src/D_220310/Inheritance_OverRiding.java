package D_220310;

class Bank
{
	double getInterrestRate(int money)
	{
		return 0;
	}
}

class GoodBank extends Bank
{
	@Override
	double getInterrestRate(int money) 
	{
		return money * 0.1;
	}
}

class NormalBank extends Bank
{
	@Override
	double getInterrestRate(int money) 
	{
		return money * 0.05;
	}
}

class BadBank extends Bank
{
	@Override
	double getInterrestRate(int money) 
	{
		return money * 0.03;
	}
}

public class Inheritance_OverRiding
{
	public static void main(String[] args)
	{
		int money = 200;
		
		GoodBank gb = new GoodBank();
		NormalBank nb = new NormalBank();
		BadBank bb = new BadBank();

		System.out.println("200원의 GoodBank 이자: " + gb.getInterrestRate(money) + "원");
		System.out.println("200원의 NormalBank 이자: " + nb.getInterrestRate(money) + "원");
		System.out.println("200원의 BadBank 이자: " + bb.getInterrestRate(money) + "원");
	}
}
