package agora_vaiSoccer;

public class TrainingCenter extends Resource {
	private int dorms;
	
	public TrainingCenter(int dorms) {
		this.dorms = dorms;
	}
	
	public String toString() {
		return String.format("Dormitórios: %d\n", dorms);
	}
}
