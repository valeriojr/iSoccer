package agora_vaiSoccer;

public class Driver extends Employee {

	private String cnh;
	
	public Driver(String name, String email, String cpf, String phone, float salary, String occupation, String cnh) {
		super(name, email, cpf, phone, salary, occupation);
		this.cnh = cnh;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("CNH: ", cnh);
	}

}
