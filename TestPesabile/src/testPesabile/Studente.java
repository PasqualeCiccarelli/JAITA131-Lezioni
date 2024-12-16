package testPesabile;

import testPersona.Persona;

public class Studente extends Persona implements Pesabile{
	
	double peso;
	


	public Studente(double peso, String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.peso= peso;
	}
		
	
	public void pesa() {
		System.out.println("lo studdente"+ getNome()+ " pesa " + peso);	
	}
	
	

}
