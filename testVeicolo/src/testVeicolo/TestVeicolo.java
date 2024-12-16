package testVeicolo;

public class TestVeicolo {

	public static void main(String[] args) {
		
		Macchina m = new Macchina("punto", 4, 3);
		System.out.println(m);
		m.parti();
		m.ferma();
		
		Bicicletta b= new Bicicletta("Bianchi", 2, 2);
		System.out.println(b);
		b.parti();
		b.ferma();
		
		Treno t = new Treno("Frecciarossa", 8, 15);
		System.out.println(t);
		t.parti();
		t.ferma();
		
		System.out.println("-----------------------POLIMORFISMO---------------------------------------");
		
		//polimorfismo -> chiamare lo stesso metodo su oggetti diversi
		Veicolo[] mezziDiTrasporto= {m,b,t};
		for (Veicolo veicolo : mezziDiTrasporto) {
			System.out.println(veicolo);
			veicolo.parti();// <- si puo fare perche sono metodi overload
			veicolo.ferma();// <- si puo fare perche sono metodi overload
		}

	}//main
	
	static void stampaInfo(Veicolo v) {
		v.parti();
		v.ferma();
	}

}
