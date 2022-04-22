package D_220311;

//관광사 프로그램
//관광 상품
interface Providable//인터페이스는 객체를 만들수없음
{
	void leisure();//레저 투어 관광상품
	void sight();//둘러보는 관광상품
	void food();//음식 투어 관광상품
}
//우리가 만든 관광상품 설계도를 구현하는 KoreaTour
class KoreaTour implements Providable
{
	@Override
	public void leisure() 
	{
		System.out.println("한강 수상스키 투어");
	}
	@Override
	public void sight() 
	{
		System.out.println("경복궁 투어");
	}
	@Override
	public void food() 
	{
		System.out.println("삼겹살 파티");
	}
}

class JapanTour implements Providable
{
	@Override
	public void leisure() 
	{
		System.out.println("도쿄 번지점프 투어");
	}
	@Override
	public void sight() 
	{
		System.out.println("도쿄타워 투어");
	}
	@Override
	public void food() 
	{
		System.out.println("초밥 파티");
	}
}

class TourGuide
{
	private Providable tour = new /*Korea*/JapanTour();
	
	public void leisure_guide()
	{
		tour.leisure();
	}
	
	public void sight_guide()
	{
		tour.sight();
	}
	
	public void food_guide()
	{
		tour.food();
	}
}

public class TourProgram
{
	public static void main(String[] args)
	{
		TourGuide guide = new TourGuide();
		guide.leisure_guide();
		guide.sight_guide();
		guide.food_guide();
	}
}