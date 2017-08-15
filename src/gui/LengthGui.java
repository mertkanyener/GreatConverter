package gui;

import javax.swing.JFrame;

import constant.functions.Length;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class LengthGui extends JFrame {
	
	private Length length;
	private JTextField txtInput, txtOutput;
	private FilteredField ff;

	
	public LengthGui() {
		
		length = new Length();
		ff = new FilteredField();
		
		getContentPane().setLayout(null);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblLength.setBounds(195, 21, 82, 31);
		getContentPane().add(lblLength);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(65, 90, 46, 17);
		getContentPane().add(lblInput);
		
		txtInput = ff.createField();
		txtInput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtInput.setBounds(111, 88, 209, 20);
		txtInput.setColumns(10);
	
		getContentPane().add(txtInput);
		
		
		
		String[] model = {"inches", "feet", "yards", "miles", "cm", "m", "km"};
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setBounds(330, 89, 82, 20);
		cBoxInput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxInput);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(65, 145, 46, 14);
		getContentPane().add(lblOutput);
		
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setBounds(112, 143, 208, 20);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setBounds(330, 143, 82, 20);
		cBoxOutput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(188, 204, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				try {
					String inputUnit = (String) cBoxInput.getSelectedItem();
					String outputUnit = (String) cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
					double result = convert(inputUnit, outputUnit, input);
					txtOutput.setText(String.format("%.2f", result));
					
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
		
		if (inputUnit.equals("inches") && outputUnit.equals("inches")) {
			return input;
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("cm")) {
			return length.inToCm(input);
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("m")) {
			return length.inToM(input);
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("km")) {
			return length.inToKm(input);
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("feet")) {
			return length.inToFt(input);
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("yards")) {
			return length.inToYard(input);
		}
		else if(inputUnit.equals("inches") && outputUnit.equals("miles")) {
			return length.inToMil(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("feet")) {
			return input;
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("cm")) {
			return length.ftToCm(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("m")) {
			return length.ftToM(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("km")) {
			return length.ftToKm(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("inches")) {
			return length.ftToIn(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("yards")) {
			return length.ftToYd(input);
		}
		else if(inputUnit.equals("feet") && outputUnit.equals("miles")) {
			return length.ftToMil(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("yards")) {
			return input;
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("cm")) {
			return length.ydToCm(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("m")) {
			return length.ydToM(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("km")) {
			return length.ydToKm(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("inches")) {
			return length.ydToIn(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("feet")) {
			return length.ydToFt(input);
		}
		else if(inputUnit.equals("yards") && outputUnit.equals("miles")) {
			return length.ydToMil(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("miles")) {
			return input;
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("cm")) {
			return length.milToCm(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("m")) {
			return length.milToM(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("km")) {
			return length.milToKm(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("inches")) {
			return length.milToIn(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("feet")) {
			return length.milToFt(input);
		}
		else if(inputUnit.equals("miles") && outputUnit.equals("yards")) {
			return length.milToYd(input);
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("cm")) {
			return input;
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("inches")) {
			return length.cmToIn(input);
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("feet")) {
			return length.cmToFt(input);
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("yards")) {
			return length.cmToYd(input);
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("miles")) {
			return length.cmToMil(input);
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("m")) {
			return input * 0.01;
		}
		else if(inputUnit.equals("cm") && outputUnit.equals("km")) {
			return input * 0.00001;
		}
		else if(inputUnit.equals("m") && outputUnit.equals("inches")) {
			return length.mToIn(input);
		}
		else if(inputUnit.equals("m") && outputUnit.equals("feet")) {
			return length.mToFt(input);
		}
		else if(inputUnit.equals("m") && outputUnit.equals("yards")) {
			return length.mToYd(input);
		}
		else if(inputUnit.equals("m") && outputUnit.equals("miles")) {
			return length.mToMil(input);
		}
		else if(inputUnit.equals("m") && outputUnit.equals("cm")) {
			return input * 100;
		}
		else if(inputUnit.equals("m") && outputUnit.equals("m")) {
			return input;
		}
		else if(inputUnit.equals("m") && outputUnit.equals("km")) {
			return input * 0.001;
		}
		else if(inputUnit.equals("km") && outputUnit.equals("inches")) {
			return length.kmToIn(input);
		}
		else if(inputUnit.equals("km") && outputUnit.equals("feet")) {
			return length.kmToFt(input);
		}
		else if(inputUnit.equals("km") && outputUnit.equals("yards")) {
			return length.kmToYd(input);
		}
		else if(inputUnit.equals("km") && outputUnit.equals("miles")) {
			return length.kmToMil(input);
		}
		else if(inputUnit.equals("km") && outputUnit.equals("cm")) {
			return input * 100000;
		}
		else if(inputUnit.equals("km") && outputUnit.equals("m")) {
			return input * 1000;
		}
		else if(inputUnit.equals("km") && outputUnit.equals("km")) {
			return input;
		}
		else {
			return 0;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new LengthGui();

	}




}
