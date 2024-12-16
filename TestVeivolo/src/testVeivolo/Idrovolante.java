package testVeivolo;

public class Idrovolante extends Veivoli{

	public Idrovolante(String modello, int velocitaMassiama) {
		super(modello, velocitaMassiama);
	}
	
	@Override
	public void atteraggio() {
		System.out.println("datterro sull'acqua");
	}
	
	@Override
	public void decollo() {
		System.out.println("decollo dall'acqua");
	}

}
