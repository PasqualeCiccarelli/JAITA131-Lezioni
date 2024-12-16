package esercizioSupermercato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cassa {
	private ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	LocalDate data = LocalDate.now();
	
	public void leggiProdotto(String codice, String desc, double Prezzo ) {
		Prodotto p = new Prodotto(codice, desc, Prezzo);
		prodotti.add(p);
	}
	
	public void stampaScontrino() {
		double somma = 0;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("Scontrino del' dd/MM/yyyy");
		System.out.println(data.format(formato));
		
		for (Prodotto p : prodotti) {
			System.out.println(p);
			somma += p.getPrezzo();
		}
		
		System.out.println("il tottale della spesa e: "+somma);
		
//		public Prodotto piuCostoso() {
//			double prezzoMax=0;
//			Prodotto piuCostoso =null;
//					
//			for (Prodotto prodotto : prodotti) {
//				if(prodotto.getPrezzo()>prezzoMax) {
//					da finire mi scoccio 
//				}
//			}
//		}
	}

}
