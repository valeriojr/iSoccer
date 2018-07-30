package agora_vaiSoccer;

public class Person {
	private String name, email, cpf, phone;
	
	public Person(String name, String email, String cpf, String phone) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nE-mail: %s\nCPF: %s\nTelefone: %s\n", name, email, cpf, phone);
	}
}
