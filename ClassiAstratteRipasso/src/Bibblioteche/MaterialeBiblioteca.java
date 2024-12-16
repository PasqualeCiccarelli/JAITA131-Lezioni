package Bibblioteche;

public abstract class MaterialeBiblioteca {
	
	private static int counterCodice =0;
	private String titolo;
	private String autore;
	private boolean disponibile;
	private int codiceIdentificativo;
	
	public MaterialeBiblioteca(String titolo, String autore, boolean disponibile) {
		this.titolo = titolo;
		this.autore = autore;
		this.disponibile = disponibile;
		this.codiceIdentificativo = ++counterCodice;
	}
	
	public void prestito() {
		if(disponibile) {
			disponibile = false;
			System.out.println(this.titolo +" e stato preso in prestito");
		}else {
			System.out.println(this.titolo +" non e disponibile al prestito");
		}
			
	}
	
	public void restituzione() {
		disponibile = true;
		System.out.println(this.titolo +" e stato restituito");
	}
	
	@Override
	public String toString() {
		return "Titolo: "+ this.titolo+", codice: "+this.codiceIdentificativo+ ", autore: "+ this.autore+", disponibile: "+ this.disponibile;
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

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	public int getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(int codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}
	
	

}
