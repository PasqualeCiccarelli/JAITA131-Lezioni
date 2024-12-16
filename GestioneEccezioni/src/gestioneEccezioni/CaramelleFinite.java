package gestioneEccezioni;

public class CaramelleFinite extends Exception {
	
	public CaramelleFinite() {
		System.out.println("hai mangiato tutte le caramelle");
	}
	
	public CaramelleFinite(String messagio) {
		super (messagio);
	}

}
