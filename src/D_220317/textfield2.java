package D_220317;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textfield2 extends JFrame implements ActionListener
{
	JTextField text1 = new JTextField(20);
	JTextArea area = new JTextArea(10,20);
	public textfield2() 
	{
		setSize(1000, 500);
		setLayout(new FlowLayout());

		text1.addActionListener(this);
		
		add(text1);
		add(area);
		
		area.append("이것은 채팅방입니다 ------" + "\n");
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		area.append(text1.getText() + "\n");
	}
	
	public static void main(String[] args)
	{
		textfield2 frame = new textfield2();//frame이 최상위 컨테이너
	}
}
