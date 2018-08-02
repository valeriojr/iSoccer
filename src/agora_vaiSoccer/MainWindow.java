package agora_vaiSoccer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import agora_vaiSoccer.Forms.AddEmployeeForm;
import agora_vaiSoccer.Forms.AddForm;
import agora_vaiSoccer.Forms.AddResourceForm;
import agora_vaiSoccer.Forms.AddSupporterForm;
import agora_vaiSoccer.Forms.Form;
import agora_vaiSoccer.Forms.NewEmployee;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private JPanel contentPane, panel;
	private Component employeeForm, resourceForm, supporterForm;
	private JMenu mnAdd, mnReport;
	private JMenuItem mntmEmployee, mntmResource, mntmSupporter, mntmTeam;
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
		
		employeeForm = new AddEmployeeForm();
		resourceForm = new AddResourceForm(panel);
		supporterForm = new AddSupporterForm();
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JButton addButton = new JButton("Adicionar");
		contentPane.add(addButton, BorderLayout.SOUTH);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		mnAdd = new JMenu("Adicionar");
		menuBar.add(mnAdd);
		
		mntmEmployee = new JMenuItem("Funcionário");
		mnAdd.add(mntmEmployee);
		mntmEmployee.addActionListener(new MenuListener());
		
		mntmResource = new JMenuItem("Recurso");
		mnAdd.add(mntmResource);
		mntmResource.addActionListener(new MenuListener());
		
		mntmSupporter = new JMenuItem("Sócio torcedor");
		mnAdd.add(mntmSupporter);
		mntmSupporter.addActionListener(new MenuListener());
		
		mnReport = new JMenu("Relatório");
		menuBar.add(mnReport);
		
		mntmTeam = new JMenuItem("Time");
		mnReport.add(mntmTeam);
		mntmTeam.addActionListener(new MenuListener());
	}
	
	public class MenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem) e.getSource();
			
			if(item == mntmEmployee) {
				panel.removeAll();
				panel.add(employeeForm, BorderLayout.NORTH);
			}
			if(item == mntmResource) {
				panel.removeAll();
				panel.add(resourceForm, BorderLayout.NORTH);
			}
			if(item == mntmSupporter) {
				panel.removeAll();
				panel.add(supporterForm, BorderLayout.NORTH);
			}
			
			panel.revalidate();
			panel.repaint();
		}
		
	}
}
