package esercizioCollection4;

import java.util.ArrayDeque;

public class EsercizioCollection4 {
	
	static int biglietto =0;
	
	public static void main(String[] args) {
		// creare sistema informativo per la gestione delle persone alle poste
		//la persona che entra alla posta tocca lo schermo e le viene generato un biglietto 
		//con indicato il suo numero nella coda
//		l'impiegato della posta schiacccia un bottone per incrementare il prossimo numero da servire
//		
//		creare i seguenti due metodi
//		
//		1) prenota che genera il successivo numero da servire come numero progressivo
//		2) servi: per servire la persona una vcolta servita la persona il numero deve essre eliminato 
//				  e viene servita un altra persona se presente
//
//		finche cci sono persone in coda, visualizza la ccoda dei numeri e il numero che e servito al momento

		ArrayDeque<Integer> liste = new ArrayDeque<Integer>();
		incrementaBiglietto(liste);
		incrementaBiglietto(liste);
		incrementaBiglietto(liste);
		incrementaBiglietto(liste);
		incrementaBiglietto(liste);
		
		servi(liste);
		servi(liste);
		servi(liste);
		
		for (Integer listina : liste) {
			System.err.println(listina);
		}
		
	}//fine main
	
		public static void incrementaBiglietto(ArrayDeque<Integer> liste) {
			liste.add(++biglietto);
			System.err.println("o mio dio hai preso il biglietto numero "+ biglietto);
		}
		
		public static void servi(ArrayDeque<Integer> liste) {
			liste.poll();
		}
		
	    

}
