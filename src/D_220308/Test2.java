package D_220308;

class Shop2
{
	static int total;
	
	static void calc_menu(String menu, int count)
	{
		switch(menu)
		{
		case "떡볶이":
			total += 3000 * count;
			break;
		case "김밥":
			total += 2000 * count;
			break;
			
		case "튀김":
			total += 500 * count;
			break;
		case "순대":
			total += 1000 * count;
			break;
		}
	}
	
	static void sales(String menu)
	{
		calc_menu(menu, 1);
	}
	static void sales(String menu,int count)
	{
		calc_menu(menu, count);
	}
	static void sales(String menu,int count, String menu2, int count2)
	{
		calc_menu(menu, count);
		calc_menu(menu2, count2);
	}
}

public class Test2
{
	public static void main(String[] args)
	{
		Shop2.sales("떡볶이");
		Shop2.sales("김밥", 2);
		Shop2.sales("튀김", 5);
		Shop2.sales("순대", 3, "김밥", 4);
		System.out.println("총 매출: " + Shop2.total + "원");
	}
}