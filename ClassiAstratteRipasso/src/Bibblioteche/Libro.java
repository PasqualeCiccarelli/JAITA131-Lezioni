package Bibblioteche;

public class Libro extends MaterialeBiblioteca{
	
	
	private int numeroPagine;
	private String genere;
	
	
	public Libro(String titolo, String autore, boolean disponibile, int numeroPagine, String genere) {
		super(titolo, autore, disponibile);
		this.numeroPagine = numeroPagine;
		this.genere = genere;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", numero pagine: "+ this.numeroPagine+", genere: "+ this.genere;
	}


	public int getNumeroPagine() {
		return numeroPagine;
	}


	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}


	public String getGenere() {
		return genere;
	}


	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	
	
	

}
