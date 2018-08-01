package agora_vaiSoccer;

import java.awt.event.ItemListener;

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
		String item = (String) cb.getSelectedItem();
		return item != null ? item : null;
	}
	
	public void addItemListener(ItemListener listener) {
		cb.addItemListener(listener);
	}

	@Override
	public boolean validateInput() {
		return true;
	}
}
