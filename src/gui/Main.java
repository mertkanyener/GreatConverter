package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Main extends JFrame {
	
	
	
	public Main() {
		
		getContentPane().setLayout(null);
		
		JLabel lblGreatConverter = new JLabel("Great Converter");
		lblGreatConverter.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblGreatConverter.setBounds(146, 11, 207, 30);
		getContentPane().add(lblGreatConverter);
		
		JButton btnLength = new JButton("Length");
		btnLength.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnLength.setBounds(50, 94, 89, 23);
		btnLength.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new LengthGui();
			}
			
		});
		getContentPane().add(btnLength);
		
		JButton btnWeight = new JButton("Weight");
		btnWeight.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnWeight.setBounds(191, 95, 89, 23);
		btnWeight.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new WeightGui();
				
			}
			
		});
		getContentPane().add(btnWeight);
		
		JButton btnVolume = new JButton("Volume");
		btnVolume.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnVolume.setBounds(315, 95, 89, 23);
		btnVolume.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new VolumeGui();
				
			}
			
		});
		getContentPane().add(btnVolume);
		
		JButton btnCurrency = new JButton("Currency");
		btnCurrency.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnCurrency.setBounds(50, 153, 89, 23);
		btnCurrency.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new CurrencyGui();
			}
		});
		getContentPane().add(btnCurrency);
		
		JButton btnSpeed = new JButton("Speed");
		btnSpeed.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnSpeed.setBounds(191, 154, 89, 23);
		btnSpeed.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new SpeedGui();
			}
		});
		getContentPane().add(btnSpeed);
		
		JButton btnTemperature = new JButton("Temperature");
		btnTemperature.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnTemperature.setBounds(315, 154, 112, 23);
		btnTemperature.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				new TempGui();
				
			}
			
		});
		getContentPane().add(btnTemperature);
		
		
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Main();
		
		
	}
}
