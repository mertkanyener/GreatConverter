package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import constant.functions.Weight;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class WeightGui extends JFrame {
	
	private JTextField txtInput;
	private JTextField txtOutput;
	private FilteredField ff;
	private Weight weight;
	
	public WeightGui() {
		
		weight = new Weight();
		ff = new FilteredField();
		
		getContentPane().setLayout(null);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblWeight.setBounds(191, 11, 89, 37);
		getContentPane().add(lblWeight);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(65, 92, 46, 14);
		getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(65, 136, 46, 14);
		getContentPane().add(lblOutput);
		
		txtInput = ff.createField();
		txtInput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtInput.setBounds(112, 90, 208, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		txtOutput = new JTextField();
		txtOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		txtOutput.setBounds(112, 134, 208, 20);
		txtOutput.setEditable(false);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		String[] model = {"oz", "lbs", "US ton", "gr", "kg", "tonnes"}; 
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setBounds(330, 90, 89, 20);
		cBoxInput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxInput);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setBounds(330, 134, 89, 20);
		cBoxOutput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(191, 196, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String inputUnit = (String) cBoxInput.getSelectedItem();
					String outputUnit = (String) cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
					if (inputUnit.equals(outputUnit)) {
						txtOutput.setText(String.format("%6f", input));
					} else {
						double result = convert(inputUnit, outputUnit, input);
						txtOutput.setText(String.format("%6f", result));
						
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
		
		if (inputUnit.equals("oz") && outputUnit.equals("lbs")) {
			return weight.ozToLbs(input);
		}
		else if (inputUnit.equals("oz") && outputUnit.equals("US ton")) {
			return weight.ozToTon(input);
		}
		else if (inputUnit.equals("oz") && outputUnit.equals("gr")) {
			return weight.ozToGr(input);
		}
		else if (inputUnit.equals("oz") && outputUnit.equals("kg")) {
			return weight.ozToKg(input);
		}
		else if (inputUnit.equals("oz") && outputUnit.equals("tonnes")) {
			return weight.ozToTonne(input);
		}
		else if (inputUnit.equals("lbs") && outputUnit.equals("oz")) {
			return weight.lbsToOz(input);
		}
		else if (inputUnit.equals("lbs") && outputUnit.equals("US ton")) {
			return weight.lbsToTon(input);
		}
		else if (inputUnit.equals("lbs") && outputUnit.equals("gr")) {
			return weight.lbsToGr(input);
		}
		else if (inputUnit.equals("lbs") && outputUnit.equals("kg")) {
			return weight.lbsToKg(input);
		}
		else if (inputUnit.equals("lbs") && outputUnit.equals("tonnes")) {
			return weight.lbsToTonne(input);
		}
		else if (inputUnit.equals("US ton") && outputUnit.equals("oz")) {
			return weight.tonToOz(input);
		}
		else if (inputUnit.equals("US ton") && outputUnit.equals("lbs")) {
			return weight.tonToLbs(input);
		}
		else if (inputUnit.equals("US ton") && outputUnit.equals("gr")) {
			return weight.tonToGr(input);
		}
		else if (inputUnit.equals("US ton") && outputUnit.equals("kg")) {
			return weight.tonToKg(input);
		}
		else if (inputUnit.equals("US ton") && outputUnit.equals("tonnes")) {
			return weight.tonToTonne(input);
		}
		else if (inputUnit.equals("gr") && outputUnit.equals("oz")) {
			return weight.grToOz(input);
		}
		else if (inputUnit.equals("gr") && outputUnit.equals("lbs")) {
			return weight.grToLbs(input);
		}
		else if (inputUnit.equals("gr") && outputUnit.equals("US ton")) {
			return weight.grToTon(input);
		}
		else if (inputUnit.equals("gr") && outputUnit.equals("kg")) {
			return input * 0.001;
		}
		else if (inputUnit.equals("gr") && outputUnit.equals("tonnes")) {
			return input * 0.000001;
		}
		else if (inputUnit.equals("kg") && outputUnit.equals("oz")) {
			return weight.kgToOz(input);
		}
		else if (inputUnit.equals("kg") && outputUnit.equals("lbs")) {
			return weight.kgToLbs(input);
		}
		else if (inputUnit.equals("kg") && outputUnit.equals("US ton")) {
			return weight.kgToTon(input);
		}
		else if (inputUnit.equals("kg") && outputUnit.equals("gr")) {
			return input * 1000;
		}
		else if (inputUnit.equals("kg") && outputUnit.equals("tonnes")) {
			return input * 0.001;
		}
		else if (inputUnit.equals("tonnes") && outputUnit.equals("oz")) {
			return weight.tonneToOz(input);
		}
		else if (inputUnit.equals("tonnes") && outputUnit.equals("lbs")) {
			return weight.tonneToLbs(input);
		}
		else if (inputUnit.equals("tonnes") && outputUnit.equals("US ton")) {
			return weight.tonneToTon(input);
		}
		else if (inputUnit.equals("tonnes") && outputUnit.equals("gr")) {
			return input * 1000000;
		}
		else if (inputUnit.equals("tonnes") && outputUnit.equals("kg")) {
			return input * 1000;
		}
		else {
			return 0;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		new WeightGui();

	}
}
