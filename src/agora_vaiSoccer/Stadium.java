package agora_vaiSoccer;

public class Stadium extends Resource {
	private int spectators, bathrooms, snackBars; 
	
	public Stadium(int spectators, int bathrooms, int snackBars) {
		this.spectators = spectators;
		this.bathrooms = bathrooms;
		this.snackBars = snackBars;
	}

	public int getSpectators() {
		return spectators;
	}

	public void setSpectators(int spectators) {
		this.spectators = spectators;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getSnackBars() {
		return snackBars;
	}

	public void setSnackBars(int snackBars) {
		this.snackBars = snackBars;
	}
	
	
}
