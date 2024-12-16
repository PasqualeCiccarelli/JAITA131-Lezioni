package Portamonete;

public class Portamonete {
	
	private double saldo;

	public Portamonete(double saldo) {
		this.saldo = saldo;
	}
	
	public void aggiungi(double importo) {
		
		if(importo >0) {
			saldo += importo;
			System.out.println("hai aggiunto "+importo+" euro nel portamonete, \nora hai: "+saldo+" euro");
		} else{
			System.out.println("L'importo deve essere positivo babbo non mi freghi");
		}

	}
	
	public void spendi(double importo) throws ControlloSaldo {
		
		if(importo > saldo) {
			throw new ControlloSaldo("Errore SAldo insufficiente");
		} else if (importo <=0 ) {
			System.out.println("L'importo deve essere positivo babbo non mi freghi");
		} else {
			saldo -= importo;
			System.out.println("Hai speso " + importo + " euro. Saldo rimanente: " + saldo + " euro.");
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
	

}
