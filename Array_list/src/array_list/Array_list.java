package array_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Array_list {

	public static void main(String[] args) {
		// Collection
		ArrayList lista = new ArrayList();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		//int[] x = new int[3];
		
		//no length() ma size()
		for (int i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		lista.add(4);
		
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
		
		lista.add("ciao");//posso aggiungere qualsiasi tipo di dato all'ArrayList
		lista.add(true);
		
		for (Object elemento : lista) { // si mette object perche ci possono essere tipi diversi
			System.out.println(elemento);
		}
		
		//--------------------------------------------------\\
		
		//wrapper class
		//int     -->   Integer
		//char    -->   Character
		//boolean -->   Boolean
		//double  -->   Double
		
		ArrayList<Character> lettere = new ArrayList<>();
		
		lettere.add('a');
		//lettere.add(123);//come vedi da errore perche lo abbioamo parametrizzato solo sui caratteri
		lettere.add('b');
		lettere.add('c');
		lettere.add('d');
		lettere.add('e');
		
		for (int i = 0; i <lettere.size();i++) {
			System.out.println(lettere.get(i));
		}
		
		lettere.add(0,'e');//specifico che l'elemento va aggiunto nella posizione desiderata in questo caso 0
		
		System.out.println(lettere);
		
		for (Character lettera : lettere) { // qui c'e scritto character perche e un arraylist di solo char
			System.out.println(lettera);
		}
		
		lettere.forEach(letter-> System.out.println(letter));
		//per ciascun elemento del arraylist lettera mettimelo nel elemento lettera e stampamelo 
		//lambda expression
		
		//method reference
		lettere.forEach(System.out::println);
		//:: operatore di risoluzione dello scopo
		
		
		ArrayList<String> prodotti = new ArrayList<>();
		prodotti.add("scarpe");
		prodotti.add("maglie");
		prodotti.add("camicie");
		
		int lunghezza = prodotti.size();
		String elemento0 = prodotti.get(0);
		
		//prodotti.remove(0);// in queso caso ci accediamo per indice quindi per posizione
		prodotti.remove("scarpe");// in questo caso ci accediamo per oggetto inserendo letteralmente la stringa da eliminare 
		
		prodotti.add(0,"giacca");
		
		prodotti.forEach(prodotto->System.out.println(prodotto));

		//------------------------------------------------\\
		
		ArrayList<String> classe = new ArrayList<>();
		
		classe.add("Mario");
		classe.add("Luigi");
		classe.add("Luca");
		
		ArrayList<Integer> voti = new ArrayList<Integer>();
		
		voti.add(25);
		voti.add(30);
		voti.add(27);
		
		for (int i = 0;i<voti.size(); i++) {
			System.out.println("studente "+ classe.get(i)+" vot: "+voti.get(i));
		}
	
	//--------------------------------------------------------\\
		
		Character[] c = {'x','y','z'};
		
		//trasformo l'array normale in ArrayList
		
		ArrayList<Character> lettere2 = new ArrayList<Character>(Arrays.asList(c));
		
		lettere2.add('w');
		
		lettere2.forEach(car->System.out.println(car));
		
		// ora trasformiam un ArrayList in un array normale
		
		//prima creiamo un array grande tanto quanto l'arraylist
		Character[] x = new Character[lettere2.size()];
		//ora converiamo l'arraylist in array normale
		lettere2.toArray(x);
		
		
		System.out.println(Arrays.toString(x));
		
		//----------------------------------------------\\
		
		//ordina una collezione di dati
		Collections.sort(lettere2);
		
		//cerchiamo un elemento
		System.out.println(Collections.binarySearch(lettere2,'y'));
		//per poter utilizzare binarySearch l'array list deve essere ordinato
		
		//Arraylist al contrario
		Collections.reverse(lettere2);
		System.out.println(lettere2);
		
		//copia di un ArrayList
		ArrayList copia = new ArrayList<>(lettere2);
		
		System.out.println(copia);
		
		//------------------------------------------------\\
		
	
	
	
	
	
	}

}
