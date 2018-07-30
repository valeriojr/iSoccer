package agora_vaiSoccer.Forms;

import java.util.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form extends JPanel {
	
	private Map<String, Component> components; 
	
	public Form(Component parent) {
		components = new TreeMap<String, Component>();
		setLayout(new GridLayout(0, 1));
	}
	
	public void addComponent(String name, Component comp) {
		components.put(name, comp);
		this.add(comp);
	}
}
