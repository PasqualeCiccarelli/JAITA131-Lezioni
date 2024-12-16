package esercizoNegozio;

public class Pantalone extends Abigliamento{
	
	private String modello;

	public Pantalone(String taglia, double prezzo, String colore, int quantita, String modello) {
		super(taglia, prezzo, colore, quantita);
		this.modello = modello;
	}
	
	@Override
	public void applicaSconto() {
		if(modello.equalsIgnoreCase("bermuda") && taglia.equalsIgnoreCase("xl")) {
			prezzo =prezzo*0.8;
		}
	}
	
	 @Override
	    public String toString() {
	        return super.toString() + ", Modello: " + modello;
	    }

}
