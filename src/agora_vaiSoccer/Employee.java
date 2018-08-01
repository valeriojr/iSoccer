package agora_vaiSoccer;

public class Employee extends Person {

	private String occupation, salary;
	
	public static String[] occupations = {"Advogado", "Cozinheiro", "Jogador", "Médico", "Motorista", "Preparador físico",
			"Presidente", "Técnico"};
	
	public Employee(String name, String email, String cpf, String phone, String salary, String occupation) {
		super(name, email, cpf, phone);
		this.salary = salary;
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Cargo: %s\nSalário: %s\n", occupation, salary);
	}

	public String getSalary() {
		return salary;
	}
	
	public String getOccupation() {
		return occupation;
	}
}
