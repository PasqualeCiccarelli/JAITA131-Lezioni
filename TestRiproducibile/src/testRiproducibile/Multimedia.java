package testRiproducibile;

public abstract class Multimedia {
	
	protected String titolo;
	protected int durata;
	
	public Multimedia(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public abstract void riproduci();
	
	

}


