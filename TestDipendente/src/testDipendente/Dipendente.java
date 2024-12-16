package testDipendente;

import testPersona.Persona;

public class Dipendente extends Persona{
	
	private double stipendio;

	public Dipendente(int stipendio, String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.stipendio = stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public void aumenta(int percentuale) {
		if(this.getEta() > 50) {
			stipendio += (stipendio*percentuale)/100;
			System.out.println("Aumentato stipendio a "+ this.getNome()+ " nuovo stipendio "+ stipendio);
		}else {
			System.out.println("Aumento non concesso a "+ this.getNome());
		}
	}

	@Override
	public String toString() {
		return super.toString() + " stipendio= " + stipendio;
	}

	
	
	
}
