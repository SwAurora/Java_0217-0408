package D_220405;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessengerB
{
	class MyFrame extends JFrame implements ActionListener
	{
		public MyFrame()
		{
			super("MessengerB");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			textField = new JTextField(30);
			textField.addActionListener(this);

			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);

			this.add(textArea, BorderLayout.CENTER);
			this.add(textField, BorderLayout.PAGE_END);

			pack();
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
																								
			try
			{
				socket.send(packet);
			}
			catch(Exception e2)
			{
				System.out.println("패킷 전송 중 문제가 발생함");
			}
			textArea.append("SENT: " + s + "\n");

		}
	}

	JTextField textField;
	JTextArea textArea;

	DatagramSocket socket;
	DatagramPacket packet;

	InetAddress address = null;

	int myPort = 6100;
	int otherPort = 5100;

	public MessengerB() throws Exception
	{
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("127.0.0.1");
		socket = new DatagramSocket(myPort);
	}

	void process()
	{
		while(true)
		{
			byte[] buf = new byte[256];
			packet = new DatagramPacket(buf, buf.length);

			try
			{
				socket.receive(packet);
			}
			catch(IOException e)
			{
				System.out.println("패킷을 받는 도중 문제가 생김");
			}
			textArea.append("RECEIVED: " + new String(buf) + "\n");
		}
	}

	public static void main(String[] args) throws Exception
	{
		new MessengerB().process();
	}

}
