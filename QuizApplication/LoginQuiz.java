package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class LoginQuiz extends JFrame implements ActionListener{
	
	String name;
	JButton btnBack,btnStart;
	LoginQuiz(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		
		JLabel heading = new JLabel(" Welcome " + name + " to Think & Click Quiz" );
		heading.setBounds(50, 20, 700, 40);
		heading.setFont(new Font("Cambria", Font.BOLD, 25));
		heading.setForeground(new Color(35, 170, 204));
		add(heading);
		
		JLabel labelRules = new JLabel();
		labelRules.setBounds(20, 60, 700, 400);
		labelRules.setFont(new Font("Cambria", Font.PLAIN, 17));
		labelRules.setText(
	    	"<html>"+ 
		           "1. Click Start Test to attempt the quiz. " + "<br><br>" +
		           "2. The time will start the moment you click the Start Test button." + "<br><br>" +
		           "3. Click on Next button to move next question. " + "<br><br>" +
		           "4. Please note that you will not able to go back to any of the previous question after clicking Next button. " + "<br><br>" +
		           "5. Answer the quetion in giving time, if you not click any option in given time  " + 
		               "then dirctly it will go to next question." + "<br><br>" +
		           "6. You will get 20 sec to answer the question." + "<br><br>" +
		           "7. Click on Submit Test button on completion of the quiz. " + "<br><br>" +
		           "8. Good Luck." +
		     "<html>");
		add(labelRules);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(300, 500, 100,40);
		btnBack.setBackground(new Color(35, 170, 204));
		btnBack.addActionListener(this);
		add(btnBack);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(500, 500, 100,40);
		btnStart.setBackground(new Color(35, 170, 204));
		btnStart.addActionListener(this);
		add(btnStart);
		
		setLayout(null);
		setSize(900,600);
		setLocation(290,90);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart)
		{
			setVisible(false);
			new Quiz(name);
		}
		else if(e.getSource() == btnBack)
		{
			setVisible(false);
			new Login();
		}
		
	}

	public static void main(String[] args) {
		new LoginQuiz("User");

	}
}
