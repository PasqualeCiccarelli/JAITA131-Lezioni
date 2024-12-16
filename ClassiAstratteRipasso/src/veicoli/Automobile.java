package veicoli;

public class Automobile extends Veicolo implements VeicoloElettrico {
	
	public Automobile(String marca) {
		super(marca);
	}

	//OBBLIGATORIO IMPLEMENTARE METODI ASTRATTI (cioe fare l'override dei metodi della classe abstract)
	@Override
	void accellera() {
		System.out.println("L'auto sta accellerando");
	}
	
	//OPZIONALE  fare l'ovveride dei metodi non abstract della classe abstract
	@Override
	public void accendi() {
		System.out.println("Ho acceso l'auto");
	}
	
	@Override
	public void ricarica() {
		System.out.println("Ricarica completata !");
	}

	@Override
	public void sostituisciBatteria() {
		System.out.println("la batteria e stata sostituita");
	}
	
	

}
