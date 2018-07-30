package agora_vaiSoccer;

import javax.swing.*;

@SuppressWarnings("serial")
public class Spinner extends Widget {
	private JComboBox<String> cb;
	
	public Spinner(String label, String[] content) {
		super(label);
		cb = new JComboBox<String>(content);
		reset();
		add(cb);
	}
	
	public void reset() {
		cb.setSelectedIndex(-1);
	}
	
	public String toString() {
		return cb.getSelectedItem().toString();
	}
}
