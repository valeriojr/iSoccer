package agora_vaiSoccer.Forms;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import agora_vaiSoccer.EditText;
import agora_vaiSoccer.Employee;
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
				System.out.println((String) e.getItem());
				switch((String)e.getItem()) {
				case "Jogador":
					instance.addComponent("newPlayerF", new NewPlayer(parent));
					break;
				case "Médico":
					instance.addComponent("newDoctorF", new NewDoctor(parent));
					break;
				case "Motorista":
					instance.addComponent("newDriverF", new NewDriver(parent));
					break;
				}
				break;
			case ItemEvent.DESELECTED:
				switch((String)e.getItem()) {
				case "Jogador":
					instance.removeComponent("newPlayerF");
					break;
				case "Médico":
					instance.removeComponent("newDoctorF");
					break;
				case "Motorista":
					instance.removeComponent("newDriverF");
					break;
				}
				break;
			}
		}
		
	}

}
