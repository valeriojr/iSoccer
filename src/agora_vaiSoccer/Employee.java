package agora_vaiSoccer;

public class Employee extends Person {

	private String occupation;
	private float salary;
	
	public Employee(String name, String email, String cpf, String phone, float salary, String occupation) {
		super(name, email, cpf, phone);
		this.salary = salary;
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Cargo: %s\nSalário: %s\n", occupation, salary);
	}

	
}
