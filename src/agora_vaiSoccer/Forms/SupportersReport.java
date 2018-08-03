package agora_vaiSoccer.Forms;

import java.awt.BorderLayout;
import java.util.Map.Entry;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import agora_vaiSoccer.Employee;
import agora_vaiSoccer.Supporter;
import agora_vaiSoccer.iSoccer;

public class SupportersReport extends JPanel {
	public SupportersReport(){
		JTextArea textArea = new JTextArea(12, 30); 
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		iSoccer isoccer = iSoccer.getInstance();
		
		setLayout(new BorderLayout());
		
		add(new JLabel("Sócios torcedores"), BorderLayout.NORTH);
		
		int adim = 0, inadim = 0;
		
		for(Entry<String, Supporter> e : isoccer.getSupporters().entrySet()) {
			if(e.getValue().isSituation()) {
				adim++;
			}else {
				inadim++;
			}
		}
		
		textArea.append(String.format("Quantidade: %d\nAdimplentes: %d\nInadimplentes: %d\n", isoccer.getSupporters().size(), adim, inadim));
	
		for(Entry<String, Supporter> e : isoccer.getSupporters().entrySet()) {
				textArea.append(e.getValue().toString());
				textArea.append("---------------\n");
		}
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll, BorderLayout.CENTER);
	}
}
