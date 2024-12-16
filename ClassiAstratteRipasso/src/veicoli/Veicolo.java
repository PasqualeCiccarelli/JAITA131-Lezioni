package veicoli;

public abstract class Veicolo {
	
	protected String marca;
	
	public Veicolo(String marca) {
		this.marca = marca;
	}
	
	
	//posso avere metodi astratti i quali vanno implementati dalla sottoclasse
	abstract void accellera();
	
	//posso avere metodi concreti
	public void accendi() {
		System.out.println("Veicolo acceso "+this.marca);
	}
	
	public void spegni() {
		System.out.println("Veicolo spento "+this.marca);
	}
	
}
