package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
	JLabel heading,JScore;
	JButton btnPlayAgain,btnExit;
	
	Score(String name, int score)
	{
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("IMG/Score.PNG"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
	    ImageIcon i3 = new ImageIcon(i2);
	    JLabel image = new JLabel(i3);
	    image.setBounds(0, 300, 300, 250);
		add(image);
		
	    heading = new JLabel(" Thank You  " + name + " for playing Think & Click Quiz");
		heading.setBounds(45, 50, 730, 80);
		heading.setFont(new Font("Cambria", Font.ITALIC, 30));
		heading.setForeground(new Color(35, 170, 204));
		add(heading);
		
		JScore = new JLabel(" Your Score is " + score);
		JScore.setBounds(50, 150, 300, 80);
		JScore.setFont(new Font("Cambria", Font.ITALIC, 30));
		JScore.setForeground(new Color(35, 170, 204));
		add(JScore);
		
		 btnPlayAgain = new JButton("Paly Again");
		 btnPlayAgain.setBounds(600, 300, 150, 40);
		 btnPlayAgain.setFont(new Font("Cambria", Font.BOLD, 20));
		 btnPlayAgain.setForeground(Color.BLACK);
		 btnPlayAgain.setBackground(new Color(35, 170, 204));
		// btnPlayAgain.setEnabled(false);
		 btnPlayAgain.addActionListener(this);
	     add(btnPlayAgain);
	     
	     btnExit = new JButton("Exit");
		 btnExit.setBounds(800, 300, 150,40);
		 btnExit.setFont(new Font("Cambria", Font.BOLD, 20));
		 btnExit.setForeground(Color.BLACK);
		 btnExit.setBackground(new Color(35, 170, 204));
		 btnExit.addActionListener(this);
		 add(btnExit);
		
		
		setBounds(50, 0, 1000, 600);
		getContentPane().setBackground(new Color(255,255,255));
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Score("user",0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPlayAgain)
		{
		setVisible(false);
		new Login();
		}
		
		else if(e.getSource() == btnExit)
		{
			setVisible(false);
		}
	}

}
