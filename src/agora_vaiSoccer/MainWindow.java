package agora_vaiSoccer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import agora_vaiSoccer.Forms.AddEmployeeForm;
import agora_vaiSoccer.Forms.AddForm;
import agora_vaiSoccer.Forms.AddSupporterForm;
import agora_vaiSoccer.Forms.Form;
import agora_vaiSoccer.Forms.NewEmployee;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private JPanel contentPane;
	private Map<String, TreeMap<String, Employee>> employees;
	private Map<String, Supporter> supporters;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MainWindow frame = new MainWindow();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		employees = new TreeMap<String, TreeMap<String, Employee>>();
		supporters = new TreeMap<String, Supporter>();
		
		Component form = new AddEmployeeForm();
		contentPane.add(form, BorderLayout.NORTH);
		JButton addButton = new JButton("Adicionar");
		addButton.addActionListener(((AddForm) form).getListener());
		contentPane.add(addButton, BorderLayout.SOUTH);
	}
	
	public void addEmployee(Employee e) {
		if(employees.containsKey(e.getOccupation()) == false) {
			employees.put(e.getOccupation(), new TreeMap<String, Employee>());
		}
		employees.get(e.getOccupation()).put(e.getCpf(), e);
	}
	
	public void removeEmployee(String occupation, String cpf) {
		employees.get(occupation).remove(cpf);
	}
	
	public List getTeamInformation(){
		ArrayList<Employee> team = new ArrayList<Employee>();
		
		Employee coach = (Employee) employees.get("Técnico").values().toArray()[0];
		
		return null;
	}

}
