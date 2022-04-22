package D_220315;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_8 extends JFrame 
{
	JButton button;
	JButton button2;
	
	public GUI_8() 
	{
		
		/*this.*/setTitle("Programming");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		setLayout(new FlowLayout());
		
		this.button = new JButton("이벤트 버튼");
		this.button2 = new JButton("이벤트 버튼");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				button.setBackground(Color.blue);
				button2.setBackground(Color.white);
			}
		});
		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				button.setBackground(Color.red);
				button2.setBackground(Color.white);
			}
		});
		add(button);
		add(button2);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_8();	
	}

}
