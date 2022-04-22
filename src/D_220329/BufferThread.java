package D_220329;

class Buffer
{
	private int data; //매대에 놓여진 실제 데이터
	private boolean empty = true; //매대가 비었는지 검사하는 변수
	
	public synchronized int get()
	{
		while(empty)//만약 매대가 비었으면
		{
			try 
			{
				wait();//데이터가 존재할 때까지 대기
			}
			catch(InterruptedException e)
			{
				
			}
		}
		//여기 까지 왔으면 데이터가 생겨서 스레드가 깨워졌다는 뜻
		empty = true;//데이터를 가져갔다
		notifyAll();//대기중인 모든 스레드(생산자)를 깨운다
		return data; //가져온 데이터를 반환
	}
	
	public synchronized void put(int data)
	{
		while(!empty)//매대가 비지 않았다면
		{
			try 
			{
				wait();//데이터가 없어질 때까지 대기
			}
			catch(InterruptedException e)
			{
				
			}
		}
		//여기 까지 왔으면 데이터가 사라져서 스레드가 깨워졌다는 뜻
		empty = false;//데이터를 놔뒀다
		this.data = data;
		notifyAll();//대기중인 모든 스레드(소비자)를 깨운다
	}
}

class Producer implements Runnable
{
	private Buffer buffer;//버퍼 클래스의 객체. 변수만 존재
	
	public Producer(Buffer buffer)
	{
		this.buffer = buffer;//버퍼 클래스의 객체 데이터 갱신
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			buffer.put(i);//i번째 케이크를 매대에 put
			System.out.println("생산자: " + i + "번째 케이크를 생산하였음");
			
			try
			{
				Thread.sleep((int)(Math.random() * 100));//잠깐 스레드를 쉬게함
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class Consumer implements Runnable
{
	private Buffer buffer;//버퍼 클래스의 객체. 변수만 존재
	
	public Consumer(Buffer buffer)
	{
		this.buffer = buffer;//버퍼 클래스의 객체 데이터 갱신
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("소비자: " + buffer.get() + "번째 케이크를 소비하였음");
			
			try
			{
				Thread.sleep((int)(Math.random() * 100));//잠깐 스레드를 쉬게함
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class BufferThread 
{
	
	public static void main(String[] args) 
	{
		Buffer buffer = new Buffer();//매대 생성
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}

}