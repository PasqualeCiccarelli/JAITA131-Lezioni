package Bibblioteche;

public class Rivista extends MaterialeBiblioteca {
	
	private int numeroEdizione;
	private String periodicita;
	
	public Rivista(String titolo, String autore, boolean disponibile, int numeroEdizione, String periodicita) {
		super(titolo, autore, disponibile);
		this.numeroEdizione = numeroEdizione;
		this.periodicita = periodicita;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", numero edizione: "+ this.numeroEdizione+", periodicita: "+ this.periodicita;
	}

	public int getNumeroEdizione() {
		return numeroEdizione;
	}

	public void setNumeroEdizione(int numeroEdizione) {
		this.numeroEdizione = numeroEdizione;
	}

	public String getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(String periodicita) {
		this.periodicita = periodicita;
	}
	
	

}
