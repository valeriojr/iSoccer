package agora_vaiSoccer.Forms;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import agora_vaiSoccer.iSoccer;

public class BusReport extends JPanel {
	public BusReport() {
		JTextArea textArea = new JTextArea(12, 30); 
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		iSoccer isoccer = iSoccer.getInstance();
		
		setLayout(new BorderLayout());
		
		add(new JLabel("Ônibus"), BorderLayout.NORTH);

		textArea.append(isoccer.getBus() == null ? "Indisponível\n" : "Disponível\n");
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll, BorderLayout.CENTER);
	}
}
