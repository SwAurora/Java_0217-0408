package D_220315;

import javax.swing.*;
import java.awt.*;

public class GUI_3 extends JFrame
{
	public GUI_3() 
	{
		
		/*this.*/setTitle("Program");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");//button.setText("BUTTON");
		JButton button2 = new JButton("Button2");
		/*this.*/add(button);
		add(button2);
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_3();	
	}

}
