package D_220315;

import javax.swing.*;
import java.awt.*;

public class GUI_5 extends JFrame
{
	public GUI_5() 
	{
		
		/*this.*/setTitle("Programming");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		setLayout(new GridLayout(0,3,10,0));
		
		add(new JButton("test1"));
		add(new JButton("test2"));
		add(new JButton("test3"));
		add(new JButton("test4"));
		add(new JButton("test5"));
		add(new JButton("test6"));
		add(new JButton("test7"));
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_5();	
	}

}
