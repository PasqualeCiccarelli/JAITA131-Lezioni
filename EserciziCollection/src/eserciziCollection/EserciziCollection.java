package eserciziCollection;

import java.util.Scanner;
import java.util.TreeMap;

public class EserciziCollection {

	public static void main(String[] args) {
		// visto che dobbiamo fare una lista che collega nome ad un numero usisamo map che collega chiave e valore 
		
		TreeMap<String, String> rubrica = new TreeMap<String, String>();
		Scanner s = new Scanner(System.in);
		int scelta = 0;
		
		while(true) {
			
			System.out.println("menu rubrica : \n1)Inserimento \n2)Cancellazione \n3)Ricerca \n4)Elenco \n5)Uscita"); 
			
			scelta=s.nextInt();
			s.nextLine();
			
			switch(scelta) {
				case 1:
					System.out.println("inserisci il nome e il telefono della persona");
					inserisciPersona(rubrica, s.nextLine(), s.nextLine());
					break;
				case 2:
					System.out.println("inserisci il nome della persona da cercare");
					cancellaPersona(rubrica, s.nextLine());
					ricercaPersona(rubrica, s.nextLine());
					break;
				case 3:
					System.out.println("elenco rubrica");
					ricercaPersona(rubrica, s.nextLine());
					break;
				case 4:
					System.out.println("Elenco persone");
					elencoPersone(rubrica);
					break;
				case 5:
					System.out.println("uscita");
					return;
				default:
					System.out.println("scelta non valida");
			}
		}
	}//fine main 

	//----------------------inizio main-------------------\\
	
	public static void inserisciPersona(TreeMap rubrica, String nome, String telefono) {
		if (rubrica.containsKey(nome)) {
			System.out.println("Errore, la persona esiste gia");
		} else if (rubrica.containsKey(telefono)) {
			System.out.println("Errore, il telefono e gia asseganto ad un'altra persona");
		} else {
			rubrica.put(nome, telefono);
			System.out.println("persona a telefono inseriti correttamente ");
			}
	}
	
	public static void cancellaPersona(TreeMap rubrica, String nome) {
		if (rubrica.remove(nome) != null) {
			System.out.println("persona eliminata con successo");
		} else {
			System.out.println("la persona che vuoi eliminare non esiste");
		}
	}
	
	public static void ricercaPersona(TreeMap rubrica, String nome) {
		String numero = (String)rubrica.get((nome));
		if (numero != null) {
			System.out.println("numero di telefono di "+nome+": "+numero);
		} else {
			System.out.println("la persona specificata non e presente nella rubrica");
		}
	}
	
	public static void elencoPersone(TreeMap rubrica) {
		if(rubrica.isEmpty()) {
			System.out.println("la rubrica e vuota");	
		} else {
		rubrica.forEach((nome, telefono) -> System.out.println(nome+": "+telefono));
		}
	}
}//fine classe
