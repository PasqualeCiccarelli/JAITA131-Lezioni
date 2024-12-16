package esercizioArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EsercizioArrayList {

	public static void main(String[] args) {
		
		/*
		 * Presentare all'utente un menu di 5 voci con cui l'utente possa fare le seguenti operazioni 
		 * 
		 * inserire un nome dentro l'ArrayList
		 * Cancellare un nome dall'ArrayList
		 * cercare un nome dentro l'arraylist
		 * visualiza l'elenco di tutti i nomi all'interno dell'ArrayList
		 * Uscre dal programma
		 * 
		 * il programma deve presentare il menu finche l'utente non sceglie di uscire
		 */
		
		
		
	ArrayList<String> nomi = new ArrayList<String>();
	Scanner s =new Scanner(System.in);
	
	
	while(true) {
		
		System.out.println("Seleziona un opzione: ");
		System.out.println("1 per inserire un nome ");
		System.out.println("2 per cancellare un nome");
		System.out.println("3 per cercare un nome e sapere se esiste nell'elemco");
		System.out.println("4 visualizza tutti i nomi");
		System.out.println("5 esci");
		
		String nome = "";
		int scelta =s.nextInt();
		s.nextLine();
		
		switch(scelta) {
		case 1: 
			//inserisci il nome
			System.out.println("inserisci un nome");
			nome=s.nextLine().toLowerCase();
			nomi.add(nome);
			System.out.println("nome inserito");
			break;
		case 2:
			//cancella il nome
			System.out.println("Che nome vuoi cancellare?");
			nome = s.nextLine().toLowerCase();
			if(nomi.contains(nome)) {//ritorna true se il valore e contenuto nell AL
				nomi.remove(nome);
				System.out.println("nome eliminato");
			} else {
				System.out.println("il nome che vuoi cancellare non e nell'elenco");
			}
			break;
		case 3:
			//cerca il nome
			System.out.println("Che nome vuoi cercare?");
			nome =s.nextLine().toLowerCase();
			if(nomi.contains(nome)) {
				System.out.println("il nome e presente nell' elenco");
			} else { 
				System.out.println(" il nome non e presente nell'elenco");
			}
			break;
		case 4:
			//visualizza tutti i nomei
			if(nomi.isEmpty()) {
				System.out.println("La lista e vuota");
			} else {
				System.out.println("Ecco tutti i nomi dell' elenco");
				for (String persona : nomi) {
					System.out.println(persona);
				}
			}
			break;
		case 5:
			//esci
			System.out.println("Grazie per aver udsto il nosto programma");
			return;//serve per uscire da tutto
		default:
			//scelta non valida
			System.out.println("Scelta non valida riprova");
			
			}// fine switch
		
		}//fine while
	
	}

}
