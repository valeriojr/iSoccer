package agora_vaiSoccer.Forms;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;

import agora_vaiSoccer.Bus;
import agora_vaiSoccer.Resource;
import agora_vaiSoccer.Spinner;
import agora_vaiSoccer.Stadium;
import agora_vaiSoccer.TrainingCenter;
import agora_vaiSoccer.iSoccer;

public class AddResourceForm extends Form implements AddForm{

	private Spinner type;
	
	public AddResourceForm(Component parent) {
		super(parent);
		
		type = new Spinner("Tipo de recurso", Resource.types);
		type.addItemListener(new SpinnerItemListener());
		addComponent("resourceTypeSp", type);
	}
	
	public class SpinnerItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			String item = (String) e.getItem();
			if(e.getStateChange() == ItemEvent.SELECTED) {
				switch(item) {
				case "Estádio":
					instance.addComponent("newStadium", new NewStadium(parent));
					break;
				case "Centro de treinamento":
					instance.addComponent("newTrainingCenter", new NewTrainingCenter(parent));
					break;
				}
			}else {
				switch(item) {
				case "Estádio":
					instance.removeComponent("newStadium");
					break;
				case "Centro de treinamento":
					instance.removeComponent("newTrainingCenter");
					break;
				}
			}
		}
		
	}

	@Override
	public ActionListener getListener() {
		return new ButtonListener();
	}
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			switch(type.toString()) {
			case "Ônibus":
				iSoccer.getInstance().setBus(new Bus());
				break;
			case "Estádio":
				int spectators = Integer.valueOf(instance.getInput("spectatorsTf"));
				int bathrooms = Integer.valueOf(instance.getInput("bathroomTf"));
				int snackBars = Integer.valueOf(instance.getInput("snackBarsTf"));
				iSoccer.getInstance().setStadium(new Stadium(spectators, bathrooms, snackBars));
				break;
			case "Centro de treinamento":
				int dorms = Integer.valueOf(instance.getInput("dormsTf"));
				iSoccer.getInstance().setTrainingCenter(new TrainingCenter(dorms));
				break;
			}
		}
		
	}

}
