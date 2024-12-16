package esercizioProdotti2;

import testPersona.Persona;

public class Cliente extends Persona{
	
	private static int countTessera = 1;
	private int numeroTessera;

	public Cliente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		this.numeroTessera = countTessera++;	
	}

	public int getNumeroTessera() {
		return numeroTessera;
	}

	@Override
	public String toString() {
		return super.toString()+ " numero tessera: "+numeroTessera;
	}
	
	
	
	

}
