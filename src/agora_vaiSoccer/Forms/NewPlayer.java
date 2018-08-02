package agora_vaiSoccer.Forms;

import java.awt.Component;

import agora_vaiSoccer.CheckBox;
import agora_vaiSoccer.Player;
import agora_vaiSoccer.Spinner;

@SuppressWarnings("serial")
public class NewPlayer extends Form {

	public NewPlayer(Component parent) {
		super(parent);
		addComponent("positionSp", new Spinner("Posição", Player.positions));
		addComponent("ableCb", new CheckBox("Apto para jogar?"));
	}

}
