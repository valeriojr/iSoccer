package agora_vaiSoccer.Forms;

import java.awt.Component;

import agora_vaiSoccer.EditText;

public class NewStadium extends Form {

	public NewStadium(Component parent) {
		super(parent);
		addComponent("spectatorsTf", new EditText("Capacidade máxima de espectadores"));
		addComponent("bathroomTf", new EditText("Número de banheiros"));
		addComponent("snackBarsTf", new EditText("Número de lanchonetes"));
	}

}
