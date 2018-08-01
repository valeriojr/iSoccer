package agora_vaiSoccer;

public class Player extends Employee {
	private String position;
	private boolean able;
	
	public static String[] positions = {"Goleiro", "Volante", "Meia", "Zagueiro", "Lateral esquerdo", "Lateral direito", "Atacante"};
	
	public Player(String name, String email, String cpf, String phone, String salary, String occupation, String position, boolean able) {
		super(name, email, cpf, phone, salary, occupation);
		this.position = position;
		this.able = able;
	}
	
	public String toString() {
		return super.toString() + String.format("Posição: %s\nApto: %s\n", position, able? "Sim" : "Não");
	}
	
	public String getPosition() {
		return position;
	}
	
	public boolean getAble() {
		return able;
	}

}
