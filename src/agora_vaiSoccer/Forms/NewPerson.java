package agora_vaiSoccer.Forms;

import java.awt.*;

import agora_vaiSoccer.EditText;

@SuppressWarnings("serial")
public class NewPerson extends Form {

	public NewPerson(Component parent) {
		super(parent);

		String fields[][] = {{"nameTf", "emailTf", "cpfTf", "phoneTf"}, {"Nome completo", "Endereço de e-mail", "CPF", "Telefone"}};
		for(int i = 0;i < fields[0].length;i++){
			addComponent(fields[0][i], new EditText(fields[1][i]));
		}
	}
}
