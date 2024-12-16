package esercizioProdotti2;

public class NonAlimenti extends Prodotto{
	private String materiale;

	public NonAlimenti(String codiceBarre, String descrizione, double prezzo, Cliente cliente, String materiale) {
		super(codiceBarre, descrizione, prezzo, cliente);
		this.materiale = materiale;	
	}
	
	@Override
	public void sconto() {
		super.sconto();
		if(materiale.equalsIgnoreCase("carta") ||  materiale.equalsIgnoreCase("vetro") ||   materiale.equalsIgnoreCase("plastica")) {
			setPrezzo(getPrezzo() - getPrezzo() * 0.10);
		}
	}

	@Override
	public String toString() {
		return super.toString()+ " materiale=" + materiale;
	}
	
	
	
}
