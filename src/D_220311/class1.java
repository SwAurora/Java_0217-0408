package D_220311;

import java.util.ArrayList;
import java.util.Scanner;

class student
{
	private String name;
	private int grade;
	Scanner input = new Scanner(System.in);
	public student()
	{
		System.out.println("학생의 이름을 입력하세요.");
		this.name = input.next();
		
		System.out.println("학생의 성적을 입력하세요.");
		this.grade = input.nextInt();
	}
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}

}

public class class1
{
	
	public static void main(String[] args)
	{
		int StudentCount = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.println("학생관리프로그램입니다.");
		ArrayList<student> s = new ArrayList<>();
		while(true)
		{
			System.out.println("원하는 기능을 선택하세요.");
			System.out.println("1.학생 추가 및 성적 입력 2.학생 제거 3.성적 수정 4.학생 조회");
			int option = input.nextInt();
			
			if(option == 1)
			{
				s.add(new student());
				StudentCount++;
			}
			
			if(option == 4)
			{
				System.out.println("조회하고 싶은 학생의 이름을 입력하세요.");
				String name = input.next();
				for (int i = 0; i <= StudentCount; i++)
				{
					
					if(s.get(i).getName().equals(name))
					{
						System.out.println((i+1) + "번째 학생으로 등록되어있습니다");
						System.out.println("성적은 " + s.get(i).getGrade() + "점입니다.");
						break;
					}
					
				}
			}
		}
		
	}

}
