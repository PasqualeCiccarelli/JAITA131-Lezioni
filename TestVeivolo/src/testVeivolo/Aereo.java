package testVeivolo;

public class Aereo extends Veivoli{

	public Aereo(String modello, int velocitaMassiama) {
		super(modello, velocitaMassiama);
	}
	
	@Override
	public void decollo() {
		System.out.println("decolla dalla pista");
	}
	
	@Override
	public void atteraggio() {
		System.out.println("atterra salla pista");	
	}

}
