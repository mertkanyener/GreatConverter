package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.FilteredField;

import java.awt.Font;
import javax.swing.JTextField;

public class TestGui extends JFrame {
	
	private FilteredField ff;
	private JTextField txtDecimal;
	
	public TestGui() {
		
		ff = new FilteredField();
		
		getContentPane().setLayout(null);
		
		JLabel lblTest = new JLabel("Test");
		lblTest.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTest.setBounds(214, 11, 78, 41);
		getContentPane().add(lblTest);
		
		txtDecimal = ff.createField();
		txtDecimal.setBounds(98, 81, 141, 20);
		getContentPane().add(txtDecimal);
		txtDecimal.setColumns(10);
		
		
		
		
		setSize(500,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new TestGui();

	}
}
