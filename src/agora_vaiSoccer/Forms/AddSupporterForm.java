package agora_vaiSoccer.Forms;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import agora_vaiSoccer.Supporter;
import agora_vaiSoccer.iSoccer;
import agora_vaiSoccer.Supporter.Type;

@SuppressWarnings("serial")
public class AddSupporterForm extends JPanel implements AddForm{
	
	Form forms[] = new Form[2];
	ButtonListener listener;
	
	public AddSupporterForm() {
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		listener = new ButtonListener();
		
		forms[0] = new NewPerson(this);
		add(forms[0]);
		forms[1] = new NewSupporter(this);
		add(forms[1]);
	}

	@Override
	public ActionListener getListener() {
		return listener;
	}
	
	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {

			String name, email, cpf, phone, address, type;
			name = forms[0].getComponents()[0].toString();
			email = forms[0].getComponents()[1].toString();
			cpf = forms[0].getComponents()[2].toString();
			phone = forms[0].getComponents()[3].toString();
			address = forms[1].getComponents()[0].toString();
			type = forms[1].getComponents()[1].toString();
			
			iSoccer.getInstance().add(new Supporter(name, email, cpf, phone, address, false, Supporter.Type.valueOf(type)));
		}
	}
}
