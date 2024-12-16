package testStrumenti;

public class Tromba extends Strumento{
	
	private int numeroTasti;
	
	public Tromba(String nome, int numeroTasti) {
		super(nome);
		this.numeroTasti = numeroTasti;
	}
	
	public void suona() {
		System.out.println("la tromba suona con l'aria");
	}
}
