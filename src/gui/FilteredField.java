package gui;

import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class FilteredField {
	
	public JTextField createField() {
		
		JTextField field = new JTextField();
		AbstractDocument doc = (AbstractDocument) field.getDocument();
		final int maxChars = 20;
		doc.setDocumentFilter(new DocumentFilter() {
			
			public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a) throws BadLocationException{
				String text = fb.getDocument().getText(0, fb.getDocument().getLength());
				text += str;
				if ((fb.getDocument().getLength() + str.length() - length) <= maxChars && text.matches("^[0-9]+[.]?[0-9]{0,4}$")) {
					super.replace(fb, offs, length, str, a);
				} else {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
			public void insertString (FilterBypass fb, int offs, String str, AttributeSet a) throws BadLocationException{
				
				String text = fb.getDocument().getText(0, fb.getDocument().getLength());
				text += str;
				if ((fb.getDocument().getLength() + str.length()) <= maxChars && text.matches("^[0-9]+[.]?[0-9]{0,2}$")) {
					super.insertString(fb, offs, str, a);
				} else {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		});
		
		return field;
	}

}
