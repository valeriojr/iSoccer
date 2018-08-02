package agora_vaiSoccer;

import javax.swing.JCheckBox;

public class CheckBox extends Widget {

	JCheckBox cB;
	
	public CheckBox(String l) {
		super(l);
		cB = new JCheckBox();
		add(cB);
	}

	@Override
	public boolean validateInput() {
		return true;
	}
	
	public String toString() {
		return cB.isSelected()? "selected" : null;
	}
}
