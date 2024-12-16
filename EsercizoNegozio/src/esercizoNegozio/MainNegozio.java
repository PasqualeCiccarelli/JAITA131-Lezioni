package esercizoNegozio;

import java.util.ArrayList;

public class MainNegozio {

	public static void main(String[] args) {
//		Scrivere la classe astratta Abbigliamento che ha gli attributi taglia,
//		prezzo, colore e quantità, e il metodo astratto applicaSconto.
//
//		Scrivere le classi concrete maglia e pantalone, sottoclassi della classe Abbigliamento.
//
//		La classe maglia ha in più l'attributo tipo(t-shirt o felpa), 
//		mentre la classe pantalone ha l'attributo modello(jeans o bermuda)
//
//		Si ottiene uno sconto del 10% se si acquistano 2 o più felpe rosse.
//
//		Si ottiene uno sconto del 20% sui pantaloncini con la taglia xl.
//		Nel main creare un elenco di Abbigliamenti, calcolare eventuali sconti,
//		e calcolare il totale speso(prezzo* quantitàAcquistata).

		double totSpesa=0.0;
		
		ArrayList<Abigliamento> abbigliamenti = new ArrayList<Abigliamento>();
		
		abbigliamenti.add(new Maglia("L", 20.0, "blu", 3, "t-shirt"));
		abbigliamenti.add(new Maglia("M", 25.0, "rosso", 2, "felpa"));
		abbigliamenti.add(new Pantalone("XL", 30.0, "blu", 1, "bermuda"));
		abbigliamenti.add(new Pantalone("L", 35.0, "nero", 1, "jeans"));
		
		for (Abigliamento abbigliamento : abbigliamenti) {
			abbigliamento.applicaSconto();
			double totArticolo =  abbigliamento.calcolaTotale();
			totSpesa += totArticolo;
			
			System.out.println(abbigliamento);
			System.out.println("Totale dopo gli sconti "+ totArticolo);
			System.out.println();
		}
		
		System.out.println("Oggi hai speso: "+ totSpesa);
	
	}

}
