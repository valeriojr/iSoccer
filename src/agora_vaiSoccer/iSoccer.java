package agora_vaiSoccer;

import java.util.Map;
import java.util.TreeMap;

public class iSoccer {
	private Employee coach, president;
	private Bus bus;
	private Stadium stadium;
	private TrainingCenter trainingCenter;
	private Map<String, Employee> employees;
	private Map<String, Supporter> supporters;
	//Singleton
	private static iSoccer instance;
	
	private iSoccer() {
		employees = new TreeMap<String, Employee>();
		supporters = new TreeMap<String, Supporter>();
	}
	
	public static iSoccer getInstance() {
		if(instance == null) {
			instance = new iSoccer();
		}
		return instance;
	}
	
	public void add(Employee e) {
		if(e.getOccupation().equals("Presidente")) {
			setPresident(e);
		}
		if(e.getOccupation().equals("Técnico")) {
			setCoach(e);
		}
		employees.put(e.getCpf(), e);
		System.out.println(employees.size());
	}

	public void add(Supporter s) {
		supporters.put(s.getCpf(), s);
	}
	
	public void remove(String cpf) {
		if(employees.get(cpf).getOccupation().equals("Presidente")) {
			setPresident(null);
		}
		if(employees.get(cpf).getOccupation().equals("Técnico")) {
			setCoach(null);
		}
		employees.remove(cpf);
	}

	public Employee getCoach() {
		return coach;
	}

	public void setCoach(Employee coach) {
		this.coach = coach;
	}

	public Employee getPresident() {
		return president;
	}

	public void setPresident(Employee president) {
		this.president = president;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public TrainingCenter getTrainingCenter() {
		return trainingCenter;
	}

	public void setTrainingCenter(TrainingCenter trainingCenter) {
		this.trainingCenter = trainingCenter;
	}

	public Map<String, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, Employee> employees) {
		this.employees = employees;
	}

	public Map<String, Supporter> getSupporters() {
		return supporters;
	}

	public void setSupporters(Map<String, Supporter> supporters) {
		this.supporters = supporters;
	}

	public static void setInstance(iSoccer instance) {
		iSoccer.instance = instance;
	}
	
	
}
