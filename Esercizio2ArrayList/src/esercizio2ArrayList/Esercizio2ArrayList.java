package esercizio2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2ArrayList {

	public static void main(String[] args) {
		// programma che chiede all'utante di inseriure dei numeri e li mette in un arrayList
		// fino a quando l'utente non mette -1
		//mostra tutti i valori e calcola la somma
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int numero = 0;
		int somma=0;
		
		do {
			System.out.println("inserisci un numero, -1 per terminare");
			numero = s.nextInt();
			if (numero!=-1) {
			numeri.add(numero);
			somma+=numero;
			}
		}while(numero!=-1);
	
		System.out.println(numeri);
		System.out.println("la somma e: "+ somma);
		
	}

}
