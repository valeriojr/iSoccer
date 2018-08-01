package agora_vaiSoccer.Forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import agora_vaiSoccer.Driver;
import agora_vaiSoccer.Employee;

@SuppressWarnings("serial")
public class AddEmployeeForm extends JPanel implements AddForm{
	
	private Form newPerson, newEmployee;
	
	public AddEmployeeForm() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		newPerson = new NewPerson(this);
		newEmployee = new NewEmployee(this);
		add(newPerson);
		add(newEmployee);
	}

	@Override
	public ActionListener getListener() {
		return new AddButtonListener();
	}
	
	public class AddButtonListener implements ActionListener{
		private Employee employee;
		
		public AddButtonListener() {
			employee = null;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String widgetNames[] = {"nameTf", "emailTf", "cpfTf", "phoneTf"};
			String personInfo[] = new String[4];
			
			for(int i = 0;i < widgetNames.length;i++) {
				personInfo[i] = newPerson.getInput(widgetNames[i]);
				if(personInfo[i] == null) {
					JOptionPane.showMessageDialog(null, "PEntrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			String salary = newEmployee.getInput("salaryTf");
			String occupation = newEmployee.getInput("occupationSp");
			if(salary == null || occupation == null) {
				JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
				return;
			}
				
			switch(occupation) {
			case "Jogador":
				break;
			case "Médico":
				break;
			case "Motorista":
				String cnh = newEmployee.getInput("cnhTf");
				if(cnh == null) {
					JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);	
				}else {
					employee = new Driver(personInfo[0], personInfo[1], personInfo[2], personInfo[3], salary, occupation, cnh);
				}
				break;
			default:
				employee = new Employee(personInfo[0], personInfo[1], personInfo[2], personInfo[3], salary, occupation);
			}
		}
		
		public Employee getEmployee() {
			return employee;
		}
	}
}
