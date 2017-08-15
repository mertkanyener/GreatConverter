package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import currency.ConvertCurrency;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CurrencyGui extends JFrame {
	private ConvertCurrency cc;
	private FilteredField ff;
	private JTextField txtOutput, txtInput;
	
	public CurrencyGui() {
		
		ff = new FilteredField();
		cc = new ConvertCurrency();
		getContentPane().setLayout(null);
		
		JLabel lblCurrency = new JLabel("Currency");
		lblCurrency.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblCurrency.setBounds(184, 11, 131, 38);
		getContentPane().add(lblCurrency);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(65, 72, 46, 14);
		getContentPane().add(lblInput);
		
		txtInput = ff.createField();
		txtInput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtInput.setBounds(110, 70, 205, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(65, 133, 46, 14);
		getContentPane().add(lblOutput);
		
		txtOutput = new JTextField();
		txtOutput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtOutput.setBounds(110, 131, 205, 20);
		txtOutput.setEditable(false);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		
		String[] currencies = {"TRY", "USD", "EUR", "GBP"};
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setBounds(330, 70, 89, 20);
		cBoxInput.setModel(new DefaultComboBoxModel(currencies));
		getContentPane().add(cBoxInput);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setModel(new DefaultComboBoxModel(currencies));
		cBoxOutput.setBounds(330, 131, 89, 20);
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(184, 204, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					String inputCur = (String)cBoxInput.getSelectedItem();
					String outputCur = (String)cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
				
					if (inputCur.equals(outputCur)) {
						txtOutput.setText(String.format("%.4f", input));
					}
					else {
						String query = getQuery(inputCur, outputCur);
						double result = input * cc.getRatio(query);
						txtOutput.setText(String.format("%.4f", result));
					}
				}catch(Exception ex) {
					System.out.println("An error has occured!");
				}
				
			}
		});
		getContentPane().add(btnConvert);
		
		
		
		
		
		setSize(500,300);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new CurrencyGui();
		
	}
	
	
	public String getQuery(String inputCur, String outputCur) {
		
		if (inputCur.equals("EUR") && outputCur.equals("USD")) {
			return "[rel=USD,EUR,2,1]";
		}
		else if (inputCur.equals("EUR") && outputCur.equals("GBP")) {
			return "[rel=GBP,EUR,2,3]";
		}
		else if (inputCur.equals("EUR") && outputCur.equals("TRY")) {
			return "[rel=TRY,EUR,4,2]";
		}
		else if (inputCur.equals("USD") && outputCur.equals("GBP")) {
			return "[rel=GBP,USD,3,1]";
		}
		else if (inputCur.equals("USD") && outputCur.equals("EUR")) {
			return "[rel=EUR,USD,2,1]";
		}
		else if (inputCur.equals("USD") && outputCur.equals("TRY")) {
			return "[rel=TRY,USD,4,1]";
		}
		else if (inputCur.equals("GBP") && outputCur.equals("EUR")) {
			return "[rel=EUR,GBP,3,2]";
		}
		else if (inputCur.equals("GBP") && outputCur.equals("USD")) {
			return "[rel=USD,GBP,3,1]";
		}
		else if (inputCur.equals("GBP") && outputCur.equals("TRY")) {
			return "[rel=TRY,GBP,4,3]";
		}
		else if (inputCur.equals("TRY") && outputCur.equals("EUR")) {
			return "[rel=EUR,TRY,4,2]";
		}
		else if (inputCur.equals("TRY") && outputCur.equals("USD")) {
			return "[rel=USD,TRY,4,1]";
		}
		else if (inputCur.equals("TRY") && outputCur.equals("GBP")) {
			return "[rel=GBP,TRY,4,3]";
		}
		else {
			return "Error!";
		}
	}
	
	
}
