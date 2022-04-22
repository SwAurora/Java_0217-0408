package D_220304;

class Book
{
	String Bookname, Writer;
	
	void set_spec(String _Bookname, String _Writer)
	{
		Bookname = _Bookname;
		Writer = _Writer;
	}
	
	void print_info()
	{
		System.out.println("책 제목: " + Bookname);
		System.out.println("책 저자: " + Writer);
	}
}

public class BookInformation
{
	public static void main(String[] args)
	{
		Book book1 = new Book();//new Book();이 객체 생성 book1이라는 변수에 삽입
		Book book2 = new Book();
		
		book1.set_spec("파이썬", "민경태");
		book2.set_spec("어린왕자", "생택쥐페리");
		
		book1.print_info();
		book2.print_info();
	}
}