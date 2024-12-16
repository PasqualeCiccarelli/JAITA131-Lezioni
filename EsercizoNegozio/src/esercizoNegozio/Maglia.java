package esercizoNegozio;

public class Maglia extends Abigliamento {
	
	private String tipo;

	public Maglia(String taglia, double prezzo, String colore, int quantita, String tipo) {
		super(taglia, prezzo, colore, quantita);
		this.tipo = tipo;
	}

	@Override
	public void applicaSconto() {
		if(tipo.equalsIgnoreCase("felpa") && colore.equalsIgnoreCase("rosso") && quantita >=2) {
			prezzo = prezzo*0.9;
		}
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
	
	
	

}
