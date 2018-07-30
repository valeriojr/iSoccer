package agora_vaiSoccer.Forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class AddEmployeeForm extends JPanel implements AddForm{
	
	public AddEmployeeForm() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(new NewPerson(this));
		add(new NewEmployee(this));
	}

	@Override
	public ActionListener getListener() {
		return new AddButtonListener();
	}
	
	public class AddButtonListener implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
