import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentResultCalculator {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldRollNo;
	private JTextField textFieldMaths;
	private JTextField textFieldEnglish;
	private JTextField textFieldScience;
	private JTextField textFieldMarathi;
	private JTextField textFieldGeog;
	private JTextField textFieldHistory;
	private JTextField textFieldTotal;
	private JTextField textFieldPercent;
	private JTextField textFieldGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResultCalculator window = new StudentResultCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentResultCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 835, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Record");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(296, 11, 300, 27);
		panel.add(lblNewLabel);
		
		JLabel JLabelName = new JLabel("Name");
		JLabelName.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelName.setBounds(33, 66, 65, 27);
		panel.add(JLabelName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldName.setBounds(126, 69, 154, 27);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel JLabelRoll_No = new JLabel("Roll No.");
		JLabelRoll_No.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelRoll_No.setBounds(314, 66, 85, 27);
		panel.add(JLabelRoll_No);
		
		textFieldRollNo = new JTextField();
		textFieldRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRollNo.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldRollNo.setBounds(423, 66, 135, 27);
		panel.add(textFieldRollNo);
		textFieldRollNo.setColumns(10);
		
		JLabel JlabelSubject = new JLabel("SUBJECTS");
		JlabelSubject.setFont(new Font("Cambria", Font.BOLD, 25));
		JlabelSubject.setBounds(33, 132, 119, 27);
		panel.add(JlabelSubject);
		
		JLabel JLabelEnglish = new JLabel("English");
		JLabelEnglish.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelEnglish.setBounds(33, 185, 85, 27);
		panel.add(JLabelEnglish);
		
		JLabel JLabelMaths = new JLabel("Mathematics");
		JLabelMaths.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelMaths.setBounds(33, 223, 154, 27);
		panel.add(JLabelMaths);
		
		JLabel JLabelScience = new JLabel("Science");
		JLabelScience.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelScience.setBounds(33, 264, 101, 20);
		panel.add(JLabelScience);
		
		JLabel JLabelMarathi = new JLabel("Marathi");
		JLabelMarathi.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelMarathi.setBounds(33, 300, 101, 27);
		panel.add(JLabelMarathi);
		
		JLabel JLabelGeography = new JLabel("Geography");
		JLabelGeography.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelGeography.setBounds(33, 338, 135, 27);
		panel.add(JLabelGeography);
		
		JLabel JLabelHistory = new JLabel("History");
		JLabelHistory.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelHistory.setBounds(33, 378, 101, 27);
		panel.add(JLabelHistory);
		
		textFieldMaths = new JTextField();
		textFieldMaths.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMaths.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldMaths.setBounds(220, 223, 86, 28);
		panel.add(textFieldMaths);
		textFieldMaths.setColumns(10);
		
		textFieldEnglish = new JTextField();
		textFieldEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEnglish.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldEnglish.setBounds(220, 185, 86, 28);
		panel.add(textFieldEnglish);
		textFieldEnglish.setColumns(10);
		
		textFieldScience = new JTextField();
		textFieldScience.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldScience.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldScience.setColumns(10);
		textFieldScience.setBounds(220, 262, 86, 28);
		panel.add(textFieldScience);
		
		textFieldMarathi = new JTextField();
		textFieldMarathi.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMarathi.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldMarathi.setColumns(10);
		textFieldMarathi.setBounds(220, 301, 86, 28);
		panel.add(textFieldMarathi);
		
		textFieldGeog = new JTextField();
		textFieldGeog.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGeog.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldGeog.setColumns(10);
		textFieldGeog.setBounds(220, 340, 86, 28);
		panel.add(textFieldGeog);
		
		textFieldHistory = new JTextField();
		textFieldHistory.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHistory.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldHistory.setColumns(10);
		textFieldHistory.setBounds(220, 379, 86, 28);
		panel.add(textFieldHistory);
		
		JButton btnNewButtonAdd = new JButton("ADD");
		btnNewButtonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sub1 = Integer.parseInt(textFieldEnglish.getText());
				int sub2 = Integer.parseInt(textFieldMaths.getText());
				int sub3 = Integer.parseInt(textFieldScience.getText());
				int sub4 = Integer.parseInt(textFieldMarathi.getText());
				int sub5 = Integer.parseInt(textFieldGeog.getText());
				int sub6 = Integer.parseInt(textFieldHistory.getText());
				
				int total = sub1+sub2+sub3+sub4+sub5+sub6;
				textFieldTotal.setText(String.valueOf(total));
				
				float percent = total*100/600;
				textFieldPercent.setText(String.valueOf(percent));
				
				if(percent > 90)
				{
				  textFieldGrade.setText("A++");
				}
				if(percent > 80)
				{
				  textFieldGrade.setText("A");
				}
				if(percent > 70)
				{
				  textFieldGrade.setText("B");
				}
				if(percent >= 35)
				{
				  textFieldGrade.setText("C");
				}
				if(percent < 35)
				{
				  textFieldGrade.setText("F");
				}
			}
		});
		btnNewButtonAdd.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButtonAdd.setBounds(360, 420, 89, 37);
		panel.add(btnNewButtonAdd);
		
		JButton btnNewButtonClear = new JButton("CLEAR");
		btnNewButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldEnglish.setText("");
				textFieldMaths.setText("");
				textFieldScience.setText("");
				textFieldMarathi.setText("");
				textFieldGeog.setText("");
				textFieldHistory.setText("");
				textFieldTotal.setText("");
				textFieldPercent.setText("");
				textFieldGrade.setText("");
				textFieldName.setText("");
				textFieldRollNo.setText("");
			}
		});
		btnNewButtonClear.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButtonClear.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButtonClear.setBounds(534, 420, 110, 37);
		panel.add(btnNewButtonClear);
		
		JButton btnNewButtonExit = new JButton("EXIT");
		btnNewButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButtonExit.setForeground(new Color(204, 0, 0));
		btnNewButtonExit.setBackground(new Color(0, 0, 0));
		btnNewButtonExit.setFont(new Font("Cambria", Font.BOLD, 24));
		btnNewButtonExit.setBounds(720, 420, 89, 37);
		panel.add(btnNewButtonExit);
		
		JLabel JLabelTotal = new JLabel("TOTAL");
		JLabelTotal.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelTotal.setBounds(423, 208, 85, 27);
		panel.add(JLabelTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(607, 209, 86, 28);
		panel.add(textFieldTotal);
		
		JLabel JLabelPercent = new JLabel("PERCENTAGE");
		JLabelPercent.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelPercent.setBounds(423, 261, 154, 27);
		panel.add(JLabelPercent);
		
		JLabel JLabelGrade = new JLabel("GRADE");
		JLabelGrade.setFont(new Font("Cambria", Font.BOLD, 24));
		JLabelGrade.setBounds(423, 311, 112, 27);
		panel.add(JLabelGrade);
		
		textFieldPercent = new JTextField();
		textFieldPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textFieldPercent.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPercent.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldPercent.setColumns(10);
		textFieldPercent.setBounds(604, 262, 86, 28);
		panel.add(textFieldPercent);
		
		textFieldGrade = new JTextField();
		textFieldGrade.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGrade.setFont(new Font("Cambria", Font.BOLD, 20));
		textFieldGrade.setColumns(10);
		textFieldGrade.setBounds(607, 312, 86, 28);
		panel.add(textFieldGrade);
	}
}
