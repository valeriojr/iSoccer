package agora_vaiSoccer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import agora_vaiSoccer.Forms.AbleReport;
import agora_vaiSoccer.Forms.AddEmployeeForm;
import agora_vaiSoccer.Forms.AddForm;
import agora_vaiSoccer.Forms.AddResourceForm;
import agora_vaiSoccer.Forms.AddSupporterForm;
import agora_vaiSoccer.Forms.BusReport;
import agora_vaiSoccer.Forms.Form;
import agora_vaiSoccer.Forms.NewEmployee;
import agora_vaiSoccer.Forms.ServicesReport;
import agora_vaiSoccer.Forms.StadiumReport;
import agora_vaiSoccer.Forms.SupportersReport;
import agora_vaiSoccer.Forms.TeamReport;
import agora_vaiSoccer.Forms.TrainingCenterReport;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	private static String username = "admin", pass = "123";
	private JPanel contentPane, panel;
	private Component employeeForm, resourceForm, supporterForm, servicesReport;
	private JMenu mnAdd, mnReport;
	private JMenuItem mntmEmployee, mntmResource, mntmSupporter, mntmTeam, mntmGeneralServices, mntmStadium, mntmBus, mntmTrainingCenter, 
		mntmAble, mntmSupporters;
	private JButton addButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame login = new JFrame();
		login.setSize(600, 600);
		login.setLayout(new GridLayout(0, 1));
		final EditText user = new EditText("Usuário"), password = new EditText("Senha");
		JButton loginButton = new JButton("Entrar");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(user.getText().equals(username) && password.getText().equals(pass)) {
					login.setVisible(false);
					login.dispose();
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				}else {
					System.exit(0);
				}
				
			}
		});
		login.add(user);
		login.add(password);
		login.add(loginButton);
		login.setVisible(true);
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
		resourceForm = new AddResourceForm(contentPane);
		supporterForm = new AddSupporterForm();
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		contentPane.add(panel, BorderLayout.CENTER);
		
		addButton = new JButton("Adicionar");
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
		
		mntmGeneralServices = new JMenuItem("Serviços gerais");
		mnReport.add(mntmGeneralServices);
		mntmGeneralServices.addActionListener(new MenuListener());
		
		mntmStadium = new JMenuItem("Estádio");
		mnReport.add(mntmStadium);
		mntmStadium.addActionListener(new MenuListener());
		
		mntmBus = new JMenuItem("Ônibus");
		mnReport.add(mntmBus);
		mntmBus.addActionListener(new MenuListener());
		
		mntmTrainingCenter = new JMenuItem("Centro de treinamento");
		mnReport.add(mntmTrainingCenter);
		mntmTrainingCenter.addActionListener(new MenuListener());
		
		mntmAble = new JMenuItem("Aptos para jogar");
		mnReport.add(mntmAble);
		mntmAble.addActionListener(new MenuListener());
		
		mntmSupporters = new JMenuItem("Sócios torcedores");
		mnReport.add(mntmSupporters);
		mntmSupporters.addActionListener(new MenuListener());
	}
	
	public class MenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem) e.getSource();
			
			panel.removeAll();
			
			if(item == mntmEmployee) {
				panel.add(employeeForm, BorderLayout.NORTH);
				addButton.addActionListener(((AddEmployeeForm) employeeForm).getListener());
			}
			if(item == mntmResource) {
				panel.add(resourceForm, BorderLayout.NORTH);
				addButton.addActionListener(((AddResourceForm) resourceForm).getListener());
			}
			if(item == mntmSupporter) {
				panel.add(supporterForm, BorderLayout.NORTH);
				addButton.addActionListener(((AddSupporterForm) supporterForm).getListener());
			}
			if(item == mntmGeneralServices) {
				panel.add(new ServicesReport(), BorderLayout.NORTH);
			}
			if(item == mntmTeam) {
				panel.add(new TeamReport(), BorderLayout.NORTH);
			}
			if(item == mntmStadium) {
				panel.add(new StadiumReport(), BorderLayout.NORTH);
			}
			if(item == mntmTrainingCenter) {
				panel.add(new TrainingCenterReport(), BorderLayout.NORTH);
			}
			if(item == mntmBus) {
				panel.add(new BusReport(), BorderLayout.NORTH);
			}
			if(item == mntmAble) {
				panel.add(new AbleReport(), BorderLayout.NORTH);
			}
			if(item == mntmSupporters) {
				panel.add(new SupportersReport(), BorderLayout.NORTH);
			}
			
			contentPane.revalidate();
			contentPane.repaint();
		}
		
	}
}
