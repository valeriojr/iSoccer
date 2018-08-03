package agora_vaiSoccer.Forms;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import agora_vaiSoccer.CheckBox;
import agora_vaiSoccer.EditText;
import agora_vaiSoccer.Employee;
import agora_vaiSoccer.Player;
import agora_vaiSoccer.Spinner;

@SuppressWarnings("serial")
public class NewEmployee extends Form {
	Spinner occupation;
	
	public NewEmployee(Component parent) {
		super(parent);
		
		occupation = new Spinner("Cargo", Employee.occupations);
		occupation.addItemListener(new SpinnerListener());
		EditText salary = new EditText("Salário");
		salary.setRegex("^([+-]?\\d*\\.?\\d*)$");
		
		addComponent("salaryTf", salary);
		addComponent("occupationSp", occupation);
	}
	
	public class SpinnerListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			switch(e.getStateChange()) {
			case ItemEvent.SELECTED:
				switch((String)e.getItem()) {
				case "Jogador":
					instance.addComponent("positionSp", new Spinner("Posição", Player.positions));
					instance.addComponent("ableCb", new CheckBox("Apto para jogar?"));
					break;
				case "Médico":
					instance.addComponent("crmTf", new EditText("CRM"));
					break;
				case "Motorista":
					instance.addComponent("cnhTf", new EditText("CNH"));
					break;
				}
				break;
			case ItemEvent.DESELECTED:
				switch((String)e.getItem()) {
				case "Jogador":
					instance.removeComponent("positionSp");
					instance.removeComponent("ableCb");
					break;
				case "Médico":
					instance.removeComponent("crmTf");
					break;
				case "Motorista":
					instance.removeComponent("cnhTf");
					break;
				}
				break;
			}
		}
		
	}

}
