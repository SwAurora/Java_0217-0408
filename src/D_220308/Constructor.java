package D_220308;

class Bank2
{
	private int account;
	Bank2(int account)
	{
		System.out.println("생성자 실행");
		this.account = account;
	}
	public int getAccount2()
	{
		return account;
	}
}

public class Constructor
{
	public static void main(String[] args)
	{
		Bank2 koreaBank = new Bank2(12345);
		System.out.println(koreaBank.getAccount2());
	}
}