package D_220322;

class Ticketing
{
	int TicketNum = 1;
	
	public synchronized void ticketing()
	{
//		synchronized (this) 
//		{
//			System.out.println(); // 이 구문만 동기화 거는 법
//		}
		
		System.out.println(Thread.currentThread().getName() + "가 티켓팅 시도. 남은 티켓 수는 " + TicketNum);
		
		if(TicketNum > 0)
		{
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공!");
			TicketNum--;
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + "가 티켓팅 실패.");
		}
	}
}
	
class Person implements Runnable
{
	Ticketing ticketClass = new Ticketing();
	
	public void run()
	{
		ticketClass.ticketing();
	}
}

public class TicketingTest
{
	public static void main(String[] args)
	{
		Person runnable = new Person();
		Thread james = new Thread(runnable, "james");
		Thread tom = new Thread(runnable, "tom");
		Thread terry = new Thread(runnable, "terry");
		
		james.start();
		tom.start();
		terry.start();
	}
}