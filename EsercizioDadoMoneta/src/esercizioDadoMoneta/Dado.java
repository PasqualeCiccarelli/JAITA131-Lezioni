package esercizioDadoMoneta;

import java.util.Random;

public class Dado implements Lanciabile{
	
	private boolean sei = false;
	Random r = new Random();

	@Override
	public void lancia() {
		// TODO Auto-generated method stub
		int lancio = r.nextInt(1,7);
		System.out.println("e uscito: "+lancio);
		if (lancio ==6) {
			sei =true;
		}
		
	}
	
	public boolean seSei() {
		return sei;
	}
	
	
	

}
