package esercizioGenerico2;

public class TestBottiglia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Bottiglie<String> bottiglia = new Bottiglie<String>();
	
	
	bottiglia.riempi("birra");
	System.out.println("Bottiglia e' vuota? " + bottiglia.eVuota()+", che cosa contiene? "+ bottiglia.getContenuto());
	bottiglia.svuota();
	System.out.println("Bottiglia di birra e' vuota? " + bottiglia.eVuota());
	
	bottiglia.riempi("acqua");
	System.out.println("Bottiglia e' vuota? " + bottiglia.eVuota()+", che cosa contiene? "+ bottiglia.getContenuto());
	bottiglia.svuota();
	System.out.println("Bottiglia d'acqua e' vuota? " + bottiglia.eVuota());
	

	}

}
