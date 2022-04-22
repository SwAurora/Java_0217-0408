package D_220315;

import javax.swing.*;
import java.awt.*;

public class GUI_4 extends JFrame
{
	public GUI_4() 
	{
		
		/*this.*/setTitle("Programming");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		JPanel mainPanel = new JPanel();
		JPanel aPanel = new JPanel();
		JLabel label = new JLabel("배우고싶은 프로그래밍 언어 선택");
		JPanel bPanel = new JPanel();
		
		JButton button1 = new JButton("C");
		JButton button2 = new JButton("Java");
		JButton button3 = new JButton("Python");
		JLabel label2 = new JLabel("시간");
		JTextField field = new JTextField(20);
		mainPanel.add(aPanel);
		mainPanel.add(bPanel);
		aPanel.add(label);
		bPanel.add(button1);
		bPanel.add(button2);
		bPanel.add(button3);
		bPanel.add(label2);
		bPanel.add(field);
		
		add(mainPanel);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_4();	
	}

}
