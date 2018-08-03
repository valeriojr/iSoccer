package agora_vaiSoccer.Forms;

import java.awt.BorderLayout;
import java.util.Map.Entry;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import agora_vaiSoccer.iSoccer;

public class StadiumReport extends JPanel {
	public StadiumReport() {
		JTextArea textArea = new JTextArea(12, 30); 
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		iSoccer isoccer = iSoccer.getInstance();
		
		setLayout(new BorderLayout());
		
		add(new JLabel("Estádio"), BorderLayout.NORTH);

		textArea.append(isoccer.getStadium() == null ? "Indisponível\n" : isoccer.getStadium().toString());
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll, BorderLayout.CENTER);
	}
}
