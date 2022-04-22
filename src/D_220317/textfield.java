package D_220317;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfield extends JFrame implements ActionListener
{
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	public textfield() 
	{
		setSize(1000, 500);
		setLayout(new FlowLayout());

		text1.addActionListener(this);
		text2.setEditable(false);
		
		add(text1);
		add(text2);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int number = Integer.valueOf(text1.getText());
		text2.setText(Math.pow(number, 2) + "");
	}
	
	public static void main(String[] args)
	{
		textfield frame = new textfield();//frame이 최상위 컨테이너
	}
}
