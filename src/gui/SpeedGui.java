package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import constant.functions.Speed;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SpeedGui extends JFrame {
	
	private FilteredField ff;
	private Speed speed;
	private JTextField txtInput;
	private JTextField txtOutput;
	
	public SpeedGui() {
		
		ff = new FilteredField();
		speed = new Speed();
		
		getContentPane().setLayout(null);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblSpeed.setBounds(190, 25, 73, 31);
		getContentPane().add(lblSpeed);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(66, 96, 46, 14);
		getContentPane().add(lblInput);
		
		txtInput = ff.createField();
		txtInput.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		txtInput.setBounds(125, 94, 111, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(66, 146, 46, 14);
		getContentPane().add(lblOutput);
		
		txtOutput = new JTextField();
		txtOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		txtOutput.setBounds(125, 144, 111, 20);
		txtOutput.setEditable(false);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		String[] model = {"mph", "kph" };
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setModel(new DefaultComboBoxModel(model));
		cBoxInput.setBounds(246, 94, 59, 20);
		getContentPane().add(cBoxInput);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setModel(new DefaultComboBoxModel(model));
		cBoxOutput.setBounds(246, 144, 59, 20);
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(190, 203, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String inputUnit = (String) cBoxInput.getSelectedItem();
					String outputUnit = (String) cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
					
					if (inputUnit.equals(outputUnit)) {
						txtOutput.setText(String.format("%.2f", input));
					}
					else {
						
						double result = convert(inputUnit, outputUnit, input);
						txtOutput.setText(String.format("%.2f", result));
						
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
		
		if (inputUnit.equals("mph") && outputUnit.equals("kph")) {
			return speed.mphToKph(input);
		}
		else if (inputUnit.equals("kph") && outputUnit.equals("mph")) {
			return speed.kphToMph(input);
		}
		else {
			return 0;
		}
	}
	

	public static void main(String[] args) {
		
		new SpeedGui();

	}

}
