package testVeivolo;

public class TestVeivolo {

	public static void main(String[] args) {
		
		Aereo a = new Aereo("Boeing 747", 600);
		Elicottero e = new Elicottero("Apache", 500);
		Idrovolante i = new Idrovolante("idro", 300);
		
		Veivoli[] v = {a,e,i};
		
		for (Veivoli veivoli : v) {
			veivoli.decollo();
			veivoli.atteraggio();
		}
		//polimorfisco(stesso metodo, oggetti diversi)

	}

}
