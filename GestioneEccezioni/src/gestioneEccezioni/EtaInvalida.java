package gestioneEccezioni;


public class EtaInvalida extends Exception{
	
	public EtaInvalida() {
		System.out.println("Eta non valida");
	}
	public EtaInvalida(String messaggio) {
		super (messaggio);
	}
}
