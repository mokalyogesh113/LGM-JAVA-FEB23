import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ScientificCalculator {

	private JFrame frame;
	private JTextField textField;
	
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
					ScientificCalculator window = new ScientificCalculator();
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
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 21, 513, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(40, 57, 451, 76);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 143, 513, 428);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnsqrt = new JButton("\u221A");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnsqrt.setBounds(27, 22, 70, 45);
		panel.add(btnsqrt);
		btnsqrt.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("1/x");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_1_1_1_1.setBounds(27, 79, 70, 45);
		panel.add(btnNewButton_1_1_1_1_1);
		btnNewButton_1_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnNewButton_1_1 = new JButton("x^2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText(""+a);
			}
		});
		btnNewButton_1_1.setBounds(27, 250, 70, 45);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("n!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a>0) {
					fact = fact * a;
					a--;
				}
				textField.setText(""+fact);
			}
		});
		btnNewButton_1.setBounds(27, 307, 70, 45);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnplusminus.setBounds(29, 364, 70, 45);
		panel.add(btnplusminus);
		btnplusminus.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnNewButton_1_1_1_2 = new JButton("e^x");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnNewButton_1_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton_1_1_1_2.setBounds(124, 22, 70, 45);
		panel.add(btnNewButton_1_1_1_2);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "%";
			}
		});
		btnpercent.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnpercent.setBounds(124, 136, 70, 45);
		panel.add(btnpercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(124, 193, 70, 45);
		panel.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(124, 250, 70, 45);
		panel.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(124, 307, 70, 45);
		panel.add(btn1);
		
		JButton btnsin = new JButton("sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnsin.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnsin.setBounds(221, 22, 70, 45);
		panel.add(btnsin);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnclear.setBounds(221, 136, 70, 45);
		panel.add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(221, 193, 70, 45);
		panel.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(221, 250, 70, 45);
		panel.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(221, 307, 70, 45);
		panel.add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(128, 364, 157, 45);
		panel.add(btn0);
		
		JButton btncos = new JButton("cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btncos.setFont(new Font("Dialog", Font.PLAIN, 16));
		btncos.setBounds(318, 22, 70, 45);
		panel.add(btncos);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("WiingDings", Font.PLAIN, 18));
		btnBackspace.setBounds(318, 136, 70, 45);
		panel.add(btnBackspace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(318, 193, 70, 45);
		panel.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(318, 250, 70, 45);
		panel.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(318, 307, 70, 45);
		panel.add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndot.setBounds(314, 364, 70, 45);
		panel.add(btndot);
		
		JButton btntan = new JButton("tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btntan.setFont(new Font("Dialog", Font.PLAIN, 16));
		btntan.setBounds(415, 22, 70, 45);
		panel.add(btntan);
		
		JButton btntanh = new JButton("tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btntanh.setFont(new Font("Dialog", Font.PLAIN, 16));
		btntanh.setBounds(415, 79, 70, 45);
		panel.add(btntanh);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnplus.setBounds(415, 136, 70, 45);
		panel.add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnminus.setBounds(415, 193, 70, 45);
		panel.add(btnminus);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "*";
			}
		});
		btnmult.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnmult.setBounds(415, 250, 70, 45);
		panel.add(btnmult);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "/";
			}
		});
		btndivide.setFont(new Font("Dialog", Font.PLAIN, 18));
		btndivide.setBounds(415, 307, 70, 45);
		panel.add(btndivide);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				} else if(operation=="-") {
					result = first - second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="*") {
					result = first * second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="/") {
					result = first / second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation=="%") {
					result = first % second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "X^Y") {
					result = Math.pow(first, second);
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnequal.setBounds(413, 364, 70, 45);
		panel.add(btnequal);
		
		JButton btnNewButton_1_1_2 = new JButton("x^3");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText(""+a);
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton_1_1_2.setBounds(27, 193, 70, 45);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("x^y");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "X^Y";
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton_1_1_2_1.setBounds(27, 136, 70, 45);
		panel.add(btnNewButton_1_1_2_1);
		
		JButton btnlog = new JButton("log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnlog.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnlog.setBounds(124, 79, 70, 45);
		panel.add(btnlog);
		
		JButton btnsinh = new JButton("sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btnsinh.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnsinh.setBounds(221, 79, 70, 45);
		panel.add(btnsinh);
		
		JButton btncosh = new JButton("cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(""+a);
			}
		});
		btncosh.setFont(new Font("Dialog", Font.PLAIN, 16));
		btncosh.setBounds(318, 79, 70, 45);
		panel.add(btncosh);
	}
}
