package agora_vaiSoccer.Forms;

import java.awt.BorderLayout;
import java.util.Map.Entry;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import agora_vaiSoccer.Employee;
import agora_vaiSoccer.Player;
import agora_vaiSoccer.iSoccer;

public class AbleReport extends JPanel{
	public AbleReport() {
		JTextArea textArea = new JTextArea(12, 30); 
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		iSoccer isoccer = iSoccer.getInstance();
		
		setLayout(new BorderLayout());
		
		add(new JLabel("Aptos"), BorderLayout.NORTH);
		
		for(Entry<String, Employee> e : isoccer.getEmployees().entrySet()) {
			if(e.getValue().getOccupation().equals("Jogador") && ((Player) e.getValue()).getAble()) {
				textArea.append(e.getValue().toString());
				textArea.append("---------------\n");
			}
		}
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll, BorderLayout.CENTER);
	}
}
