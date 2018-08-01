package agora_vaiSoccer.Forms;

import java.util.*;
import javax.swing.*;

import agora_vaiSoccer.Widget;

import java.awt.*;

@SuppressWarnings("serial")
public class Form extends JPanel {
	
	protected Map<String, Component> components; 
	protected Form instance;
	protected JPanel parent;
	
	public Form(Component parent) {
		this.parent = (JPanel) parent;
		instance = this;
		components = new TreeMap<String, Component>();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	}
	
	public void addComponent(String name, Component comp) {
		components.put(name, comp);
		this.add(comp);
		this.revalidate();
		this.repaint();
	}
	
	public void removeComponent(String name) {
		this.remove(components.get(name));
		components.remove(name);
	}
	
	public String getInput(String widgetName) {
		Widget w = (Widget) components.get(widgetName);
		return w.validateInput()? w.toString() : null;
	}
}
