package Bibblioteche;

public class DVD extends MaterialeBiblioteca {
	
	
	private int durataMinuti;
	private String categoria;
	
	public DVD(String titolo, String autore, boolean disponibile, int durataMinuti, String categoria) {
		super(titolo, autore, disponibile);
		this.durataMinuti = durataMinuti;
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", durata minuti: "+ this.durataMinuti+", categoria: "+ this.categoria;
	}

	public int getDurataMinuti() {
		return durataMinuti;
	}

	public void setDurataMinuti(int durataMinuti) {
		this.durataMinuti = durataMinuti;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
