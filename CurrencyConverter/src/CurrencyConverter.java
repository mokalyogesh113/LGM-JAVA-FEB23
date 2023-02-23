import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.ActionEvent;

public class CurrencyConverter extends JFrame {

	private JPanel contentPane;
	private JTextField AmountField;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter frame = new CurrencyConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CurrencyConverter() {
		setTitle("Currency Converter");
		
//		Currency Hashtable
		HashMap<String, Double> curr = new HashMap<String, Double>();
		curr.put("USD", 1.00);
		curr.put("INR", 82.77);
		curr.put("EUR", 0.93);
		curr.put("JPY", 134.12);
		curr.put("AUD",	1.45 );
		curr.put("CAD", 1.35 );
		curr.put("RUB", 74.00);
		curr.put("AED", 3.67);
		
		Set<String> currency_keyset = curr.keySet();	
		String countries[] = new String[curr.size()];
		int i = 0;
        for (String x : currency_keyset)
        	countries[i++] = x;
           	
        
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 766, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_Amount = new JLabel("Enter The Amount");
		label_Amount.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_Amount.setBounds(26, 78, 246, 37);
		panel.add(label_Amount);
		
		JLabel label_From = new JLabel("From");
		label_From.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_From.setBounds(202, 135, 70, 37);
		panel.add(label_From);
		
		JLabel label_To = new JLabel("To");
		label_To.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_To.setBounds(222, 182, 34, 37);
		panel.add(label_To);
		
		AmountField = new JTextField();
		AmountField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AmountField.setBounds(310, 83, 244, 32);
		panel.add(AmountField);
		AmountField.setColumns(10);
		
		JComboBox FromField = new JComboBox();
		FromField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FromField.setModel(new DefaultComboBoxModel(countries));
		FromField.setBounds(310, 135, 246, 32);
		panel.add(FromField);
		
		JComboBox ToField = new JComboBox();
		ToField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ToField.setModel(new DefaultComboBoxModel(countries));
		ToField.setBounds(310, 192, 244, 32);
		panel.add(ToField);
		
		JButton ConvertButton = new JButton("Convert");
		ConvertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double amount ;			
				if(AmountField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, String.format("Amount Field is Empty"));
					return;
				} else {
					amount = Double.parseDouble(AmountField.getText());
				}
				String from = FromField.getSelectedItem().toString();
				String To = ToField.getSelectedItem().toString();
				
				Double ans = (amount / curr.get(from)) * curr.get(To);
						
				JOptionPane.showMessageDialog(contentPane, String.format("Your Amount Will be %.2f",ans));
			}
		});
		ConvertButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ConvertButton.setBounds(250, 302, 136, 39);
		panel.add(ConvertButton);
		
		JLabel lblNewLabel = new JLabel("Created By Yogesh Mokal \r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(530, 421,	 247, 22);
		panel.add(lblNewLabel);
	}
}
