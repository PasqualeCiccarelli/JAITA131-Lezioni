package eserciziCicli;

import java.util.Random;
import java.util.Scanner;

public class EserciziCicli {

	public static void main(String[] args) {
		// ESERCIZIO1
		/*
		 * Scrivere un prtogramma ASTERISCHI che chiede all'utente di inserire un numero
		 * intero e stampa un triangolo fatto di asterischi con un numero di righe pari
		 * al valore inserito dall utente. Se l'utente inserisce un valore negativo il
		 * programma deve visualizzare un messaggio di errore.
		 * 
		 */

		Scanner s = new Scanner(System.in);
		System.out.println(
				"Dammi un numero intero e io ti creo un bel triangolo \nfatto di asterischi con un numero di righe pari al tuo numero.\nRicorda che intero significa maggiore di 0 mi raccomando.");
		int righe = s.nextInt();
		if (righe > 0) {
			for (int i = 1; i <= righe; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("Ayoh! Positivo vuol dire maggiore di 0 te lo avevo anche detto.");
		}

		/*
		 * ESERCIZIO 2 data la stringa "tanto va la gatta al lardo ..." crea una nuova
		 * stringa che contenga la precedente frase al contrario
		 */
		String gatto = "tanto va la gatta al lardo ...";
		String gattoInvertito = "";

		for (int i = gatto.length() - 1; i >= 0; i--) {
			gattoInvertito += gatto.charAt(i);
		}

		System.out.println(gatto);
		System.out.println(gattoInvertito);

		/*
		 * ESERCIZIO 3 visualizza la sequenza di Fibonacci da 0 per un numero di cifre
		 * uguali ad un numero casuale con estremi (0 - 20) esempio con 10 cifre
		 * 0,1,1,2,3,5,8,13,21,34 la sequenza di fibonacci e' una sequenza dove ogni
		 * numero e' la somma dei 2 numeri precedenti
		 */
		Random r = new Random();
		int cifre = r.nextInt(21);
		int cifra1 = 0;
		int cifra2 = 1;

		System.out.println("la sequeza di fibonacci avra' " + cifre + " cifre");
		if (cifre > 0) {
			System.out.print(cifra1);
			for (int i = 1; i < cifre; i++) {
				System.out.print(", " + cifra2);
				int somma = cifra1 + cifra2;
				cifra1 = cifra2;
				cifra2 = somma;
			}
		} else {
			System.out.println("ops. Sei stato sfortunato e' uscito proprio 0 e quindi non succede nulla.");
		}

	}

}
