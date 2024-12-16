package esercizoNegozio;

public abstract class Abigliamento {
	protected String taglia;
    protected double prezzo;
    protected String colore;
    protected int quantita;
    //protected  double sconto = 1.0;
	
    public Abigliamento(String taglia, double prezzo, String colore, int quantita) {
		this.taglia = taglia;
		this.prezzo = prezzo;
		this.colore = colore;
		this.quantita = quantita;
		
	}
    
    public abstract void applicaSconto();
    
    public double calcolaTotale() {
        return prezzo * quantita;//*sconto;
    }

	@Override
	public String toString() {
		return "Abigliamento: taglia=" + taglia + ", prezzo=" + prezzo + ", colore=" + colore + ", quantita=" + quantita;
	}
    
    
    
   

}
