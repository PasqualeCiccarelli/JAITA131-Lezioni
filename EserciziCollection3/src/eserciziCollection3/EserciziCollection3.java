package eserciziCollection3;

import java.util.Scanner;
import java.util.TreeMap;

public class EserciziCollection3 {
	


	public static void main(String[] args) {
		//menu rubrica telefonica
		//non ci sono 2 persone con lo stesso nome, o 2 persone con lo stesso numero
		//menu: 1 inserimento nome e numero 2) cancellazione persona 3)ricerca persona 4) elenco nomi in ordine alfabetico con relativo numero presenti in rubrica 5) uscita
		//i puntiu da 1 a 4 devono essere realizzati tramite chiamate a metodi
		TreeMap<String, String> rubrica = new TreeMap<String, String>();
		 Scanner s = new Scanner(System.in);
		 
		while(true) {
			System.out.println("ecco a te l'incredibile menu rubrica:\npremere 1 per inserire persona\npremere 2 per cancellare una persona dalla faccia della terra \npremere 3 per ricercare una persona \npremere 4 per tutto l'elenco della rubrica\npremere 5 per uscire");
			int scelta = s.nextInt();
			s.nextLine();
			switch (scelta) {
			case 1:
				//inserimento
				inserimento(rubrica, s.nextLine(), s.nextLine());
				break;
			case 2:
				//cancella
				cancellazione(rubrica,s.nextLine(), s.nextLine());
				break;
			case 3:
				//ricerca
				ricercazzione(rubrica,s.nextLine());
				break;
			case 4:
				//elenco
				elencazione(rubrica);
				break;
			case 5:
				System.out.println("addio per sempre");
				return;
			default:
				System.out.println("che caspio hai inserito SCEMO!!!!");
			}
		}
	}//fine main
	
	public static void inserimento(TreeMap rubrica, String nome, String numero) {
		if(rubrica.containsKey(nome)) {
			System.out.println("nome gia inserito");
		} else if (rubrica.containsValue(numero)) {
			System.out.println("il numero e gia inserito");
		}else {
		rubrica.put(nome, numero);
		}
	}
	
	public static void cancellazione(TreeMap rubrica, String nome, String numero) {
		if(rubrica.containsKey(nome) && rubrica.containsValue(numero)) {
			rubrica.remove(nome, numero);
		} else {
			System.out.println("il nome e il numero inseriti non esistono");
		}
	}
	
	public static void ricercazzione(TreeMap rubrica, String nome) {
		if(rubrica.containsKey(nome)) {
			System.out.println("il nome inserito e presente in rubrica e il suo numero e "+ rubrica.get(nome));
		} else {
			System.out.println("il noe non e presente in rubrica, sara morto");
		}
	}
	
	public static void elencazione(TreeMap rubrica) {
		if(rubrica.isEmpty()) {
			System.out.println("la rubrica e vuora");
		}else {
			rubrica.forEach((nome, numero) -> System.out.println("nome: "+nome+" numero: "+numero));
		}
	}
	
  
	
	
	
	
	
	
}
