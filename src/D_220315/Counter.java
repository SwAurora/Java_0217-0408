package D_220315;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener
{
	private JLabel label, label2;
	private JButton button;
	private int count = 0;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		count++;
		label2.setText(String.valueOf(count));//count+"" 도 가능 .toString()은 객체만 사용가능한데 count가 기본 자료형이어서 안됨
	}
	
	public Counter()
	{
		setTitle("My Counter");
		setSize(350, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		label = new JLabel("Counter");
		label2 = new JLabel(String.valueOf(count));
		label2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 100));
		button = new JButton("카운터 증가");
		button.addActionListener(this);
		add(label);
		add(label2);
		add(button);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Counter();
	}

}
