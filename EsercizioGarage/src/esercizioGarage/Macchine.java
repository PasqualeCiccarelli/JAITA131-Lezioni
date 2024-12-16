package esercizioGarage;

public class Macchine {
	private String marca;
	private String modello;
	
	
	public Macchine(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	@Override
	public String toString() {
		return marca + " " + modello;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
