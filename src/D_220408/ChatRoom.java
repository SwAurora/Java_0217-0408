package D_220408;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ChatRoom extends JFrame implements ActionListener, Runnable
{
	String nickName;
	Socket socket;// 채팅 서버와 통신을 담당하는 스트림

	JTextArea textArea;
	JTextField textField;

	DataOutputStream dos;// 서버에서 데이터를 전송하는 스트림
	DataInputStream dis;// 서버에서 데이터를 수신하는 스트림

	// 클라이언트의 닉네임, Socket을 받아오는 ChatRoom생성자
	public ChatRoom(String nickName, Socket socket)
	{
		this.socket = socket;
		this.nickName = nickName;

		try
		{
			// 서버와 input, output스트림을 연결
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			// 채팅방에 접속했을 때 서버에게 닉네임을 전송
			dos.writeUTF(nickName);
		}
		catch(Exception e)
		{
			System.out.println("Error: 채팅서버와 연결도중 문제가 발생");
			return;
		}

		this.setTitle("채팅방");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		textArea = new JTextArea(20, 10);
		textField = new JTextField(30);
		JScrollPane scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		textField.addActionListener(this);
		textArea.setEditable(false);// 수정 못하도록

		this.add(scrollPane, BorderLayout.CENTER);
		this.add(textField, BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}

	// 채팅창(텍스트필드) 부분에서 채팅치고 엔터 눌렀을 경우
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String sendMessage = textField.getText();
		try
		{
			dos.writeUTF(sendMessage);
		}
		catch(Exception e2)
		{

		}
	}

	// 채팅 서버가 보내주는 데이터를 받는 곳 (언제 보낼지 모르기 때문에 계속 대기)
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				String receiveMessage = dis.readUTF();// 채팅서버가 보내준 메세지를 수신
				textArea.append(receiveMessage);// 수신한 메세지를 채팅방에 추가
			}
			catch(Exception e)
			{

			}
		}
	}

}
