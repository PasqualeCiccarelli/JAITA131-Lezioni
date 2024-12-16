package testRiproducibile;

public class Film extends Multimedia{
	
	private String regista;
	private int visualizzazioni;
	
	public Film(String titolo, int durata, String regista, int visualizzazioni) {
		super(titolo, durata);
		this.regista = regista;
		this.visualizzazioni = visualizzazioni;
	}
	
	@Override
	public void riproduci() {
		// TODO Auto-generated method stub
		System.out.println("Stiamo guardando il film: "+titolo+" di "+regista);
	}

	public int getVisualizzazioni() {
		return visualizzazioni;
	}
	
	public String getRegista() {
		return regista;
	}

}


