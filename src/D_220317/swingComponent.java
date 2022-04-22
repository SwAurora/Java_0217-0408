package D_220317;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingComponent extends JFrame implements ActionListener
{
	int count = 0;
	JLabel label2 = new JLabel("0");
	
	public swingComponent() 
	{
		setSize(1000, 500);
		setLayout(new FlowLayout());
		
		ImageIcon image = new ImageIcon("JavaGUI\\ques.png");
		JButton button = new JButton("이미지를 보려면 누르세요");
		button.setIcon(image);
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		ImageIcon image = new ImageIcon("JavaGUI\\peng.jpg");
		JButton button = (JButton) e.getSource();
		button.setIcon(image);
		button.setText(null);
	}
	
	public static void main(String[] args)
	{
		swingComponent frame = new swingComponent();//frame이 최상위 컨테이너
	}
}
