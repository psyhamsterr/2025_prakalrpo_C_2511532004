package pekan9_2511532004;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kalkulator_2511532004  {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnC;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator_2511532004 window = new kalkulator_2511532004();
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
	public kalkulator_2511532004() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 390, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(31, 11, 316, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton.setFont(new Font("wingdings", Font.BOLD, 11));
		btnNewButton.setBounds(25, 64, 73, 42);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(25, 117, 73, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(25, 170, 73, 42);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(25, 223, 73, 42);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(25, 276, 73, 42);
		frame.getContentPane().add(btnNewButton_4);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBounds(108, 64, 73, 42);
		frame.getContentPane().add(btnC);
		
		btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setBounds(108, 117, 73, 42);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_7.setBounds(108, 170, 73, 42);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_8.setBounds(108, 223, 73, 42);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton(".");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_9.setBounds(108, 276, 73, 42);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("00");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_10.setBounds(191, 64, 73, 42);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("9");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_11.setBounds(191, 117, 73, 42);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_12.getText();
				textField.setText(number);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_12.setBounds(191, 170, 73, 42);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("3");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_13.getText();
				textField.setText(number);
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_13.setBounds(191, 223, 73, 42);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_14.setBounds(191, 276, 73, 42);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_15.setBounds(274, 64, 73, 42);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("-");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_16.setBounds(274, 117, 73, 42);
		frame.getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("*");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_17.setBounds(274, 170, 73, 42);
		frame.getContentPane().add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("/");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_18.setBounds(274, 223, 73, 42);
		frame.getContentPane().add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_19.setBounds(274, 276, 73, 42);
		frame.getContentPane().add(btnNewButton_19);
	}
}