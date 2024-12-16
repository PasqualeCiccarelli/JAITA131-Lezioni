package testRiproducibile2;

public class Canzone extends Multimedia {
	
	private final String autore;
	
	public Canzone(String titolo, int durata, String autore) {
        super(titolo, durata);
        this.autore = autore;
    }

	@Override
	public void riproduci() {
		 stampaDettagli();
	     System.out.println("Autore: " + autore);
	}
	
	public String getAutore() {
        return autore;
    }

}
