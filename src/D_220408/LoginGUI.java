package D_220408;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginGUI extends JFrame implements ActionListener
{
	// 메인 창
	JPanel mainWindowPanel = new JPanel();// 메인 패널
	JTextField loginTextField;// 아이디 입력
	JTextField pwTextField;// 패스워드 입력
	JPanel loginButtonPanel;
	JButton loginButton;// 로그인 버튼
	JButton signUpButton;// 회원가입창 띄우는 버튼
	// 회원가입 창
	JTextField nickNameTextField;// 닉네임 입력
	JPanel signUpButtonPanel;
	JButton signUpExecuteButton;// 회원가입 버튼
	JButton signUpCancelButton;// 회원가입 취소 버튼(로그인 창으로 돌아감)

	String serverIP;
	int serverPort;
	Statement stmt;
	
	//LoginGUI클래스의 생성자 (채팅서버의 주소, 포트, DB와 연결된 객체)
	public LoginGUI(String serverIP, int serverPort, Statement stmt)
	{
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.stmt = stmt;
		
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면의 해상도를 구한다
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		setBounds((int) (screenSize.width / 2.5), (int) (screenSize.height / 2.5), 400, 200);
		login_panel_open();// 로그인 화면 창을 생성
		this.setVisible(true);// 화면을 띄운다
	}

	// 로그인 화면을 띄우는 메소드
	private void login_panel_open()
	{
		remove(mainWindowPanel);// Frame에 생성되어있는 main패널 삭제

		mainWindowPanel = new JPanel();// 메인 패널 생성
		mainWindowPanel.setLayout(new GridLayout(0, 1));

		// ID
		JPanel loginWindowPanel = new JPanel();
		JLabel loginLabel = new JLabel("ID: ");
		loginTextField = new JTextField(10);
		loginWindowPanel.add(loginLabel);
		loginWindowPanel.add(loginTextField);
		// PW
		JPanel pwWindowPanel = new JPanel();
		JLabel pwLabel = new JLabel("PW: ");
		pwTextField = new JTextField(10);
		pwWindowPanel.add(pwLabel);
		pwWindowPanel.add(pwTextField);

		loginButtonPanel = new JPanel();
		loginButton = new JButton("로그인");
		loginButton.setSize(400, 500);
		loginButton.addActionListener(this);// 이벤트 처리 등록

		signUpButton = new JButton("회원가입");
		signUpButton.setSize(400, 500);
		signUpButton.addActionListener(this);// 이벤트 처리 등록

		loginButtonPanel.add(loginButton);
		loginButtonPanel.add(signUpButton);

		// 메인 패널에 추가
		mainWindowPanel.add(loginWindowPanel);
		mainWindowPanel.add(pwWindowPanel);
		mainWindowPanel.add(loginButtonPanel);
		// 메인 패널을 frame에 추가
		this.add(mainWindowPanel);
		this.revalidate(); // 컨테이너에 부착된 컴포넌트의 재배치를 지시
		this.repaint(); // 컨테이너 다시 그리기를 지시
	}

	private void signUp_panel_open()
	{
		remove(mainWindowPanel);// Frame에 생성되어있는 main패널 삭제

		mainWindowPanel = new JPanel();// 메인 패널 생성
		mainWindowPanel.setLayout(new GridLayout(0, 1));

		// ID
		JPanel loginWindowPanel = new JPanel();
		JLabel loginLabel = new JLabel("ID: ");
		loginTextField = new JTextField(10);
		loginWindowPanel.add(loginLabel);
		loginWindowPanel.add(loginTextField);
		// PW
		JPanel pwWindowPanel = new JPanel();
		JLabel pwLabel = new JLabel("PW: ");
		pwTextField = new JTextField(10);
		pwWindowPanel.add(pwLabel);
		pwWindowPanel.add(pwTextField);
		// nickName
		JPanel nickNameWindowPanel = new JPanel();
		JLabel nickNameLabel = new JLabel("NickName: ");
		nickNameTextField = new JTextField(10);
		nickNameWindowPanel.add(nickNameLabel);
		nickNameWindowPanel.add(nickNameTextField);

		signUpButtonPanel = new JPanel();
		signUpExecuteButton = new JButton("회원가입");
		signUpExecuteButton.setSize(400, 500);
		signUpExecuteButton.addActionListener(this);// 이벤트 처리 등록

		signUpCancelButton = new JButton("취소");
		signUpCancelButton.setSize(400, 500);
		signUpCancelButton.addActionListener(this);// 이벤트 처리 등록

		signUpButtonPanel.add(signUpExecuteButton);
		signUpButtonPanel.add(signUpCancelButton);

		// 메인 패널에 추가
		mainWindowPanel.add(loginWindowPanel);
		mainWindowPanel.add(pwWindowPanel);
		mainWindowPanel.add(nickNameWindowPanel);
		mainWindowPanel.add(signUpButtonPanel);
		// 메인 패널을 frame에 추가
		this.add(mainWindowPanel);
		this.revalidate(); // 컨테이너에 부착된 컴포넌트의 재배치를 지시
		this.repaint(); // 컨테이너 다시 그리기를 지시
	}

	protected boolean signUpQuery(String id, String pw, String nickName)
	{
		String query = "insert into users values" + "('" + id + "', '" + pw + "', '" + nickName + "')";

		try
		{
			int result = stmt.executeUpdate(query);
			if(result == 1)
			{
				System.out.println("회원가입이 완료되었습니다");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println("query문이 잘못되었습니다. 확인 바람.");
			System.out.println("ID 혹은 닉네임이 중복입니다");
		}
		
		return true;
	}
	
	protected String loginQuery(String id, String pw)
	{
		String query = "select * from users where user_id = '" + id + "' and user_pw =  '" + pw + "'  ";
		try
		{
			ResultSet result = stmt.executeQuery(query);
			if(result.next())
			{
				String nickName = result.getString("user_nickName");
				return nickName;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: id 와 pw가 틀렸습니다!");
		}
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		if(button == loginButton)
		{
			String nickName = loginQuery(loginTextField.getText(), pwTextField.getText());
			if(nickName != null)
			{
				try
				{
					Socket socket = new Socket(serverIP, serverPort);
					System.out.println("채팅Server 접속에 성공하였습니다");
					Thread chatThread = new Thread(new ChatRoom(nickName, socket));
					chatThread.start();
				}
				catch(Exception e2)
				{
					System.out.println("Error: 채팅Server가 열려있지 않습니다");
				}
			}
		
		}

		else if(button == signUpButton)
		{
			System.out.println("회원가입 창으로 이동합니다");
			signUp_panel_open();
		}

		else if(button == signUpExecuteButton)
		{
			signUpQuery(loginTextField.getText(), pwTextField.getText(), nickNameTextField.getText());
		}

		else if(button == signUpCancelButton)
		{
			System.out.println("로그인 창으로 이동합니다");
			login_panel_open();
		}
	}
}
