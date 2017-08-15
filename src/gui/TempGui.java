package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import constant.functions.Temperature;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TempGui extends JFrame {
	
	private FilteredField ff;
	private Temperature temp;
	private JTextField txtInput;
	private JTextField txtOutput;
	
	public TempGui() {
		
		ff = new FilteredField();
		temp = new Temperature();
		
		getContentPane().setLayout(null);
		
		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblTemperature.setBounds(165, 11, 165, 39);
		getContentPane().add(lblTemperature);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(62, 75, 46, 14);
		getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(62, 127, 46, 14);
		getContentPane().add(lblOutput);
		
		txtInput = ff.createField();
		txtInput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtInput.setBounds(110, 73, 101, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		txtOutput = new JTextField();
		txtOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		txtOutput.setBounds(110, 125, 101, 20);
		txtOutput.setEditable(false);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		String[] model = {"Celsius", "Fahrenheit", "Kelvin"};
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setModel(new DefaultComboBoxModel(model));
		cBoxInput.setBounds(245, 73, 85, 20);
		getContentPane().add(cBoxInput);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setModel(new DefaultComboBoxModel(model));
		cBoxOutput.setBounds(245, 125, 85, 20);
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(191, 191, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String inputUnit = (String) cBoxInput.getSelectedItem();
					String outputUnit = (String) cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
					
					if (inputUnit.equals(outputUnit)) {
						txtOutput.setText(String.format("%2f", input));
					} else {
						
						double result = convert(inputUnit, outputUnit, input);
						txtOutput.setText(String.format("%2f", result));
						
					}
					
					
				}catch(Exception ex) {
					System.out.println("An error has occured!");
				}
				
			}
			
		});
		getContentPane().add(btnConvert);
		
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public double convert(String inputUnit, String outputUnit, double input) {
		
		if (inputUnit.equals("Celsius") && outputUnit.equals("Fahrenheit")) {
			return temp.celsiusToFahrenheit(input);
		}
		else if (inputUnit.equals("Celsius") && outputUnit.equals("Kelvin")) {
			return temp.celsiusToKelvin(input);
		}
		else if (inputUnit.equals("Fahrenheit") && outputUnit.equals("Celsius")) {
			return temp.fahrenheitToCelsius(input);
		}
		else if (inputUnit.equals("Fahrenheit") && outputUnit.equals("Kelvin")) {
			return temp.fahrenheitToKelvin(input);
		}
		else if (inputUnit.equals("Kelvin") && outputUnit.equals("Celsius")) {
			return temp.kelvinToCelsius(input);
		}
		else if (inputUnit.equals("Kelvin") && outputUnit.equals("Fahrenheit")) {
			return temp.kelvinToFahrenheit(input);
		}
		else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		new TempGui();

	}

}
