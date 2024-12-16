package esercizioListe;

import java.util.HashSet;
import java.util.Scanner;

public class EsercizioListe {

	public static void main(String[] args) {
//		Creare un programma che consenta di aggiungere, rimuovere, visualizzare e verificare se un determinato partecipante è presente in un elenco utilizzando un HashSet. 
//
//	    Implementa il seguente menu:
//	        Opzione 1: Aggiungi partecipante
//	            Richiedi all'utente di inserire il nome del partecipante da aggiungere all'evento.
//	       Opzione 2: Rimuovi partecipante
//	            Richiedi all'utente di inserire il nome del partecipante da rimuovere dall'evento.
//	Opzione 3: Visualizza partecipanti
//	            Stampa tutti i nomi dei partecipanti presenti nell'HashSet.
//	        Opzione 4: Verifica partecipante
//	            Richiedi all'utente di inserire il nome del partecipante da verificare se è presente nell'Hashset
//	        Opzione 5: Esci
//	            Termina il programma.
//
//	    Implementa un ciclo che richieda all'utente di selezionare un'opzione dal menu finché non sceglie Esci.
		
		HashSet<String> partecipanti = new HashSet<String>();
		Scanner s = new Scanner(System.in);
		int scelta;
		
		
		
		
		while(true) {
			System.out.println("seleziona una opzione:\n1 aggiungi \n2rimuovi \n3visualizza \n4verifica \n5esci");
			scelta = s.nextInt();
			s.nextLine();
			String nome = "";
			switch(scelta) {
			case 1:
				//aggiungi
				System.out.println("inserisci un partecipante");
				nome = s.nextLine().toLowerCase();
				if(partecipanti.add(nome)) {
					System.out.println("Aggiunto con successo");
				} else {
					System.out.println("La persona che vuoi aggiungere esiste gia");
				}
				break;
			case 2:
				//rimuovi
				System.out.println("inbserisci la persona da rimuovere");
				nome=s.nextLine().toLowerCase();
				if(partecipanti.remove(nome)) {
					System.out.println("persona rimossa con successo");
				} else {
					System.out.println("la persona che vuoi rimuovere non e presente nell elenco");
				}
				break;
			case 3:
				//visualizza
				if(partecipanti.isEmpty()) {
					System.out.println("non c'e nessun parteciopante");
				} else {
					System.out.println("el;enco partecipanti:");
					for (String persona : partecipanti) {
						System.out.println(persona+" ");
					}
				}
				break;
			case 4:
				//verifica
				System.out.println("inserisci il nome da verificare esistenza");
				nome=s.nextLine().toLowerCase();
				if(partecipanti.contains(nome)) {
					System.out.println("la persona e presente nell' elenco");
				} else {
					System.out.println("non e presente ");
				}
				break;
			case 5:
				//esci
				System.out.println("ciao e grazie");
				return;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
