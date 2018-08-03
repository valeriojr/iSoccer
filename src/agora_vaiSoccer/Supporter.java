package agora_vaiSoccer;

public class Supporter extends Person {

	public enum Type{Júnior, Sênior, Elite}
	public static float pricing[] = new float[3];
	
	private String address;
	private boolean situation;
	private Type type;
	
	public Supporter(String name, String email, String cpf, String phone, String address, boolean situation, Type type) {
		super(name, email, cpf, phone);
		this.address = address;
		this.situation = situation;
		this.type = type;
	}
	
	public static float[] getPricing() {
		return pricing;
	}

	public static void setPricing(float[] pricing) {
		Supporter.pricing = pricing;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSituation() {
		return situation;
	}

	public void setSituation(boolean situation) {
		this.situation = situation;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Endereço: %s\nSituação: %s\nTipo: %s\n", address, situation? "Adimplente":"Inadimplente", type);
	}
	
	public static void setPrice(Type type, float price) {
		pricing[type.ordinal()] = price;
	}

}
