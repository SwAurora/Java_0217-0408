package D_220315;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("이벤트 발생!");
	}
}

class MyListener2 implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("이벤트 발생!!");
	}
}

public class GUI_6 extends JFrame
{
	public GUI_6() 
	{
		
		/*this.*/setTitle("Programming");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		setLayout(new FlowLayout());
		
		JButton button = new JButton("이벤트 버튼");
		JButton button2 = new JButton("이벤트 버튼2");
		button.addActionListener(new MyListener());
		button2.addActionListener(new MyListener2());
		add(button);
		add(button2);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_6();	
	}

}
