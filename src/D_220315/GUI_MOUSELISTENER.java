package D_220315;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

class MyPanel2 extends JPanel implements KeyListener
{
	Image resizeImage = null;
	int img_x = 100;
	int img_y = 100;
	
	class MyAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
	}
	
	public MyPanel2() 
	{
		
		try
		{
			resizeImage = ImageIO.read(new File("JavaGUI\\run.png"));
		}
		
		catch(Exception e)
		{
			System.out.println("이미지를 찾을 수 없습니다.");
			System.exit(1);
		}
		
		addKeyListener(this);//패널에 KeyListener를 등록
		addMouseListener(new MyAdapter());
		this.requestFocus();//패널이 키 입력을 받을 수 있도록 focus를 받아옴
		setFocusable(true);//키 입력을 받을 수 있는 상태로 만듦
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keyCode = e.getKeyCode();
		switch(keyCode)
		{
		case KeyEvent.VK_UP:
			img_y -= 10;
			break;
		case KeyEvent.VK_DOWN:
			img_y += 10;
			break;
		case KeyEvent.VK_LEFT:
			img_x -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			img_x += 10;
			break;
		}
		repaint();//화면을 다시 그려줌
	}
	
	public void keyReleased(KeyEvent e)
	{
	}
	
	public void keyTyped(KeyEvent e)
	{
	}
	
	public void paintComponent(Graphics g)//컴포넌트들을 다시 그려주는 메소드
	{
		super.paintComponent(g);
		g.drawImage(resizeImage, img_x, img_y, null);//해당 위치에 그림을 그림
	}
}

public class GUI_MOUSELISTENER extends JFrame 
{
	
	public GUI_MOUSELISTENER() 
	{
		
		/*this.*/setTitle("Program");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("JavaGUI\\icon.png");
		setIconImage(image);
		
		MyPanel2 p = new MyPanel2();
		add(p);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GUI_MOUSELISTENER();	
	}

}
