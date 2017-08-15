package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import constant.functions.Volume;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VolumeGui extends JFrame {
	
	private Volume vol;
	private FilteredField ff;
	private JTextField txtInput;
	private JTextField txtOutput;
	
	public VolumeGui() {
		
		
		ff = new FilteredField();
		vol = new Volume();
		getContentPane().setLayout(null);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblVolume.setBounds(184, 27, 96, 22);
		getContentPane().add(lblVolume);
		
		JLabel lblInput = new JLabel("Input:");
		lblInput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblInput.setBounds(64, 89, 46, 14);
		getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblOutput.setBounds(64, 134, 46, 14);
		getContentPane().add(lblOutput);
		
		txtInput = ff.createField();
		txtInput.setBounds(120, 87, 131, 20);
		getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		txtOutput = new JTextField();
		txtOutput.setBounds(120, 132, 131, 20);
		txtOutput.setEditable(false);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		String[] model = { "floz", "pints", "gal", "ml", "cl", "l"};
		JComboBox cBoxInput = new JComboBox();
		cBoxInput.setBounds(261, 87, 82, 20);
		cBoxInput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxInput);
		
		JComboBox cBoxOutput = new JComboBox();
		cBoxOutput.setBounds(262, 132, 81, 20);
		cBoxOutput.setModel(new DefaultComboBoxModel(model));
		getContentPane().add(cBoxOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnConvert.setBounds(191, 194, 89, 23);
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String inputUnit = (String) cBoxInput.getSelectedItem();
					String outputUnit = (String) cBoxOutput.getSelectedItem();
					double input = Double.parseDouble(txtInput.getText());
					txtOutput.setText(String.format("%.4f",convert(inputUnit, outputUnit, input)));
					
					
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

	public static void main(String[] args) {
		
		new VolumeGui();
		
	}
	
	public double convert(String inputUnit, String outputUnit, double input) {
		
		if (inputUnit.equals(outputUnit)) {
			return input;
		}
		else if (inputUnit.equals("ml") && outputUnit.equals("floz")) {
			return vol.mlToFLoz(input);
		}
		else if (inputUnit.equals("ml") && outputUnit.equals("pints")) {
			return vol.mlToPint(input);
		}
		else if (inputUnit.equals("ml") && outputUnit.equals("gal")) {
			return vol.mlToGal(input);
		}
		else if (inputUnit.equals("ml") && outputUnit.equals("cl")) {
			return input * 0.1;
		}
		else if (inputUnit.equals("ml") && outputUnit.equals("l")) {
			return input * 0.001;
		}
		else if (inputUnit.equals("cl") && outputUnit.equals("floz")) {
			return vol.clToFloz(input);
		}
		else if (inputUnit.equals("cl") && outputUnit.equals("pints")) {
			return vol.clToPint(input);
		}
		else if (inputUnit.equals("cl") && outputUnit.equals("gal")) {
			return vol.clToGal(input);
		}
		else if (inputUnit.equals("cl") && outputUnit.equals("ml")) {
			return input * 10;
		}
		else if (inputUnit.equals("cl") && outputUnit.equals("l")) {
			return input * 0.01;
		}
		else if (inputUnit.equals("l") && outputUnit.equals("floz")) {
			return vol.lToFloz(input);
		}
		else if (inputUnit.equals("l") && outputUnit.equals("pints")) {
			return vol.lToPint(input);
		}
		else if (inputUnit.equals("l") && outputUnit.equals("gal")) {
			return vol.lToGal(input);
		}
		else if (inputUnit.equals("l") && outputUnit.equals("cl")) {
			return input * 100;
		}
		else if (inputUnit.equals("l") && outputUnit.equals("ml")) {
			return input * 1000;
		}
		else if (inputUnit.equals("floz") && outputUnit.equals("ml")) {
			return vol.flozToMl(input);
		}
		else if (inputUnit.equals("floz") && outputUnit.equals("cl")) {
			return vol.flozToCl(input);
		}
		else if (inputUnit.equals("floz") && outputUnit.equals("l")) {
			return vol.flozToL(input);
		}
		else if (inputUnit.equals("floz") && outputUnit.equals("pints")) {
			return vol.flozToPint(input);
		}
		else if (inputUnit.equals("floz") && outputUnit.equals("gal")) {
			return vol.flozToGal(input);
		}
		else if (inputUnit.equals("pints") && outputUnit.equals("ml")) {
			return vol.pintToMl(input);
		}
		else if (inputUnit.equals("pints") && outputUnit.equals("cl")) {
			return vol.pintToCl(input);
		}
		else if (inputUnit.equals("pints") && outputUnit.equals("l")) {
			return vol.pintToL(input);
		}
		else if (inputUnit.equals("pints") && outputUnit.equals("floz")) {
			return vol.pintToFloz(input);
		}
		else if (inputUnit.equals("pints") && outputUnit.equals("gal")) {
			return vol.pintToGal(input);
		}
		else if (inputUnit.equals("gal") && outputUnit.equals("ml")) {
			return vol.galToMl(input);
		}
		else if (inputUnit.equals("gal") && outputUnit.equals("cl")) {
			return vol.galToCl(input);
		}
		else if (inputUnit.equals("gal") && outputUnit.equals("l")) {
			return vol.galToL(input);
		}
		else if (inputUnit.equals("gal") && outputUnit.equals("floz")) {
			return vol.galToFloz(input);
		}
		else if (inputUnit.equals("gal") && outputUnit.equals("pints")) {
			return vol.galToPint(input);
		}
		else {
			return 0;
		}
		
		
		
		
		
	}
	
	

}
