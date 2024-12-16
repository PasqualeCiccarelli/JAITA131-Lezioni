package esercizioDadoMoneta;

import java.util.Random;

public class Moneta implements Lanciabile{
	
	private boolean testa = false;
	
	Random r = new Random();

	@Override
	public void lancia() {
		// TODO Auto-generated method stub
		String risultato;
		int lancio = r.nextInt(1,3);
		if(lancio==1) {
			risultato = "testa";
			testa= true;
		} else {
			risultato = "croce";
			testa = false;
		}
		System.out.println("e uscito: "+risultato);
		
	}
	
	public boolean seTesta() {
		return testa;
	}
	
	

}
