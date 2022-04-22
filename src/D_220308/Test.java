package D_220308;

class Shop
{
	static int total = 0;
	
	static void howMuch(String menu)
	{
		if(menu.equals("떡볶이"))
		{
			Shop.total += 3000;
		}
		else if(menu.equals("순대"))
		{
			Shop.total += 1000;
		}
		else if(menu.equals("튀김"))
		{
			Shop.total += 500;
		}
		else if(menu.equals("김밥"))
		{
			Shop.total += 2000;
		}
	}
	
	static void sales(String menu)
	{
		howMuch(menu);
	}
	
	static void sales(String menu, int EA)
	{
		for (int i = 0; i < EA; i++)
		{
			howMuch(menu);
		}
	}
	
	static void sales(String menu, int EA, String menu2, int EA2)
	{
		for (int i = 0; i < EA; i++)
		{
			howMuch(menu);
		}
		for (int i = 0; i < EA2; i++)
		{
			howMuch(menu2);
		}
	}
	
}

public class Test 
{

	public static void main(String[] args) 
	{
		Shop.sales("떡볶이");//3000
		Shop.sales("김밥", 2);//4000
		Shop.sales("튀김", 5);//2500
		Shop.sales("순대", 3, "김밥", 4);//11000
		System.out.println("총 매출: " + Shop.total + "원");//20500
	}

}
