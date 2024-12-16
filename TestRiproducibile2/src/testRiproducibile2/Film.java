package testRiproducibile2;

public class Film extends Multimedia{
	
	private final String regista;
    private final int visualizzazioni;
    
    public Film(String titolo, int durata, String regista, int visualizzazioni) {
        super(titolo, durata);
        this.regista = regista;
        this.visualizzazioni = visualizzazioni;
    }

	@Override
	public void riproduci() {
        stampaDettagli();
        System.out.println("Regista: " + regista + ", Visualizzazioni: " + visualizzazioni);
    }

	public String getRegista() {
        return regista;
    }

    public int getVisualizzazioni() {
        return visualizzazioni;
    }
    

}
