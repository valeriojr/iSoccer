package agora_vaiSoccer;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Widget extends JPanel {
	private JLabel label;
	
	public Widget(String l){
		setLayout(new GridLayout(0, 2));
		label = new JLabel(l);
		add(label);
	}
}
