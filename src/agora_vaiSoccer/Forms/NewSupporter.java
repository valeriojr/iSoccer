package agora_vaiSoccer.Forms;

import javax.swing.*;

import agora_vaiSoccer.EditText;
import agora_vaiSoccer.Spinner;

import java.awt.*;

@SuppressWarnings("serial")
public class NewSupporter extends Form {
	public NewSupporter(Component parent) {
		super(parent);
		
		addComponent("salaryTf", new EditText("Endereço"));
		addComponent("typeSp", new Spinner("Tipo", new String[] {"Júnior", "Sênior", "Elite"}));
	}
}
