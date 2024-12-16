package testVeivolo;

public abstract class Veivoli {
	
	private String modello;
	private int velocitaMassiama;
	
	public Veivoli(String modello, int velocitaMassiama) {
		this.modello = modello;
		this.velocitaMassiama = velocitaMassiama;
	}
	
	/**
	 * Metodo astratti
	 * dovra essere implementato nelle classi ereditate
	 */
	public abstract void decollo();
	
	/**
	 * Metodo astratti
	 * dovra essere implementato nelle classi ereditate
	 */
	public abstract void atteraggio();
	
	

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getVelocitaMassiama() {
		return velocitaMassiama;
	}

	public void setVelocitaMassiama(int velocitaMassiama) {
		this.velocitaMassiama = velocitaMassiama;
	}

	@Override
	public String toString() {
		return "Veivoli [modello=" + modello + ", velocitaMassiama=" + velocitaMassiama + "]";
	}
	
	
	
	

}
