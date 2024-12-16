package testVeivolo;

public class Elicottero extends Veivoli{

	public Elicottero(String modello, int velocitaMassiama) {
		super(modello, velocitaMassiama);
	}

	@Override
	public void atteraggio() {
		System.out.println("attero sulla piattaforma");	
	}
	
	@Override
	public void decollo() {
		System.out.println("decollo dalla piattaforma");	
	}
	
	
}
