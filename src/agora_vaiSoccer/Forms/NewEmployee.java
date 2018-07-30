package agora_vaiSoccer.Forms;

import java.awt.*;

import agora_vaiSoccer.EditText;
import agora_vaiSoccer.Spinner;

@SuppressWarnings("serial")
public class NewEmployee extends Form {

	public NewEmployee(Component parent) {
		super(parent);
		addComponent("salaryTf", new EditText("Salário"));
		addComponent("occupationSp", new Spinner("Cargo", new String[]{"Advogado", "Presidente"}));
	}

}
