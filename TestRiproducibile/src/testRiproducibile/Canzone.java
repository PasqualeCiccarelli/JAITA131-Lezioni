package testRiproducibile;

public class Canzone extends Multimedia{
	
	private String autore;

	public Canzone(String titolo, int durata, String autore) {
		super(titolo, durata);
		this.autore = autore;
	}
	
	@Override
	public void riproduci() {
		// TODO Auto-generated method stub
		System.out.println("Stiamo ascoltado la canzone: "+titolo+" di "+autore);
	}

	public String getAutore() {
		return autore;
	}

	
	
	

}
