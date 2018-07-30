package agora_vaiSoccer;

import javax.swing.*;

@SuppressWarnings("serial")
public class EditText extends Widget {
	private JTextField tf;
	private String regex = ".";
	
	public EditText(String label) {
		super(label);
		tf = new JTextField();
		add(tf);
	}
	
	public String getText() {
		return tf.getText();
	}
	
	public String toString() {
		return tf.getText();
	}
	
	public void setRegex(String regex) {
		this.regex = regex;
	}
	
	public boolean validateText() {
		return tf.getText().matches(regex);
	}
}
