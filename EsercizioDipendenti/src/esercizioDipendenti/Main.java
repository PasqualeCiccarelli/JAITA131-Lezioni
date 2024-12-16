package esercizioDipendenti;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dipendente[] impiegati = new Dipendente[5];
		
		double totStipendi=0;
		
		Dipendente d1 = new Dipendente("Mariong Sturniolo", 1500);
		Dipendente d2 = new Dipendente("Goku Super Saian", 1600);
		Dipendente d3 = new Dipendente("Kuriso Makise", 3200);
		Dipendente d4 = new Dipendente("Rintaro Ocabe", 2999.99);
		Dipendente d5 = new Dipendente("Luffy cappello di paglia", 500000000);
		
		d1.setEta(49);
		d2.setEta(51);
		d3.setEta(29);
		d4.setEta(29);
		d5.setEta(18);
				
		impiegati[0]=d1;
		impiegati[1]=d2;
		impiegati[2]=d3;
		impiegati[3]=d4;
		impiegati[4]=d5;
		
		for (Dipendente dipendente : impiegati) {
            dipendente.aumento();
		}
		
		for (Dipendente dipendente : impiegati) {
            totStipendi += dipendente.getStipendio();
        }
		
		System.out.println("Totale degli stipendi: " + totStipendi);

	}

}
