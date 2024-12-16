package provaSet;

import java.util.HashSet;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		//SET
		//e' una lista di valori che non ammette duplicati
		// non e' ordinata -> non segue NECESSARIAMENTE l' ordine in cui ho messo i valori
		// l'ordine all'interno della lista diopende da una funzione di hash
		//NON esiste il metodo get per trovare un elemento
		//Hashset -> non segue l'ordine di inserimento
		//TreeSet -> ordiona a prescindere dall'ordine in cui io inserisco i valori
		
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("c");
		hash.add("a");
		hash.add("b");
		hash.add("b");
		hash.add("a");
		
		System.out.println(hash);
		System.out.println(hash.add("d"));//true se non e ancoora presente l'elemento
		System.out.println(hash.add("d"));//false  se e' gia presente
		
		for(String valore : hash) { //visto che non esiste .get possiamo stamaprlo solo in questo modo
			System.out.println(valore);
		}
		
		//di defalt e ordinato
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(2);
		ts.add(9);
		ts.add(5);
		
		System.out.println(ts);
		

	}

}
