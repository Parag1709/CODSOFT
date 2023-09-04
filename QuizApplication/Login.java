package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	
	JButton btnLogin,btnExit;
	JTextField textFieldName;
	Login()
	{
		getContentPane().setBackground(Color.WHITE);
		ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("IMG/1.jpg"));
		JLabel image = new JLabel(i);
		add(image);
		image.setBounds(0, 0,600,500);
		
		JLabel heading = new JLabel("THINK & CLICK QUIZ");
		heading.setBounds(650, 60, 300, 40);
		heading.setFont(new Font("Cambria", Font.ITALIC, 32));
		heading.setForeground(new Color(35, 170, 204));
		add(heading);
		
		JLabel Name = new JLabel("Enter your Name");
		Name.setBounds(700, 150, 300, 40);
		Name.setFont(new Font("Cambria", Font.BOLD, 20));
		Name.setForeground(new Color(35, 170, 204));
		add(Name);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldName.setBounds(680, 230, 200, 30);
		add(textFieldName);
		
	    btnLogin = new JButton("Login");
		btnLogin.setBounds(660, 300, 100,40);
		btnLogin.setBackground(new Color(35, 170, 204));
		btnLogin.addActionListener(this);
		add(btnLogin);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(800, 300, 100,40);
		btnExit.setBackground(new Color(35, 170, 204));
		btnExit.addActionListener(this);
		add(btnExit);
		
		setLayout(null);
		setSize(1000 , 500);
		setLocation(250,160);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin)
		{
			String name = textFieldName.getText();
			setVisible(false);
			new LoginQuiz(name);
		}
		else if(e.getSource() == btnExit)
		{
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		new Login();

	}

}
