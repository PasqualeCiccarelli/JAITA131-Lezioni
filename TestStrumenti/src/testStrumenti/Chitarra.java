package testStrumenti;

public class Chitarra extends Strumento{
	
	private int numeroCorde;
	
	public Chitarra(String nome, int numeroCorde) {
		super(nome);
		this.numeroCorde = numeroCorde;
	}
	
	public void suona() {
		System.out.println("la chitarra suona con le corde");
	}
}
