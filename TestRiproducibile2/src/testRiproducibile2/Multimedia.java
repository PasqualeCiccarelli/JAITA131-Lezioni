package testRiproducibile2;

public abstract class Multimedia {
	
	protected String titolo;
    protected int durata;
    
    public Multimedia(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }
    
    public void stampaDettagli() {
        System.out.println("Titolo: " + titolo + ", durata: " + durata);
    }
    
    public abstract void riproduci();

}
