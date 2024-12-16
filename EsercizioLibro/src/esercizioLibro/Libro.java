package esercizioLibro;

public class Libro {
	/*
	  	Scrivere una classe Libro che rappresenti le seguenti informazioni relative ad un libro:
		titolo, autore, prezzo, e che contenga il costruttore e tutti i metodi get e set e toString
		Scrivere poi una classe Libreria, che rappresenti un insieme di libri, e che contenga il
		costruttore , i metodi get, set e toString, ed un metodo trova, che accetta in ingresso
		un autore, e restituisca i titoli di tutti i libri scritti da quell’autore.
		Creare la classe TestLibreria per testare le 2 classi,

	*/
	
	private String titolo;
	private String autore;
	private double prezzo;
	
	
	
	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
	}
	
	
	
	

}
