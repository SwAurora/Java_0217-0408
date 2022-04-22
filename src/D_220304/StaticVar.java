package D_220304;//클래스 변수, 메소드: static이 붙음 / 클래스 이름으로 호출 or 사용 / 모든 객체가 같은 데이터를 가짐(공유) / 클래스 메소드안에서는 클래스 변수 or 메소드만 사용가능
//인스턴스 변수, 메소드: static이 안붙음 / 객체를 생성해서 사용 / 모든 객체가 다른 데이터를 가짐

class Person
{
	static String country = "한국";
}

public class StaticVar
{
	public static void main(String[] args)
	{
		Person.country = "일본";
		
		Person p1 = new Person();
		
		System.out.println(p1.country);
	}
}