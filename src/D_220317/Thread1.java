package D_220317;

class MyThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 100; i++) 
		{
			System.out.println("스레드 실행");
		}
	}
}

class MyRunnable implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 100; i++) 
		{
			System.out.println("러너블 실행");
		}
	}
}

class Thread1
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();//start는 한번만 되고 끝나면 위에 객체 t는 죽음
		
		MyRunnable r = new MyRunnable();
		Thread rt = new Thread(r);
		rt.start();//러너블 객체를 start
		
		for (int i = 0; i < 100; i++) 
		{
			System.out.println("메인 실행");
		}
	}
}