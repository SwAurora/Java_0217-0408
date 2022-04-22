package D_220304;

import java.util.Scanner;

class CoffeeMachine
{
	int calc_change(String coffee, int money)
	{
		int menu = 0;
		switch(coffee)//메뉴에 있는지 검사하고 메뉴 가격 결정
		{
		case "아메리카노":
			menu = 1000;
			break;
		case "카페라떼":
			menu = 1500;
			break;
		case "카푸치노":
			menu = 2000;
			break;
		default:
			System.out.println("그런 메뉴는 없습니다");
			return money;
		}
		
		if(money < menu)//메뉴보다 적은 돈을 냈다면
		{
			System.out.println("금액이 부족합니다.");
			return money;
		}
		//메뉴 잘 선택했고 돈도 잘냈을 때
		return money-menu;
	}
}


public class CoffeeMachineProgram                   
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("주문할 커피의 종류를 입력하세요 >> ");
		String coffee = input.next();
		
		System.out.print("지불할 돈을 입력하세요 >> ");
		int money = input.nextInt();
		
		CoffeeMachine cm = new CoffeeMachine();
		
		int change = cm.calc_change(coffee,money);
		System.out.println("잔돈은 " + change + "입니다.");
	}
}
