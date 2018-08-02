package agora_vaiSoccer.Forms;

import java.awt.Component;

import agora_vaiSoccer.EditText;

public class NewTrainingCenter extends Form {

	public NewTrainingCenter(Component parent) {
		super(parent);
		addComponent("dormsTf", new EditText("Número de dormitórios"));
	}

}
