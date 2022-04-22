package D_220315;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_7 extends JFrame implements ActionListener
{
	JButton button;
	JLabel label;
	
	public void actionPerformed(ActionEvent e)
	{
		button.setText("버튼이 눌려짐");
		label.setText("버튼이 눌려짐");
	}
	
	public GUI_7() 
	{
		
		/*this.*/setTitle("Programming");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		setLayout(new FlowLayout());
		
		this.button = new JButton("이벤트 버튼");
		this.label = new JLabel("이벤트 라벨");
		button.addActionListener(this);
		add(button);
		add(label);
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_7();	
	}

}
