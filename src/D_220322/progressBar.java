package D_220322;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MultiThread extends JPanel implements ActionListener //GUI화면을 구성하는 MultiThread 클래스
{
	private JProgressBar progress1, progress2;//프로그래스바 2개
	private JButton startButton;//시작버튼
	
	public MultiThread() 
	{
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		
		progress1 = new JProgressBar(0,1000);
		progress2 = new JProgressBar(0,1000);
		
		progress1.setValue(0);//현재 값을 0으로 세팅
		progress2.setValue(0);
		
		progress1.setStringPainted(true);//현재 value값 표시
		progress2.setStringPainted(true);
		
		add(startButton);
		add(progress1);
		add(progress2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		ProgressThread thread1 = new ProgressThread(progress1, startButton);//스레드를 생성하고 프로그래스바/버튼을 전달
		ProgressThread thread2 = new ProgressThread(progress2, startButton);
		startButton.setEnabled(false);
		thread1.start();
		thread2.start();
	}
}

class ProgressThread extends Thread //프로그래스바 스레드 동작 클래스
{
	JProgressBar jpb; 
	JButton jb;
	
	public ProgressThread(JProgressBar jpb, JButton jb) 
	{
		this.jpb = jpb;
		this.jb = jb;
	}
	
	@Override
	public void run() 
	{
		int current = 0;
		
		while(current <= 1000)
		{
			current += Math.random() * 10; //현재 프로그래스바 value에 1 더함
			try 
			{
				sleep(50);//sleep 쓸려면 try catch 사용해야함
			} 
			catch (Exception e) 
			{
				
			}
			jpb.setValue(current);//프로그래스 바의 value값을 current값으로 설정
		}
		jb.setEnabled(true);
	}
}

public class progressBar
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();//Frame 창 생성
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MultiThread gui = new MultiThread();//Panel 생성
		frame.add(gui);//Frame 창에다가 만든 Panel 추가
		frame.setVisible(true);
	}
}