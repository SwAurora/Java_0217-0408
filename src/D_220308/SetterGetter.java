package D_220308;

class Bank
{
	private int account;
	private String password;
	
	public void setAccount(int account)//setter
	{
		this.account = account;
	}
	
	public int getAccount()//getter

	{
		return account;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getPassword() 
	{
		return password;
	}
}

public class SetterGetter
{
	public static void main(String[] args)
	{
		Bank koreaBank = new Bank();
		koreaBank.setAccount(12345);
		System.out.println(koreaBank.getAccount());
	}
}