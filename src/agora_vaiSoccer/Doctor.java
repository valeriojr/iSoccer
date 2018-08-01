package agora_vaiSoccer;

public class Doctor extends Employee {
	private String crm;

	public Doctor(String name, String email, String cpf, String phone, String salary, String occupation, String crm) {
		super(name, email, cpf, phone, salary, occupation);
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("CRM: %s\n", crm);
	}

}
